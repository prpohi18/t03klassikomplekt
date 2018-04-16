import java.io.*;

public class kodulooma_teenus {
	public static void main(String[] args) throws IOException {
        String teenus = null;
		double hind = 0;
		double hetkehind = 0;
		int end = 1;
        //tekita uus input stream
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //loo uus tsek
		tsekk andmed = new tsekk();
        
        //Looma omanniku nimi
		System.out.println("Sisesta looma omaniku ees- ja prerkonna nimi:");
		String nimi = br.readLine();
		andmed.nimi = nimi;
        
        //Looma nimi
		System.out.println("Sisesta looma nimi:");
		String looma_nimi = br.readLine();
		andmed.looma_nimi = looma_nimi;
        
		while( end == 1 ){
			//Sisesta tehtud teenus
			System.out.println("Sisesta teenus:");
			if (teenus == null){
				teenus = br.readLine();
				//Sisesta teenuse hind
				System.out.println("Sisesta hind teenuse hind:");
				hind = Double.parseDouble(br.readLine());
				teenus = teenus + " " + hind + "€\n";
				andmed.teenus = teenus;
				andmed.hind = hind;
			}
			else{
				teenus = teenus + br.readLine();
				System.out.println("Sisesta hind teenuse hind:");
				hetkehind = Double.parseDouble(br.readLine());
				teenus = teenus + " " + hetkehind + "€\n";
				hind = hind + hetkehind;
				andmed.teenus = teenus;
				andmed.hind = hind;
			}
			System.out.println("1 - veel, 0 - lopeta");
			end = Integer.parseInt(br.readLine());
			
		}

        
        //komtrolli, ega muutujad tühjad ei ole
        if (nimi.equals("") || looma_nimi.equals("") || teenus.equals("") || String.valueOf(hind).equals("")) {
            
            System.out.println("\nViga: tühi väli.\n"); 
            return;
            
        } else {

            //sulge input stream
            br.close();

            //kutsu meetodit, kus tulemus kirja pannakse
            andmed.kirjutaTulemus();
        }
	}
}

/*
Omaniku nimi: Konstantin Blinkov
Looma nimi: Sirena
Teenused:
  Masaaz 15.5€
Pesu vann 8.0€
Kuivatamine 3.0€

__________________________
Kokku: 26.5€
*/