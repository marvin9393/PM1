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
public class Brief extends Sendung {

  private boolean istEinschreiben;

  public Brief(Person sender, Person empfaenger, int startZeitpunkt,
      int sendungsDauer, boolean istEinschreiben) {
    super(sender, empfaenger, startZeitpunkt, sendungsDauer);
    this.istEinschreiben = istEinschreiben;
  }

}
