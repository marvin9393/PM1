/**
*
*
*
*/
package aufgabe6;

import java.net.NetworkInterface;
import java.util.Scanner;

/**
 * Praktikum TIPM2, WS16-17 Gruppe: Marvin Petersen
 * (marvin.petersen@haw-hamburg.de), Sahin Tekes (sahin.tekes@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt xx, Aufgabe xx Verwendete Quellen:
 */
public class Simulator {
  private final int schritt = 15;
  private Sendung[] sendungsarray = new Sendung[20];

  public Simulator() {
    for (int i = 0; i < sendungsarray.length; i++) {
      sendungsarray[i] = erzeugeSendung();
    }
  }

  private Sendung erzeugeSendung() {
    OfflineSendungsDauerSchaetzer offline = new OfflineSendungsDauerSchaetzer();
    Person sender = new Person(erzeugeAdresse());
    Person empfaenger = new Person(erzeugeAdresse());

    Sendung sendung;

    if (Math.random() > 0.5) {
      sendung = new Brief(sender, empfaenger, Sendung.zeitpunkt,
          offline.ermittleSendungsdauer(sender.getAdresse().getOrt(),
              empfaenger.getAdresse().getOrt()),
          true);
      System.out.println(sendung.toString() + " erzeugt.");
      return sendung;
    } else {
      sendung = new Paket(sender, empfaenger, Sendung.zeitpunkt,
          offline.ermittleSendungsdauer(sender.getAdresse().getOrt(),
              empfaenger.getAdresse().getOrt()),
          Math.random());
      System.out.println(sendung.toString() + " erzeugt.");
      return sendung;
    }
  }

  private Stadt erzeugeStadt() {
    int random = (int) (Math.random() * 10);
    return Stadt.values()[random];
  }

  private Adresse erzeugeAdresse() {
    int random = (int) (Math.random() * 5);

    switch (random) {
    case 0:
      return new Adresse("Berliner Bogen", 2, 12345, erzeugeStadt());
    case 1:
      return new Adresse("Hamburger Straße", 10, 24689, erzeugeStadt());
    case 2:
      return new Adresse("Bremer Kuhdorf", 1, 98765, erzeugeStadt());
    case 3:
      return new Adresse("Dortmunder Ring", 222, 56892, erzeugeStadt());
    default:
      return new Adresse("Kölner Dom", 13, 54378, erzeugeStadt());

    }
  }

  public void aktualisiereZeitpunkt() {
    Sendung.zeitpunkt += 15;
    
    for (int i = 0; i < sendungsarray.length; i++) {
            if (sendungsarray[i].istAusgeliefert()) {
        System.out.println(sendungsarray[i].toString() + " ist ausgeliefert");
        sendungsarray[i] = erzeugeSendung();
      } else {
        System.out.println(sendungsarray[i].toString() + " bei "
            + (int) (100.0 / sendungsarray[i].transportDauer
                * (Sendung.zeitpunkt - sendungsarray[i].startZeitpunkt))
            + "%.");
      }
    }
  }

  public void kommando() {
    String eingabe = "";
    Scanner scanner = new Scanner(System.in);
    while (!eingabe.equals("ENDE")) {
      System.out
          .println("Bitte Kommando eingeben ( ENDE SCHRITT UNGUELTIG ): ");
      eingabe = scanner.nextLine().toUpperCase();
      if (eingabe.equals("SCHRITT")) {
        aktualisiereZeitpunkt();
      } else if (eingabe.equals("ENDE")) {
        System.out.println("Ende");
      } else {
        System.out.println("Ungültige Eingabe");
      }
    }
  }

  public static void main(String[] args) {
    Simulator sim = new Simulator();
    sim.kommando();
  }
}
