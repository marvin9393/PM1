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
public class Edelsteinbox {
  
  private Edelstein[] schatzkaestchen;
  
  public Edelsteinbox(Edelstein... edelstein) {
    schatzkaestchen=new Edelstein[edelstein.length];
    for(int i=0;i<edelstein.length;i++) {
      schatzkaestchen[i]=edelstein[i];
    }
  }
  
  private int getAnzahl(Edelstein sorte) {
    int counter=0;
    for(int i=0;i<schatzkaestchen.length;i++) {
      if(schatzkaestchen[i]!=null) {
        if(schatzkaestchen[i]==sorte) {
          counter++;
        }
      }
    }
    return counter;
  }
  
  public String toString() {
    String result="(";
    for(int i=0;i<getAnzahl(Edelstein.DIAMANT);i++) {
      result+="D";
    }
    for(int i=0;i<getAnzahl(Edelstein.RUBIN);i++) {
      result+="R";
    }
    for(int i=0;i<getAnzahl(Edelstein.SMARAGD);i++) {
      result+="S";
    }

    return result+=")";
  }
  
  public void ausgeben() {
    System.out.println(toString());
  }
  
  public void hineinlegen(Edelstein sorte, int anzahl) {
    for(int i=0;i<=anzahl;i++) {
      if(schatzkaestchen[schatzkaestchen.length-1]==null) {
        for(int j=0;j<schatzkaestchen.length;j++) {
          if(schatzkaestchen[j]==null&&i<anzahl) {
            schatzkaestchen[j]=sorte;
            i++;
          }
        }
    }
      else {
        Edelstein[] schatzkaestchenNeu=new Edelstein[schatzkaestchen.length*2];
        for(int j=0;j<schatzkaestchen.length;j++) {
          schatzkaestchenNeu[j]=schatzkaestchen[j];
        }
        if(schatzkaestchenNeu[schatzkaestchen.length]==null) {
          schatzkaestchenNeu[schatzkaestchen.length]=sorte;
          }
        schatzkaestchen=schatzkaestchenNeu;
      }
    
    }
  }
  
  public static void main(String [] args) {
    Edelsteinbox edelstein=new Edelsteinbox(Edelstein.SMARAGD, 
        Edelstein.RUBIN, Edelstein.SMARAGD, Edelstein.DIAMANT);
    edelstein.hineinlegen(Edelstein.RUBIN, 0);
    edelstein.ausgeben();
        
  }
  

}
