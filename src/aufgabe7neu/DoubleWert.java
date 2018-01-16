/**
*
*
*
*/
package aufgabe7neu;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
public class DoubleWert {
  
  private double doubleWert;
  
  public DoubleWert(double doubleWert) {
    this.doubleWert=doubleWert;
  }
  
  public int hashCode() {
    return (int)doubleWert;
  }
  
  public boolean equals(Object anderesObjekt) {
    if(anderesObjekt instanceof DoubleWert) {
      DoubleWert andererDoubleWert =(DoubleWert) anderesObjekt;
      if((andererDoubleWert.doubleWert-doubleWert)<Nullstellen.schwellWert) {
        return true;
      }
    }
    return false;
  }

}
