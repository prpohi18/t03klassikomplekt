//package t03klassikomplekt;

public class Funktsioonid {
    
    String nimi = "";
    double hinne;
    int EAPd;
    
    void lisaNimi(String uusNimi) {
        nimi = uusNimi;
    }
    void muudaHinne(double uusHinne) {
        hinne = uusHinne;
    }
    void EAPmaht(int uusMaht) {
        EAPd = uusMaht;
    }
    void valjasta() {
        System.out.println("Aine: "+nimi+", Hinne: "+hinne+", EAP maht: "+EAPd);
    }
}

/*
Aine: Matemaatika, Hinne: 5.0, EAP maht: 4
Aine: Vene keel, Hinne: 3.0, EAP maht: 3
*/