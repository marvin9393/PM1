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
public class Lokomotive {
  
  /**
   * Die Länge des Eisenbahnzuges
   */
  private int laenge;
  /**
   * Der Typ der Lokomitive
   */
  private int typ;
  /**
   * Speichert die referenz auf den ersten Wagen
   */
  private Wagen ersterWagen;
  
  public Lokomotive(int laenge, int typ) {
    this.laenge = laenge;
    this.typ = typ;
  }
  public int getlaenge() {
    return laenge;
  }
  public int getTyp() {
    return typ;
  }
  /**
   * getter für den ersten Wagen
   * @return
   */
  public Wagen getErsterWagen() {
    return ersterWagen;
  }
  /**
   * Setter für den ersten Wagen
   * @param ersterWagen
   */
  public void setErsterWagen(Wagen ersterWagen) {
    this.ersterWagen=ersterWagen;
  }

}
