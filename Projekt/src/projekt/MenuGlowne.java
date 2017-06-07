
package projekt;

import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 * Interfejs 
 */
public class MenuGlowne extends javax.swing.JFrame {
    public Rozgrywki rozgrywki = new Rozgrywki();
    
    public Sedzia sedzia_dodawany;
    public Druzyna druzyna_dodawana;
    
    public DefaultTableModel siatkowkaTabela_wynikow_model = new DefaultTableModel(0,0){
        @Override
        public boolean isCellEditable(int rzad, int kolumna){
            return false;
        }
    };
    public DefaultTableModel dwa_ognie_Tabela_wynikow_model = new DefaultTableModel(0,0){
        @Override
        public boolean isCellEditable(int rzad, int kolumna){
            return false;
        }
    };
    public DefaultTableModel przeciaganie_liny_Tabela_wynikow_model = new DefaultTableModel(0,0){
        @Override
        public boolean isCellEditable(int rzad, int kolumna){
            return false;
        }
    };
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
    
    public DefaultTableModel meczeSiatkowka_model = new DefaultTableModel(0,0){
        @Override
        public boolean isCellEditable(int rzad, int kolumna){
            return false;
        }
    };
    public DefaultTableModel meczeDwa_Ognie_model = new DefaultTableModel(0,0){
        @Override
        public boolean isCellEditable(int rzad, int kolumna){
            return false;
        }
    };
    public DefaultTableModel meczePrzeciaganie_Liny_model = new DefaultTableModel(0,0){
        @Override
        public boolean isCellEditable(int rzad, int kolumna){
            return false;
        }
    };
    
    
    public MenuGlowne() {
        initComponents();
    }

    public void wstawSedziegoSiatkowka(){
        rozgrywki.turniejSiatkowki.dodajSedziego(new Sedzia(sedzia_dodawany.getImie(),sedzia_dodawany.getNazwisko()));
        this.sedziowieSiatkowka_model.addRow(new Object[]{sedzia_dodawany.getImie(), sedzia_dodawany.getNazwisko()});
    }
    public void wstawSedziegoDwa_Ognie(){
        rozgrywki.turniejDwa_Ognie.dodajSedziego(new Sedzia(sedzia_dodawany.getImie(),sedzia_dodawany.getNazwisko()));
        this.sedziowieDwa_Ognie_model.addRow(new Object[]{sedzia_dodawany.getImie(), sedzia_dodawany.getNazwisko()});
    }
    public void wstawSedziegoPrzeciaganieLiny(){
        rozgrywki.turniejLina.dodajSedziego(new Sedzia(sedzia_dodawany.getImie(),sedzia_dodawany.getNazwisko()));
        this.sedziowiePrzeciaganie_Liny_model.addRow(new Object[]{sedzia_dodawany.getImie(), sedzia_dodawany.getNazwisko()});
    }
    
