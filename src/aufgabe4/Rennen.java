/**
*
*
*
*/
package aufgabe4;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt 4, Aufgabe 4.2
* Verwendete Quellen: */
public class Rennen {
  
  private int anzahlRennautos;
  private Rennauto[] listeDerRennautos;
  private final double streckenLaenge;
  
  public Rennen(double streckenLaenge) {
    this.streckenLaenge=streckenLaenge;
    listeDerRennautos=new Rennauto[1];
  }
}
