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
* Aufgabe: Aufgabenblatt 2, Aufgabe 2.1
* Verwendete Quellen: */
public class Satelllitenzeit2_1 {
  
  public static void main(String [] args) {
    int tage;
    int stunden;
    int minuten;
    int eingabeInSekunden;
    final int tagInSekunden=86400;
    final int stundeInSekunden=3600;
    final int minutenInSekunden=60;
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("Bitte geben Sie ein Zahl in Sekunden ein. Bestätigen Sie Ihre Eingabe mit Enter.");
    eingabeInSekunden=scanner.nextInt();
    scanner.close();
    tage=eingabeInSekunden/tagInSekunden;
    eingabeInSekunden=eingabeInSekunden-(tage*tagInSekunden);
    stunden=eingabeInSekunden/stundeInSekunden;
    eingabeInSekunden=eingabeInSekunden-(stunden*stundeInSekunden);
    minuten=eingabeInSekunden/minutenInSekunden;
    eingabeInSekunden=eingabeInSekunden-(minutenInSekunden*minuten);
    System.out.println("Tage:"+tage+" Stunden:"+stunden+" Minuten:"+minuten+" Sekunden:"+eingabeInSekunden);
    
  }

}
