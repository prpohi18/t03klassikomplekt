import java.io.*;

public class olympia {
    
    //muutujad
	protected String eesnimi;
	protected String perenimi;
	protected String spordiala;
	protected String tulemus;
    
	public void kirjutaTulemus() {
        try {
            //ava failikirjutaja
            PrintWriter pw = new PrintWriter(new FileWriter("voistlejad/" + eesnimi + " " + perenimi + ".txt"));
            
            //kirjuta read
			pw.println("EESNIMI: " + eesnimi);
			pw.println("PERENIMI: " + perenimi);
			pw.println("SPORDIALA: " + spordiala);
			pw.println("TULEMUS: " + tulemus);
            System.out.println("Tulemus on kirjas.\n");
            
            //sulge failikirjutaja
            pw.close();
            
        } catch(Exception ex) {
            //anna teada veast
            System.out.println("\nViga:" + ex + "\n");
        }
	}
}