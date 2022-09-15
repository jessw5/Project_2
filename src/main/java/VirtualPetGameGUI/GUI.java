/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualPetGameGUI;

/**
 *
 * @author jessi
 */

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame {
    
    public GUI(String title, String text) {
       
        this.add(new Panel(text));
        this.setTitle(title);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        JLabel textLabel = new JLabel("Click Me!!");
        textLabel.setFont(new Font("Verdana",Font.BOLD,24));
        Panel centerPanel = new Panel();
        centerPanel.add(textLabel);
        this.add(centerPanel, BorderLayout.CENTER);
                
    }
    

    GUI(String players_Scores, PetUser user) {
        this.add(new Panel(user));
        this.setTitle(players_Scores);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        JLabel textLabel = new JLabel("Click Me!!");
        textLabel.setFont(new Font("Verdana",Font.BOLD,24));
        Panel centerPanel = new Panel();
        centerPanel.add(textLabel);
        this.add(centerPanel, BorderLayout.CENTER);
    }

   
}

