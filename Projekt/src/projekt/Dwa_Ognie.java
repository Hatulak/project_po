package projekt;


import java.util.LinkedList;
import java.util.Random;

public class Dwa_Ognie extends Mecz {
    private Sedzia sedzia;

    public Dwa_Ognie(Druzyna team1, Druzyna team2, LinkedList<Sedzia> sedziowie){
        super(team1, team2);

        Random random = new Random();

        int los;
            los = random.nextInt(sedziowie.size());
            this.sedzia = sedziowie.get(los);
            sedziowie.remove(los);

    }

    public Sedzia getSedzia() {
        return sedzia;
    }
}
