import java.io.*;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Andmed{
	protected String nimi;
	protected String positsioon;
	protected String vanus;
	protected String klubi;
	
	public void lisaLiige(){
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(klubi + ".txt", true)));
			out.println("Eesnimi: " + nimi);
			out.println("Positsioon: " + positsioon);
			out.println("Vanus: " + vanus);
			out.println("Klubi: " + klubi);
			System.out.println("Olete lisatud!");
			out.close();
		} catch(Exception ex) {
			System.out.println("\nLisamisel tekkis viga:" + ex + "\n");
		} 
	}
}