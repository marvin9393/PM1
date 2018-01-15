/**
*
*
*
*/
package aufgabe7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Praktikum TIPM2, WS16-17 Gruppe: Marvin Petersen
 * (marvin.petersen@haw-hamburg.de), Sahin Tekes (sahin.tekes@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt xx, Aufgabe xx Verwendete Quellen:
 */
public class Nullstellen {

  private Funktion funktion;
  public final static double schwellWert = Math.pow(10, -5);

  public Nullstellen(Funktion funktion) {
    this.funktion = funktion;
  }

  public double findeNullstellen(double startWert) {
    int zaehler=0;
    try {
      if (funktion.fStrich(startWert) < schwellWert) {
        throw new NullstellenException(Fehler.DIVISION_DURCH_NULL.toString());
      }
      while (funktion.f(startWert) > schwellWert) {
        if(zaehler>=10) {
          throw new NullstellenException(Fehler.KEINE_KONVERGENZ.toString());
        }
        startWert = startWert
            - funktion.f(startWert) / funktion.fStrich(startWert);
        zaehler++;
      }
    } catch (NullstellenException exception) {
      System.out.println("Ungültige Eingabe: " + exception.getMessage());
    }

    return startWert;
  }
  
  public List<Double> findeNullstellenRandomisiert(int min, int max, int anzahlVersuche){
    List<Double> nullstellen=new ArrayList();
    List<DoubleWert> nullstellenDoubleWert=new ArrayList();
    for(int i=0;i<anzahlVersuche;i++) {
      Random ran=new Random();
      int random = min+ran.nextInt(max-(min)+1);
      DoubleWert result = new DoubleWert(findeNullstellen(random));
      if(!nullstellenDoubleWert.contains(result)) {
        nullstellenDoubleWert.add(result);
        System.out.println(nullstellenDoubleWert.toString());
      }
      }
      
    return nullstellen;
    
  }
  
 
  

}
