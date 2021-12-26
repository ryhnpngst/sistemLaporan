/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halaman;

/**
 *
 * @author Lenovo
 */
public class laporan extends javax.swing.JFrame {

    /**
     * Creates new form utama
     */
    public laporan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        menuLabel = new javax.swing.JLabel();
        buatLaporanButton = new javax.swing.JButton();
        tingkatButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        buatLaporanLabel = new javax.swing.JLabel();
        tanggalLaporanLabel = new javax.swing.JLabel();
        kabupatenLaporanLabel = new javax.swing.JLabel();
        jenisLaporanLabel = new javax.swing.JLabel();
        jenisKriminalitasComboBox = new javax.swing.JComboBox<>();
        wilayahKriminalitasComboBox = new javax.swing.JComboBox<>();
        detailLabel = new javax.swing.JLabel();
        laporanButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailTextArea = new javax.swing.JTextArea();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buat Laporan");

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setPreferredSize(new java.awt.Dimension(200, 720));

        menuLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        menuLabel.setText("Menu");

        buatLaporanButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buatLaporanButton.setText("Buat Laporan");

        tingkatButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tingkatButton.setText("Tingkat Kriminalitas");

        editButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        editButton.setText("Edit Pengguna");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuLabel)
                    .addComponent(tingkatButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buatLaporanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLabel)
                .addGap(18, 18, 18)
                .addComponent(buatLaporanButton)
                .addGap(18, 18, 18)
                .addComponent(tingkatButton)
                .addGap(18, 18, 18)
                .addComponent(editButton)
                .addContainerGap(567, Short.MAX_VALUE))
        );

        buatLaporanLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        buatLaporanLabel.setText("Create Laporan");

        tanggalLaporanLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tanggalLaporanLabel.setText("Tanggal Kejadian");

        kabupatenLaporanLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        kabupatenLaporanLabel.setText("Wilayah Kejadian");

        jenisLaporanLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jenisLaporanLabel.setText("Jenis Kriminalitas");

        jenisKriminalitasComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jenisKriminalitasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pencurian", "Perampokan", "Pembunuhan" }));

        wilayahKriminalitasComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        wilayahKriminalitasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kulon Progo", "Bantul", "Gunung Kidul", "Sleman", "Kota Yogyakarta" }));
        wilayahKriminalitasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wilayahKriminalitasComboBoxActionPerformed(evt);
            }
        });

        detailLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        detailLabel.setText("Detail Kejadian");

        laporanButton.setBackground(new java.awt.Color(214, 48, 49));
        laporanButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        laporanButton.setText("Buat Laporan");
        laporanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanButtonActionPerformed(evt);
            }
        });

        detailTextArea.setColumns(20);
        detailTextArea.setRows(5);
        jScrollPane1.setViewportView(detailTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buatLaporanLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(laporanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jenisLaporanLabel)
                                .addComponent(tanggalLaporanLabel)
                                .addComponent(kabupatenLaporanLabel)
                                .addComponent(detailLabel))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(wilayahKriminalitasComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                                        .addComponent(jenisKriminalitasComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(300, 300, 300))))))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(buatLaporanLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenisLaporanLabel)
                    .addComponent(jenisKriminalitasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kabupatenLaporanLabel)
                    .addComponent(wilayahKriminalitasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tanggalLaporanLabel)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(laporanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wilayahKriminalitasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wilayahKriminalitasComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wilayahKriminalitasComboBoxActionPerformed

    private void laporanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laporanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buatLaporanButton;
    private javax.swing.JLabel buatLaporanLabel;
    private javax.swing.JLabel detailLabel;
    private javax.swing.JTextArea detailTextArea;
    private javax.swing.JButton editButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenisKriminalitasComboBox;
    private javax.swing.JLabel jenisLaporanLabel;
    private javax.swing.JLabel kabupatenLaporanLabel;
    private javax.swing.JButton laporanButton;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel tanggalLaporanLabel;
    private javax.swing.JButton tingkatButton;
    private javax.swing.JComboBox<String> wilayahKriminalitasComboBox;
    // End of variables declaration//GEN-END:variables
}
