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
* Aufgabe: Aufgabenblatt 4, Aufgabe 4.2
* Verwendete Quellen: */
public class Rennen {
  
  private int anzahlRennautos;
  private Rennauto[] listeDerRennautos;
  private final double streckenLaenge;
  
  public Rennen(double streckenLaenge) {
    this.streckenLaenge=streckenLaenge;
    listeDerRennautos=new Rennauto[1];
  }
  private void arrayVerdoppeln() {
    Rennauto[] listeDerRennautosNeu=new Rennauto[listeDerRennautos.length*2];
    for(int i=0;i<listeDerRennautos.length;i++) {
      listeDerRennautosNeu[i]=listeDerRennautos[i];
    }
    listeDerRennautos=listeDerRennautosNeu;
  }
  private void rennautoHinzufuegen(Rennauto rennauto) {
    if(anzahlRennautos==listeDerRennautos.length) {
      arrayVerdoppeln();
    }
      listeDerRennautos[anzahlRennautos]=rennauto;
      anzahlRennautos++;
  }
  
  private Rennauto ermittleSieger() {
    for(int i=0; i<anzahlRennautos;i++) {
      if(listeDerRennautos[i].getGefahreneStrecke()>streckenLaenge) {
        listeDerRennautos[i].ausgabe();
        return listeDerRennautos[i];
      }
      
    }
    return null;
  }
  
  private void schritt() {
    for(int i=0;i<anzahlRennautos;i++) {
      listeDerRennautos[i].fahren();
    }
  }
  public void durchfuehren() {
    while(ermittleSieger()==null) {
      schritt();
    }
  }
  public static void main(String[] args) {
    Rennen rennen=new Rennen(1000.5);
    Rennauto auto0=new Rennauto("Sahin", "Mercedes G-Klasse Wüstentan",230 );
    Rennauto auto1=new Rennauto("Marvin", "BMW",230);
    rennen.rennautoHinzufuegen(auto0);
    rennen.rennautoHinzufuegen(auto1);
    rennen.durchfuehren();
  }
}
