/**
*
*
*
*/
package aufgabe7neu;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
public class QuadratischeFunktion implements Funktion{
  
  private double a;
  private double b;
  private double c;
  
  public QuadratischeFunktion(double a, double b, double c) {
    this.a=a;
    this.b=b;
    this.c=c;
  }
  
  
  public double fVonX(double x) {
    return (a*(x*x))+(b*x)+c;
  }
  
  public double fStrichVonX(double x) {
    return ((2*a)*x)+b;
  }



 

}
