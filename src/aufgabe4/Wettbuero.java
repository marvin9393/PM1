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
public class Wettbuero {
  
  private Rennen rennen;
  private Wetten[] wetten;
  private final double quote;
  
  /**
   * Konstruktor, der die Variablen beschreibt und initialsiert.
   * @param rennen
   * @param quote
   */
  public Wettbuero(Rennen rennen, double quote) {
    this.rennen=rennen;
    this.quote=quote;
    wetten=new Wetten[1];
  }
  
  public void wetteAnnehmen(String fahrerin, int wetteinsatz, String spieler) {
    if(wetten[wetten.length-1]==null) {
      for(int i=0;i<wetten.length;i++) {
        if(wetten[i]==null) {
          wetten[i]=new Wetten(fahrerin, wetteinsatz, spieler);
          return;
        }
      }
     
    }
    else {
      Wetten wettenneu[] = new Wetten[wetten.length*2];
      for(int i=0;i<wetten.length;i++) {
        wettenneu[i]=wetten[i];
      }
      wetten=wettenneu;
      wetteAnnehmen(fahrerin, wetteinsatz, spieler);
    }
    
  }
  
  public void auswerten() {
    for(int i=0;i<wetten.length;i++) {
      if(wetten[i]!=null) {
        if(wetten[i].getFahrerin().equals(rennen.ermittleSieger().getName())) {
          System.out.println("Name des Spielers: "+wetten[i].getSpieler());
          System.out.println("Gewettet auf: "+wetten[i].getFahrerin());
          System.out.println("Gewinn: "+wetten[i].getWetteinsatz()*quote);
        }
      }
    }
  }

}
