/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alapmuvgyak;

/**
 *
 * @author ricsi
 */
public class AlapMuvelet extends javax.swing.JFrame {

    /**
     * Creates new form alapMuvelet
     */
    public AlapMuvelet() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelFeladat = new javax.swing.JLabel();
        jTextValasz = new javax.swing.JTextField();
        jButtonEllenorzes = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButtonUjFeladat = new javax.swing.JButton();
        jButtonMegoldas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelOsszKerdesSzorzas = new javax.swing.JLabel();
        jLabelOsszKerdesOssze = new javax.swing.JLabel();
        jLabelOsszKerdesKivon = new javax.swing.JLabel();
        jLabelOsszKerdesOsztas = new javax.swing.JLabel();
        jLabelOsszKerdes = new javax.swing.JLabel();
        jLabelOsszProba = new javax.swing.JLabel();
        jLabelOsszProbaOsszeadas = new javax.swing.JLabel();
        jLabelOsszProbaKivonas = new javax.swing.JLabel();
        jLabelOsszProbaOsztas = new javax.swing.JLabel();
        jLabelOsszProbaSzorzas = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFajl = new javax.swing.JMenu();
        jMenuMegnyit = new javax.swing.JMenuItem();
        jMenuMent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuKilep = new javax.swing.JMenuItem();
        jMenuMuv = new javax.swing.JMenu();
        jMenuMuvOsszead = new javax.swing.JRadioButtonMenuItem();
        jMenuMuvKivonas = new javax.swing.JRadioButtonMenuItem();
        jMenuMuvSzorzas = new javax.swing.JRadioButtonMenuItem();
        jMenuMuvOsztas = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gakorlás"));

        jLabelFeladat.setText("5+12=");

        jTextValasz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValaszActionPerformed(evt);
            }
        });

        jButtonEllenorzes.setText("Ellenőrzés");
        jButtonEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEllenorzesActionPerformed(evt);
            }
        });

        jLabel14.setText("15 nem jó!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFeladat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextValasz, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEllenorzes)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFeladat)
                    .addComponent(jTextValasz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEllenorzes))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jButtonUjFeladat.setText("Új feladat");
        jButtonUjFeladat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUjFeladatActionPerformed(evt);
            }
        });

        jButtonMegoldas.setText("Megoldás");
        jButtonMegoldas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMegoldasActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        jLabelOsszKerdesSzorzas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOsszKerdesSzorzas.setText("Szorzás:0");

        jLabelOsszKerdesOssze.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOsszKerdesOssze.setText("Összeadás:1");

        jLabelOsszKerdesKivon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOsszKerdesKivon.setText("Kivonás:0");

        jLabelOsszKerdesOsztas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOsszKerdesOsztas.setText("Osztás:0");

        jLabelOsszKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOsszKerdes.setText("Össz kérdések száma:1");

        jLabelOsszProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOsszProba.setText("Összes Probélkozások száma:1");

        jLabelOsszProbaOsszeadas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOsszProbaOsszeadas.setText("Összeadés:1");

        jLabelOsszProbaKivonas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOsszProbaKivonas.setText("Kivonás:0");

        jLabelOsszProbaOsztas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOsszProbaOsztas.setText("Osztás:0");

        jLabelOsszProbaSzorzas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOsszProbaSzorzas.setText("Szorzás:0");

        jLabel15.setText("Eredmény: 0 %");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(85, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelOsszKerdesSzorzas)
                            .addComponent(jLabelOsszKerdesOsztas)
                            .addComponent(jLabelOsszKerdesOssze)
                            .addComponent(jLabelOsszKerdes)
                            .addComponent(jLabelOsszKerdesKivon))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOsszProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelOsszProbaOsszeadas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelOsszProbaKivonas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelOsszProbaOsztas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelOsszProbaSzorzas, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOsszProba)
                    .addComponent(jLabelOsszKerdes))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOsszProbaOsszeadas)
                    .addComponent(jLabelOsszKerdesOssze))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOsszKerdesKivon)
                    .addComponent(jLabelOsszProbaKivonas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOsszKerdesOsztas)
                    .addComponent(jLabelOsszProbaOsztas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOsszProbaSzorzas)
                    .addComponent(jLabelOsszKerdesSzorzas))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuFajl.setText("fájl");

        jMenuMegnyit.setText("Megnyit");
        jMenuFajl.add(jMenuMegnyit);

        jMenuMent.setText("Ment");
        jMenuMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMentActionPerformed(evt);
            }
        });
        jMenuFajl.add(jMenuMent);
        jMenuFajl.add(jSeparator1);

        jMenuKilep.setText("Kilép");
        jMenuFajl.add(jMenuKilep);

        jMenuBar1.add(jMenuFajl);

        jMenuMuv.setText("műveletek");

        buttonGroup1.add(jMenuMuvOsszead);
        jMenuMuvOsszead.setText("Ősszeadás");
        jMenuMuvOsszead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMuvOsszeadActionPerformed(evt);
            }
        });
        jMenuMuv.add(jMenuMuvOsszead);

        buttonGroup1.add(jMenuMuvKivonas);
        jMenuMuvKivonas.setText("Kivonás");
        jMenuMuvKivonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMuvKivonasActionPerformed(evt);
            }
        });
        jMenuMuv.add(jMenuMuvKivonas);

        buttonGroup1.add(jMenuMuvSzorzas);
        jMenuMuvSzorzas.setText("Szorzás");
        jMenuMuv.add(jMenuMuvSzorzas);

        buttonGroup1.add(jMenuMuvOsztas);
        jMenuMuvOsztas.setText("Osztás");
        jMenuMuvOsztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMuvOsztasActionPerformed(evt);
            }
        });
        jMenuMuv.add(jMenuMuvOsztas);

        jMenuBar1.add(jMenuMuv);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonUjFeladat)
                    .addComponent(jButtonMegoldas))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonUjFeladat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMegoldas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUjFeladatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUjFeladatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUjFeladatActionPerformed

    private void jButtonMegoldasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMegoldasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMegoldasActionPerformed

    private void jTextValaszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValaszActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValaszActionPerformed

    private void jMenuMuvOsszeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMuvOsszeadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMuvOsszeadActionPerformed

    private void jMenuMuvKivonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMuvKivonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMuvKivonasActionPerformed

    private void jMenuMuvOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMuvOsztasActionPerformed
