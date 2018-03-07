/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesim;
import java.util.Random;
/**
 *
 * @author erike
 */
public class Gamesim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        team Team1 = new team(50, 50);
        team Team2 = new team(65, 35);
        basketball Basketball = new basketball(24, 10);
        gameStates gameState = gameStates.NOTSTARTED;
        System.out.println("Meeskond 1");
        System.out.println("Rünnakuoskus: " + Team1.rünnak + " Kaitseoskus: " + Team1.kaitse);
        System.out.println("Meeskond 2");
        System.out.println("Rünnakuoskus: " + Team2.rünnak + " Kaitseoskus: " + Team2.kaitse);
        
        int timer = Basketball.quarterLengthSec;
        int quarter = 1;
        int teamWithBall = 0;
        int team1Score = 0;
        int team2Score = 0;
        int team1Att = 0;
        int team1Made = 0;
        int team2Att = 0;
        int team2Made = 0;
        float baseChanceToScore = (float) 5.0;
        while (quarter < 5){
            while(timer > 0){
                Random scoreNumber = new Random();
                int scoreSeed = scoreNumber.nextInt(10);
                if(quarter == 1 && gameState == gameStates.NOTSTARTED ){
                    Random cointoss = new Random();
                    int cointossWinner = cointoss.nextInt(1);
                    if (cointossWinner == 0){
                        teamWithBall = 0;
                        gameState = gameStates.STARTED;
                    } else {
                        teamWithBall = 1;
                        gameState = gameStates.STARTED;
                    }
                }
                if(gameState == gameStates.STARTED && timer > 0){
                    if (teamWithBall == 0){
                        float chanceToScore = (float) Team1.rünnak / (float) Team2.kaitse;
                        chanceToScore = baseChanceToScore + chanceToScore;
                        if(chanceToScore <= scoreSeed){
                            team1Score += 2;
                            team1Made += 1;
                            team1Att += 1;
                            teamWithBall = 1;
                            timer = timer - (int)(24.0 / ((float)Team1.rünnak / (float) Team2.kaitse));
                            System.out.println("Tiim 1 edukas rünnak! Seis: " + team1Score + ":" + team2Score);
                        } else {
                            teamWithBall = 1;
                            team1Att += 1;
                            timer = timer - (int)(24.0 / ((float)Team1.rünnak / (float) Team2.kaitse));
                            System.out.println("Tiim 1 ebaõnnestunud rünnak! Seis: " + team1Score + ":" + team2Score);
                        }
                    } else if(teamWithBall == 1){
                        float chanceToScore = Team2.rünnak / Team1.kaitse;
                        chanceToScore = baseChanceToScore + chanceToScore;
                        if(chanceToScore <= scoreSeed){
                            team2Score += 2;
                            team2Made += 1;
                            team2Att += 1;
                            teamWithBall = 0;
                            timer = timer - (int)(24.0 / ((float)Team2.rünnak / (float) Team1.kaitse));
                            System.out.println("Tiim 2 edukas rünnak! Seis: " + team1Score + ":" + team2Score);
                        } else {
                            teamWithBall = 0;
                            team2Att += 1;
                            timer = timer - (int)(24.0 / ((float)Team2.rünnak / (float) Team1.kaitse));
                            System.out.println("Tiim 2 ebaõnnestunud rünnak! Seis: " + team1Score + ":" + team2Score);
                        }
                    }
                }
            }
            System.out.println(quarter + ". veerandaeg lõppenud!");
            quarter += 1;
            timer = Basketball.quarterLengthSec;
        }
        if (team1Score > team2Score){
            System.out.println("Tiim 1 võitis!");
        } else if (team2Score > team1Score){
            System.out.println("Tiim 2 võitis!");
        } else {
            System.out.println("Mäng jäi viiki!");
        }
        System.out.println("Tiim 1 proovis " + team1Att + " viset ning tabas " + team1Made + ".");
        System.out.println("Tiim 1 tabavusprotsent: " + ((float) team1Made / (float) team1Att) * 100 + "%");
        System.out.println("Tiim 2 proovis " + team2Att + " viset ning tabas " + team2Made + ".");
        System.out.println("Tiim 2 tabavusprotsent: " + ((float) team2Made / (float) team2Att) * 100 + "%");
    }  
}
