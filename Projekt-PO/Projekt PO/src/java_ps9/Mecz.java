package java_ps9;


public abstract class Mecz {
    Dru�yna team1, team2;
    Dru�yna zwyciezca;


    public Dru�yna getZwyciezca() {
        return zwyciezca;
    }

    public Dru�yna getPrzegramy() {

        String nazwa_wygranego;
        Dru�yna przegrany;
        nazwa_wygranego = this.getZwyciezca().getNazwa();

        if(  nazwa_wygranego.equals(team1.getNazwa())  ){
            przegrany = team2;
        }
        else{
            przegrany = team1;
        }

        return  przegrany;
    }

    public Mecz(Dru�yna team1, Dru�yna team2){
        this.team1 = team1;
        this.team2 = team2;
    }

    public void dodajWynik(Dru�yna zwyciezca ){
        this.zwyciezca = zwyciezca;
    }

}
