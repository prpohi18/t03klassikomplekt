package kliendid;

import java.io.*;

public class andmed{
	
	public static void main(String[] args) throws IOException{
		BufferedReader sisestus=new BufferedReader(new InputStreamReader(System.in));
	
		Klient klient1 = new Klient();
		
	//protected String eesnimi;
	//protected String perenimi;
	//protected String sugu;
	//protected String vanus;
	
			System.out.println("Sisestage eesnimi: ");
			String eesnimi=sisestus.readLine();
			klient1.eesnimi=eesnimi;
	
			System.out.println("Sisestage perekonnanimi: ");
			String perenimi=sisestus.readLine();
			klient1.perenimi=perenimi;
	
			System.out.println("Sisestage sugu: ");
			String sugu=sisestus.readLine();
			klient1.sugu=sugu;
	
			System.out.println("Sisestage vanus: ");
			String vanus=sisestus.readLine();
			klient1.vanus=vanus;
	
			
	//protected String eesnimi;
	//protected String perenimi;
	//protected String sugu;
	//protected String vanus;
	
		try {
			
			PrintWriter pw = new PrintWriter(new FileWriter("andmed/" + klient1.eesnimi + " " + klient1.perenimi + ".txt"));
				pw.println("Kliendi eesnimi: "+klient1.eesnimi);
				pw.println("Kliendi vanus: " +klient1.vanus);
				
				
			System.out.println("Tulemus on kirjas.\n");
			System.out.println("Kliendi eesnimi: "+klient1.eesnimi);
			System.out.println("Kliendi tänav: "+klient1.vanus);
			
			
			
			pw.close();
			
		} catch(Exception ex){
			System.out.println("\nViga: " + ex + "\n");
		}
	
	}	
}