/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

/**
 *
 * @author Przemysław
 */
public class DodajWynik extends javax.swing.JFrame {
    String sport;
    Mecz spotkanie;
    String team1n,team2n;
    MenuGlowne menu;
    public DodajWynik(MenuGlowne m, String nazwa_sportu, String team1nazwa, String team2nazwa) {
        menu = m;
        sport = nazwa_sportu;
        team1n = team1nazwa;
        team2n = team2nazwa;
        initComponents();    
        if(nazwa_sportu.matches("Siatkowka")){
            for (Mecz mecz : menu.rozgrywki.getTurniejSiatkowki().getLista_meczy()) {
                String nazwa1 = mecz.getTeam1().getNazwa();
                String nazwa2 = mecz.getTeam2().getNazwa();
                if (  (team1n.matches(nazwa1) && team2n.matches(nazwa2))  ||  (team1n.matches(nazwa2) && (team2n.matches(nazwa1)))  ){
                    spotkanie = mecz;
                    break;
                }      
            }
        }
        else if(nazwa_sportu.matches("Dwa_Ognie")){
            for (Mecz mecz : menu.rozgrywki.getTurniejDwa_Ognie().getLista_meczy()) {
                String nazwa1 = mecz.getTeam1().getNazwa();
                String nazwa2 = mecz.getTeam2().getNazwa();
                if (  (team1n.matches(nazwa1) && team2n.matches(nazwa2))  ||  (team1n.matches(nazwa2) && (team2n.matches(nazwa1)))  ){
                    spotkanie = mecz;
                    break;
                }      
            }
        }
        else if(nazwa_sportu.matches("Przeciaganie_Liny")){
            for (Mecz mecz : menu.rozgrywki.getTurniejLina().getLista_meczy()) {
                String nazwa1 = mecz.getTeam1().getNazwa();
                String nazwa2 = mecz.getTeam2().getNazwa();
                if (  (team1n.matches(nazwa1) && team2n.matches(nazwa2))  ||  (team1n.matches(nazwa2) && (team2n.matches(nazwa1)))  ){
                    spotkanie = mecz;
                    break;
                }      
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTeam1 = new javax.swing.JButton();
        btnTeam2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnTeam1.setText(team1n);
        btnTeam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeam1ActionPerformed(evt);
            }
        });

