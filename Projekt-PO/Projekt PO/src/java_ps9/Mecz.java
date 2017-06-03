package java_ps9;


public abstract class Mecz {
    Dru퓓na team1, team2;
    Dru퓓na zwyciezca;


    public Dru퓓na getZwyciezca() {
        return zwyciezca;
    }

    public Dru퓓na getPrzegramy() {

        String nazwa_wygranego;
        Dru퓓na przegrany;
        nazwa_wygranego = this.getZwyciezca().getNazwa();

        if(  nazwa_wygranego.equals(team1.getNazwa())  ){
            przegrany = team2;
        }
        else{
            przegrany = team1;
        }

        return  przegrany;
    }

    public Mecz(Dru퓓na team1, Dru퓓na team2){
        this.team1 = team1;
        this.team2 = team2;
    }

    public void dodajWynik(Dru퓓na zwyciezca ){
        this.zwyciezca = zwyciezca;
    }

}
