package projekt;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;


/**
 * Klasa łącząca wszystkie dyscypliny oraz drużyny
 */
public class Rozgrywki {
    public LinkedList<Druzyna> druzyny = new LinkedList<>();
    public Dyscyplina turniejSiatkowki = new Dyscyplina("Siatkowka");
    public Dyscyplina turniejDwa_Ognie = new Dyscyplina("Dwa_Ognie");
    public Dyscyplina turniejLina = new Dyscyplina("Przeciaganie_Liny");
    

    /**
     * metoda dodaje drużynę na listę drużyn biorących udział w rozgrywkach
     * @param team      drużyna dodawana do listy
     */
    public void dodajDruzyne(Druzyna team){	
    	druzyny.add(team);
    }

    /**
     * metoda usuwa drużyne z listy drużyn biorących udział w rozgrywkach
     * @param nazwa     nazwa drużyny krórą chcemy wycofać
     */
    public void wycofajDruzyne(String nazwa){
        int index =0;
        for (Druzyna druzyna : druzyny) {
            if(nazwa.matches(druzyna.getNazwa())){
                this.druzyny.remove(index);
                return;
            }
            index++;
        }
    }

    /**
     * metoda pobiera listę drużyn biorących udział w rozgrywkach
     * @return zwraca listę drużyn
     */
    public LinkedList<Druzyna> getDruzyny() {
        return druzyny;
    }
    
    /**
     * metoda pobiera turniej siatkówki
     * @return zwraca turniej siatkówki
     */
    public Dyscyplina getTurniejSiatkowki(){
    	return turniejSiatkowki;
    }
    
    /**
     * metoda pobiera turniej dwu ogni
     * @return zwraca turniej dwu ogni
     */
    public Dyscyplina getTurniejDwa_Ognie(){
    	return turniejDwa_Ognie;
    }
    
    /**
     * metoda pobiera turniej przeciągania liny
     * @return zwraca turniej przeciągania liny
     */
    public Dyscyplina getTurniejLina(){
    	return turniejLina;
    }
    
    /**
     * metoda zapisuje stan rozgrywek do pliku
     * @param nazwa_pliku nazwa pliku do którego chcemy zapisać
     * @throws IOException 
     */
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
