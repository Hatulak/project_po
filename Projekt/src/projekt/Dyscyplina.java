package projekt;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Dyscyplina {
    private String nazwa;
    private LinkedList<Sedzia> sedziowie;
    private HashMap<Druzyna, Integer> tabela_wynikow;
    private LinkedList<Mecz> lista_meczy;
    private Mecz polfinal_1;
    private Mecz polfinal_2;
    private Mecz mecz_final;
    boolean wygenerowanoMecze=false;
    boolean wygenerowanoPolfinaly=false;
    boolean wygenerowanoFinal=false;

    public Dyscyplina(String s){
        nazwa = s;
        sedziowie = new LinkedList<>();
        tabela_wynikow = new HashMap<>();
        lista_meczy = new LinkedList<>();
    }

    public void dodajSedziego(Sedzia sedzia){
        sedziowie.add(sedzia);
    }
    public void usunSedziego(String imie, String nazwisko){
        int index =0;
        for (Sedzia sedzia : sedziowie) {
            if(imie.matches(sedzia.getImie()) && nazwisko.matches(sedzia.getNazwisko())){
                this.sedziowie.remove(index);
                return;
            }
            index++;
        }
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
    public void dodajPunkty(Druzyna druzyna){
        tabela_wynikow.put( druzyna, tabela_wynikow.get(druzyna) + 1 );
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
    public void wygenerujMecze(LinkedList<Druzyna> druzyny){
    	for (int i = 0; i < druzyny.size() ; i++ ){
            for (int j = i+1;  j< druzyny.size(); j++){
                Druzyna team1 = druzyny.get(i);
                Druzyna team2 = druzyny.get(j);
                if (nazwa.matches("Siatkowka"))
                    lista_meczy.add(new Siatkowka(team1,team2,sedziowie));
                else if (nazwa.matches("Dwa_Ognie"))
                    lista_meczy.add(new Dwa_Ognie(team1,team2,sedziowie));
                else if (nazwa.matches("Przeciaganie_Liny"))
                    lista_meczy.add(new Przeciaganie_Liny(team1,team2,sedziowie));
                
                }
            }
        wygenerowanoMecze=true;
        }
    public void wygenerujPolfinaly(){ 
        //Sortowanie tabeli wynikow
        List<Entry<Druzyna,Integer>> lista = new LinkedList<Entry<Druzyna,Integer>>(tabela_wynikow.entrySet());
    	Collections.sort(lista, new Comparator<Entry<Druzyna,Integer>>(){
    		@Override
    		public int compare(Entry<Druzyna,Integer> o1, Entry<Druzyna,Integer> o2){
    			return o1.getValue().compareTo(o2.getValue());
    		}
    	});
       
        for(Entry<Druzyna, Integer> item : lista){
            System.out.println(item.getKey().getNazwa() + "  " + item.getValue());
        }

    	if (nazwa.matches("Siatkowka")){
            this.polfinal_1 = new Siatkowka(lista.get(lista.size()-1).getKey() ,lista.get(lista.size()-4).getKey(),sedziowie);
            this.polfinal_2 = new Siatkowka(lista.get(lista.size()-2).getKey() ,lista.get(lista.size()-3).getKey(),sedziowie);
    	}
        if (nazwa.matches("Dwa_Ognie")){
        	this.polfinal_1 = new Dwa_Ognie(lista.get(lista.size()-1).getKey() ,lista.get(lista.size()-4).getKey(),sedziowie);
        	this.polfinal_2 = new Dwa_Ognie(lista.get(lista.size()-2).getKey() ,lista.get(lista.size()-3).getKey(),sedziowie);
        }
        if (nazwa.matches("Przeciaganie_Liny")){
        	this.polfinal_1 = new Przeciaganie_Liny(lista.get(lista.size()-1).getKey() ,lista.get(lista.size()-4).getKey(),sedziowie);
        	this.polfinal_2 = new Przeciaganie_Liny(lista.get(lista.size()-2).getKey() ,lista.get(lista.size()-3).getKey(),sedziowie);
        }
        wygenerowanoPolfinaly=true;
    }
    public void wygenerujFinal(){
    	if (nazwa.matches("Siatkowka"))
            this.mecz_final = new Siatkowka(this.polfinal_1.getZwyciezca(),this.polfinal_2.getZwyciezca(),sedziowie);
        if (nazwa.matches("Dwa_Ognie"))
            this.mecz_final = new Dwa_Ognie(this.polfinal_1.getZwyciezca(),this.polfinal_2.getZwyciezca(),sedziowie);
        if (nazwa.matches("Przeciaganie_Liny"))
            this.mecz_final = new Przeciaganie_Liny(this.polfinal_1.getZwyciezca(),this.polfinal_2.getZwyciezca(),sedziowie);
        wygenerowanoFinal=true;
    }
}
    

