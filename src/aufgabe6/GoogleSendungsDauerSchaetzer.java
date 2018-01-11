/**     
 * Praktikum TIPR1, SS 2016     
 * Gruppe: 	Sahin Tekes  (sahin.tekes@haw-hamburg.de),      
 *         	Ulla Corinna van Elsbergen (CorinnaUlla@outlook.de)   
 * Aufgabe: Aufgabenblatt 6, Aufgabe 1     
 * Verwendete Quellen:   
 */

package aufgabe6;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class GoogleSendungsDauerSchaetzer implements SendungsdauerSchaetzer{

    private static final String TAG_VALUE = "value";
    private static final String TAG_DURATION = "duration";
    private static final String TAG_ELEMENT = "element";
    private static final String TAG_ROW = "row";

  @Override
  public int getSendungsTransportDauer(Stadt senderOrt, Stadt empfaengerOrt) {
    // Http-Anfrage senden
    String httpAnfrage = erzeugeAnfrageUrl(senderOrt, empfaengerOrt);

    InputStream response = sendeHttpAnfrage(httpAnfrage);
    if (response == null) {
      return -1;
    }

    // XML parsen
    Document doc = parseXmlAntwort(response);
    if (doc == null) {
      return -1;
    }

    // Fahrtdauer extrahieren
    int dauer = extrahiereFahrtDauer(doc) / 60;
    return dauer;
  }

  /**
   * Generiert aus Start und Ziel die Anfrage-URL.
   */
  private String erzeugeAnfrageUrl(Stadt senderOrt, Stadt empfaengerOrt) {
    String anfrageUrl = "https://maps.googleapis.com/maps/api/distancematrix/xml?origins=" + senderOrt.toString()
        + "&destinations=" + empfaengerOrt.toString() + "&mode=driving&language=de-DE";
    return anfrageUrl;
  }

  /**
   * Extrahiert die Dauer der Fahrt in Minuten aus dem XML-Dokument.
   */
  private int extrahiereFahrtDauer(Document doc) {
    if (doc == null) {
      return -1;
    }
    int dauer = -1;
    try {
      Element distanceMatrixResponse = doc.getDocumentElement();
      Element row = (Element) distanceMatrixResponse.getElementsByTagName(TAG_ROW).item(0);
      Element element = (Element) row.getElementsByTagName(TAG_ELEMENT).item(0);
      Element duration = (Element) element.getElementsByTagName(TAG_DURATION).item(0);
      Element value = (Element) duration.getElementsByTagName(TAG_VALUE).item(0);
      String stringWert = value.getTextContent();
      dauer = Integer.parseInt(stringWert);
    } catch (Exception e) {
      System.out.println("Fehler beim Lesen des XML-Dokuments");
    }
    return dauer;
  }

  /**
   * XML-Dokument einlesen und als Document-Objekt zur�ckliefern. Gibt null,
   * falls das Generieren fehlschl�gt.
   */
  public Document parseXmlAntwort(InputStream response) {
    Document doc = null;
    try {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder;
      builder = factory.newDocumentBuilder();
      doc = builder.parse(response);
    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println("Fehler bei Parsen der XML-Antwort.");
    }
    return doc;
  }

  /**
   * HTTP-Anfrage an Google API senden, Ergebnis ist ein InputStream. Liefert
   * null, falls die Anfrage fehlschl�gt.
   */
  public InputStream sendeHttpAnfrage(String url) {
    String charset = java.nio.charset.StandardCharsets.UTF_8.name();
    InputStream response = null;
    try {
      URLConnection connection;
      connection = new URL(url).openConnection();
      connection.setRequestProperty("Accept-Charset", charset);
      response = connection.getInputStream();
    } catch (IOException e) {
      System.out.println("Fehler bei der Verarbeitung der Google-Anfrage.");
    }
    return response;
  }

}
