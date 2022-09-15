/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualPetGameGUI;

/**
 *
 * @author flynn
 */
public class Manual{
    
    //Game manual when called explains to user the basics of the game
    public static void main(){
        String text = ("Welcome to our Pet simulator!\n" +
"        The aim of the game is to make your pet as happy as possible!\n" +
"        Multiple actions are available each effecting different aspects of your pet such as,\n" +
"        happiness, hygiene, obedience, hunger and money.\n" +
"        Every action has some positive effect on your pet but watch out as there are negatives aswell,\n" +
"        Training - Obiedience\n" +
"        Cleaning - Hygiene\n" +
"        Performing - Money\n" +
"        Feeding - Hunger\n" +
"        Playing - Happiness\n" +
"        \n" +
                
"        You want to keep your hunger level down while raising happiness, hygiene and other stats up\n" +
"        \n" +
                
"        If you do not treat your pet properly you may incur consequences such as:\n" +
"        running away if unhappy\n" +
"        getting sick if hygiene lowers to 0\n" +
"        happiness drop if hunger reaches 10\n" +
"        inability to perform if not properly trained\n");
      
        new GUI("Game Manual", text);
        
    }

    
}
