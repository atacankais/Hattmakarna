/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarn;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JTextField;
import java.util.ArrayList;
/**
 *
 * @author clarajonsson
 */
public class RegistreraKund extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form RegistreraKund
     */
    public RegistreraKund() {
        initComponents();
        try {
    idb = new InfDB("hattdb", "3306", "hattdba", "hattkey");
} catch (InfException ex) {
    
}
    
       
    }

    
    private boolean phonenumberExists(JTextField telefonnummerTextruta){
        boolean phoneExists = false;
        
        try {
            String fraga = "Select Phone from Customer";
            ArrayList<String>phoneList;
            phoneList = idb.fetchColumn(fraga);
            for(String phone : phoneList){
                if(phone.equals(telefonnummerTextruta.getText())){
                    phoneExists = true;
                
                }
               // return phoneExists;
            }
            
        } catch(InfException e){
                    JOptionPane.showMessageDialog(null, "Något gick fel");
                    }
        return phoneExists;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        namnTextruta = new javax.swing.JTextField();
        namnRubrik = new javax.swing.JLabel();
        telefonnummerRubrik = new javax.swing.JLabel();
        telefonnummerTextruta = new javax.swing.JTextField();
        adressRubrik = new javax.swing.JLabel();
        adressTextruta = new javax.swing.JTextField();
        mailRubrik = new javax.swing.JLabel();
        mailTextruta = new javax.swing.JTextField();
        huvudmattRubrik = new javax.swing.JLabel();
        huvudmattTextruta = new javax.swing.JTextField();
        registreraKundKnapp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Registrera kund");

        namnTextruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnTextrutaActionPerformed(evt);
            }
        });

        namnRubrik.setText("För- och efternamn");

        telefonnummerRubrik.setText("Telefonnummer");

        telefonnummerTextruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonnummerTextrutaActionPerformed(evt);
            }
        });

        adressRubrik.setText("Adress");

        mailRubrik.setText("Mail");

        huvudmattRubrik.setText("Huvudmått (cm)");

        huvudmattTextruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huvudmattTextrutaActionPerformed(evt);
            }
        });

        registreraKundKnapp.setText("Registrera");
        registreraKundKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraKundKnappActionPerformed(evt);
            }
        });

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adressRubrik)
                            .addComponent(mailRubrik)
                            .addComponent(huvudmattRubrik))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registreraKundKnapp)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefonnummerRubrik)
                                    .addComponent(namnRubrik))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefonnummerTextruta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namnTextruta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adressTextruta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(huvudmattTextruta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mailTextruta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addGap(0, 134, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namnTextruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namnRubrik))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonnummerRubrik)
                    .addComponent(telefonnummerTextruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressRubrik)
                    .addComponent(adressTextruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailRubrik)
                    .addComponent(mailTextruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(huvudmattRubrik)
                    .addComponent(huvudmattTextruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registreraKundKnapp))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namnTextrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namnTextrutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namnTextrutaActionPerformed

    private void telefonnummerTextrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonnummerTextrutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonnummerTextrutaActionPerformed

    private void huvudmattTextrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huvudmattTextrutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_huvudmattTextrutaActionPerformed

    private void registreraKundKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraKundKnappActionPerformed
        {
      
        try{
            String name = namnTextruta.getText();
            String number = telefonnummerTextruta.getText();
            String address = adressTextruta.getText();
            String mail = mailTextruta.getText();
            String head_measurement = huvudmattTextruta.getText();
           // int hMeasurement = Integer.parseInt (head_measurement);
           
             if(phonenumberExists(telefonnummerTextruta) == false){
            
                   
            
            
            String createCustomer = "Insert into Customer (Name, Phone, Address, Mail, Head_measurement) values ('"+ name +"','" + number +"','" + address +"','" + mail +"','" + head_measurement +"')";
            idb.insert(createCustomer);
            
            JOptionPane.showMessageDialog(null, "Ny kund registrerad");
             }
             else if(phonenumberExists(telefonnummerTextruta) == true)
            JOptionPane.showMessageDialog(null, "Telefonnumret finns redan");
        }
       
        
            catch(InfException ettUndantag){
                JOptionPane.showMessageDialog(null, "Kunde ej skapa kund");
            }
        
        
        
       }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_registreraKundKnappActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistreraKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreraKund().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressRubrik;
    private javax.swing.JTextField adressTextruta;
    private javax.swing.JLabel huvudmattRubrik;
    private javax.swing.JTextField huvudmattTextruta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mailRubrik;
    private javax.swing.JTextField mailTextruta;
    private javax.swing.JLabel namnRubrik;
    private javax.swing.JTextField namnTextruta;
    private javax.swing.JButton registreraKundKnapp;
    private javax.swing.JLabel telefonnummerRubrik;
    private javax.swing.JTextField telefonnummerTextruta;
    // End of variables declaration//GEN-END:variables
}
