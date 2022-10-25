/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameOptions;

import Animals.Animal;

/**
 *
 * @author jessi
 */
public class Play extends Animal{
    //initialise variables
    private Animal pet;
    private int playOption;
    private String activity;
    private int playHunger;
    private int playHygiene;

    //play method to decrease hygiene but increase happiness and hunger
    public Play(Animal pet, int playOption){
        this.pet = pet;
        this.playOption = playOption;
        
        switch (playOption) {
            case 1:
                //lowest option
                this.activity = "Basic Fun";
                pet.happiness += 3;
                pet.hygiene -= 1;
                pet.hunger += 3;
                this.playHunger = 3;
                this.playHygiene = 2;
                break;
            case 2:
                //middle option
                this.activity = "Intermediate Fun";
                pet.happiness += 6;
                pet.hygiene -= 1;
                pet.hunger += 2;
                this.playHunger = 2;
                this.playHygiene = 2;
                break;
            case 3:
                //highest option
                this.activity = "Luxury Fun";
                pet.happiness += 9;
                pet.hygiene -= 1;
                pet.hunger += 1;
                this.playHunger = 1;
                this.playHygiene = 1;
                break;
            default:
                this.playHunger = 0;
                this.playOption = 0;
                this.playHygiene = 0;
                break;
        }
    }

    //Getters and Setters
    public int getPlayHunger() {
        return playHunger;
    }
    public void setPlayHunger(int playHunger) {
        this.playHunger = playHunger;
    }
    public Animal getPet() {
        return pet;
    }
    public void setPet(Animal pet) {
        this.pet = pet;
    }
    public int getPlayOption() {
        return playOption;
    }
    public void setPlayOption(int playOption) {
        this.playOption = playOption;
    }    
    public String getActivity() {
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
   
    //output to user the effects of Play
    public String playPet(){
        String playText = ("Pet has been given " + activity
                       + "\nPet Happiness is increased by " + playOption*3 + "\nHappiness: " + pet.happiness
                       + "\nPet Hunger is increased by " + this.playHunger + "\nHunger: " + pet.hunger
                       + "\nPet Hygiene is decreased by " + this.playHygiene + "\nHygiene: " + pet.hygiene);
        return playText;
    }
     
}
