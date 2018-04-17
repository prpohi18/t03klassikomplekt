package Kodutöö;

import java.io.*;

public class KorterAndmed{
	
	public static void main(String[] args) throws IOException{
		BufferedReader sisestus=new BufferedReader(new InputStreamReader(System.in));
	
		Algus korter1 = new Algus();
	
			System.out.println("Sisestage eesnimi: ");
			String eesnimi=sisestus.readLine();
			korter1.eesnimi=eesnimi;
	
			System.out.println("Sisestage perekonnanimi: ");
			String perekonnanimi=sisestus.readLine();
			korter1.perekonnanimi=perekonnanimi;
	
			System.out.println("Sisestage linn: ");
			String linn=sisestus.readLine();
			korter1.linn=linn;
	
			System.out.println("Sisestage tanav: ");
			String t2nav=sisestus.readLine();
			korter1.t2nav=t2nav;
	
			System.out.println("Sisestage t2nava_nr: ");
			String t2nava_nr=sisestus.readLine();
			korter1.t2nava_nr=t2nava_nr;
	
			System.out.println("Sisestage korteri_nr: ");
			String Korteri_nr=sisestus.readLine();
			int korteri_nr=Integer.parseInt(Korteri_nr);
			korter1.korteri_nr=korteri_nr;
	
			System.out.println("Sisestage ruutmeetrid: ");
			String Ruutmeetrid=sisestus.readLine();
			float ruutmeetrid=Float.parseFloat(Ruutmeetrid);
			korter1.ruutmeetrid=ruutmeetrid;
	
			System.out.println("Sisestage korteri lisainfo: ");
			String lisainfo=sisestus.readLine();
			korter1.lisainfo=lisainfo;
	
	
		try {
			
			PrintWriter pw = new PrintWriter(new FileWriter("muugiks/" + korter1.eesnimi + " " + korter1.perekonnanimi + ".txt"));
				pw.println("Korteri linn: "+korter1.linn);
				pw.println("Korteri tänav: " +korter1.t2nav);
				pw.println("Korteri tänavanumber:" +korter1.korteri_nr);
				pw.println("Korteri ruutmeetrid: " +korter1.ruutmeetrid);
				pw.println("Korteri lisainfo: " +lisainfo);
				
			System.out.println("Tulemus on kirjas.\n");
			System.out.println("Korteri linn: "+korter1.linn);
			System.out.println("Korteri tänav: "+korter1.t2nav);
			System.out.println("Korteri tänavanumber: "+korter1.korteri_nr);
			System.out.println("Korteri ruutmeetrid: "+korter1.ruutmeetrid);
			System.out.println("Korteri lisainfo: "+lisainfo);
			
			pw.close();
			
		} catch(Exception ex){
			System.out.println("\nViga: " + ex + "\n");
		}
	
	}	
}

/*
Korteri linn: Pärnu
Korteri tänav: Paikuse
Korteri tänavanumber: 1
Korteri ruutmeetrid: 1200
Korteri lisainfo: Elama asutud kuskil 2006 */
