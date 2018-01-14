/**
*
*
*
*/
package aufgabe7;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
public class Nullstellen {
  private Funktion funktion;
  public Nullstellen(Funktion funktion) {
    this.funktion=funktion;
  }

  private final double schwellWert=10^-5;
  
  public double findeNullstelle(double startWert) {
    double result=0;;
    while(result>schwellWert) {
      result=startWert-funktion.fVonX(startWert)/funktion.ableitungFVonX(startWert);
      startWert++;
    }
    return result;
    
  }

}
