/**
*
*
*
*/
package aufgabe7neu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
public class Nullstellen {

  private Funktion funktion;
  public final static double schwellWert= Math.pow(10, -5);
  
  public Nullstellen(Funktion funktion) {
    this.funktion=funktion;
  }
  
  public double findeNullstelle(double startWert) {
    try {
      int iteration=0;
      while(Math.abs(funktion.fVonX(startWert))>schwellWert) {
        if(funktion.fStrichVonX(startWert)==0) {
          throw new NullstellenException(Fehler.DIVISION_DURCH_NULL.toString());
        }
        startWert=startWert-funktion.fVonX(startWert)/funktion.fStrichVonX(startWert);
        iteration++;
        if(iteration>=10) {
          throw new NullstellenException(Fehler.KEINE_KONVERGENZ.toString());
        }
      }
      
    }catch(NullstellenException exception){
      System.err.println("Fehler: "+exception.getMessage());
    }
    return startWert;
  }
  
  public List<Double> findeNullstellenRandomisiert(int min, int max, 
      int versuche){
    List<Double> liste=new ArrayList<Double>();
    List<DoubleWert> listeDoubleWert=new ArrayList<DoubleWert>();
    DoubleWert doubleWert;
    for(int i=0;i<versuche;i++) {
      Random ran=new Random();
      int random = min+ran.nextInt(max-(min)+1);
      doubleWert=new DoubleWert(findeNullstelle(random));
      if(!listeDoubleWert.contains(doubleWert)) {
        listeDoubleWert.add(doubleWert);
        liste.add(findeNullstelle(random));
      }
      
    }
    System.out.println(liste.toString());
    return liste;
    
  }
  
  public static void main(String[] args) {
    Funktion funktion =new QuadratischeFunktion(1, 0, -1);
    Nullstellen nullstellen =new Nullstellen(funktion);
    nullstellen.findeNullstellenRandomisiert(-5, 5, 100);
  }
}
