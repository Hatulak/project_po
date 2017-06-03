
package projekt;

import javax.swing.table.DefaultTableModel;


public class MenuGlowne extends javax.swing.JFrame {

    public Sedzia sedzia_dodawany;
    public Druzyna druzyna_dodawana;
    
    
    public DefaultTableModel sedziowieSiatkowka_model = new DefaultTableModel(0,0){
        @Override
        public boolean isCellEditable(int rzad, int kolumna){
            return false;
        }
    };
    public DefaultTableModel sedziowieDwa_Ognie_model = new DefaultTableModel(0,0){
        @Override
        public boolean isCellEditable(int rzad, int kolumna){
            return false;
        }
    };
    public DefaultTableModel sedziowiePrzeciaganie_Liny_model = new DefaultTableModel(0,0){
        @Override
        public boolean isCellEditable(int rzad, int kolumna){
            return false;
        }
    };
    
    public DefaultTableModel druzyny_model = new DefaultTableModel(0,0){
        @Override
        public boolean isCellEditable(int rzad, int kolumna){
            return false;
        }
    };
    
    
    
    
    public MenuGlowne() {
        initComponents();
    }

    public void wstawSedziegoSiatkowka(){
        this.sedziowieSiatkowka_model.addRow(new Object[]{sedzia_dodawany.getImie(), sedzia_dodawany.getNazwisko()});
    }
    public void wstawSedziegoDwa_Ognie(){
        this.sedziowieDwa_Ognie_model.addRow(new Object[]{sedzia_dodawany.getImie(), sedzia_dodawany.getNazwisko()});
    }
    public void wstawSedziegoPrzeciaganieLiny(){
        this.sedziowiePrzeciaganie_Liny_model.addRow(new Object[]{sedzia_dodawany.getImie(), sedzia_dodawany.getNazwisko()});
    }
    
    
    public void wstawDruzyne(){
        this.druzyny_model.addRow(new Object[]{druzyna_dodawana.getNazwa()});
            
    } 
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        tpSiatkowka = new javax.swing.JTabbedPane();
        pSedziowieSiatkowka = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tSedziowieSiatkowka = new javax.swing.JTable();
        btnDodajSedziegoSiatkowka = new javax.swing.JButton();
        pMeczeSiatkowka = new javax.swing.JPanel();
        pTabelaSiatkowka = new javax.swing.JPanel();
        tpDwa_Ognie = new javax.swing.JTabbedPane();
        pSedziowieDwa_Ognie = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tSedziowieDwa_Ognie = new javax.swing.JTable();
        btnDodajSedziegoDwa_Ognie = new javax.swing.JButton();
        pMeczeDwa_Ognie = new javax.swing.JPanel();
        pTabelaDwa_Ognie = new javax.swing.JPanel();
        tpPrzeciaganie_Liny = new javax.swing.JTabbedPane();
        pSedziowiePrzeciaganie_Liny = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tSedziowiePrzeciaganie_Liny = new javax.swing.JTable();
        btnDodajSedziegoPrzeciaganie_Liny = new javax.swing.JButton();
        pMeczePrzeciaganie_Liny = new javax.swing.JPanel();
        pTabelaPrzeciaganie_Liny = new javax.swing.JPanel();
        pDruzyny = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tDruzyny = new javax.swing.JTable();
        btnDodajDruzyne = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sedziowieSiatkowka_model.setColumnIdentifiers(new Object[]{"Imie","Nazwisko"});
        tSedziowieSiatkowka.setModel(sedziowieSiatkowka_model);
        jScrollPane3.setViewportView(tSedziowieSiatkowka);

