package Teenused;

import java.io.*;
import java.time.LocalDateTime;
public class arve {
	protected String nimi;
	protected String mudel;
	protected String teenus;
	protected double hind;
    
	public void kirjutaTulemus() {
            try {
                //ava failikirjutaja
                PrintWriter pw = new PrintWriter(new FileWriter("D:\\kodune3\\Tellimus.txt", false));

                //kirjuta read
                pw.println("nimi " + nimi);
                pw.println("mudel " + mudel);
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
