/**
*
*
*
*/
package aufgabe5;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
public class Wagen {
  
  /**
   * länge des Wagens
   */
  private int laenge;
   /**
   * Passagieranzahl
   */
  private int passagierkapazitaet;
  private int serienNummer;
  /**
   * Speichert die Refernz auf den nächsten Wagen
   */
  private Wagen naechsterWagen;
  /**
   * Getter nächster Wagen
   * @return
   */
  public Wagen(int laenge, int passagierkapazitaet,int serienNummer) {
    this.laenge=laenge;
    this.passagierkapazitaet=passagierkapazitaet;
    this.serienNummer=serienNummer;
  }
  public Wagen getNaechstenWagen() {
    return naechsterWagen;
  }
  /**
   * Setter nächster Wagen
   * @param naechsterWagen
   */
  public void setNaechstenWagen(Wagen naechsterWagen) {
    this.naechsterWagen=naechsterWagen;
  }
  
  public int getPassagierkapazitaet() {
    return passagierkapazitaet;
  }
  public int getlaenge() {
    return laenge;
  }
  public int getSerienNummer() {
    return serienNummer;
  }
}
