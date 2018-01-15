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
public class DoubleWert {
  
  private double doubleWert;
  
  public DoubleWert(double doubleWert) {
    this.doubleWert=doubleWert;
  }
  
  @Override
  public int hashCode() {
    return (int)doubleWert;
    }
  
  
  @Override
  public boolean equals(Object anderesObject) {
    if (!(anderesObject instanceof DoubleWert)) {
      return false;
    }
    DoubleWert andererDoubleWert = (DoubleWert) anderesObject;
    return (andererDoubleWert.doubleWert-doubleWert)<Nullstellen.schwellWert;
    
  }
  
  public String toString() {
    String result=""+doubleWert;
    return result;
  }
  
}
