package projekt;


import java.util.LinkedList;
import java.util.Random;

public class Dwa_Ognie extends Mecz {
    
    private Sedzia sedzia;

    public Dwa_Ognie(Druzyna team1, Druzyna team2, LinkedList<Sedzia> s){
        super(team1, team2);
        Random random = new Random();
        int los;

        los = random.nextInt(s.size());
        this.sedzia = s.get(los);

    }

    public Sedzia getSedzia() {
        return sedzia;
    }
}
