
package projekt;

import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;


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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
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
        jScrollPane1.setViewportView(tMeczeSiatkowka);

        btnGenerujPolfinalySiatkowka.setText("Wygeneruj półfinały");

        btnGenerujFinalySiatkowka.setText("Wygeneruj finały");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
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

        javax.swing.GroupLayout pTabelaSiatkowkaLayout = new javax.swing.GroupLayout(pTabelaSiatkowka);
        pTabelaSiatkowka.setLayout(pTabelaSiatkowkaLayout);
        pTabelaSiatkowkaLayout.setHorizontalGroup(
            pTabelaSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTabelaSiatkowkaLayout.createSequentialGroup()
                .addGap(0, 207, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pTabelaSiatkowkaLayout.setVerticalGroup(
            pTabelaSiatkowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
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
        jScrollPane9.setViewportView(tMeczeDwa_Ognie);

        btnGenerujPolfinalyDwa_Ognie.setText("Wygeneruj półfinały");

        btnGenerujFinalyDwa_Ognie.setText("Wygeneruj finały");

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
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
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

        javax.swing.GroupLayout pTabelaDwa_OgnieLayout = new javax.swing.GroupLayout(pTabelaDwa_Ognie);
        pTabelaDwa_Ognie.setLayout(pTabelaDwa_OgnieLayout);
        pTabelaDwa_OgnieLayout.setHorizontalGroup(
            pTabelaDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTabelaDwa_OgnieLayout.createSequentialGroup()
                .addGap(0, 207, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pTabelaDwa_OgnieLayout.setVerticalGroup(
            pTabelaDwa_OgnieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
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
        jScrollPane10.setViewportView(tMeczePrzeciaganie_Liny);

        btnGenerujPolfinalyPrzeciaganie_Liny.setText("Wygeneruj półfinały");

        btnGenerujFinalyPrzeciaganie_Liny.setText("Wygeneruj finały");

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
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
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

        javax.swing.GroupLayout pTabelaPrzeciaganie_LinyLayout = new javax.swing.GroupLayout(pTabelaPrzeciaganie_Liny);
        pTabelaPrzeciaganie_Liny.setLayout(pTabelaPrzeciaganie_LinyLayout);
        pTabelaPrzeciaganie_LinyLayout.setHorizontalGroup(
            pTabelaPrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTabelaPrzeciaganie_LinyLayout.createSequentialGroup()
                .addGap(0, 207, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pTabelaPrzeciaganie_LinyLayout.setVerticalGroup(
            pTabelaPrzeciaganie_LinyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
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
       DodajSedziego fDodajSedziegoSiatkowka = new DodajSedziego(this, "Siatkowka");
       fDodajSedziegoSiatkowka.setVisible(true);
    }//GEN-LAST:event_btnDodajSedziegoSiatkowkaActionPerformed

    private void btnDodajDruzyneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajDruzyneActionPerformed
           DodajDruzyne fDodajDruzyne = new DodajDruzyne(this);
           fDodajDruzyne.setVisible(true);
    }//GEN-LAST:event_btnDodajDruzyneActionPerformed

    private void btnDodajSedziegoDwa_OgnieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajSedziegoDwa_OgnieActionPerformed
       DodajSedziego fDodajSedziegoDwa_Ognie = new DodajSedziego(this, "Dwa_Ognie");
       fDodajSedziegoDwa_Ognie.setVisible(true);
    }//GEN-LAST:event_btnDodajSedziegoDwa_OgnieActionPerformed

    private void btnDodajSedziegoPrzeciaganie_LinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajSedziegoPrzeciaganie_LinyActionPerformed
        DodajSedziego fDodajSedziegoPrzeciaganie_Liny = new DodajSedziego(this, "Przeciaganie_Liny");
       fDodajSedziegoPrzeciaganie_Liny.setVisible(true);
    }//GEN-LAST:event_btnDodajSedziegoPrzeciaganie_LinyActionPerformed

    private void btnUsunSedziegoSiatkowkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsunSedziegoSiatkowkaActionPerformed
        if(tSedziowieSiatkowka.getSelectedRow() != -1){
            String imie, nazwisko;
            imie = (String)  sedziowieSiatkowka_model.getValueAt(tSedziowieSiatkowka.getSelectedRow(), 0);
            nazwisko = (String) sedziowieSiatkowka_model.getValueAt(tSedziowieSiatkowka.getSelectedRow(), 1);
            for (Sedzia sedzia : this.rozgrywki.getTurniejSiatkowki().getSedziowie()) {
                if(imie.matches(sedzia.getImie()) && (nazwisko.matches(sedzia.getNazwisko())))
                    this.rozgrywki.getTurniejSiatkowki().usunSedziego(imie, nazwisko);
            }
            sedziowieSiatkowka_model.removeRow(tSedziowieSiatkowka.getSelectedRow());
            
        }
    }//GEN-LAST:event_btnUsunSedziegoSiatkowkaActionPerformed

    private void btnUsunSedziegoDwa_OgnieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsunSedziegoDwa_OgnieActionPerformed
        if(tSedziowieDwa_Ognie.getSelectedRow() != -1){
            String imie, nazwisko;
            imie = (String)  sedziowieDwa_Ognie_model.getValueAt(tSedziowieDwa_Ognie.getSelectedRow(), 0);
            nazwisko = (String) sedziowieDwa_Ognie_model.getValueAt(tSedziowieDwa_Ognie.getSelectedRow(), 1);
            for (Sedzia sedzia : this.rozgrywki.getTurniejDwa_Ognie().getSedziowie()) {
                if(imie.matches(sedzia.getImie()) && (nazwisko.matches(sedzia.getNazwisko())))
                    this.rozgrywki.getTurniejDwa_Ognie().usunSedziego(imie, nazwisko);
            }
            sedziowieDwa_Ognie_model.removeRow(tSedziowieDwa_Ognie.getSelectedRow());
        }
    }//GEN-LAST:event_btnUsunSedziegoDwa_OgnieActionPerformed

    private void btnUsunSedziegoPrzeciaganie_LinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsunSedziegoPrzeciaganie_LinyActionPerformed
        if(tSedziowiePrzeciaganie_Liny.getSelectedRow() != -1){
            String imie, nazwisko;
            imie = (String)  sedziowiePrzeciaganie_Liny_model.getValueAt(tSedziowiePrzeciaganie_Liny.getSelectedRow(), 0);
            nazwisko = (String) sedziowiePrzeciaganie_Liny_model.getValueAt(tSedziowiePrzeciaganie_Liny.getSelectedRow(), 1);
            for (Sedzia sedzia : this.rozgrywki.getTurniejLina().getSedziowie()) {
                if(imie.matches(sedzia.getImie()) && (nazwisko.matches(sedzia.getNazwisko())))
                    this.rozgrywki.getTurniejLina().usunSedziego(imie, nazwisko);
            }
            sedziowiePrzeciaganie_Liny_model.removeRow(tSedziowiePrzeciaganie_Liny.getSelectedRow());
        }
    }//GEN-LAST:event_btnUsunSedziegoPrzeciaganie_LinyActionPerformed

    private void btnUsunDruzyneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsunDruzyneActionPerformed
        if(tDruzyny.getSelectedRow() != -1){
            String nazwa;
            nazwa = (String) druzyny_model.getValueAt(tDruzyny.getSelectedRow(), 0);
            for(Druzyna team : this.rozgrywki.getDruzyny()){
                if(nazwa.matches(team.getNazwa()))
                    this.rozgrywki.wycofajDruzyne(nazwa);
            }
            druzyny_model.removeRow(tDruzyny.getSelectedRow());
        }
    }//GEN-LAST:event_btnUsunDruzyneActionPerformed

    private void btnWygenerujMeczeSiatkowkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWygenerujMeczeSiatkowkaActionPerformed
        rozgrywki.getTurniejSiatkowki().wygenerujMecze(rozgrywki.getDruzyny());
        
        LinkedList<Mecz> listaSiatkowka = rozgrywki.getTurniejSiatkowki().getLista_meczy();
        
        for(int i=0; i < listaSiatkowka.size(); i++){
                String nazwa1 = listaSiatkowka.get(i).getTeam1().getNazwa();
                String nazwa2 = listaSiatkowka.get(i).getTeam2().getNazwa();
            
                this.meczeSiatkowka_model.addRow(new Object[]{nazwa1,nazwa2});
            
        }
    }//GEN-LAST:event_btnWygenerujMeczeSiatkowkaActionPerformed

    private void tDruzynyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDruzynyMouseClicked
        PrzegladDruzyny fPrzeglad = new PrzegladDruzyny(this,druzyny_model.getValueAt(tDruzyny.getSelectedRow(),NORMAL).toString());
        fPrzeglad.setVisible(true); 
    }//GEN-LAST:event_tDruzynyMouseClicked

    private void btnDodajWynikSiatkowkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajWynikSiatkowkaActionPerformed
       DodajWynik fDodajwynik = new DodajWynik(this, "Siatkowka",(String) tMeczeSiatkowka.getModel().getValueAt(tMeczeSiatkowka.getSelectedRow(), 0 ),(String) tMeczeSiatkowka.getModel().getValueAt(tMeczeSiatkowka.getSelectedRow(), 1 ));
       fDodajwynik.setVisible(true);
    }//GEN-LAST:event_btnDodajWynikSiatkowkaActionPerformed

    private void btnWygenerujMeczeDwa_OgnieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWygenerujMeczeDwa_OgnieActionPerformed
        rozgrywki.getTurniejDwa_Ognie().wygenerujMecze(rozgrywki.getDruzyny());
        
        LinkedList<Mecz> listaDwa_Ognie = rozgrywki.getTurniejDwa_Ognie().getLista_meczy();
        
        for(int i=0; i < listaDwa_Ognie.size(); i++){
                String nazwa1 = listaDwa_Ognie.get(i).getTeam1().getNazwa();
                String nazwa2 = listaDwa_Ognie.get(i).getTeam2().getNazwa();
            
                this.meczeDwa_Ognie_model.addRow(new Object[]{nazwa1,nazwa2});
            
        }
    }//GEN-LAST:event_btnWygenerujMeczeDwa_OgnieActionPerformed

    private void btnDodajWynikDwa_OgnieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajWynikDwa_OgnieActionPerformed
       DodajWynik fDodajwynik = new DodajWynik(this, "Dwa_Ognie",(String) tMeczeDwa_Ognie.getModel().getValueAt(tMeczeDwa_Ognie.getSelectedRow(), 0 ),(String) tMeczeDwa_Ognie.getModel().getValueAt(tMeczeDwa_Ognie.getSelectedRow(), 1 ));
       fDodajwynik.setVisible(true);
    }//GEN-LAST:event_btnDodajWynikDwa_OgnieActionPerformed

    private void btnWygenerujMeczePrzeciaganie_LinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWygenerujMeczePrzeciaganie_LinyActionPerformed
        rozgrywki.getTurniejLina().wygenerujMecze(rozgrywki.getDruzyny());
        
        LinkedList<Mecz> listaPrzeciaganie_Liny = rozgrywki.getTurniejLina().getLista_meczy();
        
        for(int i=0; i < listaPrzeciaganie_Liny.size(); i++){
                String nazwa1 = listaPrzeciaganie_Liny.get(i).getTeam1().getNazwa();
                String nazwa2 = listaPrzeciaganie_Liny.get(i).getTeam2().getNazwa();
            
                this.meczePrzeciaganie_Liny_model.addRow(new Object[]{nazwa1,nazwa2});
            
        }
    }//GEN-LAST:event_btnWygenerujMeczePrzeciaganie_LinyActionPerformed

    private void btnDodajWynikPrzeciaganie_LinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajWynikPrzeciaganie_LinyActionPerformed
       DodajWynik fDodajwynik = new DodajWynik(this, "Przeciaganie_Liny",(String) tMeczePrzeciaganie_Liny.getModel().getValueAt(tMeczePrzeciaganie_Liny.getSelectedRow(), 0 ),(String) tMeczePrzeciaganie_Liny.getModel().getValueAt(tMeczePrzeciaganie_Liny.getSelectedRow(), 1 ));
       fDodajwynik.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_btnDodajWynikPrzeciaganie_LinyActionPerformed

    
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
