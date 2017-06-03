package java_ps9;


import java.util.LinkedList;
import java.util.Random;

public class Dwa_Ognie extends Mecz {
    private Sêdzia sêdzia;

    public Dwa_Ognie(Dru¿yna team1, Dru¿yna team2, LinkedList<Sêdzia> sêdziowie){
        super(team1, team2);

        Random random = new Random();

        int los;
            los = random.nextInt(sêdziowie.size());
            this.sêdzia = sêdziowie.get(los);
            sêdziowie.remove(los);

    }

    public Sêdzia getSêdzia() {
        return sêdzia;
    }
}
