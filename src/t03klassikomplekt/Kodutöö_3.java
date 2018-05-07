package t03klassikomplekt;

public class Toode {
    
    String nimi = "Continental SuveRehvid";
    double hind = 345;
    int tk = 40;
    
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

package t03klassikomplekt;

public class UusToode {
	public static void main(String[] args) {
        
        Toode toode1 = new Toode();
        Toode toode2 = new Toode();
        
        toode1.muudaNime("Summuti BMW E46 M65412");
        toode1.muudaHinda(550);
        toode1.muudaTk(50);
        toode1.printChanges();
        
        toode2.muudaNime("Spreyvärv Lilla Matt");
        toode2.muudaHinda(30);
        toode2.muudaTk(10);
        toode2.printChanges();
    }
    
}

/*
Toode: Summuti BMW E46 M65412, Hind: 550.0€, Laos: 50tk.
Toode: Spreyvärv Lilla Matt, Hind: 30.0€, Laos: 10tk.
*/