jLabelFeladat.setText("10/5=");
jTextValasz.setText("");
    }//GEN-LAST:event_jMenuMuvOsztasActionPerformed

    private void jMenuMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMentActionPerformed

    private void jButtonEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEllenorzesActionPerformed
      ertekeles();
    }//GEN-LAST:event_jButtonEllenorzesActionPerformed

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
            java.util.logging.Logger.getLogger(AlapMuvelet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlapMuvelet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlapMuvelet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlapMuvelet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlapMuvelet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonEllenorzes;
    private javax.swing.JButton jButtonMegoldas;
    private javax.swing.JButton jButtonUjFeladat;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabelFeladat;
    private javax.swing.JLabel jLabelOsszKerdes;
    private javax.swing.JLabel jLabelOsszKerdesKivon;
    private javax.swing.JLabel jLabelOsszKerdesOssze;
    private javax.swing.JLabel jLabelOsszKerdesOsztas;
    private javax.swing.JLabel jLabelOsszKerdesSzorzas;
    private javax.swing.JLabel jLabelOsszProba;
    private javax.swing.JLabel jLabelOsszProbaKivonas;
    private javax.swing.JLabel jLabelOsszProbaOsszeadas;
    private javax.swing.JLabel jLabelOsszProbaOsztas;
    private javax.swing.JLabel jLabelOsszProbaSzorzas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFajl;
    private javax.swing.JMenuItem jMenuKilep;
    private javax.swing.JMenuItem jMenuMegnyit;
    private javax.swing.JMenuItem jMenuMent;
    private javax.swing.JMenu jMenuMuv;
    private javax.swing.JRadioButtonMenuItem jMenuMuvKivonas;
    private javax.swing.JRadioButtonMenuItem jMenuMuvOsszead;
    private javax.swing.JRadioButtonMenuItem jMenuMuvOsztas;
    private javax.swing.JRadioButtonMenuItem jMenuMuvSzorzas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextValasz;
    // End of variables declaration//GEN-END:variables

    private void ertekeles() {
        String Valasz=jTextValasz.getText();
        if ("2".equals(Valasz)) {
            jLabel14.setText("Jó a válasz");
            
        }
        else{
            jLabel14.setText("Nem jó a válasz");
        }
    }
}
