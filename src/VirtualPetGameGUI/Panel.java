/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPetGameGUI;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author jessi
 */
public class Panel extends JPanel{
    
    static final int SCREEN_WIDTH = 700;
    static final int SCREEN_HEIGHT = 500;
    
    public Image image;

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
//        JLabel image = new JLabel();
//        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cuteBackground.jpg")));
        this.image = new ImageIcon("./images/cuteBackground.jpg").getImage();
        JTextArea gameText = new JTextArea();
        gameText.setText(text);
        gameText.setEditable(false);
        gameText.setFont(new Font("Verdana",Font.PLAIN,14));
        this.add(gameText);
       // this.add(image);
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setFocusable(true);
        this.setVisible(true);
    }
    
    Panel(PetUser user){
//        JLabel image = new JLabel();
//        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cuteBackground.jpg")));
        this.image = new ImageIcon("./images/cuteBackground.jpg").getImage();
        JTextArea gamePlayers = new JTextArea();
        gamePlayers.append("Player: " + user.getUsername() + "     Score: " + user.getScore());
        gamePlayers.setEditable(false);
        gamePlayers.setFont(new Font("Verdana",Font.PLAIN,16));
        this.add(gamePlayers);
        //this.add(image);
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setFocusable(true);
        this.setVisible(true);
    }
    
}

