/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author john
 */
public class TugasPBO extends javax.swing.JFrame {

    /**
     * Creates new form TugasPBO
     */
    public TugasPBO() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Absen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Mapel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Nilai = new javax.swing.JTextField();
        ButtonProses = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        ButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Penilaian");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 0, 90, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 50, 50, 30);

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        getContentPane().add(Nama);
        Nama.setBounds(140, 50, 160, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 90, 50, 30);

        Absen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbsenActionPerformed(evt);
            }
        });
        getContentPane().add(Absen);
        Absen.setBounds(140, 90, 160, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Mapel");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 130, 50, 30);

        Mapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapelActionPerformed(evt);
            }
        });
        getContentPane().add(Mapel);
        Mapel.setBounds(140, 130, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hasil :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 260, 40, 30);

        Nilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NilaiActionPerformed(evt);
            }
        });
        getContentPane().add(Nilai);
        Nilai.setBounds(140, 170, 160, 30);

        ButtonProses.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonProses.setText("Proses");
        ButtonProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProsesActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonProses);
        ButtonProses.setBounds(170, 210, 73, 40);

        TA.setEditable(false);
        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 290, 210, 130);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nilai");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 170, 50, 30);

        ButtonReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonReset.setForeground(new java.awt.Color(255, 0, 0));
        ButtonReset.setText("Reset");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonReset);
        ButtonReset.setBounds(170, 440, 71, 40);

        setBounds(0, 0, 416, 562);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void AbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbsenActionPerformed

    private void MapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MapelActionPerformed

    private void NilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NilaiActionPerformed

    private void ButtonProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProsesActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        int absen = Integer.parseInt(Absen.getText());
        String mapel = Mapel.getText();
        int nilai = Integer.parseInt(Nilai.getText());
        
        if(nilai <= 74)
        {
            TA.setText("Nama :"+ nama+"\n"+"Absen :"+ absen+"\n"+"Mapel :"+ mapel+"\n"+"Nilai :"+ nilai+"\n"+"Predikat : Tidak Lulus");
        }
        else if(nilai >= 75 && nilai <= 85)
        {
            TA.setText("Nama :"+ nama+"\n"+"Absen :"+ absen+"\n"+"Mapel :"+ mapel+"\n"+"Nilai :"+ nilai+"\n"+"Predikat : Lulus");
        }
        else
        {
            TA.setText("Nama :"+ nama+"\n"+"Absen :"+ absen+"\n"+"Mapel :"+ mapel+"\n"+"Nilai :"+ nilai+"\n"+"Predikat : Sempurna");
        }
    }//GEN-LAST:event_ButtonProsesActionPerformed

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        // TODO add your handling code here:
        Nama.setText("");
        Absen.setText("");
        Mapel.setText("");
        Nilai.setText("");
        TA.setText("");
    }//GEN-LAST:event_ButtonResetActionPerformed

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
            java.util.logging.Logger.getLogger(TugasPBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TugasPBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TugasPBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TugasPBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasPBO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JButton ButtonProses;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JTextField Mapel;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nilai;
    private javax.swing.JTextArea TA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
