package projekt;

/**
 * Klasa będąca częścią drużyny
 */
public class Zawodnik {

    private String imie, nazwisko;

    /**
     * metoda pobiera imię zawodnika
     * @return zwraca imie zawodnika
     */
    public String getImie() { return imie; }

    /**
     * metoda pobiera nazwisko zawodnika
     * @return zwraca nazwiko zawodnika
     */
    public String getNazwisko() { return nazwisko; }

    /**
     * konstruktor, tworzy zawodnika o podanym imieniu i nazwisku
     * @param imie tworzonego zawodnika
     * @param nazwisko tworzonego zawodnika
     */
    public Zawodnik(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
