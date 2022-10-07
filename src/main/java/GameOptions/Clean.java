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
public class Clean extends Animal{
    private Animal pet;
    private int cleaningOption;
    private String clean;
    private int cleanHappiness;

    //Clean method affects hygiene stats depending on user input
    public Clean(Animal pet, int cleaningOption){
        this.pet = pet;
        this.cleaningOption = cleaningOption;
        
        //allow clean method only if pet.money is high enough
        switch(cleaningOption){
            case 1:
                if(pet.getMoney()< 2){
                    System.out.println("Insufficient funds");
                    this.clean = "N/A";
                    this.cleaningOption = 0;
                    break;
                }
                this.clean = "Basic clean: $2";
                pet.happiness -= 3;
                pet.hygiene += 1;
                pet.money -= 2;
                this.cleanHappiness = 3;
                break;
            case 2:
                if(pet.getMoney()< 4){
                    System.out.println("Insufficient funds");
                    this.clean = "N/A";
                    this.cleaningOption = 0;
                    break;
                }
                this.clean = "Intermediate Clean: $4";
                pet.happiness -= 2;
                pet.hygiene += 2;
                pet.money -= 4;
                this.cleanHappiness = 2;
                break;
            case 3:
                if(pet.getMoney()< 6){
                    System.out.println("Insufficient funds");
                    this.clean = "N/A";
                    this.cleaningOption = 0;
                    break;
                }
                this.clean = "Luxury Clean: $6";
                pet.happiness -= 1;
                pet.hygiene += 3;
                pet.money -= 6;
                this.cleanHappiness = 1;
                break;
            default:
                this.cleaningOption = 0;
                this.cleanHappiness = 0;
                break;
        }
    }
    
    //getters and setters
    public int getCleanHappiness() {
        return cleanHappiness;
    }
    public void setCleanHappiness(int cleanHappiness) {
        this.cleanHappiness = cleanHappiness;
    }
    public Animal getPet(){
        return pet;
    }
    public void setPet(Animal pet){
        this.pet = pet;
    }   
    public int getCleaningOption(){
        return cleaningOption;
    }
    public void setCleaningOption(int cleaningOption){
        this.cleaningOption = cleaningOption;
    }   
    public String getClean(){
        return clean;
    }
    public void setClean(String clean){
        this.clean = clean;
    }
    
    //output to user the effects of clean
    public String cleanPet(){
        String cleanText = ("Pet has been given a " + clean
                        + "\nPet happiness is decreased by "+ this.cleanHappiness + "\nHappiness: " + pet.happiness
                        + "\nPet Hygiene is increased by " + cleaningOption + "\nHygiene: " + pet.hygiene
                        + "\nMoney is decreased by " + cleaningOption*2 + "\nMoney: " + pet.getMoney());
        return cleanText;
    }
}
