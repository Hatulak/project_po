package projekt;


import java.util.LinkedList;
import java.util.Random;
/**
 * Klasa dziedzicząca z klasy mecz, wyróżnia ona mecz siatkówki
 */
public class Siatkowka extends Mecz {

    private LinkedList<Sedzia> sedziowie = new LinkedList<>();

    /**
     * konstruktor, tworzy mecz w siatkówkę
     * @param team1 pierwsza drużyna, która będzie brała udział w tworzonym meczu
     * @param team2 druga drużyna, która będzie brała udział w tworzonym meczu
     * @param s     lista sędziów, z których zostanie wybranych 3 do sędziowania spotkania
     */
    public Siatkowka(Druzyna team1, Druzyna team2, LinkedList<Sedzia> s){
        super(team1, team2);
        LinkedList<Sedzia> kopia = new LinkedList<>();
        for(int i=0; i< s.size(); i++){
            kopia.add(new Sedzia(s.get(i).getImie(), s.get(i).getNazwisko()));
        }
        Random random = new Random();
        int los;
        for(int i =0; i <3; i++){
             los = random.nextInt(kopia.size());
             this.sedziowie.add(kopia.get(los));
             kopia.remove(los);
        }
    }
    
    /**
     * metoda pobiera listę sędziów danego meczu
     * @return zwraca listę sędziów
     */
    public LinkedList<Sedzia> getSedziowie() {
        return sedziowie;
    }
}
