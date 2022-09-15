/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPetGameGUI;

/**
 *
 * @author jessi
 */
public class Rabbit extends Animal{
    private String color;
    private String name;

    //initialise Rabbit specific stats from default values
    public Rabbit(String name, String color) {
        this.name = name;
        this.color = color;
        super.hunger = 3;
        super.happiness = 3;
        super.obedience = 2;
        super.hygiene = 3;
        super.intelligence = 1;
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
    public String getColor() {
        return ("Color: " + color);
    }
    public void setColor(String color) {
        this.color = color;
    }
}

