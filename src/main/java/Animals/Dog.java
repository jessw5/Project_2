/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

/**
 *
 * @author jessi
 */
public class Dog extends Animal{
    private String color;
    private String name;

    //initialise Dog specific stats from default values
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        super.hunger = 2;
        super.happiness = 10;
        super.obedience = 5;
        super.hygiene = 5;
        super.intelligence = 3;
        super.animalName = name;
        super.colour = color;
    }

    //getters and setters
    public String getName() {
        return ("Name: " + name);
    }
    public void setName(String name) {
        this.name = name;
    }  
    public String getColor(){
        return ("Color: " + color);
    }
    public void setColor(String color) {
        this.color = color;
    }

}
