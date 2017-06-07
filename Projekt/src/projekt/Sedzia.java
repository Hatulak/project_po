package projekt;

import java.io.*;

/**
 * Klasa będąca częścią danej dyscypliny
 */
public class Sedzia implements Serializable{
    private String imie, nazwisko;

    /**
     * metoda pobiera imię sędziego
     * @return zwraca imię sędziego
     */
    public String getImie() {
        return imie;
    }

    /**
     * metoda pobiera nazwisko sędziego
     * @return zwraca nazwisko sędziego
     */
    public String getNazwisko() {
        return nazwisko;
    }
    
    /**
     * konstruktor, tworzy sędziego o podanym imieniu i nazwisku
     * @param imie      imię tworzonego sędziego
     * @param nazwisko      nazwisko tworzonego sędziego
     */
    public Sedzia(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
