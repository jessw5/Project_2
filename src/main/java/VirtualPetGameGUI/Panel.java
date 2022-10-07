/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPetGameGUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Collections;
import javax.swing.*;



/**
 *
 * @author jessi
 */
public class Panel extends JPanel{
    
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 350;
    
    public Image image;

    public Panel() {
        this.image = new ImageIcon("./images/petimage.jpg").getImage();
    }

    /**
     * Draw the background of this panel.
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.image, 0, 0, null);
    }
    
   
    Panel(String text){
        
    JTextArea gameManualText = new JTextArea();
    gameManualText.setText(text);
    this.add(gameManualText);
    this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
    this.setFocusable(true);
    this.setVisible(true);
    }
    
    Panel(PetUser user){
        
    JTextArea gamePlayers = new JTextArea();
    gamePlayers.append("Player: " + user.getUsername() + " Score: " + user.getScore()
                    + "\nHighest Score: " + user.getHighestScore());
    //+ +Collections.max(super.list));
    this.add(gamePlayers);
    this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
    this.setFocusable(true);
    this.setVisible(true);
    }
    
}

