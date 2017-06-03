package projekt;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

public class Dyscyplina {
    private String nazwa;
    private LinkedList<Sedzia> sedziowie = new LinkedList<>();
    private HashMap<Druzyna, Integer> tabela_wynikow = new HashMap<>();
    private LinkedList<Mecz> lista_meczy = new LinkedList<>();
    private Mecz polfinal_1;
    private Mecz polfinal_2;
    private Mecz mecz_final;



    public void dodajSedziego(Sedzia sedzia){
        sedziowie.add(sedzia);
    }
    public void usunSedziego(Sedzia sedzia){
        sedziowie.remove(sedzia);
    }

    public LinkedList<Sedzia> getSedziowie() {
        return sedziowie;
    }
    public LinkedList<Mecz> getLista_meczy() {
        return lista_meczy;
    }


    public HashMap<Druzyna, Integer> getTabela_wynikow() {
        return tabela_wynikow;
    }
    public void dodajWynik(Druzyna druzyna){
        tabela_wynikow.put( druzyna, tabela_wynikow.get(druzyna) + 1 );
        sortowanie();
    }


    public Mecz getFinal() {
        return mecz_final;
    }
    public Mecz getPolfinal_1() {
        return polfinal_1;
    }
    public Mecz getPolfinal_2() {
        return polfinal_2;
    }
    public void sortowanie(){
    	List<Entry<Druzyna,Integer>> lista = new LinkedList<Entry<Druzyna,Integer>>(tabela_wynikow.entrySet());
    	Collections.sort(lista, new Comparator<Entry<Druzyna,Integer>>(){
    		@Override
    		public int compare(Entry<Druzyna,Integer> o1, Entry<Druzyna,Integer> o2){
    			return o1.getValue().compareTo(o2.getValue());
    		}
    	});
    	HashMap<Druzyna,Integer> posort = new HashMap<Druzyna,Integer>();
    	for (Entry<Druzyna,Integer> druzyna: lista){
    		posort.put(druzyna.getKey(), druzyna.getValue());
    	}
    }
    public void wygenerujMecze(LinkedList<Druzyna> druzyny){
        Mecz mecz;
    	for (int i = 0; i < druzyny.size() ; i++ ){
            for (int j = i+1;  j< druzyny.size(); j++){
                Druzyna team1 = druzyny.get(i);
                Druzyna team2 = druzyny.get(j);
                if (nazwa.matches("Siatk�wka"))
                    mecz = new Siatkowka(team1,team2,sedziowie);
                if (nazwa.matches("Dwa_Ognie"))
                    mecz = new Dwa_Ognie(team1,team2,sedziowie);
                if (nazwa.matches("Przeciaganie_Liny"))
                    mecz= new Przeciaganie_Liny(team1,team2,sedziowie);
                }
            }
        }
    public void wygenerujPolfinaly(){
    	//sortowanie
    	List<Druzyna> nazwy = new ArrayList<Druzyna>();
    	for(Druzyna klucz : tabela_wynikow.keySet()){
    	             nazwy.add(klucz);
    	}
    	if (nazwa.matches("Siatk�wka")){
            this.polfinal_1 = new Siatkowka(nazwy.get(0),nazwy.get(3),sedziowie);
            this.polfinal_2 = new Siatkowka(nazwy.get(1),nazwy.get(2),sedziowie);
    	}
        if (nazwa.matches("Dwa_Ognie")){
        	this.polfinal_1 = new Dwa_Ognie(nazwy.get(0),nazwy.get(3),sedziowie);
        	this.polfinal_2 = new Dwa_Ognie(nazwy.get(1),nazwy.get(2),sedziowie);
        }
        if (nazwa.matches("Przeciaganie_Liny")){
        	this.polfinal_1 = new Przeciaganie_Liny(nazwy.get(0),nazwy.get(3),sedziowie);
        	this.polfinal_2 = new Przeciaganie_Liny(nazwy.get(1),nazwy.get(2),sedziowie);
        }
    }
    public void wygenerujFinaly(){
    	if (nazwa.matches("Siatkowka"))
            this.mecz_final = new Siatkowka(this.polfinal_1.getZwyciezca(),this.polfinal_2.getZwyciezca(),sedziowie);
        if (nazwa.matches("Dwa_Ognie"))
            this.mecz_final = new Dwa_Ognie(this.polfinal_1.getZwyciezca(),this.polfinal_2.getZwyciezca(),sedziowie);
        if (nazwa.matches("Przeciaganie_Liny"))
            this.mecz_final = new Przeciaganie_Liny(this.polfinal_1.getZwyciezca(),this.polfinal_2.getZwyciezca(),sedziowie);
    }
    }
    
