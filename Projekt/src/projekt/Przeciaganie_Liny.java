package projekt;


import java.util.LinkedList;
import java.util.Random;

public class Przeciaganie_Liny extends Mecz {

    private Sedzia sedzia;

    public Przeciaganie_Liny(Druzyna team1, Druzyna team2, LinkedList<Sedzia> sedzia){

        super(team1, team2);
        Random random = new Random();
        int los = random.nextInt(sedzia.size());
        this.sedzia=sedzia.get(los);
        sedzia.remove(los);
    }

    public Sedzia getSedzia() {
        return sedzia;
    }
}
