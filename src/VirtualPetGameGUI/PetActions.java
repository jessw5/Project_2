/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VirtualPetGameGUI;

import GameOptions.Train;
import GameOptions.Play;
import GameOptions.Perform;
import GameOptions.Feed;
import GameOptions.Clean;
import static VirtualPetGameGUI.AdoptPetGUI.pet;
import static VirtualPetGameGUI.AdoptPetGUI.petText;
import static VirtualPetGameGUI.IntroductionFrame.player;
import javax.swing.JFrame;

/**
 *
 * @author flynn
 */
public class PetActions extends JFrame{
    
    private static JFrame frame = new JFrame();
 
    /**
     * Creates new form NewJPanel
     */
    public PetActions() {
        initComponents();
        this.PetTextArea.setText(petText);
        PetStatsArea1.setText(pet.printInfo());
        player.setScore(pet.petScore);
        PetGameArea.setText("What would you like to feed " + pet.animalName
                + "\nOptions are:\n"
                + "1. Basic Food: $2\n"
                + "2. Intermediate Food: $4\n"
                + "3. Luxury Food: $6");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PetTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        PetStatsArea1 = new javax.swing.JTextArea();
        TitleLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ScoresButton = new javax.swing.JButton();
        PetReportButton = new javax.swing.JButton();
        EndButton = new javax.swing.JButton();
        RestartButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PetActionsCombobox = new javax.swing.JComboBox<>();
        Option1 = new javax.swing.JRadioButton();
        Option2 = new javax.swing.JRadioButton();
        Option3 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        PetGameArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game");
        setMinimumSize(new java.awt.Dimension(720, 500));
        setSize(new java.awt.Dimension(720, 500));
        getContentPane().setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        PetTextArea.setColumns(20);
        PetTextArea.setRows(5);
        jScrollPane1.setViewportView(PetTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 270, 210);

        PetStatsArea1.setColumns(20);
        PetStatsArea1.setRows(5);
        jScrollPane4.setViewportView(PetStatsArea1);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(20, 280, 270, 165);

        TitleLabel.setBackground(new java.awt.Color(204, 255, 204));
        TitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleLabel.setText(" Pet Actions");
        TitleLabel.setOpaque(true);
        getContentPane().add(TitleLabel);
        TitleLabel.setBounds(50, 20, 110, 30);

        jPanel3.setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPanel2.setOpaque(false);

        ScoresButton.setBackground(new java.awt.Color(255, 255, 102));
        ScoresButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ScoresButton.setText("Scores");
        ScoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoresButtonActionPerformed(evt);
            }
        });

        PetReportButton.setBackground(new java.awt.Color(102, 255, 204));
        PetReportButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PetReportButton.setText("Pet Report");
        PetReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetReportButtonActionPerformed(evt);
            }
        });

        EndButton.setBackground(new java.awt.Color(255, 51, 0));
        EndButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EndButton.setText("End");
        EndButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndButtonActionPerformed(evt);
            }
        });

        RestartButton.setBackground(new java.awt.Color(102, 255, 102));
        RestartButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RestartButton.setText("Restart");
        RestartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RestartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PetReportButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(ScoresButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EndButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PetReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RestartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EndButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(265, 0, 110, 252);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("What would you like to do with your Pet?");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 20, 254, 20);

        PetActionsCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feed", "Play", "Clean", "Train", "Perform" }));
        PetActionsCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetActionsComboboxActionPerformed(evt);
            }
        });
        jPanel1.add(PetActionsCombobox);
        PetActionsCombobox.setBounds(20, 50, 77, 22);

        Option1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Option1.setText("Option 1");
        Option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option1ActionPerformed(evt);
            }
        });
        jPanel1.add(Option1);
        Option1.setBounds(0, 80, 80, 20);

        Option2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Option2.setText("Option 2");
        Option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option2ActionPerformed(evt);
            }
        });
        jPanel1.add(Option2);
        Option2.setBounds(90, 80, 80, 20);

        Option3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Option3.setText("Option 3");
        Option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option3ActionPerformed(evt);
            }
        });
        jPanel1.add(Option3);
        Option3.setBounds(180, 80, 80, 20);

        PetGameArea.setColumns(20);
        PetGameArea.setRows(5);
        jScrollPane3.setViewportView(PetGameArea);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(0, 120, 260, 300);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(310, 0, 390, 470);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cloudsBackground.jpg"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 480);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 700, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option3ActionPerformed

        if(null != PetActionsCombobox.getSelectedItem().toString())
        switch (PetActionsCombobox.getSelectedItem().toString()) {
            case "Feed":
            Feed feed = new Feed(pet, 3);
            PetGameArea.setText(feed.feedPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            case "Clean":
            Clean clean = new Clean(pet, 3);
            PetGameArea.setText(clean.cleanPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            case "Play":
            Play play = new Play(pet, 3);
            PetGameArea.setText(play.playPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            case "Train":
            Train train = new Train(pet, 3);
            PetGameArea.setText(train.trainPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            case "Perform":
            Perform perform = new Perform(pet, 3);
            PetGameArea.setText(perform.performPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            default:
            break;
        }
        Option1.setSelected(false);
        Option2.setSelected(false);
        PetGameArea.append(pet.checkHygiene(pet));
        PetGameArea.append(pet.checkHunger(pet));
        PetGameArea.append(pet.checkHappiness(pet));
        PetStatsArea1.setText(pet.printInfo());
        player.setScore(pet.petScore);
        if (pet.happiness >= 40){
            Ending.goodGame();
            PetActions.super.dispose();
        } else if (pet.happiness == 0){
            Ending.badGame();
            PetActions.super.dispose();
        }
    }//GEN-LAST:event_Option3ActionPerformed

    private void Option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option2ActionPerformed

        if(null != PetActionsCombobox.getSelectedItem().toString())
        switch (PetActionsCombobox.getSelectedItem().toString()) {
            case "Feed":
            Feed feed = new Feed(pet, 2);
            PetGameArea.setText(feed.feedPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            case "Clean":
            Clean clean = new Clean(pet, 2);
            PetGameArea.setText(clean.cleanPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            case "Play":
            Play play = new Play(pet, 2);
            PetGameArea.setText(play.playPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            case "Train":
            Train train = new Train(pet, 2);
            PetGameArea.setText(train.trainPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            case "Perform":
            Perform perform = new Perform(pet, 2);
            PetGameArea.setText(perform.performPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            default:
            break;
        }
        Option1.setSelected(false);
        Option3.setSelected(false);
        PetGameArea.append(pet.checkHygiene(pet));
        PetGameArea.append(pet.checkHunger(pet));
        PetGameArea.append(pet.checkHappiness(pet));
        PetStatsArea1.setText(pet.printInfo());
        player.setScore(pet.petScore);
        if (pet.happiness >= 40){
            Ending.goodGame();
            PetActions.super.dispose();
        } else if (pet.happiness == 0){
            Ending.badGame();
            PetActions.super.dispose();
        }
    }//GEN-LAST:event_Option2ActionPerformed

    private void Option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option1ActionPerformed

        if(null != PetActionsCombobox.getSelectedItem().toString())
        switch (PetActionsCombobox.getSelectedItem().toString()) {
            case "Feed":
            Feed feed = new Feed(pet, 1);
            PetGameArea.setText(feed.feedPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            case "Clean":
            Clean clean = new Clean(pet, 1);
            PetGameArea.setText(clean.cleanPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            case "Play":
            Play play = new Play(pet, 1);
            PetGameArea.setText(play.playPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            case "Train":
            Train train = new Train(pet, 1);
            PetGameArea.setText(train.trainPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            case "Perform":
            Perform perform = new Perform(pet, 1);
            PetGameArea.setText(perform.performPet());
            PetStatsArea1.setText(pet.printInfo());
            break;
            default:
            break;
        }
        Option2.setSelected(false);
        Option3.setSelected(false);
        PetGameArea.append(pet.checkHygiene(pet));
        PetGameArea.append(pet.checkHunger(pet));
        PetGameArea.append(pet.checkHappiness(pet));
        PetStatsArea1.setText(pet.printInfo());
        player.setScore(pet.petScore);
        if (pet.happiness >= 40){
            Ending.goodGame();
            PetActions.super.dispose();
        } else if (pet.happiness == 0){
            Ending.badGame();
            PetActions.super.dispose();
        }
    }//GEN-LAST:event_Option1ActionPerformed

    private void PetActionsComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetActionsComboboxActionPerformed
        // TODO add your handling code here:
        Option1.setSelected(false);
        Option2.setSelected(false);
        Option3.setSelected(false);
        if("Feed".equals(PetActionsCombobox.getSelectedItem().toString())){
            PetGameArea.setText("What would you like to feed " + pet.animalName
                + "\nOptions are:\n"
                + "1. Basic Food: $2\n"
                + "2. Intermediate Food: $4\n"
                + "3. Luxury Food: $6");
        }
        if("Clean".equals(PetActionsCombobox.getSelectedItem().toString())){
            PetGameArea.setText("How would you like to Clean " + pet.animalName
                + "\nOptions are:\n"
                + "1. Basic Cleaning\n"
                + "2. Intermediate Cleaning\n"
                + "3. Luxury Cleaning");
        }
        if("Play".equals(PetActionsCombobox.getSelectedItem().toString())){
            PetGameArea.setText("How would you like to Play with " + pet.animalName
                + "\nOptions are:\n"
                + "1. Basic Fun\n"
                + "2. Intermediate Fun\n"
                + "3. Luxury Fun");
        }
        if("Train".equals(PetActionsCombobox.getSelectedItem().toString())){
            PetGameArea.setText("How would you like to Train " + pet.animalName
                + "\nOptions are:\n"
                + "1. Basic Training\n"
                + "2. Intermediate Training\n"
                + "3. Luxury Training");
        }
        if("Perform".equals(PetActionsCombobox.getSelectedItem().toString())){
            PetGameArea.setText("What act would you and " + pet.animalName + " like to perform"
                + "\nOptions are:\n"
                + "1. Basic Show\n"
                + "2. Intermediate Show\n"
                + "3. Advanced Show");
        }
    }//GEN-LAST:event_PetActionsComboboxActionPerformed

    private void RestartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButtonActionPerformed
        // TODO add your handling code here:
        PetActions.super.dispose();
        new IntroductionFrame().setVisible(true);
    }//GEN-LAST:event_RestartButtonActionPerformed

    private void EndButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_EndButtonActionPerformed

    private void PetReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetReportButtonActionPerformed
        // TODO add your handling code here:
        PetReport.main(pet);
    }//GEN-LAST:event_PetReportButtonActionPerformed

    private void ScoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoresButtonActionPerformed
        // TODO add your handling code here:
        PetUser.main(player);
    }//GEN-LAST:event_ScoresButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PetActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame = new PetActions();
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EndButton;
    private javax.swing.JRadioButton Option1;
    private javax.swing.JRadioButton Option2;
    private javax.swing.JRadioButton Option3;
    private javax.swing.JComboBox<String> PetActionsCombobox;
    private javax.swing.JTextArea PetGameArea;
    private javax.swing.JButton PetReportButton;
    private javax.swing.JTextArea PetStatsArea1;
    private javax.swing.JTextArea PetTextArea;
    private javax.swing.JButton RestartButton;
    private javax.swing.JButton ScoresButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

}