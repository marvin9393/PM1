/**
*
*
*
*/
package aufgabe6;

/**
 * Praktikum TIPM2, WS16-17 Gruppe: Marvin Petersen
 * (marvin.petersen@haw-hamburg.de), Sahin Tekes (sahin.tekes@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt xx, Aufgabe xx Verwendete Quellen:
 */
public class Paket extends Sendung {
  private double gewicht;

  public Paket(Person sender, Person empfaenger, int startZeitpunkt,
      int sendungsDauer, double gewicht) {
    super(sender, empfaenger, startZeitpunkt, sendungsDauer);
    this.gewicht=gewicht;
  }

}
