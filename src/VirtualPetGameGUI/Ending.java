/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPetGameGUI;

import static Database.PlayerScores.highestScore;
import Database.PlayerScoresMain;
import static Database.PlayerScoresMain.scoresText;
import static VirtualPetGameGUI.AdoptPetGUI.pet;
import static VirtualPetGameGUI.IntroductionFrame.player;
import java.util.Arrays;

/**
 *
 * @author jessi
 */
public class Ending {
    
    public static void goodGame() {
        PlayerScoresMain.main();
        String goodEnding = ("\nPlayer: " + player.getUsername() + "  Score: " + pet.getPetScore() + "\n\nCongralutations! " + pet.animalName + " is at maximum happiness!"
                   + "\nWell done, you have completed the game!\n"
                   + "Here is your Pet Report\n" + pet.printReportCard()
                   + "\n\nHighest Score: " + highestScore + "\n\nList of last 10 Players and Scores:\n" + Arrays.toString(scoresText));
        GUI g = new GUI();
        g.GUIend("Good Game", goodEnding);
    }
    
    public static void badGame() {
        PlayerScoresMain.main();
        String badEnding = ("\nPlayer: " + player.getUsername() + "  Score: " + pet.getPetScore() 
                   + "\n\nSorry! " + pet.animalName + " is not happy at all!"
                   + "\nToo bad " + pet.animalName + " has decided to run away...\n"
                   + "Here is your Pet Report\n" + pet.printReportCard()
                   + "\n\nHighest Score: " + highestScore + "\n\nList of last 10 Players and Scores:\n" + Arrays.toString(scoresText));
        GUI g = new GUI();
        g.GUIend("Bad Game", badEnding);
        //new GUIend("Bad Game", badEnding);  
    }
    
}
