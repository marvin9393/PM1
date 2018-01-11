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
  protected static int zeitpunkt;
  
  public Sendung(Person sender, Person empfaenger, int startZeitpunk,
      int transportDauer) {
    this.sender=sender;
    this.empfaenger=empfaenger;
    this.sendungsnummer=sendungsnummer;
    this.startZeitpunkt=startZeitpunkt;
    this.transportDauer=transportDauer;
    sendungsnummerZaehler++;
    sendungsnummer=sendungsnummerZaehler;
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
    result.append(sender.getAdresse().getOrt().toString()+" -> "
    +empfaenger.getAdresse().getOrt().toString()+"(start="
        +startZeitpunkt+", dauer="+transportDauer+")");
    return result.toString();
  }
  public abstract boolean istAusgeliefert();
  
  public abstract void aktualisiereZeitpunkt();

}
