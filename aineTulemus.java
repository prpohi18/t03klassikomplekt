import java.io.*;
//package t03klassikomplekt;

public class aineTulemus {
	public static void main(String[] args) {
        
        Funktsioonid aine1 = new Funktsioonid();
        Funktsioonid aine2 = new Funktsioonid();
        
        aine1.lisaNimi("Matemaatika");
        aine1.muudaHinne(5);
        aine1.EAPmaht(4);
        aine1.valjasta();
        
        aine2.lisaNimi("Vene keel");
        aine2.muudaHinne(3);
        aine2.EAPmaht(3);
        aine2.valjasta();
    }
    
}