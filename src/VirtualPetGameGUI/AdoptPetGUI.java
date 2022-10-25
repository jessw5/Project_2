/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VirtualPetGameGUI;

import Animals.Rabbit;
import Animals.Animal;
import Animals.Dog;
import Animals.Cat;
import javax.swing.JFrame;
/**
 *
 * @author jessi
 */
public class AdoptPetGUI extends javax.swing.JFrame{

    public static Animal pet;
    public static String petText;
    
    private static JFrame frame = new JFrame();

    /**
     * Creates new form ChoosePetGUI
     */
    public AdoptPetGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questionLabel = new javax.swing.JLabel();
        animalComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PetColorText = new javax.swing.JTextField();
        PetNameText = new javax.swing.JTextField();
        AdoptPetButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        petTextArea = new javax.swing.JTextArea();
        TitleLabel = new javax.swing.JLabel();
        TitleLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EndButton = new javax.swing.JButton();
        RestartButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        PetStatsArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adopt a Pet");
        setMinimumSize(new java.awt.Dimension(600, 570));
        setPreferredSize(new java.awt.Dimension(600, 570));
        getContentPane().setLayout(null);

        questionLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        questionLabel.setText("Please choose your Pet");
        getContentPane().add(questionLabel);
        questionLabel.setBounds(40, 59, 143, 30);

        animalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"--Select Option--", "Dog", "Cat", "Rabbit" }));
        animalComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(animalComboBox);
        animalComboBox.setBounds(206, 62, 90, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Pet Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 100, 90, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Pet Color:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 140, 70, 20);

        PetColorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetColorTextActionPerformed(evt);
            }
        });
        getContentPane().add(PetColorText);
        PetColorText.setBounds(140, 140, 110, 22);

        PetNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetNameTextActionPerformed(evt);
            }
        });
        getContentPane().add(PetNameText);
        PetNameText.setBounds(140, 100, 110, 22);

        AdoptPetButton.setBackground(new java.awt.Color(255, 255, 51));
        AdoptPetButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AdoptPetButton.setText("Adopt Pet");
        AdoptPetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdoptPetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AdoptPetButton);
        AdoptPetButton.setBounds(420, 90, 110, 40);

        petTextArea.setColumns(20);
        petTextArea.setRows(5);
        jScrollPane2.setViewportView(petTextArea);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 180, 244, 212);

        TitleLabel.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        TitleLabel.setText("Virtual Pet Game");
        getContentPane().add(TitleLabel);
        TitleLabel.setBounds(190, 10, 153, 23);

        TitleLabel1.setBackground(new java.awt.Color(153, 255, 255));
        TitleLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        TitleLabel1.setText("  Adopt your Pet!");
        TitleLabel1.setOpaque(true);
        getContentPane().add(TitleLabel1);
        TitleLabel1.setBounds(34, 26, 120, 30);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(271, 198, 0, 0);

        EndButton.setBackground(new java.awt.Color(255, 0, 0));
        EndButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EndButton.setText("End");
        EndButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EndButton);
        EndButton.setBounds(490, 20, 70, 30);

        RestartButton.setBackground(new java.awt.Color(102, 255, 102));
        RestartButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RestartButton.setText("Restart");
        RestartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RestartButton);
        RestartButton.setBounds(400, 20, 80, 30);

        jPanel1.setLayout(null);

        PetStatsArea.setColumns(20);
        PetStatsArea.setRows(5);
        jScrollPane4.setViewportView(PetStatsArea);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(310, 180, 234, 212);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/petAdoptionPic.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 550, 490);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 580, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//Retrieves animal info depending on user selection
    private void animalComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalComboBoxActionPerformed

        if("Dog".equals(animalComboBox.getSelectedItem().toString())){
            petTextArea.setText("              _=,_\n" +
                "           o_/6 /#\\\n" +
                "           \\__ |##/\n" +
                "            ='|--\\\n" +
                "              /   #'-.\n" +
                "              \\#|_   _'-. /\n" +
                "               |/ \\_( # |\" \n" +
                "              C/ ,--___/");
            String nameDog = PetNameText.getText().trim();
            String colorDog = PetColorText.getText().trim();

            AdoptPetGUI.pet = new Dog(nameDog, colorDog);
            PetStatsArea.setText("\n" + pet.printInfo());
            AdoptPetGUI.petText = this.petTextArea.getText();
        }
        if("Cat".equals(animalComboBox.getSelectedItem().toString())){
            petTextArea.setText(" _._     _,-'\"\"`-._\n" +
                "(,-.`._,'(       |\\`-/|\n" +
                "    `-.-' \\ )-`( , o o)\n" +
                "          `-    \\`_`\"'-");
            String nameCat = PetNameText.getText().trim();
            String colorCat = PetColorText.getText().trim();

            AdoptPetGUI.pet = new Cat(nameCat, colorCat);
            PetStatsArea.setText("\n" + pet.printInfo());
            AdoptPetGUI.petText = this.petTextArea.getText();
        }
        if("Rabbit".equals(animalComboBox.getSelectedItem().toString())){
            petTextArea.setText("       _\n" +
                "      (\\\\\n" +
                "       \\||\n" +
                "     __(_\";\n" +
                "    /    \\\n" +
                "   {}___)\\)_");
            String nameRabbit = PetNameText.getText().trim();
            String colorRabbit = PetColorText.getText().trim();

            AdoptPetGUI.pet = new Rabbit(nameRabbit, colorRabbit);
            PetStatsArea.setText("\n" + pet.printInfo());
            AdoptPetGUI.petText = this.petTextArea.getText();
        }

    }//GEN-LAST:event_animalComboBoxActionPerformed

    private void PetColorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetColorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PetColorTextActionPerformed

    private void PetNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PetNameTextActionPerformed
