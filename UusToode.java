class Toode {
    
    String nimi = "Sülearvuti";
    double hind = 1000;
    int tk = 10;
    
    void muudaNime(String uusNimi) {
        nimi = uusNimi;
    }
    void muudaHinda(double uusHind) {
        hind = uusHind;
    }
    void muudaTk(int uusTk) {
        tk = uusTk;
    }
    void printChanges() {
        System.out.println("Toode: "+nimi+", Hind: "+hind+"€"+", Laos: "+tk+"tk.");
    }
}

public class UusToode {
	public static void main(String[] args) {
        
        Toode toode1 = new Toode();
        Toode toode2 = new Toode();
        
        toode1.muudaNime("Hiirematt");
        toode1.muudaHinda(10);
        toode1.muudaTk(50);
        toode1.printChanges();
        
        toode2.muudaNime("Hiir");
        toode2.muudaHinda(30);
        toode2.muudaTk(10);
        toode2.printChanges();
    }
    
}

//Toode: Hiirematt, Hind: 10.0€, Laos: 50tk.
//Toode: Hiir, Hind: 30.0€, Laos: 10tk.
