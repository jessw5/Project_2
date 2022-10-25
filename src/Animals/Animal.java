
package Animals;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jessi
 */
public class Animal {
   
    public String animalName;
    public String colour;
    public int happiness;
    public int hunger;
    public int obedience;
    public int hygiene;
    public int intelligence;
    public int money;
    public int petScore;
    
    //initialise all variable statistics for animal
    public Animal(){
        this.animalName = "";
        this.colour = "";
        this.happiness = 0;
        this.hunger = 0;
        this.hygiene = 0;
        this.intelligence = 0;
        this.money = 30;
        this.obedience = 0;
        this.petScore = 0;          
    }

    //getters and setters for above stats
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }    
    public int getPetScore() {
        return petScore;
    }    
    public int getHappiness() {
        return happiness;
    }
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public int getObedience() {
        return obedience;
    }
    public void setObedience(int obedience) {
        this.obedience = obedience;
    }   
    public int getHygiene(){
        return hygiene;
    }   
    public void setHygiene(int hygiene){
        this.hygiene = hygiene;
    }   
    public String getanimalName() {
        return this.animalName;
    }    
    public void setanimalName(String animalName){
        this.animalName = animalName;
    }   
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    
    //Prints out pet's stats
    public String printInfo() {
        String petStats = (this.animalName + " Stats:"
                + "\nHunger: " + this.hunger
                + "\nHappiness: " + this.happiness
                + "\nObedience: " + this.obedience
                + "\nHygiene: " + this.hygiene
                + "\nIntelligence: " + this.intelligence
                + "\nMoney: " + this.money);

        return petStats;
    }

    //check happiness level, exit game if happiness = 40 or 0 respectively
    /**
     *
     * @param pet
     * @return
     */
    public String checkHappiness(Animal pet) {
        pet.happiness = happiness;
        String happinessText = "";

        if(happiness >= 1 && happiness < 10)
        {
            happinessText = ("\n" + this.animalName + " is not very happy\n");
        }
        else if(happiness >= 10 && happiness < 20)
        {
            happinessText = ("\n" + this.animalName + " is happy!\n");
        }
        else if(happiness >= 20 && happiness < 30)
        {
            happinessText = ("\n" + this.animalName + " is very happy!\n");
        }
        else if(happiness >= 30 && happiness < 40)
        {
            happinessText = ("\n" + this.animalName + " is extremely happy!\n");
        }
        this.petScore = this.happiness + this.hunger + this.hygiene + this.intelligence
                + this.money + this.obedience;
        return happinessText;
    }

    //checks hygiene level and if hygiene is less than 0, happiness and obedience decreases by 5
    public String checkHygiene(Animal pet){
        String hygieneText = "";
        if (pet.hygiene <= 0){
            pet.happiness -= 5;
            pet.obedience -= 5;
            pet.hygiene = 0;
            if(pet.happiness <= 0){
               pet.happiness = 0;
               hygieneText = ("\n" + pet.animalName + " is Dirty!"
                            + "\nHappiness and Obedience decreased by 5"
                            + "\nHappiness cannot be below zero"
                            + "\nHygiene cannot be below zero"
                            + "\nHappiness: " + pet.happiness + "\nObedience: " + pet.obedience
                            + "\nHygiene: " + pet.hygiene);
            }
            if(pet.obedience <= 0){
                pet.obedience = 0;
                hygieneText = ("\n" + pet.animalName + " is Dirty!"
                            + "\nHappiness and Obedience decreased by 5"
                            + "\nObedience cannot be below zero"
                            + "\nHygiene cannot be below zero"
                            + "\nHappiness: " + pet.happiness + "\nObedience: " + pet.obedience
                            + "\nHygiene: " + pet.hygiene);
            }
            if(pet.happiness <= 0 && pet.obedience <= 0){
               pet.happiness = 0;
               pet.obedience = 0;
               hygieneText = ("\n" + pet.animalName + " is Dirty!"
                            + "\nHappiness and Obedience decreased by 5"
                            + "\nHappiness and Obedience cannot be below zero"
                            + "\nHygiene cannot be below zero"
                            + "\nHappiness: " + pet.happiness + "\nObedience: " + pet.obedience
                            + "\nHygiene: " + pet.hygiene);
            }else{
            hygieneText = ("\n" + pet.animalName + " is Dirty!"
                            + "\nHappiness and Obedience decreased by 5"
                            + "\nHygiene cannot be below zero"
                            + "\nHappiness: " + pet.happiness + "\nObedience: " + pet.obedience
                            + "\nHygiene: " + pet.hygiene);
            }
        }
        return hygieneText;
    }
    
    //checks hunger level and if hunger is equal or more than 10, happiness decreases by 10.
    public String checkHunger(Animal pet){
        String hungerText = "";
        if (pet.hunger >= 10){
            pet.happiness -= 10;
            if(pet.happiness <= 0){
                pet.happiness = 0;
                hungerText = ("\n" + pet.animalName + " is very hungry!"
                        + "\nPet Happiness is decreased by 10"
                        + "\nHappiness cannot be below zero"
                        + "\nHappiness: " + pet.happiness);
            }else{
            hungerText = ("\n" + pet.animalName + " is very hungry!"
                        + "\nPet Happiness is decreased by 10"
                        + "\nHappiness: " + pet.happiness);
            }
        }if (pet.hunger <= 0){
            pet.hunger = 0;
            hungerText =("\nHunger cannot be less than 0"
                    + "\nHunger: " + pet.hunger);
        }
        return hungerText;
    }
    
    //Write to file and print to user, animal stat information
    public String printReportCard(){
        String petReport = ("\n" + "Pet report card for " + this.animalName
                + "\nPet details: \n"
                + "Happiness: " + this.happiness
                + "\nColor: " + this.colour
                + "\nHunger: " + this.hunger
                + "\nObedience: " + this.obedience
                + "\nHygiene: " + this.hygiene
                + "\nIntelligence: " + this.intelligence
                + "\nMoney: " + this.money
                + "\nPet Score: " + this.petScore);
        return petReport;
    }
    
}

