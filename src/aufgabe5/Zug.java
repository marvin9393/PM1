/**
*
*
*
*/
package aufgabe5;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
public class Zug {
  /**
   * Speichert die Lok
   */
  private Lokomotive lok;
  /**
   * Konstruktor legt unsere Lok für den Zug fest
   * @param lok
   */
  public Zug (Lokomotive lok) {
    this.lok=lok;
  }
  public void wagenHinzufuegen(Wagen wagen) {
    if(lok.getErsterWagen()==null) {
      lok.setErsterWagen(wagen);
    }
    else {
      Wagen hilfswagen =lok.getErsterWagen();
      while(hilfswagen.getNaechstenWagen()!=null) {
        hilfswagen=hilfswagen.getNaechstenWagen();
      }
      hilfswagen.setNaechstenWagen(wagen);
    }
  }
  public Wagen erstenWagenEntfernen() {
    if(lok.getErsterWagen()!=null) {
      Wagen result=lok.getErsterWagen();
      lok.setErsterWagen(result.getNaechstenWagen());
      return result;
    }
    return null;
  }
  public void zugAnhaengen(Zug zug) {
    wagenHinzufuegen(zug.lok.getErsterWagen());
  }
  public int getWagenAnzahl() {
    int anzahl=0;
    if(lok.getErsterWagen()!=null) {
      Wagen hilfswagen =lok.getErsterWagen();
      anzahl++;
      while(hilfswagen.getNaechstenWagen()!=null) {
        hilfswagen=hilfswagen.getNaechstenWagen();
        anzahl++;
      }
    }
    
    return anzahl;
  }
  public int getKapazitaet(){
    int kapazitaet=0;
    if(lok.getErsterWagen()!=null) {
      Wagen hilfswagen=lok.getErsterWagen();
      while(hilfswagen.getNaechstenWagen()!=null) {
        kapazitaet+=hilfswagen.getPassagierkapazitaet();
        hilfswagen=hilfswagen.getNaechstenWagen();
      }
      kapazitaet+=hilfswagen.getPassagierkapazitaet();
    }
    return kapazitaet;
  }
  public int getlaenge(){
    int laenge=lok.getlaenge();
    if(lok.getErsterWagen()!=null) {
      Wagen hilfswagen=lok.getErsterWagen();
      while(hilfswagen.getNaechstenWagen()!=null) {
        laenge+=hilfswagen.getlaenge();
        hilfswagen=hilfswagen.getNaechstenWagen();
      }
      laenge+=hilfswagen.getlaenge();
    }
    return laenge;
  }
  public String toString() {
    String result="";
    result+="Typ der Lok: "+lok.getTyp();
    result+="\nAnzahl der Wagen: "+getWagenAnzahl();
    result+="\nGesamtlaenge des Zuges: "+getlaenge()+" Meter";
    result+="\nGesamte Passagierkapazität: "+getKapazitaet();
    if(lok.getErsterWagen()!=null) {
      Wagen hilfsWagen=lok.getErsterWagen();
      while(hilfsWagen.getNaechstenWagen()!=null) {
        result+="\n";
        result+="\nSeriennummer des Wagens: "+hilfsWagen.getSerienNummer();
        result+="\nWagenlaenge: "+hilfsWagen.getlaenge()+" Meter";
        result+="\n Passagierkapazität: "+getKapazitaet();
        hilfsWagen=hilfsWagen.getNaechstenWagen();
      }
      result+="\n";
      result+="\nSeriennummer des Wagens: "+hilfsWagen.getSerienNummer();
      result+="\nWagenlaenge: "+hilfsWagen.getlaenge()+" Meter";
      result+="\n Passagierkapazität: "+getKapazitaet();
    }
    return result.toString();
  }
  public static void main(String[] args) {
    Lokomotive lokomotive1 =new Lokomotive(50,1);
    Zug zug1=new Zug(lokomotive1);
    Wagen wagen1=new Wagen(50,53,1);
    Wagen wagen2=new Wagen(50,52,2);
    zug1.wagenHinzufuegen(wagen1);
    zug1.wagenHinzufuegen(wagen2);
    zug1.erstenWagenEntfernen();
    Lokomotive lokomotive2 =new Lokomotive(100,2);
    Zug zug2=new Zug(lokomotive2);
    Wagen wagen3=new Wagen(50,48,3);
    Wagen wagen4=new Wagen(150,100,4);
    zug2.wagenHinzufuegen(wagen3);
    zug2.wagenHinzufuegen(wagen4);
    zug1.zugAnhaengen(zug2);
    System.out.println(zug1.toString());
    System.out.println(zug1.getWagenAnzahl());
    System.out.println(zug1.getKapazitaet());
    System.out.println(zug1.getlaenge());
  }
}
  
