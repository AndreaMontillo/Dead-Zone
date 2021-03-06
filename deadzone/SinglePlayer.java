/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadzone;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class SinglePlayer extends javax.swing.JFrame {
    

    private ImageIcon ridimensionaImageIcon(URL url, int nuovaW, int nuovaH){
        ImageIcon image = new ImageIcon(url);
        Image immagineScalata = image.getImage().getScaledInstance(nuovaW, nuovaH, Image.SCALE_DEFAULT);
        return new ImageIcon(immagineScalata);
    }
    /**
     * Creates new form SinglePlayer
     */
    public SinglePlayer() {
        Image iconaFrame;
        iconaFrame = new ImageIcon(getClass().getResource("icona_frame.png")).getImage();
        this.setIconImage(iconaFrame);  
        
        System.out.println("Single Player");
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        dim.setSize(1920*2/5, 575);
        this.setPreferredSize(dim.getSize());
        
        
        initComponents();
        
        sfondo.setPreferredSize(dim.getSize());        
        jTextField1.setBackground(new Color(0, 0, 0, 0));
        jButtonUomo.setBackground(new Color(0, 0, 0, 0));
        jButtonDonna.setBackground(new Color(0, 0, 0, 0));
        
        ImageIcon i = ridimensionaImageIcon(getClass().getResource("soldato_uomo.png"), jButtonUomo.getWidth(), jButtonUomo.getHeight());
        jButtonUomo.setIcon(i);
        
        ImageIcon i2  = ridimensionaImageIcon(getClass().getResource("soldato_donna.png"), jButtonDonna.getWidth(), jButtonDonna.getHeight());
        jButtonDonna.setIcon(i2);
        
        
        jTextField1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                if (jTextField1.getText().length() >= 12)
                    e.consume();
            }
        });
        
        
        //jTextField1 = text;
        //text.setBackground(new Color(0, 0, 0, 0));

