/**
*
*
*
*/
package aufgabe6;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
public class Brief extends Sendung{
  
  private boolean istEinschreiben;
  private boolean istAusgeliefert;
  
  public Brief(Person sender, Person empfaenger,
      int startZeitpunkt,int sendungsDauer,boolean istEinschreiben) {
    super(sender, empfaenger,startZeitpunkt, sendungsDauer);
    this.istEinschreiben=istEinschreiben;
  }

  /* (non-Javadoc)
   * @see aufgabe6.Sendung#istAusgeliefert()
   */
  @Override
  public boolean istAusgeliefert() {
    if((zeitpunkt-startZeitpunkt)>=transportDauer) {
      istAusgeliefert=true;
    }else {
      istAusgeliefert=false;
    }
    return istAusgeliefert;
  }

  /* (non-Javadoc)
   * @see aufgabe6.Sendung#aktualisiereZeitpunkt()
   */
  @Override
  public void aktualisiereZeitpunkt() {
    zeitpunkt+=15;
    }

}
