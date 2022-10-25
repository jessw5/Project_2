/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPetGameGUI;

import Animals.Animal;

/**
 *
 * @author jessi
 */
public class PetReport {
    public static void main(Animal pet) {
        String petReport = ("\nThank you for playing Virtual Pet Game!"
                        + "\n" + pet.printReportCard());
        GUI gui;
        gui = new GUI("Pet Report",petReport);
    }

}
