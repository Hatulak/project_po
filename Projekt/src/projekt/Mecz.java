package projekt;


public abstract class Mecz {
    Druzyna team1, team2;
    Druzyna zwyciezca;


    public Druzyna getZwyciezca() {
        return zwyciezca;
    }

    public Druzyna getPrzegramy() {

        String nazwa_wygranego;
        Druzyna przegrany;
        nazwa_wygranego = this.getZwyciezca().getNazwa();

        if(  nazwa_wygranego.equals(team1.getNazwa())  ){
            przegrany = team2;
        }
        else{
            przegrany = team1;
        }

        return  przegrany;
    }

    public Mecz(Druzyna team1, Druzyna team2){
        this.team1 = team1;
        this.team2 = team2;
    }

    public void dodajWynik(Druzyna zwyciezca ){
        this.zwyciezca = zwyciezca;
    }

}
