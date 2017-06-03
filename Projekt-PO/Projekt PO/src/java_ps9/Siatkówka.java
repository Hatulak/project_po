package java_ps9;


import java.util.LinkedList;
import java.util.Random;

public class Siatk�wka extends Mecz {

    private LinkedList<S�dzia> s�dziowie = new LinkedList<>();

    public Siatk�wka(Dru�yna team1, Dru�yna team2, LinkedList<S�dzia> s�dziowie){

        super(team1, team2);

        Random random = new Random();

         int los;

         for(int i =0; i <3; i++){
             los = random.nextInt(s�dziowie.size());
             this.s�dziowie.add(s�dziowie.get(los));
             s�dziowie.remove(los);
         }



    }

    public LinkedList<S�dzia> getS�dziowie() {
        return s�dziowie;
    }
}
