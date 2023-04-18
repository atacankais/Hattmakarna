/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarn;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author carolinaappel
 */
import java.util.ArrayList;
public class SeOrderInfo extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form SeOrderInfo
     */
    public SeOrderInfo() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        anställningT = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        articleT = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        ordernummerT = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        materialT = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        statusT = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        orderIDTr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sök Kundnamn:");

        ValjKund.setText("Sök");
        ValjKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValjKundActionPerformed(evt);
            }
        });

        anställningT.setColumns(20);
        anställningT.setRows(5);
        jScrollPane2.setViewportView(anställningT);

        articleT.setColumns(20);
        articleT.setRows(5);
        jScrollPane3.setViewportView(articleT);

        ordernummerT.setColumns(20);
        ordernummerT.setRows(5);
        jScrollPane4.setViewportView(ordernummerT);

        materialT.setColumns(20);
        materialT.setRows(5);
        jScrollPane5.setViewportView(materialT);

        jLabel3.setText("Artikel");

        jLabel4.setText("Anställningsnummer");

        jLabel5.setText("Material");

        jLabel6.setText("Status");

        statusT.setColumns(20);
        statusT.setRows(5);
        jScrollPane6.setViewportView(statusT);

        jLabel7.setText("OrderID");

        jButton1.setText("Ändra Status ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ta bort order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ange Order-ID du vill ta bort:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ValjKund)
                                    .addComponent(sokKundnamnTr, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(orderIDTr, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))
                                .addGap(35, 35, 35)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sokKundnamnTr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ValjKund)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderIDTr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(108, 108, 108)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValjKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValjKundActionPerformed
        try {
//        //var saveCustomerName = sokKundnamnTr.getText();
//        //var id = idb.fetchSingle("SELECT CustomerID FROM Customer where Name = '" + saveCustomerName + "'"); 
//        //String name = idb.fetchSingle("SELECT Name FROM Customer where Name = '" + saveCustomerName + "'");
//        var phonenumber = idb.fetchSingle("SELECT Phone FROM Customer where Name = '" + saveCustomerName + "'"); 
//        var address = idb.fetchSingle("SELECT Address FROM Customer where Name = '" + saveCustomerName + "'"); 
//        var mail = idb.fetchSingle("SELECT Mail FROM Customer where Name = '" + saveCustomerName + "'"); 
//        var head_measurement = idb.fetchSingle("SELECT Head_measurement FROM Customer where Name = '" + saveCustomerName + "'"); 
//        
//        var id = idb.fetchSingle("SELECT orderID from order where Name = '" + saveCustomerName + "'");
//        
//        
//        String kundnamn = sokKundnamnTr.getText();
//       
//
//        String seOrder = "Select "
        String name = sokKundnamnTr.getText();
        String showArticle = "SELECT a.Article_Name, o.OrderID, e.EmployeeID, m.Material_name, pr.Status FROM Article a INNER JOIN Article_Contains_Of_Material ac ON a.ArticleID = ac.ArticleID INNER JOIN Material m ON ac.MaterialID = m.MaterialID INNER JOIN Production pr ON a.ArticleID = pr.ArticleID INNER JOIN `Order` o ON pr.OrderID = o.OrderID INNER JOIN Employee e ON o.EmployeeID = e.EmployeeID INNER JOIN Customer c ON o.CustomerID = c.CustomerID where c.Name = '" + name + "'";
        ArrayList<String> articles = idb.fetchColumn(showArticle);
        
        for (String thisArticle : articles){
            articleT.append(thisArticle);
            articleT.append("\n");
                
        }
        
//        String name = sokKundnamnTr.getText();
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
        
        
        
       // JOptionPane.showMessageDialog(null, "ID: " + id + "\nNamn: " + name + "\nTelefonnummer: " + phonenumber + "\nAdress: " + address + "\nMail: " + mail + "\nHuvudmått: " + head_measurement + " cm" + "");

                    }

        catch(InfException a) {
           JOptionPane.showMessageDialog(null, "Någonting gick fel");
           System.out.println("Någonting gick fel");
        }
    }//GEN-LAST:event_ValjKundActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ÄndraStatusPåOrder().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
         String selectedID = orderIDTr.getText();
         

        
        idb.delete("delete from order_contains_of_article where OrderID = " + selectedID);
        idb.delete("delete from production where OrderID = " + selectedID);
        idb.delete("delete from `order` where OrderID = " + selectedID);
      
         
         
         JOptionPane.showMessageDialog(null, "Ordern har raderats");

           
        
        
         
        } catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SeOrderInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeOrderInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeOrderInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeOrderInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeOrderInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ValjKund;
    private javax.swing.JTextArea anställningT;
    private javax.swing.JTextArea articleT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea materialT;
    private javax.swing.JTextField orderIDTr;
    private javax.swing.JTextArea ordernummerT;
    private javax.swing.JTextField sokKundnamnTr;
    private javax.swing.JTextArea statusT;
    // End of variables declaration//GEN-END:variables
}
