/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import views.transaksi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import koneksi.koneksi;

/**
 *
 * @author Rahmad Al Habib Khasari <rahmadalhabib89@gmail.com>
 */
public class modalsopir extends javax.swing.JFrame {
    
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    public transaksi sopir = null;

    /**
     * Creates new form modalsopir
     */
    public modalsopir() {
        initComponents();
        datatable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        txtcari = new javax.swing.JTextField();
        kButton1 = new keeptoo.KButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblplgn = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(740, 383));

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        kButton1.setText("Cari");
        kButton1.setkEndColor(new java.awt.Color(46, 204, 113));

        kButton1.setkForeGround(new java.awt.Color(0, 0, 0));

        kButton1.setkHoverColor(new java.awt.Color(0, 0, 0));

        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));

        kButton1.setkHoverStartColor(new java.awt.Color(30, 130, 76));

        kButton1.setkIndicatorColor(new java.awt.Color(0, 0, 0));

        kButton1.setkSelectedColor(new java.awt.Color(46, 204, 113));

        kButton1.setkStartColor(new java.awt.Color(0, 230, 64));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 231, 231));
        jLabel1.setText("Data Sopir");

        tblplgn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblplgn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblplgnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblplgn);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            datatable();
        }
    }//GEN-LAST:event_txtcariKeyPressed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        datatable();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void tblplgnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblplgnMouseClicked
        int tabelSopir = tblplgn.getSelectedRow();
        sopir.noSim = tblplgn.getValueAt(tabelSopir, 0).toString();
        sopir.namaSopir = tblplgn.getValueAt(tabelSopir, 1).toString();
        sopir.tarifSopir = tblplgn.getValueAt(tabelSopir, 4).toString();
        sopir.itemTerpilihSopir();
        this.dispose();
    }//GEN-LAST:event_tblplgnMouseClicked

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
            java.util.logging.Logger.getLogger(modalsopir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modalsopir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modalsopir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modalsopir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modalsopir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KButton kButton1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblplgn;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables

    private void datatable() {
        Object[] Baris = {"No SIM", "Nama", "Alamat", "No. Telepon","Sopir"};
        tabmode = new DefaultTableModel(null, Baris);
        String cariitem = txtcari.getText();
        try {
            String sql = "SELECT * FROM sopir where statusRental != 'Ya' AND nama like '%" + cariitem + "%' order by noSim asc ";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                tabmode.addRow(new Object[]{
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4),
                    hasil.getString(5)
                });
            }
            tblplgn.setModel(tabmode);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal dipanggil" + e);
        }
    }
}
