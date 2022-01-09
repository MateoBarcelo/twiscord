/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package me.legadyn.jframe;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.legadyn.config.Keys;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class OptionsFrame extends javax.swing.JFrame {
    
    private Font customFont;
    private static FileWriter filew;
    public OptionsFrame() throws FileNotFoundException, IOException, ParseException {
        
        try {
    //create the font to use. Specify the size!
            customFont = Font.createFont(Font.TRUETYPE_FONT, MainFrame.class.getResourceAsStream("/Roboto-Medium.ttf")).deriveFont(14f);   

            GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            genv.registerFont(customFont);
            // makesure to derive the size
            
        } catch (IOException e) {        
            e.printStackTrace();
        } catch(FontFormatException e) {
            e.printStackTrace();
        }
        initComponents();       
        updatetext.setVisible(false);
        setVisible(false);
        loadKeys();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        accessField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        accessSecretField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        consumerField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        consumerSecretField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tokenField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        updateButton = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        updatetext = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        channelIDField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opciones");
        setBackground(new java.awt.Color(35, 39, 42));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(35, 39, 42));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(customFont.deriveFont(12f));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Access Key");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 40));

        accessField.setBackground(new java.awt.Color(55, 59, 64));
        accessField.setFont(customFont.deriveFont(11f));
        accessField.setForeground(new java.awt.Color(153, 153, 153));
        accessField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(accessField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 260, 30));

        jLabel3.setFont(customFont.deriveFont(12f));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Access Secret");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 40));

        accessSecretField.setBackground(new java.awt.Color(55, 59, 64));
        accessSecretField.setFont(customFont.deriveFont(11f));
        accessSecretField.setForeground(new java.awt.Color(153, 153, 153));
        accessSecretField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(accessSecretField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 260, 30));

        jLabel4.setFont(customFont.deriveFont(12f));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consumer Key");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 40));

        consumerField.setBackground(new java.awt.Color(55, 59, 64));
        consumerField.setFont(customFont.deriveFont(11f));
        consumerField.setForeground(new java.awt.Color(153, 153, 153));
        consumerField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(consumerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 260, 30));

        jLabel5.setFont(customFont.deriveFont(12f));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Consumer Secret");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 40));

        consumerSecretField.setBackground(new java.awt.Color(55, 59, 64));
        consumerSecretField.setFont(customFont.deriveFont(11f));
        consumerSecretField.setForeground(new java.awt.Color(153, 153, 153));
        consumerSecretField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(consumerSecretField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 260, 30));

        jLabel6.setFont(customFont.deriveFont(16f));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TWITTER");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 90, 30));

        tokenField.setBackground(new java.awt.Color(55, 59, 64));
        tokenField.setFont(customFont.deriveFont(11f));
        tokenField.setForeground(new java.awt.Color(153, 153, 153));
        tokenField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(tokenField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 260, 30));

        jLabel7.setFont(customFont.deriveFont(12f));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Discord Token");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 90, 40));

        jLabel8.setFont(customFont.deriveFont(16f));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DISCORD");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 80, 40));

        updateButton.setBackground(new java.awt.Color(88, 101, 242));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });
        updateButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ACTUALIZAR");
        updateButton.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 10));

        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 90, 30));

        updatetext.setFont(customFont.deriveFont(11f));
        updatetext.setForeground(new java.awt.Color(153, 153, 153));
        updatetext.setText("Reinicia el programa para actualizar los cambios");
        jPanel1.add(updatetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/X.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel10.setFont(customFont.deriveFont(12f));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID de canal");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, 40));

        channelIDField.setBackground(new java.awt.Color(55, 59, 64));
        channelIDField.setFont(customFont.deriveFont(11f));
        channelIDField.setForeground(new java.awt.Color(153, 153, 153));
        channelIDField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(channelIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 260, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
       updateFile();
    }//GEN-LAST:event_updateButtonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    
                    new OptionsFrame().setVisible(true);
                    
                } catch (IOException ex) {
                    Logger.getLogger(OptionsFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(OptionsFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
    }
    
    private void loadKeys() {
         JSONParser parser = new JSONParser();
        
        try {
            
           //BufferedReader reader1 = new BufferedReader((new InputStreamReader(Keys.class.getResourceAsStream("/keys.json"))));
            FileReader reader = new FileReader(System.getProperty("user.home")+"\\keys.json");
            BufferedReader reader1 = new BufferedReader(reader);
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            accessField.setText((String) jsonObject.get("access_key"));
            accessSecretField.setText((String) jsonObject.get("access_secret_key"));
            consumerField.setText((String) jsonObject.get("consumer_key"));
            consumerSecretField.setText((String) jsonObject.get("consumer_key_secret"));
            tokenField.setText((String) jsonObject.get("discordtoken"));
            channelIDField.setText((String) jsonObject.get("channelID"));
            
        }  catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        
    }
    public void updateFile() {
         try {                                          
            
            System.out.println(System.getProperty("user.home"));
            JSONObject object = new JSONObject();
            object.put("access_key", accessField.getText());
            object.put("access_secret_key", accessSecretField.getText());
            object.put("consumer_key", consumerField.getText());
            object.put("consumer_key_secret", consumerSecretField.getText());
            object.put("discordtoken", tokenField.getText());
            object.put("channelID", channelIDField.getText());
            try {
                filew = new FileWriter(System.getProperty("user.home")+"\\keys.json");
            } catch (IOException ex) {
                Logger.getLogger(OptionsFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println(this.getClass().getProtectionDomain().getCodeSource().getLocation());        
            filew.write(object.toJSONString());
            filew.flush();
            filew.close();
            updatetext.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(OptionsFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accessField;
    private javax.swing.JTextField accessSecretField;
    public static javax.swing.JTextField channelIDField;
    private javax.swing.JTextField consumerField;
    private javax.swing.JTextField consumerSecretField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tokenField;
    private javax.swing.JPanel updateButton;
    private javax.swing.JLabel updatetext;
    // End of variables declaration//GEN-END:variables
}
