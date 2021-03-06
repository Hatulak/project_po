
package projekt;

import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * Interfejs 
 */
public class PrzegladMeczu extends javax.swing.JFrame {
    
    DefaultTableModel tabelaSedziow_model = new DefaultTableModel(0,0){
    @Override
        public boolean isCellEditable(int rzad, int kolumna){
            return false;
        }
    };
    
    MenuGlowne menu;
    String team1,team2, nazwa_sportu, tekst, nazwa_zwyciezcy, faza;
    List<Sedzia> lista_sedziow = new LinkedList<>();
   
    public PrzegladMeczu(MenuGlowne m, String team1, String team2, String sport, String faza_meczu) {
        nazwa_sportu = sport;
        menu=m;
        this.team1=team1;
        this.team2=team2;
        this.faza= faza_meczu;
        tabelaSedziow_model.setColumnIdentifiers(new Object[]{"Imie", "Nazwisko"});
        
        if(sport.matches("Siatkowka")){
            tekst = "Sedziowie";
            if(faza.matches("Finał")){
                Siatkowka mecz =(Siatkowka) menu.rozgrywki.getTurniejSiatkowki().getFinal();
                lista_sedziow = mecz.getSedziowie();
                if(mecz.getZwyciezca() != null) nazwa_zwyciezcy = mecz.getZwyciezca().getNazwa();
                else nazwa_zwyciezcy = "Brak";
            }
            else if(faza.matches("Półfinały")){
                Siatkowka polfinal1 = (Siatkowka) menu.rozgrywki.getTurniejSiatkowki().getPolfinal_1();
                Siatkowka polfinal2 = (Siatkowka) menu.rozgrywki.getTurniejSiatkowki().getPolfinal_2();
                if( (polfinal1.getTeam1().getNazwa().matches(team1) && polfinal1.getTeam2().getNazwa().matches(team2) ) || (polfinal1.getTeam1().getNazwa().matches(team2) && polfinal1.getTeam2().getNazwa().matches(team1) )   ){
                    lista_sedziow = polfinal1.getSedziowie();
                    if(polfinal1.getZwyciezca() != null) nazwa_zwyciezcy = polfinal1.getZwyciezca().getNazwa();
                    else nazwa_zwyciezcy = "Brak";
                }
                else if( (polfinal2.getTeam1().getNazwa().matches(team1) && polfinal2.getTeam2().getNazwa().matches(team2) ) || (polfinal2.getTeam1().getNazwa().matches(team2) && polfinal2.getTeam2().getNazwa().matches(team1) )   ){
                    lista_sedziow = polfinal2.getSedziowie();
                    if(polfinal2.getZwyciezca() != null) nazwa_zwyciezcy = polfinal2.getZwyciezca().getNazwa();
                    else nazwa_zwyciezcy = "Brak";
                }
            }
            else{
                for( Mecz mecz : menu.rozgrywki.getTurniejSiatkowki().getLista_meczy()){
                    Siatkowka _mecz = (Siatkowka)mecz;
                    if( (mecz.getTeam1().getNazwa().matches(team1) && mecz.getTeam2().getNazwa().matches(team2) ) || (mecz.getTeam1().getNazwa().matches(team2) && mecz.getTeam2().getNazwa().matches(team1) )   ){
                        lista_sedziow = _mecz.getSedziowie();
                        if(_mecz.getZwyciezca() != null) nazwa_zwyciezcy = _mecz.getZwyciezca().getNazwa();
                        else nazwa_zwyciezcy = "Brak";
                    }
                }
            }
        }
        else if(sport.matches("Dwa_Ognie")){
            tekst = "Sedzia";
            if(faza.matches("Finał")){
                Dwa_Ognie mecz =(Dwa_Ognie) menu.rozgrywki.getTurniejDwa_Ognie().getFinal();
                lista_sedziow.add(mecz.getSedzia());
                if(mecz.getZwyciezca() != null) nazwa_zwyciezcy = mecz.getZwyciezca().getNazwa();
                else nazwa_zwyciezcy = "Brak";
            }
            else if(faza.matches("Półfinały")){
                Dwa_Ognie polfinal1 = (Dwa_Ognie) menu.rozgrywki.getTurniejDwa_Ognie().getPolfinal_1();
                Dwa_Ognie polfinal2 = (Dwa_Ognie) menu.rozgrywki.getTurniejDwa_Ognie().getPolfinal_2();
                if( (polfinal1.getTeam1().getNazwa().matches(team1) && polfinal1.getTeam2().getNazwa().matches(team2) ) || (polfinal1.getTeam1().getNazwa().matches(team2) && polfinal1.getTeam2().getNazwa().matches(team1) )   ){
                    lista_sedziow.add(polfinal1.getSedzia());
                    if(polfinal1.getZwyciezca() != null) nazwa_zwyciezcy = polfinal1.getZwyciezca().getNazwa();
                    else nazwa_zwyciezcy = "Brak";
                }
                else if( (polfinal2.getTeam1().getNazwa().matches(team1) && polfinal2.getTeam2().getNazwa().matches(team2) ) || (polfinal2.getTeam1().getNazwa().matches(team2) && polfinal2.getTeam2().getNazwa().matches(team1) )   ){
                    lista_sedziow.add(polfinal2.getSedzia());
                    if(polfinal2.getZwyciezca() != null) nazwa_zwyciezcy = polfinal2.getZwyciezca().getNazwa();
                    else nazwa_zwyciezcy = "Brak";
                }
            }
            else{
                for( Mecz mecz : menu.rozgrywki.getTurniejDwa_Ognie().getLista_meczy()){
                    Dwa_Ognie _mecz = (Dwa_Ognie)mecz;
                    if( (mecz.getTeam1().getNazwa().matches(team1) && mecz.getTeam2().getNazwa().matches(team2) ) || (mecz.getTeam1().getNazwa().matches(team2) && mecz.getTeam2().getNazwa().matches(team1) )   ){
                        lista_sedziow.add(_mecz.getSedzia());
                        if(_mecz.getZwyciezca() != null) nazwa_zwyciezcy = _mecz.getZwyciezca().getNazwa();
                        else nazwa_zwyciezcy = "Brak";
                    }
                }
            }
        }
        else if(sport.matches("Przeciaganie_Liny")){
            tekst = "Sedzia";
            if(faza.matches("Finał")){
                Przeciaganie_Liny mecz =(Przeciaganie_Liny) menu.rozgrywki.getTurniejLina().getFinal();
                lista_sedziow.add(mecz.getSedzia());
                if(mecz.getZwyciezca() != null) nazwa_zwyciezcy = mecz.getZwyciezca().getNazwa();
                else nazwa_zwyciezcy = "Brak";
            }
            else if(faza.matches("Półfinały")){
                Przeciaganie_Liny polfinal1 = (Przeciaganie_Liny) menu.rozgrywki.getTurniejLina().getPolfinal_1();
                Przeciaganie_Liny polfinal2 = (Przeciaganie_Liny) menu.rozgrywki.getTurniejLina().getPolfinal_2();
                if( (polfinal1.getTeam1().getNazwa().matches(team1) && polfinal1.getTeam2().getNazwa().matches(team2) ) || (polfinal1.getTeam1().getNazwa().matches(team2) && polfinal1.getTeam2().getNazwa().matches(team1) )   ){
                    lista_sedziow.add(polfinal1.getSedzia());
                    if(polfinal1.getZwyciezca() != null) nazwa_zwyciezcy = polfinal1.getZwyciezca().getNazwa();
                    else nazwa_zwyciezcy = "Brak";
                }
                else if( (polfinal2.getTeam1().getNazwa().matches(team1) && polfinal2.getTeam2().getNazwa().matches(team2) ) || (polfinal2.getTeam1().getNazwa().matches(team2) && polfinal2.getTeam2().getNazwa().matches(team1) )   ){
                    lista_sedziow.add(polfinal2.getSedzia());
                    if(polfinal2.getZwyciezca() != null) nazwa_zwyciezcy = polfinal2.getZwyciezca().getNazwa();
                    else nazwa_zwyciezcy = "Brak";
                }
            }
            else{
                for( Mecz mecz : menu.rozgrywki.getTurniejLina().getLista_meczy()){
                    Przeciaganie_Liny _mecz = (Przeciaganie_Liny)mecz;
                    if( (mecz.getTeam1().getNazwa().matches(team1) && mecz.getTeam2().getNazwa().matches(team2) ) || (mecz.getTeam1().getNazwa().matches(team2) && mecz.getTeam2().getNazwa().matches(team1) )   ){
                        lista_sedziow.add(_mecz.getSedzia());
                        if(_mecz.getZwyciezca() != null) nazwa_zwyciezcy = _mecz.getZwyciezca().getNazwa();
                        else nazwa_zwyciezcy = "Brak";
                    }
                }
            } 
        }
        
        for(Sedzia sedzia : lista_sedziow){
            tabelaSedziow_model.addRow(new Object[]{ sedzia.getImie() , sedzia.getNazwisko() });
        }
        
        
        
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

        lMecz = new javax.swing.JLabel();
        lDyscyplina = new javax.swing.JLabel();
        bPowrot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tSedziowie = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNazwa_Zwyciezcy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lMecz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lMecz.setText(team1 + " -- "+ team2);

        bPowrot.setText("Wyjscie");
        bPowrot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPowrotActionPerformed(evt);
            }
        });

        tSedziowie.setModel(tabelaSedziow_model);
        jScrollPane1.setViewportView(tSedziowie);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(nazwa_sportu);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(tekst);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Zwyciezca:");

        lblNazwa_Zwyciezcy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lMecz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(lDyscyplina)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNazwa_Zwyciezcy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 50, Short.MAX_VALUE)
                                .addComponent(bPowrot)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(lMecz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lDyscyplina)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNazwa_Zwyciezcy, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bPowrot)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblNazwa_Zwyciezcy.setText(nazwa_zwyciezcy);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPowrotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPowrotActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bPowrotActionPerformed

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
            java.util.logging.Logger.getLogger(PrzegladMeczu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrzegladMeczu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrzegladMeczu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrzegladMeczu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PrzegladMeczu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPowrot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lDyscyplina;
    private javax.swing.JLabel lMecz;
    private javax.swing.JLabel lblNazwa_Zwyciezcy;
    private javax.swing.JTable tSedziowie;
    // End of variables declaration//GEN-END:variables
}
