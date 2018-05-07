class Auto{
    String mark = "Automark";
    String kytus = "Bensiin";
    Double mootor = 2.2;
    Integer aasta = 1995;
    Integer hind = 10;

    void muudaMark(String uusMark){
        mark = uusMark;
    }
    void muudaKytus(String uusKytus){
        kytus = uusKytus;
    }
    void muudaMootor(Double uusMootor){
        mootor = uusMootor;
    }
    void muudaAasta(Integer uusAasta){
        aasta = uusAasta;
    }
    void muudaHind(Integer uusHind){
        hind = uusHind;
    }
    void prindiAndmed(){
        System.out.println("Auto "+mark+" andmed");
        System.out.println("Mootor: "+mootor);
        System.out.println("Kütus: "+kytus);
        System.out.println("Aasta: "+aasta);
        System.out.println("Hind: "+hind);
        System.out.println();
    }
}

public class Automyyk{
    public static void main (String[] args){
        Auto auto1 = new Auto();
        auto1.muudaMark("Toyota");
        auto1.muudaAasta(2000);
        auto1.muudaHind(500);
        auto1.muudaKytus("Diisel");
        auto1.muudaMootor(1.9);

        Auto auto2 = new Auto();
        auto2.muudaMark("BMW");
        auto2.muudaAasta(1990);
        auto2.muudaHind(300);
        auto2.muudaKytus("Bensiin");
        auto2.muudaMootor(2.0);

        auto1.prindiAndmed();
        auto2.prindiAndmed();
    }
}