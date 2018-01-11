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
public abstract class Sendung {
  protected Person sender;
  protected Person empfaenger;
  protected int sendungsnummer;
  protected int startZeitpunkt;
  protected int transportDauer;
  protected static int sendungsnummerZaehler;
  
  public Sendung(Person sender, Person empfaenger, int sendungsnummer,
      int startZeitpunkt) {
    this.sender=sender;
    this.empfaenger=empfaenger;
    this.sendungsnummer=sendungsnummer;
    this.startZeitpunkt=startZeitpunkt;
  }
  
  public int getSendungsnummer() {
    return sendungsnummer;
  }
  
  public int getTransportDauer() {
    return transportDauer;
  }
  
  public int getStartZeitpunkt() {
    return startZeitpunkt;
  }
  
  public String toString() {
    StringBuilder result=new StringBuilder();
    result.append("Sender: "+sender.getAdresse().getOrt());
    result.append("\n Empfaenger: "+empfaenger.getAdresse().getOrt());
    result.append("\n Sendungsnummer: "+sendungsnummer);
    result.append("\n Startzeitpunkt: "+startZeitpunkt);
    result.append("\nTransportdauer: "+transportDauer);
    result.append("\nSendungungsnummer: "+sendungsnummer);
    return result.toString();
  }
  public abstract boolean istAusgeliefert();
  
  public abstract void aktualisiereZeitpunkt();

}
