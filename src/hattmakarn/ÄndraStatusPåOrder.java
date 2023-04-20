/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarn;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author flind
 */
public class ÄndraStatusPåOrder extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form ÄndraStatusPåOrder
     */
    public ÄndraStatusPåOrder() {
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

        LabelHead = new javax.swing.JLabel();
        BtnVisaOrder = new javax.swing.JButton();
        LabelFooter = new javax.swing.JLabel();
        TfPid = new javax.swing.JTextField();
        CbStatus = new javax.swing.JComboBox<>();
        BtnBekräfta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TaNamn = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TaProd = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TaDatum = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        TaStatus = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        TaArtikel = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LabelHead.setText("Ändra status på order");

        BtnVisaOrder.setText("Visa pågående ordrar");
        BtnVisaOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVisaOrderActionPerformed(evt);
            }
        });

        LabelFooter.setText("Ange produktions-ID för artikeln du vill ändra status på:");

        TfPid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfPidActionPerformed(evt);
            }
        });

        CbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lagd", "Påbörjad", "Färdigställd", "Levererad" }));
        CbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbStatusActionPerformed(evt);
            }
        });

        BtnBekräfta.setText("Bekräfta ny status");
        BtnBekräfta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBekräftaActionPerformed(evt);
            }
        });

        jLabel1.setText("Namn");

        jLabel2.setText("Datum");

        jLabel3.setText("Produktions-ID");

        jLabel4.setText("Artikel");

        jLabel5.setText("Status");

        TaNamn.setColumns(20);
        TaNamn.setRows(5);
        jScrollPane1.setViewportView(TaNamn);

        TaProd.setColumns(20);
        TaProd.setRows(5);
        jScrollPane2.setViewportView(TaProd);

        TaDatum.setColumns(20);
        TaDatum.setRows(5);
        jScrollPane3.setViewportView(TaDatum);

        TaStatus.setColumns(20);
        TaStatus.setRows(5);
        jScrollPane4.setViewportView(TaStatus);

        TaArtikel.setColumns(20);
        TaArtikel.setRows(5);
        jScrollPane5.setViewportView(TaArtikel);

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
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(BtnVisaOrder))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LabelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TfPid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(BtnBekräfta))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(176, 176, 176)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelHead)))
                .addGap(284, 284, 284))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelHead)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnVisaOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBekräfta))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVisaOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVisaOrderActionPerformed
        
       
        try {
           String showName = "SELECT c.Name, o.Datum, p.ProductionID, a.Article_Name, p.Status FROM Customer c JOIN `Order` o ON c.CustomerID = o.CustomerID JOIN Production p ON o.OrderID = p.OrderID JOIN Article a ON p.ArticleID = a.ArticleID JOIN Order_Contains_Of_Article oca ON o.OrderID = oca.OrderID AND a.ArticleID = oca.ArticleID;";
           ArrayList<String> names = idb.fetchColumn(showName);
           
           for(String thisName : names){
                TaNamn.append(thisName);
                TaNamn.append("\n");

        }
           
           String showDate = "SELECT o.Datum, c.Name, p.ProductionID, a.Article_Name, p.Status FROM Customer c JOIN `Order` o ON c.CustomerID = o.CustomerID JOIN Production p ON o.OrderID = p.OrderID JOIN Article a ON p.ArticleID = a.ArticleID JOIN Order_Contains_Of_Article oca ON o.OrderID = oca.OrderID AND a.ArticleID = oca.ArticleID;";
           ArrayList<String> dates = idb.fetchColumn(showDate);
           
           for(String thisDate : dates){
                TaDatum.append(thisDate);
                TaDatum.append("\n");

        }
           
           String showProd = "SELECT p.ProductionID, o.Datum, c.Name, a.Article_Name, p.Status FROM Customer c JOIN `Order` o ON c.CustomerID = o.CustomerID JOIN Production p ON o.OrderID = p.OrderID JOIN Article a ON p.ArticleID = a.ArticleID JOIN Order_Contains_Of_Article oca ON o.OrderID = oca.OrderID AND a.ArticleID = oca.ArticleID;";
           ArrayList<String> prod = idb.fetchColumn(showProd);
           
           for(String thisProd : prod){
                TaProd.append(thisProd);
                TaProd.append("\n");

        }
           
           String showArticle = "SELECT a.Article_Name, p.ProductionID, o.Datum, c.Name, p.Status FROM Customer c JOIN `Order` o ON c.CustomerID = o.CustomerID JOIN Production p ON o.OrderID = p.OrderID JOIN Article a ON p.ArticleID = a.ArticleID JOIN Order_Contains_Of_Article oca ON o.OrderID = oca.OrderID AND a.ArticleID = oca.ArticleID;";
           ArrayList<String> article = idb.fetchColumn(showArticle);
           
           for(String thisArticle : article){
                TaArtikel.append(thisArticle);
                TaArtikel.append("\n");

        }
           String showStatus = "SELECT p.Status, a.Article_Name, p.ProductionID, o.Datum, c.Name FROM Customer c JOIN `Order` o ON c.CustomerID = o.CustomerID JOIN Production p ON o.OrderID = p.OrderID JOIN Article a ON p.ArticleID = a.ArticleID JOIN Order_Contains_Of_Article oca ON o.OrderID = oca.OrderID AND a.ArticleID = oca.ArticleID;";
           ArrayList<String> status = idb.fetchColumn(showStatus);
           
           for(String thisStatus : status){
                TaStatus.append(thisStatus);
                TaStatus.append("\n");

        }
        }
            
//"SELECT c.Name, o.Datum, p.ProductionID, a.Article_Name, p.Status FROM Customer c JOIN `Order` o ON c.CustomerID = o.CustomerID JOIN Production p ON o.OrderID = p.OrderID JOIN Article a ON p.ArticleID = a.ArticleID JOIN Order_Contains_Of_Article oca ON o.OrderID = oca.OrderID AND a.ArticleID = oca.ArticleID;"
     
        catch(InfException ex){}
    }//GEN-LAST:event_BtnVisaOrderActionPerformed

    private void TfPidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfPidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfPidActionPerformed

    private void CbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbStatusActionPerformed

    private void BtnBekräftaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBekräftaActionPerformed
        try{
            String changeStatus = TfPid.getText();
            String newStatus = CbStatus.getSelectedItem().toString();
            
            String fraga = "update production set status='" + newStatus + "'where ProductionID= '" + changeStatus+"'";
            idb.update(fraga);
            JOptionPane.showMessageDialog(null, "Status är ändrat");
        
        }
        
        catch(InfException ex){}
    }//GEN-LAST:event_BtnBekräftaActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraStatusPåOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraStatusPåOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraStatusPåOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraStatusPåOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ÄndraStatusPåOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBekräfta;
    private javax.swing.JButton BtnVisaOrder;
    private javax.swing.JComboBox<String> CbStatus;
    private javax.swing.JLabel LabelFooter;
    private javax.swing.JLabel LabelHead;
    private javax.swing.JTextArea TaArtikel;
    private javax.swing.JTextArea TaDatum;
    private javax.swing.JTextArea TaNamn;
    private javax.swing.JTextArea TaProd;
    private javax.swing.JTextArea TaStatus;
    private javax.swing.JTextField TfPid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
