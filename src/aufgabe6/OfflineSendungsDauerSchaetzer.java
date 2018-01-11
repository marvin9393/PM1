/**
*
*
*
*/
package aufgabe6;

/**
* Praktikum TIPM2, WS16-17
* Gruppe: Marvin Petersen (marvin.petersen@haw-hamburg.de),
* Sahin Tekes (sahin.tekes@haw-hamburg.de)
* Aufgabe: Aufgabenblatt xx, Aufgabe xx
* Verwendete Quellen: */
public class OfflineSendungsDauerSchaetzer {
  
  private int[][] entfernungsArray;
  
  public OfflineSendungsDauerSchaetzer() {
    entfernungsArray=new int[10][10];
    entfernungsArray[0][0]=0;
    entfernungsArray[0][1]=180;
    entfernungsArray[0][2]=344;
    entfernungsArray[0][3]=357;
    entfernungsArray[0][4]=338;
    entfernungsArray[0][5]=381;
    entfernungsArray[0][6]=350;
    entfernungsArray[0][7]=306;
    entfernungsArray[0][8]=324;
    entfernungsArray[0][9]=238;
    entfernungsArray[1][0]=178;
    entfernungsArray[1][1]=0;
    entfernungsArray[1][2]=446;
    entfernungsArray[1][3]=262;
    entfernungsArray[1][4]=302;
    entfernungsArray[1][5]=394;
    entfernungsArray[1][6]=243;
    entfernungsArray[1][7]=210;
    entfernungsArray[1][8]=224;
    entfernungsArray[1][9]=80;
    entfernungsArray[2][0]=343;
    entfernungsArray[2][1]=450;
    entfernungsArray[2][2]=0;
    entfernungsArray[2][3]=340;
    entfernungsArray[2][4]=244;
    entfernungsArray[2][5]=143;
    entfernungsArray[2][6]=369;
    entfernungsArray[2][7]=364;
    entfernungsArray[2][8]=378;
    entfernungsArray[2][9]=433;
    entfernungsArray[3][0]=354;
    entfernungsArray[3][1]=261;
    entfernungsArray[3][2]=339;
    entfernungsArray[3][3]=0;
    entfernungsArray[3][4]=126;
    entfernungsArray[3][5]=223;
    entfernungsArray[3][6]=44;
    entfernungsArray[3][7]=73;
    entfernungsArray[3][8]=63;
    entfernungsArray[3][9]=200;
    entfernungsArray[4][0]=336;
    entfernungsArray[4][1]=297;
    entfernungsArray[4][2]=240;
    entfernungsArray[4][3]=124;
    entfernungsArray[4][4]=0;
    entfernungsArray[4][5]=134;
    entfernungsArray[4][6]=152;
    entfernungsArray[4][7]=151;
    entfernungsArray[4][8]=162;
    entfernungsArray[4][9]=278;
    entfernungsArray[5][0]=379;
    entfernungsArray[5][1]=391;
    entfernungsArray[5][2]=146;
    entfernungsArray[5][3]=221;
    entfernungsArray[5][4]=136;
    entfernungsArray[5][5]=0;
    entfernungsArray[5][6]=250;
    entfernungsArray[5][7]=258;
    entfernungsArray[5][8]=260;
    entfernungsArray[5][9]=373;
    entfernungsArray[6][0]=347;
    entfernungsArray[6][1]=246;
    entfernungsArray[6][2]=364;
    entfernungsArray[6][3]=46;
    entfernungsArray[6][4]=151;
    entfernungsArray[6][5]=248;
    entfernungsArray[6][6]=0;
    entfernungsArray[6][7]=58;
    entfernungsArray[6][8]=37;
    entfernungsArray[6][9]=184;
    entfernungsArray[7][0]=303;
    entfernungsArray[7][1]=210;
    entfernungsArray[7][2]=363;
    entfernungsArray[7][3]=73;
    entfernungsArray[7][4]=152;
    entfernungsArray[7][5]=259;
    entfernungsArray[7][6]=56;
    entfernungsArray[7][7]=0;
    entfernungsArray[7][8]=33;
    entfernungsArray[7][9]=150;
    entfernungsArray[8][0]=324;
    entfernungsArray[8][1]=226;
    entfernungsArray[8][2]=376;
    entfernungsArray[8][3]=63;
    entfernungsArray[8][4]=163;
    entfernungsArray[8][5]=260;
    entfernungsArray[8][6]=36;
    entfernungsArray[8][7]=35;
    entfernungsArray[8][8]=0;
    entfernungsArray[8][9]=164;
    entfernungsArray[9][0]=236;
    entfernungsArray[9][1]=82;
    entfernungsArray[9][2]=429;
    entfernungsArray[9][3]=201;
    entfernungsArray[9][4]=281;
    entfernungsArray[9][5]=377;
    entfernungsArray[9][6]=183;
    entfernungsArray[9][7]=150;
    entfernungsArray[9][8]=164;
    entfernungsArray[9][9]=0;
  }
  public int ermittleSendungsdauer(Stadt stadt1, Stadt stadt2) {
    return entfernungsArray[stadt1.ordinal()][stadt2.ordinal()];
    
  }

}
