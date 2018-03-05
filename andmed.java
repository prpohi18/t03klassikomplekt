import java.io.*;

public class andmed{
	
	public static void main(String[] args) throws IOException{
		BufferedReader sisestus=new BufferedReader(new InputStreamReader(System.in));
	
		Tootaja tootaja1 = new Tootaja();
	
			System.out.println("Sisestage töötaja eesnimi: ");
			String eesnimi=sisestus.readLine();
			tootaja1.eesnimi=eesnimi;
	
			System.out.println("Sisestage töötaja perekonnanimi: ");
			String perekonnanimi=sisestus.readLine();
			tootaja1.perekonnanimi=perekonnanimi;
	
			System.out.println("Sisestage kodakondsus: ");
			String kodakondsus=sisestus.readLine();
			tootaja1.kodakondsus=kodakondsus;
	
			System.out.println("Sisestage elukoht: ");
			String elukoht=sisestus.readLine();
			tootaja1.elukoht=elukoht;
	
			System.out.println("Sisestage isikukood: ");
			String Isikukood=sisestus.readLine();
			int isikukood=Integer.parseInt(Isikukood);
			tootaja1.isikukood=isikukood;
	
			System.out.println("Sisestage tootaja_nr: ");
			String Tootaja_nr=sisestus.readLine();
			int tootaja_nr=Integer.parseInt(Tootaja_nr);
			tootaja1.tootaja_nr=tootaja_nr;
	
			System.out.println("Sisestage palk: ");
			String Palk=sisestus.readLine();
			float palk=Float.parseFloat(Palk);
			tootaja1.palk=palk;
	
			System.out.println("Sisestage töötaja lisainfo: ");
			String lisainfo=sisestus.readLine();
			tootaja1.lisainfo=lisainfo;
	
	
		try {
			
			PrintWriter pw = new PrintWriter(new FileWriter(tootaja1.eesnimi + " " + tootaja1.perekonnanimi + ".txt"));
				pw.println("Töötaja kodakondsus: "+tootaja1.kodakondsus);
				pw.println("Töötaja elukoht: " +tootaja1.elukoht);
				pw.println("Isikukood: " +tootaja1.isikukood);
				pw.println("Töötaja number:" +tootaja1.tootaja_nr);
				pw.println("Töötaja palk: " +tootaja1.palk);
				pw.println("Töötaja lisainfo: " +lisainfo);
				
			System.out.println("Tulemus on kirjas.\n");
			System.out.println("Töötaja kodakondsus: "+tootaja1.kodakondsus);
			System.out.println("Töötaja tänav: "+tootaja1.elukoht);
			System.out.println("Isikukood: "+tootaja1.isikukood);
			System.out.println("Töötaja tänavanumber: "+tootaja1.tootaja_nr);
			System.out.println("Töötaja palk: "+tootaja1.palk);
			System.out.println("Töötaja lisainfo: "+lisainfo);
			
			pw.close();
			
		} catch(Exception ex){
			System.out.println("\nViga: " + ex + "\n");
		}
	
	}	
}
/*

Sisestage töötaja eesnimi:
Peeter
Sisestage töötaja perekonnanimi:
Pakiraam
Sisestage kodakondsus:
eestlane
Sisestage elukoht:
Tallinn
Sisestage isikukood:
39402040654
Sisestage tootaja_nr:
771
Sisestage palk:
1200
Sisestage töötaja lisainfo:
Maaler, tingimisi vangistus
Tulemus on kirjas.

Töötaja kodakondsus: eestlane
Töötaja tänav: Tallinn
Isikukood: 39402040654
Töötaja tänavanumber: 771
Töötaja palk: 1200.0
Töötaja lisainfo: Maaler, tingimisi vangistus

*/