package java_ps9;


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
    private LinkedList<S�dzia> s�dziowie = new LinkedList<>();
    private HashMap<Dru�yna, Integer> tabela_wynikow = new HashMap<>();
    private LinkedList<Mecz> lista_meczy = new LinkedList<>();
    private Mecz polfinal_1, polfinal_2, fina�;



    public void dodajSedziego(S�dzia s�dzia){
        s�dziowie.add(s�dzia);
    }
    public void usunSedziego(S�dzia s�dzia){
        s�dziowie.remove(s�dzia);
    }

    public LinkedList<S�dzia> getS�dziowie() {
        return s�dziowie;
    }
    public LinkedList<Mecz> getLista_meczy() {
        return lista_meczy;
    }


    public HashMap<Dru�yna, Integer> getTabela_wynikow() {
        return tabela_wynikow;
    }
    public void dodajWynik(Dru�yna dru�yna){
        tabela_wynikow.put( dru�yna, tabela_wynikow.get(dru�yna) + 1 );
        sortowanie();
    }


    public Mecz getFina�() {
        return fina�;
    }
    public Mecz getPolfinal_1() {
        return polfinal_1;
    }
    public Mecz getPolfinal_2() {
        return polfinal_2;
    }
    public void sortowanie(){
    	List<Entry<Dru�yna,Integer>> lista = new LinkedList<Entry<Dru�yna,Integer>>(tabela_wynikow.entrySet());
    	Collections.sort(lista, new Comparator<Entry<Dru�yna,Integer>>(){
    		@Override
    		public int compare(Entry<Dru�yna,Integer> o1, Entry<Dru�yna,Integer> o2){
    			return o1.getValue().compareTo(o2.getValue());
    		}
    	});
    	HashMap<Dru�yna,Integer> posort = new HashMap<Dru�yna,Integer>();
    	for (Entry<Dru�yna,Integer> druzyna: lista){
    		posort.put(druzyna.getKey(), druzyna.getValue());
    	}
    }
    public void wygenerujMecze(LinkedList<Dru�yna> dru�yny){
        Mecz mecz;
    	for (int i = 0; i < dru�yny.size() ; i++ ){
            for (int j = i+1;  j< dru�yny.size(); j++){
                Dru�yna team1 = dru�yny.get(i);
                Dru�yna team2 = dru�yny.get(j);
                if (nazwa.matches("Siatk�wka"))
                    mecz = new Siatk�wka(team1,team2,s�dziowie);
                if (nazwa.matches("Dwa_Ognie"))
                    mecz = new Dwa_Ognie(team1,team2,s�dziowie);
                if (nazwa.matches("Przeciaganie_Liny"))
                    mecz= new Przeci�ganie_Liny(team1,team2,s�dziowie);
                }
            }
        }
    public void wygenerujPolfinaly(){
    	//sortowanie
    	List<Dru�yna> nazwy = new ArrayList<Dru�yna>();
    	for(Dru�yna klucz : tabela_wynikow.keySet()){
    	             nazwy.add(klucz);
    	}
    	if (nazwa.matches("Siatk�wka")){
            this.polfinal_1 = new Siatk�wka(nazwy.get(0),nazwy.get(3),s�dziowie);
            this.polfinal_2 = new Siatk�wka(nazwy.get(1),nazwy.get(2),s�dziowie);
    	}
        if (nazwa.matches("Dwa_Ognie")){
        	this.polfinal_1 = new Dwa_Ognie(nazwy.get(0),nazwy.get(3),s�dziowie);
        	this.polfinal_2 = new Dwa_Ognie(nazwy.get(1),nazwy.get(2),s�dziowie);
        }
        if (nazwa.matches("Przeciaganie_Liny")){
        	this.polfinal_1 = new Przeci�ganie_Liny(nazwy.get(0),nazwy.get(3),s�dziowie);
        	this.polfinal_2 = new Przeci�ganie_Liny(nazwy.get(1),nazwy.get(2),s�dziowie);
        }
    }
    public void wygenerujFinaly(){
    	if (nazwa.matches("Siatk�wka"))
            this.fina� = new Siatk�wka(this.polfinal_1.getZwyciezca(),this.polfinal_2.getZwyciezca(),s�dziowie);
        if (nazwa.matches("Dwa_Ognie"))
            this.fina� = new Dwa_Ognie(this.polfinal_1.getZwyciezca(),this.polfinal_2.getZwyciezca(),s�dziowie);
        if (nazwa.matches("Przeciaganie_Liny"))
            this.fina� = new Przeci�ganie_Liny(this.polfinal_1.getZwyciezca(),this.polfinal_2.getZwyciezca(),s�dziowie);
    }
    }
    

