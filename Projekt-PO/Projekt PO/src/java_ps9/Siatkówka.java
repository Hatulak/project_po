package java_ps9;


import java.util.LinkedList;
import java.util.Random;

public class Siatkówka extends Mecz {

    private LinkedList<Sêdzia> sêdziowie = new LinkedList<>();

    public Siatkówka(Dru¿yna team1, Dru¿yna team2, LinkedList<Sêdzia> sêdziowie){

        super(team1, team2);

        Random random = new Random();

         int los;

         for(int i =0; i <3; i++){
             los = random.nextInt(sêdziowie.size());
             this.sêdziowie.add(sêdziowie.get(los));
             sêdziowie.remove(los);
         }



    }

    public LinkedList<Sêdzia> getSêdziowie() {
        return sêdziowie;
    }
}
