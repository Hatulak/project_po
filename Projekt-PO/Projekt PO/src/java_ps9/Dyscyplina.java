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
    private LinkedList<Sêdzia> sêdziowie = new LinkedList<>();
    private HashMap<Dru¿yna, Integer> tabela_wynikow = new HashMap<>();
    private LinkedList<Mecz> lista_meczy = new LinkedList<>();
    private Mecz polfinal_1, polfinal_2, fina³;



    public void dodajSedziego(Sêdzia sêdzia){
        sêdziowie.add(sêdzia);
    }
    public void usunSedziego(Sêdzia sêdzia){
        sêdziowie.remove(sêdzia);
    }

    public LinkedList<Sêdzia> getSêdziowie() {
        return sêdziowie;
    }
    public LinkedList<Mecz> getLista_meczy() {
        return lista_meczy;
    }


    public HashMap<Dru¿yna, Integer> getTabela_wynikow() {
        return tabela_wynikow;
    }
    public void dodajWynik(Dru¿yna dru¿yna){
        tabela_wynikow.put( dru¿yna, tabela_wynikow.get(dru¿yna) + 1 );
        sortowanie();
    }


    public Mecz getFina³() {
        return fina³;
    }
    public Mecz getPolfinal_1() {
        return polfinal_1;
    }
    public Mecz getPolfinal_2() {
        return polfinal_2;
    }
    public void sortowanie(){
    	List<Entry<Dru¿yna,Integer>> lista = new LinkedList<Entry<Dru¿yna,Integer>>(tabela_wynikow.entrySet());
    	Collections.sort(lista, new Comparator<Entry<Dru¿yna,Integer>>(){
    		@Override
    		public int compare(Entry<Dru¿yna,Integer> o1, Entry<Dru¿yna,Integer> o2){
    			return o1.getValue().compareTo(o2.getValue());
    		}
    	});
    	HashMap<Dru¿yna,Integer> posort = new HashMap<Dru¿yna,Integer>();
    	for (Entry<Dru¿yna,Integer> druzyna: lista){
    		posort.put(druzyna.getKey(), druzyna.getValue());
    	}
    }
    public void wygenerujMecze(LinkedList<Dru¿yna> dru¿yny){
        Mecz mecz;
    	for (int i = 0; i < dru¿yny.size() ; i++ ){
            for (int j = i+1;  j< dru¿yny.size(); j++){
                Dru¿yna team1 = dru¿yny.get(i);
                Dru¿yna team2 = dru¿yny.get(j);
                if (nazwa.matches("Siatkówka"))
                    mecz = new Siatkówka(team1,team2,sêdziowie);
                if (nazwa.matches("Dwa_Ognie"))
                    mecz = new Dwa_Ognie(team1,team2,sêdziowie);
                if (nazwa.matches("Przeciaganie_Liny"))
                    mecz= new Przeci¹ganie_Liny(team1,team2,sêdziowie);
                }
            }
        }
    public void wygenerujPolfinaly(){
    	//sortowanie
    	List<Dru¿yna> nazwy = new ArrayList<Dru¿yna>();
    	for(Dru¿yna klucz : tabela_wynikow.keySet()){
    	             nazwy.add(klucz);
    	}
    	if (nazwa.matches("Siatkówka")){
            this.polfinal_1 = new Siatkówka(nazwy.get(0),nazwy.get(3),sêdziowie);
            this.polfinal_2 = new Siatkówka(nazwy.get(1),nazwy.get(2),sêdziowie);
    	}
        if (nazwa.matches("Dwa_Ognie")){
        	this.polfinal_1 = new Dwa_Ognie(nazwy.get(0),nazwy.get(3),sêdziowie);
        	this.polfinal_2 = new Dwa_Ognie(nazwy.get(1),nazwy.get(2),sêdziowie);
        }
        if (nazwa.matches("Przeciaganie_Liny")){
        	this.polfinal_1 = new Przeci¹ganie_Liny(nazwy.get(0),nazwy.get(3),sêdziowie);
        	this.polfinal_2 = new Przeci¹ganie_Liny(nazwy.get(1),nazwy.get(2),sêdziowie);
        }
    }
    public void wygenerujFinaly(){
    	if (nazwa.matches("Siatkówka"))
            this.fina³ = new Siatkówka(this.polfinal_1.getZwyciezca(),this.polfinal_2.getZwyciezca(),sêdziowie);
        if (nazwa.matches("Dwa_Ognie"))
            this.fina³ = new Dwa_Ognie(this.polfinal_1.getZwyciezca(),this.polfinal_2.getZwyciezca(),sêdziowie);
        if (nazwa.matches("Przeciaganie_Liny"))
            this.fina³ = new Przeci¹ganie_Liny(this.polfinal_1.getZwyciezca(),this.polfinal_2.getZwyciezca(),sêdziowie);
    }
    }
    

