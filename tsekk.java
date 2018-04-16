import java.io.*;
import java.time.LocalDateTime;

public class tsekk {
    
    //muutujad
	protected String nimi;
	protected String looma_nimi;
	protected String teenus;
	protected double hind;
    
	public void kirjutaTulemus() {
        try {
            //ava failikirjutaja
            PrintWriter pw = new PrintWriter(new FileWriter("Teenused/" + LocalDateTime.now() + " " + nimi + ".txt"));
            
            //kirjuta read
			pw.println("Omaniku nimi: " + nimi);
			pw.println("Looma nimi: " + looma_nimi);
			pw.println("Teenused:\n  " + teenus);
			pw.println("__________________________");
			pw.println("Kokku: " + hind + "€");
            System.out.println("Tulemus on kirjas.\n");
            
            //sulge failikirjutaja
            pw.close();
            
        } catch(Exception ex) {
            //anna teada veast
            System.out.println("\nViga:" + ex + "\n");
        }
	}
}