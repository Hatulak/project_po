package projekt;

import java.io.*;
/**
 * Klasa będąca częścią dyscypliny
 */
public abstract class Mecz implements Serializable {
    private Druzyna team1, team2;
    private Druzyna zwyciezca;
    private String faza; //Faza_Grupowa, Półfinały, Finał

    
    /**
     * metoda pobiera fazę w której rozgrywany jest dany mecz
     * @return zwraca fazę spotkania Faza_grupowa/Półfinały/Finał
     */
    public String getFaza(){
        return faza;
    }
    /**
     * metoda pobiera zwycięską drużynę
     * @return zwraca zwycięzcę danego meczu
     */
    public Druzyna getZwyciezca() {
        return zwyciezca;
    }
    
    /**
     * pobiera pierwszą drużynę biorącą udział w meczu
     * @return zwraca pierwszą drużynę z meczu
     */
    public Druzyna getTeam1() {
        return team1;
    }
    
    /**
     * pobiera drugą drużynę biorącą udział w meczu
     * @return zwraca drugą drużynę z meczu
     */
    public Druzyna getTeam2() {
        return team2;
    }
    
    /**
     * metoda pobiera przegranego z danego meczu
     * @return zwraca przegraną drużynę danego meczu
     */
    public Druzyna getPrzegrany() {

        String nazwa_wygranego;
        Druzyna przegrany;
        nazwa_wygranego = this.getZwyciezca().getNazwa();

        if(  nazwa_wygranego.equals(team1.getNazwa())  ){
            przegrany = team2;
        }
        else{
            przegrany = team1;
        }

        return  przegrany;
    }

    /**
     * konstruktor, tworzy mecz z podanych drużyn
     * @param team1     pierwsza drużyna biorąca udział w meczu
     * @param team2     druga drużyna biorąca udział  w meczu
     */
    public Mecz(Druzyna team1, Druzyna team2, String faza_rozgrywek){
        this.team1 = team1;
        this.team2 = team2;
        faza = faza_rozgrywek;
    }

    /**
     * metoda ustanawia zwycięzcę danego meczu
     * @param zwyciezca     drużyna, która wygrała dany mecz
     */
    public void dodajWynik(Druzyna zwyciezca ){
        this.zwyciezca = zwyciezca;
    }

}
