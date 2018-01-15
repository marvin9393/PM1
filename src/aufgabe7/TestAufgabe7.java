/**
*
*
*
*/
package aufgabe7;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
class TestAufgabe7 {

  @Test
  void testNullstellenberechnen() {
    Funktion funktion =new QuadratischeFunktion(1, 0, -1);
    Nullstellen nullstellen=new Nullstellen(funktion);
    assertTrue("Fehler bei den Nullstellen", (int)nullstellen.findeNullstellen(2)==1);
  }
  
  @Test
  void testNullstellenException() {
    Funktion funktion =new QuadratischeFunktion(0, 0, 1);
    Nullstellen nullstellen=new Nullstellen(funktion);
    assertTrue("Fehler beim Fehler werfen Division durch 0", (int)nullstellen.findeNullstellen(0)==0);
  }
  
  @Test
  void testKeineKovergenzException() {
    Funktion funktion =new QuadratischeFunktion(1, 0, 1);
    Nullstellen nullstellen=new Nullstellen(funktion);
    assertFalse("Fehler beim Fehler werfen Keine Konvergenz", (int)nullstellen.findeNullstellen(2)==0);
  }
  
  @Test
  void testRandomisiert() {
    Funktion funktion =new QuadratischeFunktion(1, 0, -1);
    Nullstellen nullstellen=new Nullstellen(funktion);
    assertFalse("Fehler beim Fehler werfen Keine Konvergenz", nullstellen.findeNullstellenRandomisiert(-5, 5, 100).size()==2);
  }

}
