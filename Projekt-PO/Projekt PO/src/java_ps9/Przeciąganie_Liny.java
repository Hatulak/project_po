package java_ps9;


import java.util.LinkedList;
import java.util.Random;

public class Przeci�ganie_Liny extends Mecz {

    private S�dzia s�dzia;

    public Przeci�ganie_Liny(Dru�yna team1, Dru�yna team2, LinkedList<S�dzia> s�dzia){

        super(team1, team2);
        Random random = new Random();
        int los = random.nextInt(s�dzia.size());
        this.s�dzia=s�dzia.get(los);
        s�dzia.remove(los);
    }

    public S�dzia getS�dzia() {
        return s�dzia;
    }
}
