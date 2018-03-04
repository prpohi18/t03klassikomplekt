import java.io.*;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Andmed{
	protected String eesnimi;
	protected String perenimi;
	protected String sugu;
	protected String vanus;
	
	public void lisaPere(){
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(vanus + ".txt", true)));
			out.println("Eesnimi: " + eesnimi);
			out.println("Perenimi: " + perenimi);
			out.println("Sugu: " + sugu);
			out.println("Vanus: " + vanus);
			System.out.println("Pereliige on lisatud!");
			out.close();
		} catch(Exception ex) {
			System.out.println("\nPereliikme lisamisel tekkis viga:" + ex + "\n");
		} 
	}
}