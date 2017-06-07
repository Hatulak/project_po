package projekt;


import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Klasa łącząca wszystkie dyscypliny oraz drużyny
 */
public class Rozgrywki implements Serializable{
    public LinkedList<Druzyna> druzyny = new LinkedList<>();
    public Dyscyplina turniejSiatkowki = new Dyscyplina("Siatkowka");
    public Dyscyplina turniejDwa_Ognie = new Dyscyplina("Dwa_Ognie");
    public Dyscyplina turniejLina = new Dyscyplina("Przeciaganie_Liny");
    private static final long serialVersionUID = 070620172330L;
    

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
    public void setDruzyny(LinkedList<Druzyna> d){
        this.druzyny=d;
    }
    public void setTurniejDwa_Ognie(Dyscyplina td){
        this.turniejDwa_Ognie=td;
    }
    public void setTurniejSiatkowka(Dyscyplina ts){
        this.turniejSiatkowki=ts;
    }
    public void setTurniejPrzeciaganie_Liny(Dyscyplina tp){
        this.turniejLina=tp;
    }
    /**
     * metoda zapisuje stan rozgrywek do pliku rozgrywki.ser w folderze z projektem
     * @throws IOException 
     */
    public void zapis_stanu() throws IOException{
    	try{
            FileOutputStream plikOut= new FileOutputStream("rozgrywki.ser");
            ObjectOutputStream out = new ObjectOutputStream(plikOut);
            out.writeObject(getDruzyny());
            out.writeObject(getTurniejDwa_Ognie());
            out.writeObject(getTurniejLina());
            out.writeObject(getTurniejSiatkowki());
            out.close();
            plikOut.close();
    	} catch (IOException e){
    		e.printStackTrace();
    	}
    }
    /**
     * metoda odczytuje stan rozgrywek z pliku rozgrywki.ser w folderze z projektem
     * @throws IOException 
     */
    public void odczyt_stanu() throws IOException{
        try {
            FileInputStream plikIn = new FileInputStream("rozgrywki.ser");
            ObjectInputStream in = new ObjectInputStream(plikIn);
            druzyny = (LinkedList<Druzyna>) in.readObject();
            turniejDwa_Ognie = (Dyscyplina) in.readObject();
            turniejLina = (Dyscyplina) in.readObject();
            turniejSiatkowki = (Dyscyplina) in.readObject();
            in.close();
            plikIn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rozgrywki.class.getName()).log(Level.SEVERE, null, ex);
        }
 
 
    }
}
