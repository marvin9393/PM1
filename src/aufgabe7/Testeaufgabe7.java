/**
*
*
*
*/
package aufgabe7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
class Testeaufgabe7 {

  @Test
  void testAufgabe71() {
    Funktion funktion=new QuadratischeFunktion(-1.0, 1.0, 0.0);
    Nullstellen nullstellen=new Nullstellen(funktion);
    nullstellen.findeNullstelle(0);
    assertEquals(1,nullstellen.findeNullstelle(0),"Tst");
  }

}
