
package projekt;

import javax.swing.table.DefaultTableModel;


public class MenuGlowne extends javax.swing.JFrame {

    public Sedzia sedzia_dodawany;
    public Druzyna druzyna_dodawana;
    
    
    public DefaultTableModel sedziowie_model = new DefaultTableModel(0,0);
    public DefaultTableModel druzyny_model = new DefaultTableModel(0,0);
    
    
    
    
    public MenuGlowne() {
        initComponents();
    }

    public void wstawSedziego(){
        this.sedziowie_model.addRow(new Object[]{sedzia_dodawany.getImie(), sedzia_dodawany.getNazwisko()});
    }
    
    public void wstawDruzyne(){
        this.druzyny_model.addRow(new Object[]{druzyna_dodawana.getNazwa()});
            
    } 
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        tpSiatkowka = new javax.swing.JTabbedPane();
        pSedziowieSiat = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tSedziowie = new javax.swing.JTable();
        btnDodajSedziego = new javax.swing.JButton();
        pMeczeSiat = new javax.swing.JPanel();
        pTabelaSiat = new javax.swing.JPanel();
        pDruzyny = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tDruzyny = new javax.swing.JTable();
        btnDodajDruzyne = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sedziowie_model.setColumnIdentifiers(new Object[]{"Imie","Nazwisko"});
        tSedziowie.setModel(sedziowie_model);
        jScrollPane3.setViewportView(tSedziowie);

        btnDodajSedziego.setText("Dodaj Sędziego");
        btnDodajSedziego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajSedziegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSedziowieSiatLayout = new javax.swing.GroupLayout(pSedziowieSiat);
        pSedziowieSiat.setLayout(pSedziowieSiatLayout);
        pSedziowieSiatLayout.setHorizontalGroup(
            pSedziowieSiatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSedziowieSiatLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnDodajSedziego)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pSedziowieSiatLayout.setVerticalGroup(
            pSedziowieSiatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSedziowieSiatLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnDodajSedziego)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        tpSiatkowka.addTab("Sędziowie", pSedziowieSiat);

        javax.swing.GroupLayout pMeczeSiatLayout = new javax.swing.GroupLayout(pMeczeSiat);
        pMeczeSiat.setLayout(pMeczeSiatLayout);
        pMeczeSiatLayout.setHorizontalGroup(
            pMeczeSiatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        pMeczeSiatLayout.setVerticalGroup(
            pMeczeSiatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        tpSiatkowka.addTab("Mecze", pMeczeSiat);

        javax.swing.GroupLayout pTabelaSiatLayout = new javax.swing.GroupLayout(pTabelaSiat);
        pTabelaSiat.setLayout(pTabelaSiatLayout);
        pTabelaSiatLayout.setHorizontalGroup(
            pTabelaSiatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        pTabelaSiatLayout.setVerticalGroup(
            pTabelaSiatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        tpSiatkowka.addTab("Tabela Wyników", pTabelaSiat);

        jTabbedPane1.addTab("Siatkówka", tpSiatkowka);

        druzyny_model.setColumnIdentifiers(new Object[]{"Nazwa drużyny"});
        tDruzyny.setModel(druzyny_model);
        jScrollPane2.setViewportView(tDruzyny);

        btnDodajDruzyne.setText("Dodaj Drużynę");
        btnDodajDruzyne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajDruzyneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDruzynyLayout = new javax.swing.GroupLayout(pDruzyny);
        pDruzyny.setLayout(pDruzynyLayout);
        pDruzynyLayout.setHorizontalGroup(
            pDruzynyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDruzynyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnDodajDruzyne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pDruzynyLayout.setVerticalGroup(
            pDruzynyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
            .addGroup(pDruzynyLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnDodajDruzyne)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Drużyny", pDruzyny);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajSedziegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajSedziegoActionPerformed
       DodajSedziego fDodajSedziego = new DodajSedziego(this);
       fDodajSedziego.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDodajSedziegoActionPerformed

    private void btnDodajDruzyneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajDruzyneActionPerformed
           DodajDruzyne fDodajDruzyne = new DodajDruzyne(this);
           fDodajDruzyne.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDodajDruzyneActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGlowne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajDruzyne;
    private javax.swing.JButton btnDodajSedziego;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pDruzyny;
    private javax.swing.JPanel pMeczeSiat;
    private javax.swing.JPanel pSedziowieSiat;
    private javax.swing.JPanel pTabelaSiat;
    private javax.swing.JTable tDruzyny;
    private javax.swing.JTable tSedziowie;
    private javax.swing.JTabbedPane tpSiatkowka;
    // End of variables declaration//GEN-END:variables
}
