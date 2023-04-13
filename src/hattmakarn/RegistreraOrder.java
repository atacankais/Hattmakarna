/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarn;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author theod
 */
public class RegistreraOrder extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form RegistreraOrder
     */
    public RegistreraOrder() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cbLagerFord = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tfHuvudMått = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfPris = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfArtikelNummerKundAnpassad = new javax.swing.JTextField();
        cbHattypKundAnpassad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbSpecialAnpassadDekoration1 = new javax.swing.JComboBox<>();
        cbKundAnpassadDekoration2 = new javax.swing.JComboBox<>();
        cbKundAnpassadDekoration3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbSpecialAnpassadTyg = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfPrisSpecialAnpassad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfArtikelNummerLagerford = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfHuvudMåttSpecialAnpassad = new javax.swing.JTextField();
        cbKundAnpassadDekoration4 = new javax.swing.JComboBox<>();
        cbSpecialAnpassadDekoration2 = new javax.swing.JComboBox<>();
        cbSpecialAnpassadDekoration3 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tfHuvudMåttKundAnpassad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfPrisKundAnpassad1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfArtikelNummerSpecialAnpassad = new javax.swing.JTextField();
        checkLagerFord = new javax.swing.JCheckBox();
        checkKundAnpassad = new javax.swing.JCheckBox();
        checkSpecialAnpassad = new javax.swing.JCheckBox();
        buttonLagerFord = new javax.swing.JButton();
        buttonKundAnpassad = new javax.swing.JButton();
        buttonSpecialAnpassad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Lagerförd hatt");

        jButton2.setText("Kundanpassad hatt");

        jButton3.setText("Specialanpassad hatt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cbLagerFord.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filthatt kanin", "Filthatt ull", "Panamahatt", "Stråhatt", "Tyghatt ull", "Tyghatt bomull", "Tyghatt linne", "Läderhätta" }));
        cbLagerFord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLagerFordActionPerformed(evt);
            }
        });

        jLabel1.setText("Huvudmått");

        tfHuvudMått.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHuvudMåttActionPerformed(evt);
            }
        });

        jLabel2.setText("Pris");

        jLabel3.setText("Artikelnummer");

        tfArtikelNummerKundAnpassad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfArtikelNummerKundAnpassadActionPerformed(evt);
            }
        });

        cbHattypKundAnpassad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filthatt kanin", "Filthatt ull", "Panamahatt", "Stråhatt", "Tyghatt ull", "Tyghatt bomull", "Tyghatt linne", "Läderhätta" }));

        jLabel4.setText("Välj lagerförd hatt");

        jLabel5.setText("Välj lagerförd hatt");

        cbSpecialAnpassadDekoration1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Band", "Strutsfjäder", "Påfågerfjäder", "Hönsfjäder", "Tygblomma", "Pärlor", "Spetts", "Lackeratpapper", "Lurextråd", "Fuskpäls" }));

        cbKundAnpassadDekoration2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Band", "Strutsfjäder", "Påfågerfjäder", "Hönsfjäder", "Tygblomma", "Pärlor", "Spetts", "Lackeratpapper", "Lurextråd", "Fuskpäls" }));

        cbKundAnpassadDekoration3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Band", "Strutsfjäder", "Påfågerfjäder", "Hönsfjäder", "Tygblomma", "Pärlor", "Spetts", "Lackeratpapper", "Lurextråd", "Fuskpäls" }));

        jLabel6.setText("Dekoration 1");

        jLabel7.setText("Dekoration 3");

        jLabel8.setText("Dekoration 2");

        cbSpecialAnpassadTyg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ullfilt", "Kaninfilt", "Toquillastrå", "Rishalm", "Palmlöv", "Majsblad", "Hampafibrer", "Läder", "Bomull", "Linne", "Ull", "Silke", "Satin", "Tweed", "Polyester", " " }));

        jLabel9.setText("Tyg");

        jLabel10.setText("Pris");

        jLabel11.setText("Artikelnummer");

        tfArtikelNummerLagerford.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfArtikelNummerLagerfordActionPerformed(evt);
            }
        });

        jLabel12.setText("Huvudmått");

        tfHuvudMåttSpecialAnpassad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHuvudMåttSpecialAnpassadActionPerformed(evt);
            }
        });

        cbKundAnpassadDekoration4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Band", "Strutsfjäder", "Påfågerfjäder", "Hönsfjäder", "Tygblomma", "Pärlor", "Spetts", "Lackeratpapper", "Lurextråd", "Fuskpäls" }));

        cbSpecialAnpassadDekoration2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Band", "Strutsfjäder", "Påfågerfjäder", "Hönsfjäder", "Tygblomma", "Pärlor", "Spetts", "Lackeratpapper", "Lurextråd", "Fuskpäls" }));

        cbSpecialAnpassadDekoration3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Band", "Strutsfjäder", "Påfågerfjäder", "Hönsfjäder", "Tygblomma", "Pärlor", "Spetts", "Lackeratpapper", "Lurextråd", "Fuskpäls" }));

        jLabel13.setText("Dekoration 1");

        jLabel14.setText("Dekoration 2");

        jLabel15.setText("Dekoration 3");

        jLabel16.setText("Huvudmått");

        tfHuvudMåttKundAnpassad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHuvudMåttKundAnpassadActionPerformed(evt);
            }
        });

        jLabel17.setText("Pris");

        jLabel18.setText("Artikelnummer");

        tfArtikelNummerSpecialAnpassad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfArtikelNummerSpecialAnpassadActionPerformed(evt);
            }
        });

        checkLagerFord.setText("Brådskande");

        checkKundAnpassad.setText("Brådskande");

        checkSpecialAnpassad.setText("Brådskande");

        buttonLagerFord.setText("Lägg till");

        buttonKundAnpassad.setText("Lägg till");
        buttonKundAnpassad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKundAnpassadActionPerformed(evt);
            }
        });

        buttonSpecialAnpassad.setText("Lägg till");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbLagerFord, 0, 116, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPris, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfArtikelNummerLagerford, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkLagerFord, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonLagerFord)
                                .addComponent(tfHuvudMått, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(cbHattypKundAnpassad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbKundAnpassadDekoration4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbKundAnpassadDekoration3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbKundAnpassadDekoration2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfArtikelNummerKundAnpassad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPrisKundAnpassad1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHuvudMåttKundAnpassad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfArtikelNummerSpecialAnpassad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSpecialAnpassadDekoration2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSpecialAnpassadTyg, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSpecialAnpassadDekoration1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSpecialAnpassadDekoration3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHuvudMåttSpecialAnpassad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPrisSpecialAnpassad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(checkKundAnpassad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonKundAnpassad)
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSpecialAnpassad)
                            .addComponent(checkSpecialAnpassad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbLagerFord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbHattypKundAnpassad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSpecialAnpassadTyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbKundAnpassadDekoration4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSpecialAnpassadDekoration1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKundAnpassadDekoration2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSpecialAnpassadDekoration2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKundAnpassadDekoration3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSpecialAnpassadDekoration3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHuvudMåttKundAnpassad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHuvudMåttSpecialAnpassad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHuvudMått, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPrisKundAnpassad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPrisSpecialAnpassad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfArtikelNummerKundAnpassad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfArtikelNummerSpecialAnpassad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfArtikelNummerLagerford, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkLagerFord)
                    .addComponent(checkKundAnpassad)
                    .addComponent(checkSpecialAnpassad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonLagerFord)
                    .addComponent(buttonKundAnpassad)
                    .addComponent(buttonSpecialAnpassad))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbLagerFordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLagerFordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLagerFordActionPerformed

    private void tfHuvudMåttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHuvudMåttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHuvudMåttActionPerformed

    private void tfArtikelNummerKundAnpassadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfArtikelNummerKundAnpassadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfArtikelNummerKundAnpassadActionPerformed

    private void tfArtikelNummerLagerfordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfArtikelNummerLagerfordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfArtikelNummerLagerfordActionPerformed

    private void tfHuvudMåttSpecialAnpassadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHuvudMåttSpecialAnpassadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHuvudMåttSpecialAnpassadActionPerformed

    private void tfHuvudMåttKundAnpassadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHuvudMåttKundAnpassadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHuvudMåttKundAnpassadActionPerformed

    private void tfArtikelNummerSpecialAnpassadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfArtikelNummerSpecialAnpassadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfArtikelNummerSpecialAnpassadActionPerformed

    private void buttonKundAnpassadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKundAnpassadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonKundAnpassadActionPerformed

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
            java.util.logging.Logger.getLogger(RegistreraOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreraOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKundAnpassad;
    private javax.swing.JButton buttonLagerFord;
    private javax.swing.JButton buttonSpecialAnpassad;
    private javax.swing.JComboBox<String> cbHattypKundAnpassad;
    private javax.swing.JComboBox<String> cbKundAnpassadDekoration2;
    private javax.swing.JComboBox<String> cbKundAnpassadDekoration3;
    private javax.swing.JComboBox<String> cbKundAnpassadDekoration4;
    private javax.swing.JComboBox<String> cbLagerFord;
    private javax.swing.JComboBox<String> cbSpecialAnpassadDekoration1;
    private javax.swing.JComboBox<String> cbSpecialAnpassadDekoration2;
    private javax.swing.JComboBox<String> cbSpecialAnpassadDekoration3;
    private javax.swing.JComboBox<String> cbSpecialAnpassadTyg;
    private javax.swing.JCheckBox checkKundAnpassad;
    private javax.swing.JCheckBox checkLagerFord;
    private javax.swing.JCheckBox checkSpecialAnpassad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfArtikelNummerKundAnpassad;
    private javax.swing.JTextField tfArtikelNummerLagerford;
    private javax.swing.JTextField tfArtikelNummerSpecialAnpassad;
    private javax.swing.JTextField tfHuvudMått;
    private javax.swing.JTextField tfHuvudMåttKundAnpassad;
    private javax.swing.JTextField tfHuvudMåttSpecialAnpassad;
    private javax.swing.JTextField tfPris;
    private javax.swing.JTextField tfPrisKundAnpassad1;
    private javax.swing.JTextField tfPrisSpecialAnpassad;
    // End of variables declaration//GEN-END:variables
}
