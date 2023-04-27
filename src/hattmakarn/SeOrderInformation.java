/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarn;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author flind
 */
public class SeOrderInformation extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form SeOrderInformation
     */
    public SeOrderInformation() {
        initComponents();
        try {
           idb = new InfDB("hattdb", "3306", "hattdba", "hattkey");
        } catch (InfException ex) {
            
        }
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
        sokKundnamnTr = new javax.swing.JTextField();
        ValjKund = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        orderIDTr = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        statusT = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        anställningT = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        materialT = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        articleT = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        ordernummerT = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TfMail = new javax.swing.JTextField();
        BtnMail = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sök Kundnamn:");

        sokKundnamnTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokKundnamnTrActionPerformed(evt);
            }
        });

        ValjKund.setText("Sök");
        ValjKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValjKundActionPerformed(evt);
            }
        });

        jLabel2.setText("Ange Order-ID för order som ska raderas:");

        jButton2.setText("Radera order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ändra status");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        statusT.setColumns(20);
        statusT.setRows(5);
        jScrollPane1.setViewportView(statusT);

        anställningT.setColumns(20);
        anställningT.setRows(5);
        jScrollPane2.setViewportView(anställningT);

        materialT.setColumns(20);
        materialT.setRows(5);
        jScrollPane3.setViewportView(materialT);

        articleT.setColumns(20);
        articleT.setRows(5);
        jScrollPane4.setViewportView(articleT);

        ordernummerT.setColumns(20);
        ordernummerT.setRows(5);
        jScrollPane5.setViewportView(ordernummerT);

        jLabel3.setText("Artikel");

        jLabel4.setText("Anställningsnummer");

        jLabel5.setText("Material");

        jLabel6.setText("Status");

        jLabel7.setText("OrderID");

        jLabel8.setText("Ange Order-ID för order du vill skapa mail för:");

        BtnMail.setText("Skapa Mail");
        BtnMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMailActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sokKundnamnTr, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ValjKund))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(orderIDTr, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TfMail, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BtnMail))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)))
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sokKundnamnTr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ValjKund)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderIDTr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnMail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sokKundnamnTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokKundnamnTrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sokKundnamnTrActionPerformed

    private void ValjKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValjKundActionPerformed

  try {
        articleT.setText(null);
        anställningT.setText(null);
        materialT.setText(null);
        statusT.setText(null);
        ordernummerT.setText(null);
        String name = sokKundnamnTr.getText();
        String showArticle = "SELECT a.Article_Name, o.OrderID, e.EmployeeID, m.Material_name, pr.Status FROM Article a INNER JOIN Article_Contains_Of_Material ac ON a.ArticleID = ac.ArticleID INNER JOIN Material m ON ac.MaterialID = m.MaterialID INNER JOIN Production pr ON a.ArticleID = pr.ArticleID INNER JOIN `Order` o ON pr.OrderID = o.OrderID INNER JOIN Employee e ON o.EmployeeID = e.EmployeeID INNER JOIN Customer c ON o.CustomerID = c.CustomerID where c.Name = '" + name + "'";
        ArrayList<String> articles = idb.fetchColumn(showArticle);
        
        for (String thisArticle : articles){
            articleT.append(thisArticle);
            articleT.append("\n");
                
        }
        

        String showNumber = "SELECT e.EmployeeID, a.Article_Name, o.OrderID, m.Material_name, pr.Status FROM Article a INNER JOIN Article_Contains_Of_Material ac ON a.ArticleID = ac.ArticleID INNER JOIN Material m ON ac.MaterialID = m.MaterialID INNER JOIN Production pr ON a.ArticleID = pr.ArticleID INNER JOIN `Order` o ON pr.OrderID = o.OrderID INNER JOIN Employee e ON o.EmployeeID = e.EmployeeID INNER JOIN Customer c ON o.CustomerID = c.CustomerID where c.Name = '" + name + "'";
        ArrayList<String> number = idb.fetchColumn(showNumber);
        
        for (String thisNumber : number){
            anställningT.append(thisNumber);
            anställningT.append("\n");
            
        }
        
        String showMaterial = "SELECT m.Material_name, e.EmployeeID, a.Article_Name, o.OrderID, pr.Status FROM Article a INNER JOIN Article_Contains_Of_Material ac ON a.ArticleID = ac.ArticleID INNER JOIN Material m ON ac.MaterialID = m.MaterialID INNER JOIN Production pr ON a.ArticleID = pr.ArticleID INNER JOIN `Order` o ON pr.OrderID = o.OrderID INNER JOIN Employee e ON o.EmployeeID = e.EmployeeID INNER JOIN Customer c ON o.CustomerID = c.CustomerID where c.Name = '" + name + "'";
        ArrayList<String> material = idb.fetchColumn(showMaterial);
        
        for (String thisMaterial : material){
            materialT.append(thisMaterial);
            materialT.append("\n");
        }  
       
        String showStatus = "SELECT pr.Status, m.Material_name, e.EmployeeID, a.Article_Name, o.OrderID, pr.Status FROM Article a INNER JOIN Article_Contains_Of_Material ac ON a.ArticleID = ac.ArticleID INNER JOIN Material m ON ac.MaterialID = m.MaterialID INNER JOIN Production pr ON a.ArticleID = pr.ArticleID INNER JOIN `Order` o ON pr.OrderID = o.OrderID INNER JOIN Employee e ON o.EmployeeID = e.EmployeeID INNER JOIN Customer c ON o.CustomerID = c.CustomerID where c.Name = '" + name + "'";
        ArrayList<String> status = idb.fetchColumn(showStatus);
        
        for (String thisStatus : status){
            statusT.append(thisStatus);
            statusT.append("\n");
                   
        }
        
        String showOrder = "SELECT o.OrderID, pr.Status, m.Material_name, e.EmployeeID, a.Article_Name, pr.Status FROM Article a INNER JOIN Article_Contains_Of_Material ac ON a.ArticleID = ac.ArticleID INNER JOIN Material m ON ac.MaterialID = m.MaterialID INNER JOIN Production pr ON a.ArticleID = pr.ArticleID INNER JOIN `Order` o ON pr.OrderID = o.OrderID INNER JOIN Employee e ON o.EmployeeID = e.EmployeeID INNER JOIN Customer c ON o.CustomerID = c.CustomerID where c.Name = '" + name + "'";
        ArrayList<String> order = idb.fetchColumn(showOrder);
        
        for (String thisOrdernummer : order){
            ordernummerT.append(thisOrdernummer);
            ordernummerT.append("\n");
            
        }
        
        
        
       
                    }

        catch(InfException a) {
           JOptionPane.showMessageDialog(null, "Någonting gick fel");
           System.out.println("Någonting gick fel");
        }
                                            




    }//GEN-LAST:event_ValjKundActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ÄndraStatusPåOrder().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
         String selectedID = orderIDTr.getText();



        idb.delete("delete from order_contains_of_article where OrderID = " + selectedID);
        idb.delete("delete from production where OrderID = " + selectedID);
        idb.delete("delete from `Order` where OrderID = " + selectedID);
        



         JOptionPane.showMessageDialog(null, "Ordern har raderats");





        } catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BtnMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMailActionPerformed
        try{
        
            String mailID = TfMail.getText();
            
            String Wcustomer = "SELECT Customer.Name FROM `Order` INNER JOIN Customer ON Order.CustomerID = Customer.CustomerID WHERE Order.OrderID = " + mailID;
            String Rcustomer = idb.fetchSingle(Wcustomer);
  
            JOptionPane.showMessageDialog(null, "Hej " + Rcustomer + "!\nHär kommer ett kostnadsförslag på din order:\nOrder-ID: " + mailID + "\nPris: \nVänligen bekräfta denna order genom att svara på detta mail!\nMed vänliga häslningar\nHattmakaren");
           
            FileWriter writer = new FileWriter("C:\\Users\\flind\\OneDrive\\Skrivbord\\ProjektetNB\\hattmakarna\\mailFil.txt");
            writer.write("Hej " + Rcustomer + "!\nHär kommer ett kostnadsförslag på din order:\nOrder-ID: " + mailID + "\nPris: \nVänligen bekräfta denna order genom att svara på detta mail!\nMed vänliga hälsningar\nHattmakaren");
            writer.close();
            System.out.println("Filen har skapats.");
        }
        
        catch (IOException | InfException ex){}
    }//GEN-LAST:event_BtnMailActionPerformed

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
            java.util.logging.Logger.getLogger(SeOrderInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeOrderInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeOrderInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeOrderInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeOrderInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMail;
    private javax.swing.JTextField TfMail;
    private javax.swing.JButton ValjKund;
    private javax.swing.JTextArea anställningT;
    private javax.swing.JTextArea articleT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea materialT;
    private javax.swing.JTextField orderIDTr;
    private javax.swing.JTextArea ordernummerT;
    private javax.swing.JTextField sokKundnamnTr;
    private javax.swing.JTextArea statusT;
    // End of variables declaration//GEN-END:variables
}
