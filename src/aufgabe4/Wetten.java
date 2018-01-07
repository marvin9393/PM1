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
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
public class Wetten {
  
  private String fahrerin;
  private int wetteinsatz;
  private String spieler;
  
  public Wetten(String fahrerin, int wetteinsatz, String spieler) {
    this.fahrerin=fahrerin;
    this.wetteinsatz=wetteinsatz;
    this.spieler=spieler;
  }
  
  public String getFahrerin() {
    return fahrerin;
  }
  
  public int getWetteinsatz() {
    return wetteinsatz;
  }
  
  public String getSpieler() {
    return spieler;
  }

}
