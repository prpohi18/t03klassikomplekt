import java.io.*;

public class Meeskonna_salvestamine {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		Meeskond2 nimetus = new Meeskond2();
        
		System.out.println("Sisesta meeskonnanimi:");
		String meeskonnanimi = br.readLine();
		nimetus.meeskonnanimi = meeskonnanimi;

		System.out.println("Sisesta mängijanimi:");
		String mangijanimi = br.readLine();
		nimetus.mangijanimi = mangijanimi;

		System.out.println("Sisesta võidud:");
		String voidud = br.readLine();
		nimetus.voidud = voidud;

		System.out.println("Sisesta kaotused:");
		String kaotused = br.readLine();
		nimetus.kaotused = kaotused;
 
        if (meeskonnanimi.equals("") || mangijanimi.equals("") || voidud.equals("") || kaotused.equals("")) {
            
            System.out.println("Tühi väli.");
            
        } else {

            br.close();

            nimetus.salvestaAndmed();
        }
	}
}

/*Sisesta meeskonnanimi:
Barcelona
Sisesta mängijanimi:
Messi
Sisesta võidud:
10
Sisesta kaotused:
1
Andmed salvestatud.*/