//Display message pushing user to select option before continuing
    private void AdoptPetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdoptPetButtonActionPerformed
        // TODO add your handling code here:
        if ("--Select Option--".equals(animalComboBox.getSelectedItem().toString())){
            String text = "Please select a pet!";
            PetStatsArea.setText(text);
        }else if ("".equals(PetNameText.getText())){
            String text = "Please enter a name!";
            PetStatsArea.setText(text);      
        }else if ("".equals(PetColorText.getText())){
            String text = "Please enter a color!";
            PetStatsArea.setText(text);      
        }else if ("".equals(PetNameText.getText()) && "".equals(PetColorText.getText())){
            String text = "Please enter a name and color!";
            PetStatsArea.setText(text);      
        }else {
            pet.setanimalName(PetNameText.getText());
            pet.setColour(PetColorText.getText());
            petTextArea.append("\nYour pet details:");
            petTextArea.append("\nName: " + pet.getanimalName());
            petTextArea.append("\nColor: " + pet.getColour());
            AdoptPetGUI.petText = this.petTextArea.getText();
            new PetActions().setVisible(true);
            AdoptPetGUI.super.dispose();
        }
        
    }//GEN-LAST:event_AdoptPetButtonActionPerformed

    private void EndButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_EndButtonActionPerformed

    private void RestartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButtonActionPerformed
        // TODO add your handling code here:
        frame.setVisible(false);
         new IntroductionFrame().setVisible(true);
    }//GEN-LAST:event_RestartButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdoptPetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdoptPetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdoptPetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdoptPetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame = new AdoptPetGUI();
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdoptPetButton;
    private javax.swing.JButton EndButton;
    public javax.swing.JTextField PetColorText;
    public javax.swing.JTextField PetNameText;
    private javax.swing.JTextArea PetStatsArea;
    private javax.swing.JButton RestartButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TitleLabel1;
    public javax.swing.JComboBox<String> animalComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea petTextArea;
    private javax.swing.JLabel questionLabel;
    // End of variables declaration//GEN-END:variables

}
