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
public class Train extends Animal{
    //initialise variables
    private Animal pet;
    private int trainOption;
    private String train;
    private int trainHunger;
    private int trainHygiene;
    
    //Train method to increase obedience, happiness and hunger while decreasing hygiene
    public Train(Animal pet, int trainOption){
        this.pet = pet;
        this.trainOption = trainOption;
        
        switch (trainOption) {
            case 1:
                //lowest option
                this.train = "Basic Training";
                pet.happiness += 1;
                pet.obedience += 1;
                pet.hunger += 3;
                pet.hygiene -= 3;
                this.trainHunger = 3;
                this.trainHygiene = 3;
                break;
            case 2:
                //middle option
                this.train = "Intermediate Training";
                pet.happiness += 2;
                pet.obedience += 2;
                pet.hunger += 2;
                pet.hygiene -= 2;
                this.trainHunger = 2;
                this.trainHygiene = 2;
                break;
            case 3:
                //highest option
                this.train = "Luxury Training";
                pet.happiness += 3;
                pet.obedience += 3;
                pet.hunger += 1;
                pet.hygiene -= 1;
                this.trainHunger = 1;
                this.trainHygiene = 1;
                break;
            default:
                this.trainHunger = 0;
                this.trainHygiene = 0;
                this.trainOption = 0;
                break;
        }
    }

    //getter and setters
    public int getTrainHunger() {
        return trainHunger;
    }
    public void setTrainHunger(int trainHunger) {
        this.trainHunger = trainHunger;
    }
    public int getTrainHygiene() {
        return trainHygiene;
    }
    public void setTrainHygiene(int trainHygiene) {
        this.trainHygiene = trainHygiene;
    }
    public Animal getPet() {
        return pet;
    }
    public void setPet(Animal pet) {
        this.pet = pet;
    }
    public int getTrainOption() {
        return trainOption;
    }
    public void setTrainOption(int trainOption) {
        this.trainOption = trainOption;
    }  
    public String getTrain() {
        return train;
    }
    public void setFood(String train) {
        this.train = train;
    }
   
    //output to user effects of train
    public String trainPet(){
        String trainText = ("Pet has been given " + train
                        + "\nPet Happiness is increased by " + trainOption + "\nHappiness: " + pet.happiness
                        + "\nPet Obedience is increased by " + trainOption + "\nObedience: " + pet.obedience
                        + "\nPet Hunger is increased by " + this.trainHunger + "\nHunger: " + pet.hunger
                        + "\nPet Hygiene is decreased by " + this.trainHygiene + "\nHygiene: " + pet.hygiene);
        return trainText;
    }
     
}
