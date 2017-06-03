package projekt;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Rozgrywki {
    public LinkedList<Druzyna> druzyny = new LinkedList<>();
    public Dyscyplina turniejSiatkowki = new Dyscyplina("Siatkowka");
    public Dyscyplina turniejDwa_Ognie = new Dyscyplina("Dwa_Ognie");
    public Dyscyplina turniejLina = new Dyscyplina("Przeciaganie_Liny");
    

    public void dodajDruzyne(Druzyna team){	
    	druzyny.add(team);
    }

    public void wycofajDruzyne(Druzyna team){
        druzyny.remove(team);
    }

    public LinkedList<Druzyna> getDruzyny() {
        return druzyny;
    }
    public Dyscyplina getTurniejSiatkowki(){
    	return turniejSiatkowki;
    }
    public Dyscyplina getTurniejDwa_Ognie(){
    	return turniejDwa_Ognie;
    }
    public Dyscyplina getTurniejLina(){
    	return turniejLina;
    }
    public void zapis_stanu(String nazwa_pliku) throws IOException{
    	try{
    		ObjectOutputStream zp = new ObjectOutputStream(new FileOutputStream("a"));
    	    zp.writeObject(turniejDwa_Ognie);
    	    zp.close();
    	    ObjectOutputStream z = new ObjectOutputStream(new FileOutputStream("b"));
    	    zp.writeObject(turniejSiatkowki);
    	    zp.close();
    	    ObjectOutputStream zf = new ObjectOutputStream(new FileOutputStream("c"));
    	    zp.writeObject(turniejLina);
    	    zp.close();
    	} catch (IOException e){
    		e.printStackTrace();
    	}
    }
}
