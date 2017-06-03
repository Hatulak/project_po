/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;


public class DodajDruzyne extends javax.swing.JFrame {

    MenuGlowne menu;
    public DodajDruzyne(MenuGlowne m) {
        initComponents();
        menu = m;
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDodaj = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfZawodnik1_imie = new javax.swing.JTextField();
        tfZawodnik2_imie = new javax.swing.JTextField();
        tfZawodnik3_imie = new javax.swing.JTextField();
        tfZawodnik4_imie = new javax.swing.JTextField();
        tfZawodnik5_imie = new javax.swing.JTextField();
        tfZawodnik6_imie = new javax.swing.JTextField();
        tfZawodnik1_nazwisko = new javax.swing.JTextField();
        tfZawodnik2_nazwisko = new javax.swing.JTextField();
        tfZawodnik3_nazwisko = new javax.swing.JTextField();
        tfZawodnik4_nazwisko = new javax.swing.JTextField();
        tfZawodnik5_nazwisko = new javax.swing.JTextField();
        tfZawodnik6_nazwisko = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfNazwaDruzyny = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        jLabel1.setText("Zawodnik 1");

        jLabel2.setText("Zawodnik 2");

        jLabel3.setText("Zawodnik 3");

        jLabel4.setText("Zawodnik 4");

        jLabel5.setText("Zawodnik 5");

        jLabel6.setText("Zawodnik 6");

        tfZawodnik1_nazwisko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfZawodnik1_nazwiskoActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Nazwa Drużyny");

        tfNazwaDruzyny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNazwaDruzynyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfZawodnik1_imie)
                            .addComponent(tfZawodnik1_nazwisko))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfZawodnik2_imie)
                            .addComponent(tfZawodnik2_nazwisko)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfZawodnik3_imie)
                            .addComponent(tfZawodnik3_nazwisko))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfZawodnik4_nazwisko)
                            .addComponent(jLabel4)
                            .addComponent(tfZawodnik4_imie)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNazwaDruzyny)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(tfZawodnik5_nazwisko)
                            .addComponent(tfZawodnik5_imie))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfZawodnik6_nazwisko)
                            .addComponent(jLabel6)
                            .addComponent(tfZawodnik6_imie)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addGap(4, 4, 4)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfZawodnik1_imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfZawodnik2_imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfZawodnik3_imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfZawodnik4_imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfZawodnik5_imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfZawodnik6_imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfZawodnik1_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfZawodnik2_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfZawodnik3_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfZawodnik4_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfZawodnik5_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfZawodnik6_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(jLabel7)
                    .addComponent(tfNazwaDruzyny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfZawodnik1_nazwiskoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfZawodnik1_nazwiskoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfZawodnik1_nazwiskoActionPerformed

    private void tfNazwaDruzynyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNazwaDruzynyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNazwaDruzynyActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        menu.druzyna_dodawana = new Druzyna();
        menu.druzyna_dodawana.dodajZawodnika(new Zawodnik(tfZawodnik1_imie.getText(),tfZawodnik1_nazwisko.getText()));
        menu.druzyna_dodawana.dodajZawodnika(new Zawodnik(tfZawodnik2_imie.getText(),tfZawodnik2_nazwisko.getText()));
        menu.druzyna_dodawana.dodajZawodnika(new Zawodnik(tfZawodnik3_imie.getText(),tfZawodnik3_nazwisko.getText()));
        menu.druzyna_dodawana.dodajZawodnika(new Zawodnik(tfZawodnik4_imie.getText(),tfZawodnik4_nazwisko.getText()));
        menu.druzyna_dodawana.dodajZawodnika(new Zawodnik(tfZawodnik5_imie.getText(),tfZawodnik5_nazwisko.getText()));
        menu.druzyna_dodawana.dodajZawodnika(new Zawodnik(tfZawodnik6_imie.getText(),tfZawodnik6_nazwisko.getText()));
        menu.druzyna_dodawana.setNazwa(tfNazwaDruzyny.getText());
        
        menu.wstawDruzyne();
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDodajActionPerformed

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
            java.util.logging.Logger.getLogger(DodajDruzyne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DodajDruzyne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DodajDruzyne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DodajDruzyne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DodajDruzyne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfNazwaDruzyny;
    private javax.swing.JTextField tfZawodnik1_imie;
    private javax.swing.JTextField tfZawodnik1_nazwisko;
    private javax.swing.JTextField tfZawodnik2_imie;
    private javax.swing.JTextField tfZawodnik2_nazwisko;
    private javax.swing.JTextField tfZawodnik3_imie;
    private javax.swing.JTextField tfZawodnik3_nazwisko;
    private javax.swing.JTextField tfZawodnik4_imie;
    private javax.swing.JTextField tfZawodnik4_nazwisko;
    private javax.swing.JTextField tfZawodnik5_imie;
    private javax.swing.JTextField tfZawodnik5_nazwisko;
    private javax.swing.JTextField tfZawodnik6_imie;
    private javax.swing.JTextField tfZawodnik6_nazwisko;
    // End of variables declaration//GEN-END:variables
}
