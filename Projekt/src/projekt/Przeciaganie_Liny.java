package projekt;


import java.util.LinkedList;
import java.util.Random;

public class Przeciaganie_Liny extends Mecz {

    private LinkedList<Sedzia> sedziowie = new LinkedList<>();

    public Przeciaganie_Liny(Druzyna team1, Druzyna team2, LinkedList<Sedzia> s){

        super(team1, team2);
        LinkedList<Sedzia> kopia = new LinkedList<>();
        for(int i=0; i< s.size(); i++){
            kopia.add(new Sedzia(s.get(i).getImie(), s.get(i).getNazwisko()));
        }

        Random random = new Random();

         int los;

         los = random.nextInt(kopia.size());
         this.sedziowie.add(kopia.get(los));
         kopia.remove(los);
    }

    public LinkedList<Sedzia> getSedzia() {
        return sedziowie;
    }
}
