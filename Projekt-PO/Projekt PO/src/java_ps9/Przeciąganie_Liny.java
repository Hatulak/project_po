package java_ps9;


import java.util.LinkedList;
import java.util.Random;

public class Przeci¹ganie_Liny extends Mecz {

    private Sêdzia sêdzia;

    public Przeci¹ganie_Liny(Dru¿yna team1, Dru¿yna team2, LinkedList<Sêdzia> sêdzia){

        super(team1, team2);
        Random random = new Random();
        int los = random.nextInt(sêdzia.size());
        this.sêdzia=sêdzia.get(los);
        sêdzia.remove(los);
    }

    public Sêdzia getSêdzia() {
        return sêdzia;
    }
}
