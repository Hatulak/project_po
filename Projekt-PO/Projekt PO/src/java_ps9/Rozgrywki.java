package java_ps9;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Rozgrywki {
    public LinkedList<Dru퓓na> dru퓓ny = new LinkedList<>();
    public Dyscyplina turniejSiatkowki,turniejDwa_Ognie,turniejLina;
    

    public void dodajDru퓓ne(Dru퓓na team){	
    	dru퓓ny.add(team);
    }

    public void wycofajDru퓓ne(Dru퓓na team){
        dru퓓ny.remove(team);
    }

    public LinkedList<Dru퓓na> getDru퓓ny() {
        return dru퓓ny;
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
