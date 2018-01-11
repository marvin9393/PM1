/**
*
*
*
*/
package aufgabe6;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
public class Adresse {
  /**
   * speichert die Wichtigsten Adressdaten
   */
  private String strasse;
  private int hausnummer;
  private int postleitzahl;
  private Stadt ort;
  
  public Adresse(String strasse, int hausnumnmer, int postleitzahl,
      Stadt ort) {
    this.strasse=strasse;
    this.hausnummer=hausnumnmer;
    this.postleitzahl=postleitzahl;
    this.ort=ort;
  }
  
  public String getStrasse() {
    return strasse;
  }
  
  public int getHausnummer() {
    return hausnummer;
  }
  
  public int getPostleitzahl() {
    return postleitzahl;
  }
  
  public Stadt getOrt() {
    return ort;
  }

}
