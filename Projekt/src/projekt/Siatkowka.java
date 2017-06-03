package projekt;


import java.util.LinkedList;
import java.util.Random;

public class Siatkowka extends Mecz {

    private LinkedList<Sedzia> sedziowie = new LinkedList<>();

    public Siatkowka(Druzyna team1, Druzyna team2, LinkedList<Sedzia> sedziowie){

        super(team1, team2);

        Random random = new Random();

         int los;

         for(int i =0; i <3; i++){
             los = random.nextInt(sedziowie.size());
             this.sedziowie.add(sedziowie.get(los));
             sedziowie.remove(los);
         }



    }

    public LinkedList<Sedzia> getSedziowie() {
        return sedziowie;
    }
}
