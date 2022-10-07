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
public class Perform extends Animal{
    private Animal pet;
    private int performOption;
    private String perform;
    private int performHunger;

    //perform method to increase money according to user input
    public Perform(Animal pet, int performOption){
        this.pet = pet;
        this.performOption = performOption;
        
        //user input decide which option seleceted
        switch (this.performOption) {
            //certain options locked behind obiedience stat
            case 1:
                this.perform = "Basic Show";
                pet.money += 10;
                pet.hunger += 3;
                this.performHunger = 3;
                break;
            case 2:
                if(pet.getObedience() < 10){
                    System.out.println(pet.animalName + " needs more training!");
                    this.perform = "N/A";
                    this.performOption = 0;
                    break;
                }
                this.perform = "Intermediate Show";
                pet.money += 20;
                pet.hunger += 2;
                this.performHunger = 2;
                break;
            case 3:
                if(pet.getObedience() < 20){
                    System.out.println(pet.animalName + " needs more training!");
                    this.perform = "N/A";
                    this.performOption = 0;
                    break;
                }
                this.perform = "Advanced Show";
                pet.money += 30;
                pet.hunger += 1;
                this.performHunger = 1;
                break;
            default:
                this.performOption = 0;
                this.performHunger = 0;
                break;
        }
    }

    //Getters and Setters
    public int getPerformHunger() {
        return performHunger;
    }
    public void setPerformHunger(int performHunger) {
        this.performHunger = performHunger;
    }
    public Animal getPet() {
        return pet;
    }
    public void setPet(Animal pet) {
        this.pet = pet;
    }
    public int getPerformOption() {
        return performOption;
    }
    public void setPerformOption(int performOption) {
        this.performOption = performOption;
    }   
    public String getPerform() {
        return perform;
    }
    public void setFood(String perform) {
        this.perform = perform;
    }
   
    //output stats effected by perform method
    public String performPet(){
        String performText = ("You and " + pet.animalName + " Perform: " + perform
                    + "\nMoney increased by: " + performOption*10 + "\nMoney: " + pet.money
                    + "\nHunger increased by: " + this.performHunger + "\nHunger: " + pet.hunger);
        return performText;
    }
     
}
