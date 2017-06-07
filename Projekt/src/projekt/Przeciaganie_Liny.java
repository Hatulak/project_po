package projekt;


import java.util.LinkedList;
import java.util.Random;

/**
 * Klasa dziedzicząca z klasy mecz, wyróżnia ona mecz w przeciąganie liny
 */
public class Przeciaganie_Liny extends Mecz {

    private Sedzia sedzia;
  
    /**
     * konstruktor, tworzy mecz w przeciaganie liny
     * @param team1 pierwsza drużyna, która będzie brała udział w tworzonym meczu
     * @param team2 druga drużyna, która będzie brała udział w tworzonym meczu
     * @param s     lista sędziów, z których zostanie wybrany jeden do sędziowania spotkania
     */
    public Przeciaganie_Liny(Druzyna team1, Druzyna team2, LinkedList<Sedzia> s){
        super(team1, team2);
        
        Random random = new Random();
        int los;
        los = random.nextInt(s.size());
        this.sedzia = s.get(los);
    }

    /**
     * metoda zwraca sędziego sędziującego dany mecz
     * @return zwraca sędziego
     */
    public Sedzia getSedzia() {
        return sedzia;
    }
}