//        String [] score = new String[]{"Andrea789012:   100", "Ciccioiiiiii:   50", "Oscar, 30", "Giovanni, 10", "EEE, 10", "ggg, 6", "ooo, 4", "dddd, 2", "eee, 1", "ddd, 1"};
//        jScore1.setText(jScore1.getText() + "   " + score[0]);
//        jScore2.setText(jScore2.getText() + "   " + score[1]);
//        jScore3.setText(jScore3.getText() + "   " + score[2]);
//        jScore4.setText(jScore4.getText() + "   " + score[3]);
//        jScore5.setText(jScore5.getText() + "   " + score[4]);
//        jScore6.setText(jScore6.getText() + "   " + score[5]);
//        jScore7.setText(jScore7.getText() + "   " + score[6]);
//        jScore8.setText(jScore8.getText() + "   " + score[7]);
//        jScore9.setText(jScore9.getText() + "   " + score[8]);
//        jScore10.setText(jScore10.getText() + "  " + score[9]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScoreboard = new javax.swing.JLabel();
        jScore1 = new javax.swing.JLabel();
        jScore3 = new javax.swing.JLabel();
        jScore10 = new javax.swing.JLabel();
        jScore2 = new javax.swing.JLabel();
        jScore4 = new javax.swing.JLabel();
        jScore5 = new javax.swing.JLabel();
        jScore6 = new javax.swing.JLabel();
        jScore7 = new javax.swing.JLabel();
        jScore8 = new javax.swing.JLabel();
        jScore9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonDonna = new javax.swing.JButton();
        jButtonUomo = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonPlay = new javax.swing.JButton();
        sfondo = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DEAD ZONE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Select your avatar:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 140, 216, 39);

        jTextField1.setBackground(new java.awt.Color(255, 51, 51));
        jTextField1.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jTextField1.setMinimumSize(new java.awt.Dimension(193, 39));
        jTextField1.setOpaque(false);
        jTextField1.setPreferredSize(new java.awt.Dimension(193, 39));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(100, 60, 193, 39);

        jScoreboard.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jScoreboard.setForeground(new java.awt.Color(255, 255, 255));
        jScoreboard.setText("          Scoreboard:");
        jScoreboard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jScoreboard);
        jScoreboard.setBounds(480, 30, 290, 30);

        jScore1.setBackground(new java.awt.Color(255, 255, 255));
        jScore1.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jScore1.setForeground(new java.awt.Color(255, 255, 255));
        jScore1.setText("1)");
        getContentPane().add(jScore1);
        jScore1.setBounds(480, 90, 290, 30);

        jScore3.setBackground(new java.awt.Color(255, 153, 255));
        jScore3.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jScore3.setForeground(new java.awt.Color(255, 255, 255));
        jScore3.setText("3)");
        getContentPane().add(jScore3);
        jScore3.setBounds(480, 170, 290, 30);

        jScore10.setBackground(new java.awt.Color(255, 153, 255));
        jScore10.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jScore10.setForeground(new java.awt.Color(255, 255, 255));
        jScore10.setText("10)");
        getContentPane().add(jScore10);
        jScore10.setBounds(480, 450, 290, 30);

        jScore2.setBackground(new java.awt.Color(255, 153, 255));
        jScore2.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jScore2.setForeground(new java.awt.Color(255, 255, 255));
        jScore2.setText("2)");
        getContentPane().add(jScore2);
        jScore2.setBounds(480, 130, 290, 30);

        jScore4.setBackground(new java.awt.Color(255, 153, 255));
        jScore4.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jScore4.setForeground(new java.awt.Color(255, 255, 255));
        jScore4.setText("4)");
        getContentPane().add(jScore4);
        jScore4.setBounds(480, 210, 290, 30);

        jScore5.setBackground(new java.awt.Color(255, 153, 255));
        jScore5.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jScore5.setForeground(new java.awt.Color(255, 255, 255));
        jScore5.setText("5)");
        getContentPane().add(jScore5);
        jScore5.setBounds(480, 250, 290, 30);

        jScore6.setBackground(new java.awt.Color(255, 153, 255));
        jScore6.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jScore6.setForeground(new java.awt.Color(255, 255, 255));
        jScore6.setText("6)");
        getContentPane().add(jScore6);
        jScore6.setBounds(480, 290, 290, 30);

        jScore7.setBackground(new java.awt.Color(255, 153, 255));
        jScore7.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jScore7.setForeground(new java.awt.Color(255, 255, 255));
        jScore7.setText("7)");
        getContentPane().add(jScore7);
        jScore7.setBounds(480, 330, 290, 30);

        jScore8.setBackground(new java.awt.Color(255, 153, 255));
        jScore8.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jScore8.setForeground(new java.awt.Color(255, 255, 255));
        jScore8.setText("8)");
        getContentPane().add(jScore8);
        jScore8.setBounds(480, 370, 290, 30);

        jScore9.setBackground(new java.awt.Color(255, 153, 255));
        jScore9.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jScore9.setForeground(new java.awt.Color(255, 255, 255));
        jScore9.setText("9)");
        getContentPane().add(jScore9);
        jScore9.setBounds(480, 410, 290, 30);

        jLabel3.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Insert your name:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 20, 189, 39);

        jButtonDonna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonDonna.setBorderPainted(false);
        jButtonDonna.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDonna.setOpaque(false);
        jButtonDonna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDonnaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDonna);
        jButtonDonna.setBounds(220, 190, 130, 230);

        jButtonUomo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonUomo.setBorderPainted(false);
        jButtonUomo.setOpaque(false);
        jButtonUomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUomoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUomo);
        jButtonUomo.setBounds(60, 190, 130, 230);

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack);
        jButtonBack.setBounds(60, 490, 59, 25);

        jButtonPlay.setText("Select Map");
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPlay);
        jButtonPlay.setBounds(330, 490, 100, 25);

        sfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deadzone/sfondo_senza_spari.png"))); // NOI18N
        getContentPane().add(sfondo);
        sfondo.setBounds(0, 0, 860, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonUomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUomoActionPerformed
        // TODO add your handling code here:
        jButtonUomo.setBorderPainted(true);
        System.out.println("Selezionato Uomo");
    }//GEN-LAST:event_jButtonUomoActionPerformed

    private void jButtonDonnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDonnaActionPerformed
        // TODO add your handling code here:
        System.out.println("Selezionato Donna");
        jButtonUomo.setBorderPainted(false);
    }//GEN-LAST:event_jButtonDonnaActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
        // TODO add your handling code here:
        if(!jTextField1.getText().isEmpty() && (jButtonUomo.isBorderPainted() || jButtonDonna.isBorderPainted())){
            new MapFrame(this).setVisible(true);
            this.setVisible(false);
            
            
        }
        else{
            int w = new ImageIcon(getClass().getResource("LogoBiancoENero.png")).getIconWidth()*1/6;
            int h = new ImageIcon(getClass().getResource("LogoBiancoENero.png")).getIconHeight()*1/6;
            ImageIcon i = ridimensionaImageIcon(getClass().getResource("LogoBiancoENero.png"),w,h);
            JOptionPane.showConfirmDialog(rootPane, "Please select the properties of the character", "Player selection DeadZone", JOptionPane.PLAIN_MESSAGE, JOptionPane.OK_OPTION, i);

        }
        
    }//GEN-LAST:event_jButtonPlayActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDonna;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JButton jButtonUomo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jScore1;
    private javax.swing.JLabel jScore10;
    private javax.swing.JLabel jScore2;
    private javax.swing.JLabel jScore3;
    private javax.swing.JLabel jScore4;
    private javax.swing.JLabel jScore5;
    private javax.swing.JLabel jScore6;
    private javax.swing.JLabel jScore7;
    private javax.swing.JLabel jScore8;
    private javax.swing.JLabel jScore9;
    private javax.swing.JLabel jScoreboard;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel sfondo;
    // End of variables declaration//GEN-END:variables
}