    public void wstawDruzyne(){
        rozgrywki.dodajDruzyne(druzyna_dodawana);
        int punkty=0;
        this.druzyny_model.addRow(new Object[]{druzyna_dodawana.getNazwa()});
        this.siatkowkaTabela_wynikow_model.addRow(new Object[]{druzyna_dodawana.getNazwa(),punkty});
        this.dwa_ognie_Tabela_wynikow_model.addRow(new Object[]{druzyna_dodawana.getNazwa(),punkty});
        this.przeciaganie_liny_Tabela_wynikow_model.addRow(new Object[]{druzyna_dodawana.getNazwa(),punkty});
        this.rozgrywki.getTurniejSiatkowki().getTabela_wynikow().put(druzyna_dodawana, punkty);
        this.rozgrywki.getTurniejDwa_Ognie().getTabela_wynikow().put(druzyna_dodawana, punkty);
        this.rozgrywki.getTurniejLina().getTabela_wynikow().put(druzyna_dodawana, punkty);
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
        btnUsunSedziegoSiatkowka = new javax.swing.JButton();
        pMeczeSiatkowka = new javax.swing.JPanel();
        btnWygenerujMeczeSiatkowka = new javax.swing.JButton();
        btnDodajWynikSiatkowka = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMeczeSiatkowka = new javax.swing.JTable();
        btnGenerujPolfinalySiatkowka = new javax.swing.JButton();
        btnGenerujFinalySiatkowka = new javax.swing.JButton();
        pTabelaSiatkowka = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tSiatkowkaTabela_wynikow = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lPolfinal1_lewy = new javax.swing.JLabel();
        lPolfinal1_prawy = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lPolfinal1_zwyciezca = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lPolfinal2_lewy = new javax.swing.JLabel();
        lPolfinal2_prawy = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lPolfinal2_zwyciezca = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lFinal_lewy = new javax.swing.JLabel();
        lFinal_prawy = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lFinal_zwyciezca = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        tpDwa_Ognie = new javax.swing.JTabbedPane();
        pSedziowieDwa_Ognie = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tSedziowieDwa_Ognie = new javax.swing.JTable();
        btnDodajSedziegoDwa_Ognie = new javax.swing.JButton();
        btnUsunSedziegoDwa_Ognie = new javax.swing.JButton();
        pMeczeDwa_Ognie = new javax.swing.JPanel();
        btnWygenerujMeczeDwa_Ognie = new javax.swing.JButton();
        btnDodajWynikDwa_Ognie = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tMeczeDwa_Ognie = new javax.swing.JTable();
        btnGenerujPolfinalyDwa_Ognie = new javax.swing.JButton();
        btnGenerujFinalyDwa_Ognie = new javax.swing.JButton();
        pTabelaDwa_Ognie = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tDwa_OgnieTabela_wynikow = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        lPolfinal1_lewy_DO = new javax.swing.JLabel();
        lPolfinal1_prawy_DO = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lPolfinal1_zwyciezca_DO = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        lPolfinal2_lewy_DO = new javax.swing.JLabel();
        lPolfinal2_prawy_DO = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lPolfinal2_zwyciezca_DO = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        lFinal_lewy_DO = new javax.swing.JLabel();
        lFinal_prawy_DO = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lFinal_zwyciezca_DO = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        tpPrzeciaganie_Liny = new javax.swing.JTabbedPane();
        pSedziowiePrzeciaganie_Liny = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tSedziowiePrzeciaganie_Liny = new javax.swing.JTable();
        btnDodajSedziegoPrzeciaganie_Liny = new javax.swing.JButton();
        btnUsunSedziegoPrzeciaganie_Liny = new javax.swing.JButton();
        pMeczePrzeciaganie_Liny = new javax.swing.JPanel();
        btnWygenerujMeczePrzeciaganie_Liny = new javax.swing.JButton();
        btnDodajWynikPrzeciaganie_Liny = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tMeczePrzeciaganie_Liny = new javax.swing.JTable();
        btnGenerujPolfinalyPrzeciaganie_Liny = new javax.swing.JButton();
        btnGenerujFinalyPrzeciaganie_Liny = new javax.swing.JButton();
        pTabelaPrzeciaganie_Liny = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tPrzeciaganie_LinyTabela_wynikow = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        lPolfinal1_lewy_PL = new javax.swing.JLabel();
        lPolfinal1_prawy_PL = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lPolfinal1_zwyciezca_PL = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        lPolfinal2_lewy_PL = new javax.swing.JLabel();
        lPolfinal2_prawy_PL = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lPolfinal2_zwyciezca_PL = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        lFinal_lewy_PL = new javax.swing.JLabel();
        lFinal_prawy_PL = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lFinal_zwyciezca_PL = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        pDruzyny = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tDruzyny = new javax.swing.JTable();
        btnDodajDruzyne = new javax.swing.JButton();
        btnUsunDruzyne = new javax.swing.JButton();

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

        btnUsunSedziegoSiatkowka.setText("Usun Sedziego");
        btnUsunSedziegoSiatkowka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsunSedziegoSiatkowkaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSedziowieSiatkowkaLayout = new javax.swing.GroupLayout(pSedziowieSiatkowka);
        pSedziowieSiatkowka.setLayout(pSedziowieSiatkowkaLayout);
        pSedziowieSiatkowkaLayout.setHorizontalGroup(
            pSedziowieSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSedziowieSiatkowkaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pSedziowieSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDodajSedziegoSiatkowka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsunSedziegoSiatkowka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pSedziowieSiatkowkaLayout.setVerticalGroup(
            pSedziowieSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSedziowieSiatkowkaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnDodajSedziegoSiatkowka)
                .addGap(18, 18, 18)
                .addComponent(btnUsunSedziegoSiatkowka)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        tpSiatkowka.addTab("Sędziowie", pSedziowieSiatkowka);

        btnWygenerujMeczeSiatkowka.setText("Wygeneruj Mecze");
        btnWygenerujMeczeSiatkowka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWygenerujMeczeSiatkowkaActionPerformed(evt);
            }
        });

        btnDodajWynikSiatkowka.setText("Dodaj Wynik");
        btnDodajWynikSiatkowka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajWynikSiatkowkaActionPerformed(evt);
            }
        });

        meczeSiatkowka_model.setColumnIdentifiers(new Object[]{"Drużyna 1", "Drużyna 2", "Zwyciezca"});
        tMeczeSiatkowka.setModel(meczeSiatkowka_model);
        tMeczeSiatkowka.setToolTipText("");
        tMeczeSiatkowka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMeczeSiatkowkaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tMeczeSiatkowka);

        btnGenerujPolfinalySiatkowka.setText("Wygeneruj półfinały");
        btnGenerujPolfinalySiatkowka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerujPolfinalySiatkowkaActionPerformed(evt);
            }
        });

        btnGenerujFinalySiatkowka.setText("Wygeneruj finały");
        btnGenerujFinalySiatkowka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerujFinalySiatkowkaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMeczeSiatkowkaLayout = new javax.swing.GroupLayout(pMeczeSiatkowka);
        pMeczeSiatkowka.setLayout(pMeczeSiatkowkaLayout);
        pMeczeSiatkowkaLayout.setHorizontalGroup(
            pMeczeSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMeczeSiatkowkaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pMeczeSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pMeczeSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnWygenerujMeczeSiatkowka, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(btnDodajWynikSiatkowka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pMeczeSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnGenerujPolfinalySiatkowka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerujFinalySiatkowka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
        );
        pMeczeSiatkowkaLayout.setVerticalGroup(
            pMeczeSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMeczeSiatkowkaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnWygenerujMeczeSiatkowka)
                .addGap(18, 18, 18)
                .addComponent(btnDodajWynikSiatkowka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerujPolfinalySiatkowka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerujFinalySiatkowka)
                .addGap(96, 96, 96))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        tpSiatkowka.addTab("Mecze", pMeczeSiatkowka);

        siatkowkaTabela_wynikow_model.setColumnIdentifiers(new Object[] {"Drużyna", "Punkty"});
        tSiatkowkaTabela_wynikow.setModel(siatkowkaTabela_wynikow_model);
        jScrollPane6.setViewportView(tSiatkowkaTabela_wynikow);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Półfinał 1");

        lPolfinal1_lewy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lPolfinal1_lewy.setText("Brak");

        lPolfinal1_prawy.setText("Brak");

        jLabel4.setText("Zwycięzca:");

        lPolfinal1_zwyciezca.setText("Brak");

        jLabel6.setText("VS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lPolfinal1_lewy, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lPolfinal1_prawy, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(lPolfinal1_zwyciezca)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPolfinal1_lewy)
                    .addComponent(lPolfinal1_prawy)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lPolfinal1_zwyciezca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Półfinał 2");

        lPolfinal2_lewy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lPolfinal2_lewy.setText("Brak");

        lPolfinal2_prawy.setText("Brak");

        jLabel10.setText("Zwycięzca:");

        lPolfinal2_zwyciezca.setText("Brak");

        jLabel12.setText("VS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lPolfinal2_lewy, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lPolfinal2_prawy, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator4)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(lPolfinal2_zwyciezca)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPolfinal2_lewy)
                    .addComponent(lPolfinal2_prawy)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lPolfinal2_zwyciezca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setText("Finał");

        lFinal_lewy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lFinal_lewy.setText("Brak");

        lFinal_prawy.setText("Brak");

        jLabel16.setText("Zwycięzca:");

        lFinal_zwyciezca.setText("Brak");

        jLabel18.setText("VS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator5)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lFinal_lewy, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lFinal_prawy, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator6)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(lFinal_zwyciezca)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFinal_lewy)
                    .addComponent(lFinal_prawy)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lFinal_zwyciezca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pTabelaSiatkowkaLayout = new javax.swing.GroupLayout(pTabelaSiatkowka);
        pTabelaSiatkowka.setLayout(pTabelaSiatkowkaLayout);
        pTabelaSiatkowkaLayout.setHorizontalGroup(
            pTabelaSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTabelaSiatkowkaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTabelaSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pTabelaSiatkowkaLayout.setVerticalGroup(
            pTabelaSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
            .addGroup(pTabelaSiatkowkaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnUsunSedziegoDwa_Ognie.setText("Usun Sędziego");
        btnUsunSedziegoDwa_Ognie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsunSedziegoDwa_OgnieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSedziowieDwa_OgnieLayout = new javax.swing.GroupLayout(pSedziowieDwa_Ognie);
        pSedziowieDwa_Ognie.setLayout(pSedziowieDwa_OgnieLayout);
        pSedziowieDwa_OgnieLayout.setHorizontalGroup(
            pSedziowieDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSedziowieDwa_OgnieLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pSedziowieDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDodajSedziegoDwa_Ognie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsunSedziegoDwa_Ognie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pSedziowieDwa_OgnieLayout.setVerticalGroup(
            pSedziowieDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSedziowieDwa_OgnieLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnDodajSedziegoDwa_Ognie)
                .addGap(18, 18, 18)
                .addComponent(btnUsunSedziegoDwa_Ognie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        tpDwa_Ognie.addTab("Sędziowie", pSedziowieDwa_Ognie);

        btnWygenerujMeczeDwa_Ognie.setText("Wygeneruj Mecze");
        btnWygenerujMeczeDwa_Ognie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWygenerujMeczeDwa_OgnieActionPerformed(evt);
            }
        });

        btnDodajWynikDwa_Ognie.setText("Dodaj Wynik");
        btnDodajWynikDwa_Ognie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajWynikDwa_OgnieActionPerformed(evt);
            }
        });

        meczeDwa_Ognie_model.setColumnIdentifiers(new Object[]{"Drużyna 1", "Drużyna 2", "Zwyciezca"});
        tMeczeDwa_Ognie.setModel(meczeDwa_Ognie_model);
        tMeczeDwa_Ognie.setToolTipText("");
        tMeczeDwa_Ognie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMeczeDwa_OgnieMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tMeczeDwa_Ognie);

        btnGenerujPolfinalyDwa_Ognie.setText("Wygeneruj półfinały");
        btnGenerujPolfinalyDwa_Ognie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerujPolfinalyDwa_OgnieActionPerformed(evt);
            }
        });

        btnGenerujFinalyDwa_Ognie.setText("Wygeneruj finały");
        btnGenerujFinalyDwa_Ognie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerujFinalyDwa_OgnieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMeczeDwa_OgnieLayout = new javax.swing.GroupLayout(pMeczeDwa_Ognie);
        pMeczeDwa_Ognie.setLayout(pMeczeDwa_OgnieLayout);
        pMeczeDwa_OgnieLayout.setHorizontalGroup(
            pMeczeDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMeczeDwa_OgnieLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pMeczeDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pMeczeDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnWygenerujMeczeDwa_Ognie, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(btnDodajWynikDwa_Ognie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pMeczeDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnGenerujPolfinalyDwa_Ognie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerujFinalyDwa_Ognie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
        );
        pMeczeDwa_OgnieLayout.setVerticalGroup(
            pMeczeDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMeczeDwa_OgnieLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnWygenerujMeczeDwa_Ognie)
                .addGap(18, 18, 18)
                .addComponent(btnDodajWynikDwa_Ognie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerujPolfinalyDwa_Ognie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerujFinalyDwa_Ognie)
                .addGap(96, 96, 96))
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        tpDwa_Ognie.addTab("Mecze", pMeczeDwa_Ognie);

        dwa_ognie_Tabela_wynikow_model.setColumnIdentifiers(new Object[]{"Drużyna","Punkty"});
        tDwa_OgnieTabela_wynikow.setModel(dwa_ognie_Tabela_wynikow_model);
        jScrollPane7.setViewportView(tDwa_OgnieTabela_wynikow);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Półfinał 1");

        lPolfinal1_lewy_DO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lPolfinal1_lewy_DO.setText("Brak");

        lPolfinal1_prawy_DO.setText("Brak");

        jLabel9.setText("Zwycięzca:");

        lPolfinal1_zwyciezca_DO.setText("Brak");

        jLabel11.setText("VS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator9)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lPolfinal1_lewy_DO, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lPolfinal1_prawy_DO, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator10)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(lPolfinal1_zwyciezca_DO)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPolfinal1_lewy_DO)
                    .addComponent(lPolfinal1_prawy_DO)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lPolfinal1_zwyciezca_DO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Półfinał 2");

        lPolfinal2_lewy_DO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lPolfinal2_lewy_DO.setText("Brak");

        lPolfinal2_prawy_DO.setText("Brak");

        jLabel15.setText("Zwycięzca:");

        lPolfinal2_zwyciezca_DO.setText("Brak");

        jLabel17.setText("VS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator11)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lPolfinal2_lewy_DO, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lPolfinal2_prawy_DO, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator12)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(lPolfinal2_zwyciezca_DO)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPolfinal2_lewy_DO)
                    .addComponent(lPolfinal2_prawy_DO)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lPolfinal2_zwyciezca_DO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setText("Finał");

        lFinal_lewy_DO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lFinal_lewy_DO.setText("Brak");

        lFinal_prawy_DO.setText("Brak");

        jLabel20.setText("Zwycięzca:");

        lFinal_zwyciezca_DO.setText("Brak");

        jLabel21.setText("VS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator13)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lFinal_lewy_DO, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lFinal_prawy_DO, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator14)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(lFinal_zwyciezca_DO)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFinal_lewy_DO)
                    .addComponent(lFinal_prawy_DO)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lFinal_zwyciezca_DO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pTabelaDwa_OgnieLayout = new javax.swing.GroupLayout(pTabelaDwa_Ognie);
        pTabelaDwa_Ognie.setLayout(pTabelaDwa_OgnieLayout);
        pTabelaDwa_OgnieLayout.setHorizontalGroup(
            pTabelaDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTabelaDwa_OgnieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTabelaDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pTabelaDwa_OgnieLayout.setVerticalGroup(
            pTabelaDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
            .addGroup(pTabelaDwa_OgnieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnUsunSedziegoPrzeciaganie_Liny.setText("Usuń Sędziego");
        btnUsunSedziegoPrzeciaganie_Liny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsunSedziegoPrzeciaganie_LinyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSedziowiePrzeciaganie_LinyLayout = new javax.swing.GroupLayout(pSedziowiePrzeciaganie_Liny);
        pSedziowiePrzeciaganie_Liny.setLayout(pSedziowiePrzeciaganie_LinyLayout);
        pSedziowiePrzeciaganie_LinyLayout.setHorizontalGroup(
            pSedziowiePrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSedziowiePrzeciaganie_LinyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pSedziowiePrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDodajSedziegoPrzeciaganie_Liny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsunSedziegoPrzeciaganie_Liny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pSedziowiePrzeciaganie_LinyLayout.setVerticalGroup(
            pSedziowiePrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSedziowiePrzeciaganie_LinyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnDodajSedziegoPrzeciaganie_Liny)
                .addGap(18, 18, 18)
                .addComponent(btnUsunSedziegoPrzeciaganie_Liny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        tpPrzeciaganie_Liny.addTab("Sędziowie", pSedziowiePrzeciaganie_Liny);

        btnWygenerujMeczePrzeciaganie_Liny.setText("Wygeneruj Mecze");
        btnWygenerujMeczePrzeciaganie_Liny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWygenerujMeczePrzeciaganie_LinyActionPerformed(evt);
            }
        });

        btnDodajWynikPrzeciaganie_Liny.setText("Dodaj Wynik");
        btnDodajWynikPrzeciaganie_Liny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajWynikPrzeciaganie_LinyActionPerformed(evt);
            }
        });

        meczePrzeciaganie_Liny_model.setColumnIdentifiers(new Object[]{"Drużyna 1", "Drużyna 2", "Zwyciezca"});
        tMeczePrzeciaganie_Liny.setModel(meczePrzeciaganie_Liny_model);
        tMeczePrzeciaganie_Liny.setToolTipText("");
        tMeczePrzeciaganie_Liny.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMeczePrzeciaganie_LinyMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tMeczePrzeciaganie_Liny);

        btnGenerujPolfinalyPrzeciaganie_Liny.setText("Wygeneruj półfinały");
        btnGenerujPolfinalyPrzeciaganie_Liny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerujPolfinalyPrzeciaganie_LinyActionPerformed(evt);
            }
        });

        btnGenerujFinalyPrzeciaganie_Liny.setText("Wygeneruj finały");
        btnGenerujFinalyPrzeciaganie_Liny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerujFinalyPrzeciaganie_LinyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMeczePrzeciaganie_LinyLayout = new javax.swing.GroupLayout(pMeczePrzeciaganie_Liny);
        pMeczePrzeciaganie_Liny.setLayout(pMeczePrzeciaganie_LinyLayout);
        pMeczePrzeciaganie_LinyLayout.setHorizontalGroup(
            pMeczePrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMeczePrzeciaganie_LinyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pMeczePrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pMeczePrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnWygenerujMeczePrzeciaganie_Liny, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(btnDodajWynikPrzeciaganie_Liny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pMeczePrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnGenerujPolfinalyPrzeciaganie_Liny, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerujFinalyPrzeciaganie_Liny, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
        );
        pMeczePrzeciaganie_LinyLayout.setVerticalGroup(
            pMeczePrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMeczePrzeciaganie_LinyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnWygenerujMeczePrzeciaganie_Liny)
                .addGap(18, 18, 18)
                .addComponent(btnDodajWynikPrzeciaganie_Liny)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerujPolfinalyPrzeciaganie_Liny)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerujFinalyPrzeciaganie_Liny)
                .addGap(96, 96, 96))
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        tpPrzeciaganie_Liny.addTab("Mecze", pMeczePrzeciaganie_Liny);

        przeciaganie_liny_Tabela_wynikow_model.setColumnIdentifiers(new Object[]{"Drużyna","Punkty"});
        tPrzeciaganie_LinyTabela_wynikow.setModel(przeciaganie_liny_Tabela_wynikow_model);
        jScrollPane8.setViewportView(tPrzeciaganie_LinyTabela_wynikow);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel22.setText("Półfinał 1");

        lPolfinal1_lewy_PL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lPolfinal1_lewy_PL.setText("Brak");

        lPolfinal1_prawy_PL.setText("Brak");

        jLabel23.setText("Zwycięzca:");

        lPolfinal1_zwyciezca_PL.setText("Brak");

        jLabel24.setText("VS");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator15)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lPolfinal1_lewy_PL, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lPolfinal1_prawy_PL, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator16)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(lPolfinal1_zwyciezca_PL)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPolfinal1_lewy_PL)
                    .addComponent(lPolfinal1_prawy_PL)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lPolfinal1_zwyciezca_PL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel25.setText("Półfinał 2");

        lPolfinal2_lewy_PL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lPolfinal2_lewy_PL.setText("Brak");

        lPolfinal2_prawy_PL.setText("Brak");

        jLabel26.setText("Zwycięzca:");

        lPolfinal2_zwyciezca_PL.setText("Brak");

        jLabel27.setText("VS");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator17)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lPolfinal2_lewy_PL, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lPolfinal2_prawy_PL, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator18)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(lPolfinal2_zwyciezca_PL)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPolfinal2_lewy_PL)
                    .addComponent(lPolfinal2_prawy_PL)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(lPolfinal2_zwyciezca_PL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel28.setText("Finał");

        lFinal_lewy_PL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lFinal_lewy_PL.setText("Brak");

        lFinal_prawy_PL.setText("Brak");

        jLabel29.setText("Zwycięzca:");

        lFinal_zwyciezca_PL.setText("Brak");

        jLabel30.setText("VS");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator19)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lFinal_lewy_PL, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lFinal_prawy_PL, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator20)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(lFinal_zwyciezca_PL)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFinal_lewy_PL)
                    .addComponent(lFinal_prawy_PL)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(lFinal_zwyciezca_PL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pTabelaPrzeciaganie_LinyLayout = new javax.swing.GroupLayout(pTabelaPrzeciaganie_Liny);
        pTabelaPrzeciaganie_Liny.setLayout(pTabelaPrzeciaganie_LinyLayout);
        pTabelaPrzeciaganie_LinyLayout.setHorizontalGroup(
            pTabelaPrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTabelaPrzeciaganie_LinyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTabelaPrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pTabelaPrzeciaganie_LinyLayout.setVerticalGroup(
            pTabelaPrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
            .addGroup(pTabelaPrzeciaganie_LinyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpPrzeciaganie_Liny.addTab("Tabela Wyników", pTabelaPrzeciaganie_Liny);

        jTabbedPane1.addTab("Przeciąganie liny", tpPrzeciaganie_Liny);

        druzyny_model.setColumnIdentifiers(new Object[]{"Nazwa drużyny"});
        tDruzyny.setModel(druzyny_model);
        tDruzyny.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDruzynyMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tDruzyny);

        btnDodajDruzyne.setText("Dodaj Drużynę");
        btnDodajDruzyne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajDruzyneActionPerformed(evt);
            }
        });

        btnUsunDruzyne.setText("Usuń Drużynę");
        btnUsunDruzyne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsunDruzyneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDruzynyLayout = new javax.swing.GroupLayout(pDruzyny);
        pDruzyny.setLayout(pDruzynyLayout);
        pDruzynyLayout.setHorizontalGroup(
            pDruzynyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDruzynyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pDruzynyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDodajDruzyne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsunDruzyne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pDruzynyLayout.setVerticalGroup(
            pDruzynyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
            .addGroup(pDruzynyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnDodajDruzyne)
                .addGap(18, 18, 18)
                .addComponent(btnUsunDruzyne)
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
       if(rozgrywki.getTurniejSiatkowki().wygenerowanoMecze==false){
        DodajSedziego fDodajSedziegoSiatkowka = new DodajSedziego(this, "Siatkowka");
        fDodajSedziegoSiatkowka.setVisible(true);
       }
       else{
           JOptionPane.showMessageDialog(this, "Nie można dodać sędziego po wygenerowaniu meczy");
       }
    }//GEN-LAST:event_btnDodajSedziegoSiatkowkaActionPerformed

    private void btnDodajDruzyneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajDruzyneActionPerformed
        if(((rozgrywki.turniejSiatkowki.wygenerowanoMecze==false)&&(rozgrywki.turniejDwa_Ognie.wygenerowanoMecze==false)&&(rozgrywki.turniejLina.wygenerowanoMecze==false))==true){   
        DodajDruzyne fDodajDruzyne = new DodajDruzyne(this);
           fDodajDruzyne.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Nie można dodać drużyny po wygenerowaniu którychkolwiek meczy");
        }
    }//GEN-LAST:event_btnDodajDruzyneActionPerformed

    private void btnDodajSedziegoDwa_OgnieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajSedziegoDwa_OgnieActionPerformed
       if(rozgrywki.getTurniejDwa_Ognie().wygenerowanoMecze==false){
           DodajSedziego fDodajSedziegoDwa_Ognie = new DodajSedziego(this, "Dwa_Ognie");
           fDodajSedziegoDwa_Ognie.setVisible(true);
       }
       else{
           JOptionPane.showMessageDialog(this, "Nie można dodać sędziego po wygenerowaniu meczy");
       }
    }//GEN-LAST:event_btnDodajSedziegoDwa_OgnieActionPerformed

    private void btnDodajSedziegoPrzeciaganie_LinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajSedziegoPrzeciaganie_LinyActionPerformed
        if(rozgrywki.getTurniejLina().wygenerowanoMecze==false){
        DodajSedziego fDodajSedziegoPrzeciaganie_Liny = new DodajSedziego(this, "Przeciaganie_Liny");
       fDodajSedziegoPrzeciaganie_Liny.setVisible(true);
       }
       else{
           JOptionPane.showMessageDialog(this, "Nie można dodać sędziego po wygenerowaniu meczy");
       }
    }//GEN-LAST:event_btnDodajSedziegoPrzeciaganie_LinyActionPerformed

    private void btnUsunSedziegoSiatkowkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsunSedziegoSiatkowkaActionPerformed
        if(rozgrywki.getTurniejSiatkowki().getSedziowie().isEmpty()==true){
            JOptionPane.showMessageDialog(this, "Nie można usuwać sędziów gdy nie ma żadnego na liście");
        }else{
        if(rozgrywki.getTurniejSiatkowki().wygenerowanoMecze!=false){
            JOptionPane.showMessageDialog(this,"Nie można usuwać sędziów po wygenerowaniu meczy");
        }
        else{
            if(tSedziowieSiatkowka.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(this, "Nie wybrano sędziego");
            } else {
                String imie, nazwisko;
                imie = (String)  sedziowieSiatkowka_model.getValueAt(tSedziowieSiatkowka.getSelectedRow(), 0);
                nazwisko = (String) sedziowieSiatkowka_model.getValueAt(tSedziowieSiatkowka.getSelectedRow(), 1);
                for (Sedzia sedzia : this.rozgrywki.getTurniejSiatkowki().getSedziowie()) {
                    if(imie.matches(sedzia.getImie()) && (nazwisko.matches(sedzia.getNazwisko())))
                        this.rozgrywki.getTurniejSiatkowki().usunSedziego(imie, nazwisko);
                }
                sedziowieSiatkowka_model.removeRow(tSedziowieSiatkowka.getSelectedRow());
            }
        }
        }
    }//GEN-LAST:event_btnUsunSedziegoSiatkowkaActionPerformed

    private void btnUsunSedziegoDwa_OgnieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsunSedziegoDwa_OgnieActionPerformed
        if(rozgrywki.getTurniejDwa_Ognie().getSedziowie().isEmpty()==true){
            JOptionPane.showMessageDialog(this, "Nie można usuwać sędziów gdy nie ma żadnego na liście");
        }else{
        if(rozgrywki.getTurniejDwa_Ognie().wygenerowanoMecze!=false){
            JOptionPane.showMessageDialog(this,"Nie można usuwać sędziów po wygenerowaniu meczy");
        }
        else{
            if(tSedziowieDwa_Ognie.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(this, "Nie wybrano sędziego");
            } else {
                String imie, nazwisko;
                imie = (String)  sedziowieDwa_Ognie_model.getValueAt(tSedziowieDwa_Ognie.getSelectedRow(), 0);
                nazwisko = (String) sedziowieDwa_Ognie_model.getValueAt(tSedziowieDwa_Ognie.getSelectedRow(), 1);
                for (Sedzia sedzia : this.rozgrywki.getTurniejDwa_Ognie().getSedziowie()) {
                    if(imie.matches(sedzia.getImie()) && (nazwisko.matches(sedzia.getNazwisko())))
                        this.rozgrywki.getTurniejDwa_Ognie().usunSedziego(imie, nazwisko);
                }
                sedziowieDwa_Ognie_model.removeRow(tSedziowieDwa_Ognie.getSelectedRow());
            }
        }
        }
    }//GEN-LAST:event_btnUsunSedziegoDwa_OgnieActionPerformed

    private void btnUsunSedziegoPrzeciaganie_LinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsunSedziegoPrzeciaganie_LinyActionPerformed
        if(rozgrywki.getTurniejDwa_Ognie().getSedziowie().isEmpty()==true){
            JOptionPane.showMessageDialog(this, "Nie można usuwać sędziów gdy nie ma żadnego na liście");
        }else{
        if(rozgrywki.getTurniejLina().wygenerowanoMecze!=false){
            JOptionPane.showMessageDialog(this,"Nie można usuwać sędziów po wygenerowaniu meczy");
        }
        else{
            if(tSedziowiePrzeciaganie_Liny.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(this, "Nie wybrano sędziego");
            } else {
                String imie, nazwisko;
                imie = (String)  sedziowiePrzeciaganie_Liny_model.getValueAt(tSedziowiePrzeciaganie_Liny.getSelectedRow(), 0);
                nazwisko = (String) sedziowiePrzeciaganie_Liny_model.getValueAt(tSedziowiePrzeciaganie_Liny.getSelectedRow(), 1);
                for (Sedzia sedzia : this.rozgrywki.getTurniejLina().getSedziowie()) {
                    if(imie.matches(sedzia.getImie()) && (nazwisko.matches(sedzia.getNazwisko())))
                        this.rozgrywki.getTurniejLina().usunSedziego(imie, nazwisko);
                }
                sedziowiePrzeciaganie_Liny_model.removeRow(tSedziowiePrzeciaganie_Liny.getSelectedRow());
            }
        }
        }
    }//GEN-LAST:event_btnUsunSedziegoPrzeciaganie_LinyActionPerformed

    private void btnUsunDruzyneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsunDruzyneActionPerformed
        if(((rozgrywki.turniejSiatkowki.wygenerowanoMecze==false)&&(rozgrywki.turniejDwa_Ognie.wygenerowanoMecze==false)&&(rozgrywki.turniejLina.wygenerowanoMecze==false))!=true){
            JOptionPane.showMessageDialog(this, "Nie można usuwać drużyn po wygenerowaniu którychkolwiek meczy");
        }
        else{
            if(tDruzyny.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(this, "Nie wybrano drużyny");
            } else {
                String nazwa;
                nazwa = (String) druzyny_model.getValueAt(tDruzyny.getSelectedRow(), 0);
                for(Druzyna team : this.rozgrywki.getDruzyny()){
                    if(nazwa.matches(team.getNazwa()))
                        this.rozgrywki.wycofajDruzyne(nazwa);
                }
                druzyny_model.removeRow(tDruzyny.getSelectedRow());
            }
        }
    }//GEN-LAST:event_btnUsunDruzyneActionPerformed

    private void btnWygenerujMeczeSiatkowkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWygenerujMeczeSiatkowkaActionPerformed
        if(rozgrywki.turniejSiatkowki.wygenerowanoMecze!=false){
            JOptionPane.showMessageDialog(this,"Mecze zostały już wygenerowane");
        }
        else{
            rozgrywki.getTurniejSiatkowki().wygenerujMecze(rozgrywki.getDruzyny());
        
            LinkedList<Mecz> listaSiatkowka = rozgrywki.getTurniejSiatkowki().getLista_meczy();
            
            for(int i=0; i < listaSiatkowka.size(); i++){
                String nazwa1 = listaSiatkowka.get(i).getTeam1().getNazwa();
                String nazwa2 = listaSiatkowka.get(i).getTeam2().getNazwa();
                
                this.meczeSiatkowka_model.addRow(new Object[]{nazwa1,nazwa2});
                
            }
        }
    }//GEN-LAST:event_btnWygenerujMeczeSiatkowkaActionPerformed

    private void tDruzynyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDruzynyMouseClicked
        if(evt.getClickCount()==2&&!evt.isConsumed()){
        PrzegladDruzyny fPrzeglad = new PrzegladDruzyny(this,druzyny_model.getValueAt(tDruzyny.getSelectedRow(),NORMAL).toString());
        fPrzeglad.setVisible(true); 
        }
    }//GEN-LAST:event_tDruzynyMouseClicked

    private void btnDodajWynikSiatkowkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajWynikSiatkowkaActionPerformed
       if(tMeczeSiatkowka.getModel().getValueAt(tMeczeSiatkowka.getSelectedRow(), 2)!=(null)){
           JOptionPane.showMessageDialog(this,"Zwycięzca został wybrany");
       }    
       else{
       DodajWynik fDodajwynik = new DodajWynik(this, "Siatkowka",(String) tMeczeSiatkowka.getModel().getValueAt(tMeczeSiatkowka.getSelectedRow(), 0 ),(String) tMeczeSiatkowka.getModel().getValueAt(tMeczeSiatkowka.getSelectedRow(), 1 ));
       fDodajwynik.setVisible(true);
       }
    }//GEN-LAST:event_btnDodajWynikSiatkowkaActionPerformed

    private void btnWygenerujMeczeDwa_OgnieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWygenerujMeczeDwa_OgnieActionPerformed
        if(rozgrywki.turniejDwa_Ognie.wygenerowanoMecze==false)
        {
            rozgrywki.getTurniejDwa_Ognie().wygenerujMecze(rozgrywki.getDruzyny());
            LinkedList<Mecz> listaDwa_Ognie = rozgrywki.getTurniejDwa_Ognie().getLista_meczy();
        
            for(int i=0; i < listaDwa_Ognie.size(); i++){
                String nazwa1 = listaDwa_Ognie.get(i).getTeam1().getNazwa();
                String nazwa2 = listaDwa_Ognie.get(i).getTeam2().getNazwa();
            
                this.meczeDwa_Ognie_model.addRow(new Object[]{nazwa1,nazwa2});
            
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Mecze zostały wygenerowane");
        }
    }//GEN-LAST:event_btnWygenerujMeczeDwa_OgnieActionPerformed

    private void btnDodajWynikDwa_OgnieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajWynikDwa_OgnieActionPerformed
       if(tMeczeDwa_Ognie.getModel().getValueAt(tMeczeDwa_Ognie.getSelectedRow(), 2)!=(null)){
           JOptionPane.showMessageDialog(this,"Zwycięzca został wybrany");
       }    
       else{
           DodajWynik fDodajwynik = new DodajWynik(this, "Dwa_Ognie",(String) tMeczeDwa_Ognie.getModel().getValueAt(tMeczeDwa_Ognie.getSelectedRow(), 0 ),(String) tMeczeDwa_Ognie.getModel().getValueAt(tMeczeDwa_Ognie.getSelectedRow(), 1 ));
           fDodajwynik.setVisible(true);
       }
    }//GEN-LAST:event_btnDodajWynikDwa_OgnieActionPerformed

    private void btnWygenerujMeczePrzeciaganie_LinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWygenerujMeczePrzeciaganie_LinyActionPerformed
        if(rozgrywki.getTurniejLina().wygenerowanoMecze==false){
            rozgrywki.getTurniejLina().wygenerujMecze(rozgrywki.getDruzyny());
            LinkedList<Mecz> listaPrzeciaganie_Liny = rozgrywki.getTurniejLina().getLista_meczy();
        
            for(int i=0; i < listaPrzeciaganie_Liny.size(); i++){
                String nazwa1 = listaPrzeciaganie_Liny.get(i).getTeam1().getNazwa();
                String nazwa2 = listaPrzeciaganie_Liny.get(i).getTeam2().getNazwa();
            
                this.meczePrzeciaganie_Liny_model.addRow(new Object[]{nazwa1,nazwa2});
            
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Mecze zostały wygenerowane");
        }
    }//GEN-LAST:event_btnWygenerujMeczePrzeciaganie_LinyActionPerformed

    private void btnDodajWynikPrzeciaganie_LinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajWynikPrzeciaganie_LinyActionPerformed
       if(tMeczePrzeciaganie_Liny.getModel().getValueAt(tMeczePrzeciaganie_Liny.getSelectedRow(), 2)!=(null)){
           JOptionPane.showMessageDialog(this,"Zwycięzca został wybrany");
       }    
       else{
           DodajWynik fDodajwynik = new DodajWynik(this, "Przeciaganie_Liny",(String) tMeczePrzeciaganie_Liny.getModel().getValueAt(tMeczePrzeciaganie_Liny.getSelectedRow(), 0 ),(String) tMeczePrzeciaganie_Liny.getModel().getValueAt(tMeczePrzeciaganie_Liny.getSelectedRow(), 1 ));
           fDodajwynik.setVisible(true);
       }
    }//GEN-LAST:event_btnDodajWynikPrzeciaganie_LinyActionPerformed

    private void tMeczeSiatkowkaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMeczeSiatkowkaMouseClicked
       if(evt.getClickCount()==2&&!evt.isConsumed()){
        PrzegladMeczu fPrzeglad = new PrzegladMeczu(this,meczeSiatkowka_model.getValueAt(tMeczeSiatkowka.getSelectedRow(), 0).toString(),meczeSiatkowka_model.getValueAt(tMeczeSiatkowka.getSelectedRow(), 1).toString(), "Siatkowka");
        fPrzeglad.setVisible(true); 
        }
    }//GEN-LAST:event_tMeczeSiatkowkaMouseClicked

    private void tMeczeDwa_OgnieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMeczeDwa_OgnieMouseClicked
        if(evt.getClickCount()==2&&!evt.isConsumed()){
        PrzegladMeczu fPrzeglad = new PrzegladMeczu(this,meczeDwa_Ognie_model.getValueAt(tMeczeDwa_Ognie.getSelectedRow(), 0).toString(),meczeDwa_Ognie_model.getValueAt(tMeczeDwa_Ognie.getSelectedRow(), 1).toString(), "Dwa_Ognie");
        fPrzeglad.setVisible(true); 
        }
    }//GEN-LAST:event_tMeczeDwa_OgnieMouseClicked

    private void tMeczePrzeciaganie_LinyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMeczePrzeciaganie_LinyMouseClicked
       if(evt.getClickCount()==2&&!evt.isConsumed()){
        PrzegladMeczu fPrzeglad = new PrzegladMeczu(this,meczePrzeciaganie_Liny_model.getValueAt(tMeczePrzeciaganie_Liny.getSelectedRow(), 0).toString(),meczePrzeciaganie_Liny_model.getValueAt(tMeczePrzeciaganie_Liny.getSelectedRow(), 1).toString(), "Przeciaganie_Liny");
        fPrzeglad.setVisible(true); 
        }
    }//GEN-LAST:event_tMeczePrzeciaganie_LinyMouseClicked

    private void btnGenerujPolfinalyDwa_OgnieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerujPolfinalyDwa_OgnieActionPerformed
        if(rozgrywki.getTurniejDwa_Ognie().wygenerowanoPolfinaly==false){
            rozgrywki.getTurniejDwa_Ognie().wygenerujPolfinaly();
        
            
            this.meczeDwa_Ognie_model.addRow(new Object[] {this.rozgrywki.getTurniejDwa_Ognie().getPolfinal_1().getTeam1().getNazwa(),this.rozgrywki.getTurniejDwa_Ognie().getPolfinal_1().getTeam2().getNazwa() });
            this.meczeDwa_Ognie_model.addRow(new Object[]{this.rozgrywki.getTurniejDwa_Ognie().getPolfinal_2().getTeam1().getNazwa(),this.rozgrywki.getTurniejDwa_Ognie().getPolfinal_2().getTeam2().getNazwa()});
            
        }
        else{
            JOptionPane.showMessageDialog(this,"Półfinały zostały już wygenerowane");
        } 
        
        
    }//GEN-LAST:event_btnGenerujPolfinalyDwa_OgnieActionPerformed

    private void btnGenerujPolfinalySiatkowkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerujPolfinalySiatkowkaActionPerformed
       if(rozgrywki.getTurniejSiatkowki().wygenerowanoPolfinaly==false){
            rozgrywki.getTurniejSiatkowki().wygenerujPolfinaly();
        
            
            this.meczeSiatkowka_model.addRow(new Object[] {this.rozgrywki.getTurniejSiatkowki().getPolfinal_1().getTeam1().getNazwa(),this.rozgrywki.getTurniejSiatkowki().getPolfinal_1().getTeam2().getNazwa() });
            this.meczeSiatkowka_model.addRow(new Object[]{this.rozgrywki.getTurniejSiatkowki().getPolfinal_2().getTeam1().getNazwa(),this.rozgrywki.getTurniejSiatkowki().getPolfinal_2().getTeam2().getNazwa()});
            
        }
        else{
            JOptionPane.showMessageDialog(this,"Półfinały zostały już wygenerowane");
        }       
    }//GEN-LAST:event_btnGenerujPolfinalySiatkowkaActionPerformed

    private void btnGenerujFinalySiatkowkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerujFinalySiatkowkaActionPerformed
        if(rozgrywki.getTurniejSiatkowki().wygenerowanoFinal==false){
            rozgrywki.getTurniejSiatkowki().wygenerujFinal();
            
            this.meczeSiatkowka_model.addRow(new Object[] {this.rozgrywki.getTurniejSiatkowki().getFinal().getTeam1().getNazwa(),this.rozgrywki.getTurniejSiatkowki().getFinal().getTeam2().getNazwa()} );
     
        }
        else{
            JOptionPane.showMessageDialog(this,"Final został już wygenerowany");
        }      
    }//GEN-LAST:event_btnGenerujFinalySiatkowkaActionPerformed

    private void btnGenerujPolfinalyPrzeciaganie_LinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerujPolfinalyPrzeciaganie_LinyActionPerformed
        if(rozgrywki.getTurniejLina().wygenerowanoPolfinaly==false){
            rozgrywki.getTurniejLina().wygenerujPolfinaly();
                  
            this.meczePrzeciaganie_Liny_model.addRow(new Object[] {this.rozgrywki.getTurniejLina().getPolfinal_1().getTeam1().getNazwa(),this.rozgrywki.getTurniejLina().getPolfinal_1().getTeam2().getNazwa() });
            this.meczePrzeciaganie_Liny_model.addRow(new Object[]{this.rozgrywki.getTurniejLina().getPolfinal_2().getTeam1().getNazwa(),this.rozgrywki.getTurniejLina().getPolfinal_2().getTeam2().getNazwa()});
            
        }
        else{
            JOptionPane.showMessageDialog(this,"Półfinały zostały już wygenerowane");
        } 
    }//GEN-LAST:event_btnGenerujPolfinalyPrzeciaganie_LinyActionPerformed

    private void btnGenerujFinalyDwa_OgnieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerujFinalyDwa_OgnieActionPerformed
        if(rozgrywki.getTurniejDwa_Ognie().wygenerowanoFinal==false){
            rozgrywki.getTurniejDwa_Ognie().wygenerujFinal();
            
            this.meczeDwa_Ognie_model.addRow(new Object[] {this.rozgrywki.getTurniejDwa_Ognie().getFinal().getTeam1().getNazwa(),this.rozgrywki.getTurniejDwa_Ognie().getFinal().getTeam2().getNazwa()} );
     
        }
        else{
            JOptionPane.showMessageDialog(this,"Final został już wygenerowany");
        }  
        
        
    }//GEN-LAST:event_btnGenerujFinalyDwa_OgnieActionPerformed

    private void btnGenerujFinalyPrzeciaganie_LinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerujFinalyPrzeciaganie_LinyActionPerformed
        if(rozgrywki.getTurniejLina().wygenerowanoFinal==false){
            rozgrywki.getTurniejLina().wygenerujFinal();
            
            this.meczePrzeciaganie_Liny_model.addRow(new Object[] {this.rozgrywki.getTurniejLina().getFinal().getTeam1().getNazwa(),this.rozgrywki.getTurniejLina().getFinal().getTeam2().getNazwa()} );
     
        }
        else{
            JOptionPane.showMessageDialog(this,"Final został już wygenerowany");
        }  
    }//GEN-LAST:event_btnGenerujFinalyPrzeciaganie_LinyActionPerformed

    
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
    private javax.swing.JButton btnDodajWynikDwa_Ognie;
    private javax.swing.JButton btnDodajWynikPrzeciaganie_Liny;
    private javax.swing.JButton btnDodajWynikSiatkowka;
    private javax.swing.JButton btnGenerujFinalyDwa_Ognie;
    private javax.swing.JButton btnGenerujFinalyPrzeciaganie_Liny;
    private javax.swing.JButton btnGenerujFinalySiatkowka;
    private javax.swing.JButton btnGenerujPolfinalyDwa_Ognie;
    private javax.swing.JButton btnGenerujPolfinalyPrzeciaganie_Liny;
    private javax.swing.JButton btnGenerujPolfinalySiatkowka;
    private javax.swing.JButton btnUsunDruzyne;
    private javax.swing.JButton btnUsunSedziegoDwa_Ognie;
    private javax.swing.JButton btnUsunSedziegoPrzeciaganie_Liny;
    private javax.swing.JButton btnUsunSedziegoSiatkowka;
    private javax.swing.JButton btnWygenerujMeczeDwa_Ognie;
    private javax.swing.JButton btnWygenerujMeczePrzeciaganie_Liny;
    private javax.swing.JButton btnWygenerujMeczeSiatkowka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel lFinal_lewy;
    public javax.swing.JLabel lFinal_lewy_DO;
    public javax.swing.JLabel lFinal_lewy_PL;
    public javax.swing.JLabel lFinal_prawy;
    public javax.swing.JLabel lFinal_prawy_DO;
    public javax.swing.JLabel lFinal_prawy_PL;
    public javax.swing.JLabel lFinal_zwyciezca;
    public javax.swing.JLabel lFinal_zwyciezca_DO;
    public javax.swing.JLabel lFinal_zwyciezca_PL;
    public javax.swing.JLabel lPolfinal1_lewy;
    public javax.swing.JLabel lPolfinal1_lewy_DO;
    public javax.swing.JLabel lPolfinal1_lewy_PL;
    public javax.swing.JLabel lPolfinal1_prawy;
    public javax.swing.JLabel lPolfinal1_prawy_DO;
    public javax.swing.JLabel lPolfinal1_prawy_PL;
    public javax.swing.JLabel lPolfinal1_zwyciezca;
    public javax.swing.JLabel lPolfinal1_zwyciezca_DO;
    public javax.swing.JLabel lPolfinal1_zwyciezca_PL;
    public javax.swing.JLabel lPolfinal2_lewy;
    public javax.swing.JLabel lPolfinal2_lewy_DO;
    public javax.swing.JLabel lPolfinal2_lewy_PL;
    public javax.swing.JLabel lPolfinal2_prawy;
    public javax.swing.JLabel lPolfinal2_prawy_DO;
    public javax.swing.JLabel lPolfinal2_prawy_PL;
    public javax.swing.JLabel lPolfinal2_zwyciezca;
    public javax.swing.JLabel lPolfinal2_zwyciezca_DO;
    public javax.swing.JLabel lPolfinal2_zwyciezca_PL;
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
    private javax.swing.JTable tDwa_OgnieTabela_wynikow;
    public javax.swing.JTable tMeczeDwa_Ognie;
    public javax.swing.JTable tMeczePrzeciaganie_Liny;
    public javax.swing.JTable tMeczeSiatkowka;
    private javax.swing.JTable tPrzeciaganie_LinyTabela_wynikow;
    private javax.swing.JTable tSedziowieDwa_Ognie;
    private javax.swing.JTable tSedziowiePrzeciaganie_Liny;
    private javax.swing.JTable tSedziowieSiatkowka;
    private javax.swing.JTable tSiatkowkaTabela_wynikow;
    private javax.swing.JTabbedPane tpDwa_Ognie;
    private javax.swing.JTabbedPane tpPrzeciaganie_Liny;
    private javax.swing.JTabbedPane tpSiatkowka;
    // End of variables declaration//GEN-END:variables
}
