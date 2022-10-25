/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPetGameGUI;

/**
 *
 * @author jessi
 */
public class PetUser {
  
    private String username;
    private int score = 0;
    private int highestScore = 0;

    //Constructor - stores user name and scores
    public PetUser(){
        this.username = "";
        this.score = 0;
    }
    
    public PetUser(String un, int sc) {
        this.username = un;
        this.score = sc;
    }
    
    public static void main(PetUser player) {
        new GUI("Players Scores", player);
    }
    
    //Getters and Setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getHighestScore() {
        return highestScore;
    }
    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }

    
}
