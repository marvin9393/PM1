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
  /**
   * lässt das Auto mit einer Zufallsgeschwindigkeit fahren.
   */
  public void fahren() {
    gefahrenStrecke=gefahrenStrecke+Math.random()*maximaleGeschwindigkeit;
  }
  /**
   * Gibt den Zustand in einem String zurück
   */
  public String toString(){
   return "Name des Fahrers:"+nameDesFahrers+"\nFahrzeugtyp:"+fahrzeugtyp
       +"\nMaximaleGeschwindigkeit:"+maximaleGeschwindigkeit+"\nGefahrene Strecke:"+gefahrenStrecke;
  }
  /**
   * Ausgabe um den Zustand des Autos auszugeben
   */
  public void ausgabe() {
    System.out.println(toString());
  }
  
  public static void main(String[] args) {
    Rennauto auto=new Rennauto("Marvin", "Porsche Boxter", 350);
    auto.fahren();
    auto.ausgabe();
  }
  
  public double getGefahreneStrecke() {
    return gefahrenStrecke;
  }
  
  public String getName() {
    return nameDesFahrers;
  }
  
  
}
