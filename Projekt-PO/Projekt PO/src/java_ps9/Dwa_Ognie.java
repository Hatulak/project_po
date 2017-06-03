package java_ps9;


import java.util.LinkedList;
import java.util.Random;

public class Dwa_Ognie extends Mecz {
    private S�dzia s�dzia;

    public Dwa_Ognie(Dru�yna team1, Dru�yna team2, LinkedList<S�dzia> s�dziowie){
        super(team1, team2);

        Random random = new Random();

        int los;
            los = random.nextInt(s�dziowie.size());
            this.s�dzia = s�dziowie.get(los);
            s�dziowie.remove(los);

    }

    public S�dzia getS�dzia() {
        return s�dzia;
    }
}
