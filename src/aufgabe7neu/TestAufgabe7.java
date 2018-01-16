/**
*
*
*
*/
package aufgabe7neu;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
class TestAufgabe7 {

  @Test
  void testNullstellen() {
    Funktion funktion =new QuadratischeFunktion(1, 0, -1);
    Nullstellen nullstellen =new Nullstellen(funktion);
    assertTrue("Fehler bei finde Nullstelle", (int)nullstellen.findeNullstelle(2)==1);
  }

}
