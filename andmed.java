import java.io.*;

public class andmed{
	
	public static void main(String[] args) throws IOException{
		BufferedReader sisestus=new BufferedReader(new InputStreamReader(System.in));
	
		Korter korter1 = new Korter();
	
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

/* Sisestage eesnimi:
Mia
Sisestage perekonnanimi:
Tamm
Sisestage linn:
Tallinn
Sisestage tanav:
Akadeemia tee
Sisestage t2nava_nr:
5a
Sisestage korteri_nr:
79
Sisestage ruutmeetrid:
35.6
Sisestage korteri lisainfo:
Renoveeritud 2017 aastal
Tulemus on kirjas.

Korteri linn: Tallinn
Korteri tänav: Akadeemia tee
Korteri tänavanumber: 79
Korteri ruutmeetrid: 35.6
Korteri lisainfo: Renoveeritud 2017 aastal */
