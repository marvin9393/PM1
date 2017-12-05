/**
*
*
*
*/
package aufgabe3;

import java.util.Scanner;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
public class Flaecheninhalt3_1 {
  
  public static void main(String[] args) {
    
    double x;
    int index;
    double flaecheninhalt;
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("Bitte geben Sie den Index an. 1=Flächeninhalt eines Kreises."
        + "2=Flächeninhalt eines Quadrates"
        + "3=Flächeninhalt eines Sechsecks");
    index=scanner.nextInt();
    if(index==1) {
      System.out.println("Bitte geben Sie die die Länge des Radius in cm an");
     x=scanner.nextDouble();
     flaecheninhalt=3.14*(x*x);
     System.out.println("Der Flächeninhalt des Kreises beträgt:"+flaecheninhalt);
    }
    else if(index==2) {
      System.out.println("Bitte geben Sie die die Länge der Grundseite des Quadrates in cm an");
     x=scanner.nextDouble();
      flaecheninhalt=x*x;
      System.out.println("Der Flächeninhalt des Quadrates beträgt:"+flaecheninhalt);
    }
    else if(index==3) {
      System.out.println("Bitte geben Sie die Länge der Grundseite des Sechsecks in cm an");
      x=scanner.nextDouble();
      flaecheninhalt=3/2*(x*x)*Math.sqrt(3);
      System.out.println("Der Flächeninhalt des Sechsecks beträgt:"+flaecheninhalt);
    }
    else {
      flaecheninhalt=-1;
      System.out.println("Ungültiger Index, deshalb ist das Ergebnis"+flaecheninhalt);
    }
    scanner.close();
  }

}
