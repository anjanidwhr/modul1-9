/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cobaa1;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author PC RPL - R1
 */
public class modul7 extends javax.swing.JFrame {

    /**
     * Creates new form modul7
     */
    public modul7() {
        initComponents();
        ListModel = new DefaultListModel(); 
         ListMinuman.setModel(ListModel);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CbMakanan = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListMinuman = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaKota = new javax.swing.JTextArea();
        btTambah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btUbah = new javax.swing.JButton();
        btSisip = new javax.swing.JButton();
        eUbah = new javax.swing.JTextField();
        eKota = new javax.swing.JTextField();
        eMakanan = new javax.swing.JTextField();
        eMinuman = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kota");

        jLabel2.setText("Makanan");

        jLabel3.setText("Minuman ");

        jScrollPane3.setViewportView(ListMinuman);

        AreaKota.setColumns(20);
        AreaKota.setRows(5);
        jScrollPane2.setViewportView(AreaKota);

        btTambah.setText("Tambah");
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btUbah.setText("Ubah");
        btUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahActionPerformed(evt);
            }
        });

        btSisip.setText("Sisip");
        btSisip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSisipActionPerformed(evt);
            }
        });

        eUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eUbahActionPerformed(evt);
            }
        });

        eKota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eKotaActionPerformed(evt);
            }
        });

        jLabel4.setText("Kota");

        jLabel5.setText("Makanan");

        jLabel7.setText("Minuman ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btTambah)
                                    .addComponent(btSisip, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(btUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eKota, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(eUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(CbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btTambah)
                        .addGap(18, 18, 18)
                        .addComponent(btHapus)
                        .addGap(18, 18, 18)
                        .addComponent(btUbah)
                        .addGap(18, 18, 18)
                        .addComponent(btSisip)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(eUbah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        AreaKota.append("Gersik" + "\n");
        AreaKota.append("Malang " + "\n");
        AreaKota.append("Surabaya" + "\n");
        CbMakanan.insertItemAt("Rujak", 0);
        CbMakanan.insertItemAt("Rawon", 1);
        CbMakanan.insertItemAt("Sate", 2);
        ListModel.add(0, "Sprite");
        ListModel.add(1, "Fanta");
        ListModel.add(2, "Es Batu");
        ListModel.add(3, "Kopi");
        ListMinuman.setModel(ListModel);
        // TODO add your handling code here:
    }//GEN-LAST:event_btTambahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        if (AreaKota.getLineCount() > 0) {
            AreaKota.setSelectionStart(0);
            AreaKota.setSelectionEnd(12);
            int posisi = AreaKota.getSelectedText().indexOf("\n");
            AreaKota.replaceRange("", 0, posisi + 1);
            if (posisi == -1) {
                AreaKota.replaceRange("", 0, 8);
            }
        }
        if (CbMakanan.getItemCount() > 0) {
            CbMakanan.removeItemAt(0);
        }
        if (ListModel.getSize() > 0) {
            ListModel.remove(0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btHapusActionPerformed

    private void btUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahActionPerformed

       if (AreaKota.getLineCount()>0) {
AreaKota.setSelectionStart(0);
AreaKota.setSelectionEnd(12);
int posisi = AreaKota.getSelectedText().indexOf("\n");
AreaKota.replaceRange(eUbah.getText()+"\n", 0,posisi+1);
if (posisi == -1)
AreaKota.replaceRange(eUbah.getText()+"\n",0,8);
}
if (CbMakanan.getItemCount()>0){
CbMakanan.removeItemAt(1);
CbMakanan.insertItemAt(eUbah.getText(),1);
}
if (ListModel.getSize()>0){
ListModel.remove(1);
ListModel.insertElementAt(eUbah.getText(),1);
}


    }//GEN-LAST:event_btUbahActionPerformed

    private void btSisipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSisipActionPerformed
         String kota = eKota.getText();
    String makanan = eMakanan.getText();
    String minuman = eMinuman.getText();

    // Memasukkan data ke dalam AreaKota (JTextArea)
    AreaKota.append(kota + "\n");

    // Memasukkan data ke dalam CbMakanan (JComboBox)
    if (!makanan.isEmpty()) {
        CbMakanan.addItem(makanan);
    }

    // Memasukkan data ke dalam ListMinuman (JList)
    if (!minuman.isEmpty()) {
        ListModel.addElement(minuman);
    }  // TODO add your handling code here:
    }//GEN-LAST:event_btSisipActionPerformed

    private void eUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eUbahActionPerformed
        // TODO add your handling code here:if (AreaKota.getLineCount()>0) {


    }//GEN-LAST:event_eUbahActionPerformed

    private void eKotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eKotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eKotaActionPerformed

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
            java.util.logging.Logger.getLogger(modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modul7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaKota;
    private javax.swing.JComboBox<String> CbMakanan;
    private javax.swing.JList<String> ListMinuman;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btSisip;
    private javax.swing.JButton btTambah;
    private javax.swing.JButton btUbah;
    private javax.swing.JTextField eKota;
    private javax.swing.JTextField eMakanan;
    private javax.swing.JTextField eMinuman;
    private javax.swing.JTextField eUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
DefaultListModel ListModel;

    private String Text() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}