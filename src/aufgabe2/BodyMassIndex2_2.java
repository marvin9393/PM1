/**
*
*
*
*/
package aufgabe2;

import java.util.Scanner;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
public class BodyMassIndex2_2 {
  
  public static void main(String[] args) {
    
    double koerpergroesse;
    double koerpergewicht;
    int bmi;
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("Bitte geben Sie Ihre Körpergröße in Metern "
        + "ein und Bestätigen Sie Ihre Eingabe mit Enter.");
    koerpergroesse=scanner.nextDouble();
    
    System.out.println("Bitte geben Sie Ihr Gewicht in Kilogramm "
        + "ein und Bestätigen Sie Ihre Eingabe mit Enter.");
    
    koerpergewicht=scanner.nextDouble();
    scanner.close();
    
    bmi=(int)(koerpergewicht/(koerpergroesse*koerpergroesse));
    System.out.println("Ihr BMI beträgt:"+bmi);
  }

}
