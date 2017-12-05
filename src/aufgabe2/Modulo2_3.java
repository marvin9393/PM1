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
public class Modulo2_3 {
  
  public static void main(String[] args) {
    
    int a;
    int b;
    Scanner scanner=new Scanner(System.in);
    a=scanner.nextInt();
    b=scanner.nextInt();
    scanner.close();
    
    System.out.println(a%b);
    System.out.println(a-((a/b)*b));
  }

}