        btnDodajSedziegoSiatkowka.setText("Dodaj Sędziego");
        btnDodajSedziegoSiatkowka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajSedziegoSiatkowkaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSedziowieSiatkowkaLayout = new javax.swing.GroupLayout(pSedziowieSiatkowka);
        pSedziowieSiatkowka.setLayout(pSedziowieSiatkowkaLayout);
        pSedziowieSiatkowkaLayout.setHorizontalGroup(
            pSedziowieSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSedziowieSiatkowkaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnDodajSedziegoSiatkowka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pSedziowieSiatkowkaLayout.setVerticalGroup(
            pSedziowieSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSedziowieSiatkowkaLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnDodajSedziegoSiatkowka)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        tpSiatkowka.addTab("Sędziowie", pSedziowieSiatkowka);

        javax.swing.GroupLayout pMeczeSiatkowkaLayout = new javax.swing.GroupLayout(pMeczeSiatkowka);
        pMeczeSiatkowka.setLayout(pMeczeSiatkowkaLayout);
        pMeczeSiatkowkaLayout.setHorizontalGroup(
            pMeczeSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        pMeczeSiatkowkaLayout.setVerticalGroup(
            pMeczeSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        tpSiatkowka.addTab("Mecze", pMeczeSiatkowka);

        javax.swing.GroupLayout pTabelaSiatkowkaLayout = new javax.swing.GroupLayout(pTabelaSiatkowka);
        pTabelaSiatkowka.setLayout(pTabelaSiatkowkaLayout);
        pTabelaSiatkowkaLayout.setHorizontalGroup(
            pTabelaSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        pTabelaSiatkowkaLayout.setVerticalGroup(
            pTabelaSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        tpSiatkowka.addTab("Tabela Wyników", pTabelaSiatkowka);

        jTabbedPane1.addTab("Siatkówka", tpSiatkowka);

        sedziowieDwa_Ognie_model.setColumnIdentifiers(new Object[]{"Imie","Nazwisko"});
        tSedziowieDwa_Ognie.setModel(sedziowieDwa_Ognie_model);
        jScrollPane4.setViewportView(tSedziowieDwa_Ognie);

        btnDodajSedziegoDwa_Ognie.setText("Dodaj Sędziego");
        btnDodajSedziegoDwa_Ognie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajSedziegoDwa_OgnieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSedziowieDwa_OgnieLayout = new javax.swing.GroupLayout(pSedziowieDwa_Ognie);
        pSedziowieDwa_Ognie.setLayout(pSedziowieDwa_OgnieLayout);
        pSedziowieDwa_OgnieLayout.setHorizontalGroup(
            pSedziowieDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSedziowieDwa_OgnieLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnDodajSedziegoDwa_Ognie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pSedziowieDwa_OgnieLayout.setVerticalGroup(
            pSedziowieDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSedziowieDwa_OgnieLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnDodajSedziegoDwa_Ognie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        tpDwa_Ognie.addTab("Sędziowie", pSedziowieDwa_Ognie);

        javax.swing.GroupLayout pMeczeDwa_OgnieLayout = new javax.swing.GroupLayout(pMeczeDwa_Ognie);
        pMeczeDwa_Ognie.setLayout(pMeczeDwa_OgnieLayout);
        pMeczeDwa_OgnieLayout.setHorizontalGroup(
            pMeczeDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        pMeczeDwa_OgnieLayout.setVerticalGroup(
            pMeczeDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        tpDwa_Ognie.addTab("Mecze", pMeczeDwa_Ognie);

        javax.swing.GroupLayout pTabelaDwa_OgnieLayout = new javax.swing.GroupLayout(pTabelaDwa_Ognie);
        pTabelaDwa_Ognie.setLayout(pTabelaDwa_OgnieLayout);
        pTabelaDwa_OgnieLayout.setHorizontalGroup(
            pTabelaDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        pTabelaDwa_OgnieLayout.setVerticalGroup(
            pTabelaDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        tpDwa_Ognie.addTab("Tabela Wyników", pTabelaDwa_Ognie);

        jTabbedPane1.addTab("Dwa ognie", tpDwa_Ognie);

        sedziowiePrzeciaganie_Liny_model.setColumnIdentifiers(new Object[]{"Imie","Nazwisko"});
        tSedziowiePrzeciaganie_Liny.setModel(sedziowiePrzeciaganie_Liny_model);
        jScrollPane5.setViewportView(tSedziowiePrzeciaganie_Liny);

        btnDodajSedziegoPrzeciaganie_Liny.setText("Dodaj Sędziego");
        btnDodajSedziegoPrzeciaganie_Liny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajSedziegoPrzeciaganie_LinyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSedziowiePrzeciaganie_LinyLayout = new javax.swing.GroupLayout(pSedziowiePrzeciaganie_Liny);
        pSedziowiePrzeciaganie_Liny.setLayout(pSedziowiePrzeciaganie_LinyLayout);
        pSedziowiePrzeciaganie_LinyLayout.setHorizontalGroup(
            pSedziowiePrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSedziowiePrzeciaganie_LinyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnDodajSedziegoPrzeciaganie_Liny)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pSedziowiePrzeciaganie_LinyLayout.setVerticalGroup(
            pSedziowiePrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSedziowiePrzeciaganie_LinyLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnDodajSedziegoPrzeciaganie_Liny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        tpPrzeciaganie_Liny.addTab("Sędziowie", pSedziowiePrzeciaganie_Liny);

        javax.swing.GroupLayout pMeczePrzeciaganie_LinyLayout = new javax.swing.GroupLayout(pMeczePrzeciaganie_Liny);
        pMeczePrzeciaganie_Liny.setLayout(pMeczePrzeciaganie_LinyLayout);
        pMeczePrzeciaganie_LinyLayout.setHorizontalGroup(
            pMeczePrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        pMeczePrzeciaganie_LinyLayout.setVerticalGroup(
            pMeczePrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        tpPrzeciaganie_Liny.addTab("Mecze", pMeczePrzeciaganie_Liny);

        javax.swing.GroupLayout pTabelaPrzeciaganie_LinyLayout = new javax.swing.GroupLayout(pTabelaPrzeciaganie_Liny);
        pTabelaPrzeciaganie_Liny.setLayout(pTabelaPrzeciaganie_LinyLayout);
        pTabelaPrzeciaganie_LinyLayout.setHorizontalGroup(
            pTabelaPrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        pTabelaPrzeciaganie_LinyLayout.setVerticalGroup(
            pTabelaPrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        tpPrzeciaganie_Liny.addTab("Tabela Wyników", pTabelaPrzeciaganie_Liny);

        jTabbedPane1.addTab("Przeciąganie liny", tpPrzeciaganie_Liny);

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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
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

    private void btnDodajSedziegoSiatkowkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajSedziegoSiatkowkaActionPerformed
       DodajSedziego fDodajSedziegoSiatkowka = new DodajSedziego(this);
       fDodajSedziegoSiatkowka.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDodajSedziegoSiatkowkaActionPerformed

    private void btnDodajDruzyneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajDruzyneActionPerformed
           DodajDruzyne fDodajDruzyne = new DodajDruzyne(this);
           fDodajDruzyne.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDodajDruzyneActionPerformed

    private void btnDodajSedziegoDwa_OgnieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajSedziegoDwa_OgnieActionPerformed
       DodajSedziego fDodajSedziegoDwa_Ognie = new DodajSedziego(this);
       fDodajSedziegoDwa_Ognie.setVisible(true);
       // TODO add your handling code here:
    }//GEN-LAST:event_btnDodajSedziegoDwa_OgnieActionPerformed

    private void btnDodajSedziegoPrzeciaganie_LinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajSedziegoPrzeciaganie_LinyActionPerformed
        DodajSedziego fDodajSedziegoPrzeciaganie_Liny = new DodajSedziego(this);
       fDodajSedziegoPrzeciaganie_Liny.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDodajSedziegoPrzeciaganie_LinyActionPerformed

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
    private javax.swing.JButton btnDodajSedziegoDwa_Ognie;
    private javax.swing.JButton btnDodajSedziegoPrzeciaganie_Liny;
    private javax.swing.JButton btnDodajSedziegoSiatkowka;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pDruzyny;
    private javax.swing.JPanel pMeczeDwa_Ognie;
    private javax.swing.JPanel pMeczePrzeciaganie_Liny;
    private javax.swing.JPanel pMeczeSiatkowka;
    private javax.swing.JPanel pSedziowieDwa_Ognie;
    private javax.swing.JPanel pSedziowiePrzeciaganie_Liny;
    private javax.swing.JPanel pSedziowieSiatkowka;
    private javax.swing.JPanel pTabelaDwa_Ognie;
    private javax.swing.JPanel pTabelaPrzeciaganie_Liny;
    private javax.swing.JPanel pTabelaSiatkowka;
    private javax.swing.JTable tDruzyny;
    private javax.swing.JTable tSedziowieDwa_Ognie;
    private javax.swing.JTable tSedziowiePrzeciaganie_Liny;
    private javax.swing.JTable tSedziowieSiatkowka;
    private javax.swing.JTabbedPane tpDwa_Ognie;
    private javax.swing.JTabbedPane tpPrzeciaganie_Liny;
    private javax.swing.JTabbedPane tpSiatkowka;
    // End of variables declaration//GEN-END:variables
}
