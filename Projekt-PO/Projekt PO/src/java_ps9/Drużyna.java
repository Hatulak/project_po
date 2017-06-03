package java_ps9;


import java.util.LinkedList;

public class Dru¿yna {
    private String nazwa;
    private LinkedList<Zawodnik> zawodnicy = new LinkedList<>();

    public void dodajZawodnika(Zawodnik gracz){
        zawodnicy.add(gracz);
    }

    public LinkedList<Zawodnik> getZawodnicy(){
        return zawodnicy;
    }

    public String getNazwa() {
        return nazwa;
    }
    
    public void setNazwa(String nazwa){
    	this.nazwa = nazwa;
    }
    
}
