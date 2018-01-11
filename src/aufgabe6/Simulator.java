/**
*
*
*
*/
package aufgabe6;

import java.net.NetworkInterface;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
public class Simulator {
  private final int schritt= 15;
  private Sendung[] sendungsarray=new Sendung[20];
  
  public Simulator() {
    for(int i=0;i<sendungsarray.length;i++) {
      sendungsarray[i]=erzeugeSendung();
    }
  }
  
  private Sendung erzeugeSendung() {
    OfflineSendungsDauerSchaetzer offline =new OfflineSendungsDauerSchaetzer();
    Person sender=new Person(erzeugeAdresse());
    Person empfaenger=new Person(erzeugeAdresse());
    Brief brief =new Brief(sender, empfaenger, Sendung.zeitpunkt, offline.ermittleSendungsdauer(sender.getAdresse().getOrt(), empfaenger.getAdresse().getOrt()), true);
    return brief;
  }
  
  private Stadt erzeugeStadt() {
    int random=(int)(Math.random()*10);
    return Stadt.values()[random];
    }
  
  private Adresse erzeugeAdresse() {
    int random=(int)(Math.random()*5);
    
    switch (random) {
    case 0:return new Adresse("Berliner Bogen", 2, 12345, erzeugeStadt()); 
    case 1:return new Adresse("Hamburger Straße", 10, 24689, erzeugeStadt());
    case 2:return new Adresse("Bremer Kuhdorf", 1, 98765, erzeugeStadt());
    case 3:return new Adresse("Dortmunder Ring", 222, 56892, erzeugeStadt());
    default:return new Adresse("Kölner Dom", 13, 54378, erzeugeStadt());
      
    }
  }
  public void aktualisiereZeitpunkt() {
    Sendung.zeitpunkt++;
    for (int i=0;i<sendungsarray.length;i++) {
      System.out.println(sendungsarray[i].toString());
      }
  }
  public static void main(String[] args) {
    Simulator sim=new Simulator();
    sim.aktualisiereZeitpunkt();
  }
}

  


