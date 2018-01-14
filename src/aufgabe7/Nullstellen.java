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
  private final double schwellWert =Math.pow(10, -5);
  
  public Nullstellen(Funktion funktion) {
    this.funktion=funktion;
  }
  
  public double findeNullstellen(double startWert) {
    while(funktion.f(startWert)>schwellWert) {
      startWert=startWert-funktion.f(startWert)/funktion.fStrich(startWert);
    }
    
    return startWert;
  }
  

}