        btnTeam2.setText(team2n);
        btnTeam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeam2ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nacisnij w jeden z przycisków aby wybrać zwycięzcę spotkania");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(team1n + "  --  " + team2n);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnTeam1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTeam1)
                    .addComponent(btnTeam2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTeam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeam1ActionPerformed
        // LEWY
        if(team1n.matches(spotkanie.getTeam1().getNazwa())) {
            spotkanie.dodajWynik(spotkanie.getTeam1());
        }
        else{
            spotkanie.dodajWynik(spotkanie.getTeam2());
        }        
        int rzad=0;
       
        if(sport.matches("Siatkowka")){
            for(int i=0;i<menu.rozgrywki.getTurniejSiatkowki().getTabela_wynikow().size();i++){
            if(spotkanie.getZwyciezca().getNazwa().matches((String)menu.siatkowkaTabela_wynikow_model.getValueAt(i, 0))){
                rzad=i;
                break;
            }
        }
            menu.meczeSiatkowka_model.setValueAt(spotkanie.zwyciezca.getNazwa(), menu.tMeczeSiatkowka.getSelectedRow(), 2);
            menu.rozgrywki.getTurniejSiatkowki().dodajPunkty(spotkanie.getZwyciezca());
            menu.siatkowkaTabela_wynikow_model.setValueAt(menu.rozgrywki.getTurniejSiatkowki().getTabela_wynikow().get(spotkanie.getZwyciezca()), rzad, 1);
        }
        else if(sport.matches("Dwa_Ognie")){
            for(int i=0;i<menu.rozgrywki.getTurniejDwa_Ognie().getTabela_wynikow().size();i++){
            if(spotkanie.getZwyciezca().getNazwa().matches((String)menu.dwa_ognie_Tabela_wynikow_model.getValueAt(i, 0))){
                rzad=i;
                break;
            }
        }
            menu.meczeDwa_Ognie_model.setValueAt(spotkanie.zwyciezca.getNazwa(), menu.tMeczeDwa_Ognie.getSelectedRow(), 2);
            menu.rozgrywki.getTurniejDwa_Ognie().dodajPunkty(spotkanie.getZwyciezca());
            menu.dwa_ognie_Tabela_wynikow_model.setValueAt(menu.rozgrywki.getTurniejDwa_Ognie().getTabela_wynikow().get(spotkanie.getZwyciezca()), rzad, 1);
       
        }
        else if(sport.matches("Przeciaganie_Liny")){
            for(int i=0;i<menu.rozgrywki.getTurniejLina().getTabela_wynikow().size();i++){
            if(spotkanie.getZwyciezca().getNazwa().matches((String)menu.przeciaganie_liny_Tabela_wynikow_model.getValueAt(i, 0))){
                rzad=i;
                break;
            }
        }
            menu.meczePrzeciaganie_Liny_model.setValueAt(spotkanie.zwyciezca.getNazwa(), menu.tMeczePrzeciaganie_Liny.getSelectedRow(), 2);
            menu.rozgrywki.getTurniejLina().dodajPunkty(spotkanie.getZwyciezca());
            menu.przeciaganie_liny_Tabela_wynikow_model.setValueAt(menu.rozgrywki.getTurniejLina().getTabela_wynikow().get(spotkanie.getZwyciezca()), rzad, 1);
       
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnTeam1ActionPerformed

    private void btnTeam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeam2ActionPerformed
        // PRAWY
        if(team2n.matches(spotkanie.getTeam1().getNazwa())){
            spotkanie.dodajWynik(spotkanie.getTeam1());
        }
        else{ 
            spotkanie.dodajWynik(spotkanie.getTeam2());
        }
        int rzad=0;
       
        if(sport.matches("Siatkowka")){
            for(int i=0;i<menu.rozgrywki.getTurniejSiatkowki().getTabela_wynikow().size();i++){
            if(spotkanie.getZwyciezca().getNazwa().matches((String)menu.siatkowkaTabela_wynikow_model.getValueAt(i, 0))){
                rzad=i;
                break;
            }
        }
            menu.meczeSiatkowka_model.setValueAt(spotkanie.zwyciezca.getNazwa(), menu.tMeczeSiatkowka.getSelectedRow(), 2);
            menu.rozgrywki.getTurniejSiatkowki().dodajPunkty(spotkanie.getZwyciezca());
            menu.siatkowkaTabela_wynikow_model.setValueAt(menu.rozgrywki.getTurniejSiatkowki().getTabela_wynikow().get(spotkanie.getZwyciezca()), rzad, 1);
        }
        else if(sport.matches("Dwa_Ognie")){
            for(int i=0;i<menu.rozgrywki.getTurniejDwa_Ognie().getTabela_wynikow().size();i++){
            if(spotkanie.getZwyciezca().getNazwa().matches((String)menu.dwa_ognie_Tabela_wynikow_model.getValueAt(i, 0))){
                rzad=i;
                break;
            }
        }
            menu.meczeDwa_Ognie_model.setValueAt(spotkanie.zwyciezca.getNazwa(), menu.tMeczeDwa_Ognie.getSelectedRow(), 2);
            menu.rozgrywki.getTurniejDwa_Ognie().dodajPunkty(spotkanie.getZwyciezca());
            menu.dwa_ognie_Tabela_wynikow_model.setValueAt(menu.rozgrywki.getTurniejDwa_Ognie().getTabela_wynikow().get(spotkanie.getZwyciezca()), rzad, 1);
       
        }
        else if(sport.matches("Przeciaganie_Liny")){
            for(int i=0;i<menu.rozgrywki.getTurniejLina().getTabela_wynikow().size();i++){
            if(spotkanie.getZwyciezca().getNazwa().matches((String)menu.przeciaganie_liny_Tabela_wynikow_model.getValueAt(i, 0))){
                rzad=i;
                break;
            }
        }
            menu.meczePrzeciaganie_Liny_model.setValueAt(spotkanie.zwyciezca.getNazwa(), menu.tMeczePrzeciaganie_Liny.getSelectedRow(), 2);
            menu.rozgrywki.getTurniejLina().dodajPunkty(spotkanie.getZwyciezca());
            menu.przeciaganie_liny_Tabela_wynikow_model.setValueAt(menu.rozgrywki.getTurniejLina().getTabela_wynikow().get(spotkanie.getZwyciezca()), rzad, 1);
       
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnTeam2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(DodajWynik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DodajWynik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DodajWynik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DodajWynik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DodajWynik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTeam1;
    private javax.swing.JButton btnTeam2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
