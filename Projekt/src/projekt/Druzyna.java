package projekt;

import java.io.*;
import java.util.LinkedList;

/**
 * Klasa drużyna posiada listę zawodników oraz nazwę
 */

public class Druzyna implements Serializable {
    private String nazwa;
    private LinkedList<Zawodnik> zawodnicy = new LinkedList<>();

    
    /**
     * metoda dodaje zawodnika do listy zawodników
     * @param gracz     dodawany do drużyny zawodnik
     */
    public void dodajZawodnika(Zawodnik gracz){
        zawodnicy.add(gracz);
    }

    /**
     * metoda pobiera listę zawodników
     * @return zwraca listę zawodników
     */
    public LinkedList<Zawodnik> getZawodnicy(){
        return zawodnicy;
    }

    /**
     * metoda pobiera nazwę drużyny
     * @return zwraca nazwę drużyny
     */
    public String getNazwa() {
        return nazwa;
    }
    
    /**
     * ustawia nazwę drużyny
     * @param nazwa     nazwa do ustawienia
     */
    public void setNazwa(String nazwa){
    	this.nazwa = nazwa;
    }
}
