/**
*
*
*
*/
package aufgabe4;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt 4, Aufgabe 4.1
* Verwendete Quellen: */
public class Rennauto {
  
  /**
   * Name des Fahrers des Rennautos
   */
  private final String nameDesFahrers;
  /**
   * Beschreibt den Fahrzeugtyp
   */
  private final String fahrzeugtyp;
  /**
   * Legt die Maximalegeschwindigkeit fest
   */
  private final int maximaleGeschwindigkeit;
  /**
   * speichert die gefahren die gefahrene Strecke.
   */
  private double gefahrenStrecke;
  
  /**
   * Der Konstruktor legt die Individuellen Eigenschaften des Autos fest.
   * @param nameDesFahrers
   * @param fahrzeugtyp
   * @param maximaleGeschwindigkeit
   */
  public Rennauto(String nameDesFahrers, String fahrzeugtyp, int maximaleGeschwindigkeit) {
    this.nameDesFahrers=nameDesFahrers;
    this.fahrzeugtyp=fahrzeugtyp;
    this.maximaleGeschwindigkeit=maximaleGeschwindigkeit;
  }
  
  public void fahren() {
    gefahrenStrecke=gefahrenStrecke+Math.random()*maximaleGeschwindigkeit;
  }
  public String toString(){
    String eigenschaften;
    return eigenschaften;
  }
  
  
}
