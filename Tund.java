import java.io.*;

public class opilased {

    //muutujad
  protected String kuup2ev;
  protected String ainenimi;
	protected String eesnimi;
	protected String perekonnanimi;
	protected String klass;

	public void kirjutaTulemus() {
        try {
            //ava failikirjutaja
            PrintWriter pw = new PrintWriter(new FileWriter(kuup2ev + "_" + ainekood + ".txt"));

            //kirjuta read //tsükkel
      			pw.println("Eesnimi: " + eesnimi);
      			pw.println("Perekonnanimi: " + perekonnanimi);
      			pw.println("Rühm: " + klass);
            System.out.println("Tudengid/õpilased on kirjas.\n");

            //sulge failikirjutaja
            pw.close();

        } catch(Exception ex) {
            //anna teada veast
            System.out.println("\nViga:" + ex + "\n");
        }
	}
}
