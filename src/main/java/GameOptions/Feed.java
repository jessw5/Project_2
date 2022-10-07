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
public class Feed extends Animal{
    private Animal pet;
    private int foodOption;
    private String food;
    private int foodHygiene;
    
    //feeds pet based on user input to the options on what food....
    public Feed(Animal pet, int foodOption){
        this.pet = pet;
        this.foodOption = foodOption;
        
        //user input decides which option is selected
        switch (foodOption) {
            //certain options locked behind money stat
            case 1:
                    if(pet.getMoney()< 2){
                    System.out.println("Insufficient funds");
                    this.food = "N/A";
                    this.foodOption = 0;
                    break;
                }
                this.food = "Basic Food: $2";
                pet.happiness += 1;
                pet.hunger -= 1;
                pet.hygiene -= 3;
                pet.money -= 2;
                this.foodHygiene = 3;
                break;
            case 2:
                if(pet.getMoney()< 4){
                    System.out.println("Insufficient funds");
                    this.food = "N/A";
                    this.foodOption = 0;
                    break;
                }
                this.food = "Intermediate Food: $4";
                pet.happiness += 2;
                pet.hunger -= 2;
                pet.hygiene -= 2;
                pet.money -= 4;
                this.foodHygiene = 2;
                break;
            case 3:
                if(pet.getMoney()< 6){
                    System.out.println("Insufficient funds");
                    this.food = "N/A";
                    this.foodOption = 0;
                    break;
                }
                this.food = "Luxury Food: $6";
                pet.happiness += 3;
                pet.hunger -= 3;
                pet.hygiene -= 1;
                pet.money -= 6;
                this.foodHygiene = 1;
                break;
            default:
                this.foodOption = 0;
                this.foodHygiene = 0;
                break;
        }
    }

    //getters and setters
    public Animal getPet() {
        return pet;
    }
    public void setPet(Animal pet) {
        this.pet = pet;
    }
    public int getFoodOption() {
        return foodOption;
    }
    public void setFoodOption(int foodOption) {
        this.foodOption = foodOption;
    }  
    public String getFood() {
        return food;
    }   
    public void setFood(String food) {
        this.food = food;
    }  
    public int getFoodHygiene() {
        return foodHygiene;
    }
    public void setFoodHygiene(int foodHygiene) {
        this.foodHygiene = foodHygiene;
    }
    
    //output to user effects of feed method
    public String feedPet(){
        String feedText = ("Pet is fed " + getFood() 
                        + "\nPet Happiness is increased by " + getFoodOption() + "\nHappiness: " + getPet().happiness
                        + "\nPet Hunger is decreased by " + getFoodOption() + "\nHunger: " + getPet().hunger
                        + "\nPet Hygiene is decreased by " + getFoodHygiene() + "\nHygiene: " + getPet().hygiene
                        + "\nMoney is decreased by " + getFoodOption()*2 + "\nMoney: " + getPet().money);
        
        return feedText;
//        System.out.println("Pet is fed " + getFood());
//        System.out.println("Pet Happiness is increased by " + getFoodOption() + "\nHappiness: " + getPet().happiness);
//        System.out.println("Pet Hunger is decreased by " + getFoodOption() + "\nHunger: " + getPet().hunger);
//        System.out.println("Pet Hygiene is decreased by " + getFoodHygiene() + "\nHygiene: " + getPet().hygiene);
//        System.out.println("Money is decreased by " + getFoodOption()*2 + "\nMoney: " + getPet().money);
    }
     
}

