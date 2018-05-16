import java.io.*;

public class Meeskond2 {

	protected String meeskonnanimi;
        protected String mangijanimi;
	protected String voidud;
	protected String kaotused;
    
	public void salvestaAndmed() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("mangijad/" + meeskonnanimi + " " + mangijanimi + ".txt"));

			pw.println("Sisesta meeskonnanimi: " + meeskonnanimi);
			pw.println("Sisesta mängijanimi: " + mangijanimi);
			pw.println("Võidud: " + voidud);
			pw.println("Kaotused: " + kaotused);
            System.out.println("Andmed salvestatud.\n");

            pw.close();
            
        } catch(Exception ex) {
            System.out.println("\nViga:" + ex + "\n");
        }
	}
}