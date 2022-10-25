/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

/**
 *
 * @author jessi
 */
public class Cat extends Animal{
    private String color;
    private String name;

    //initialise Cat specific stats from default values
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        super.hunger = 3;
        super.happiness = 5;
        super.obedience = 7;
        super.hygiene = 7;
        super.intelligence = 4;
        super.animalName = name;
        super.colour = color;
        super.money = 30;
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

