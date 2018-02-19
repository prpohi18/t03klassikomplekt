import java.io.*;

public class olympia_input {
	public static void main(String[] args) throws IOException {
        
        //tekita uus input stream
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //loo uus võistleja
		olympia voistleja = new olympia();
        
        //anna võistllejale eesnimi väli
		System.out.println("Sisesta võistleja eesnimi:");
		String eesnimi = br.readLine();
		voistleja.eesnimi = eesnimi;
        
        //anna võistlejale perenimi väli
		System.out.println("Sisesta võistleja perekonnanimi:");
		String perenimi = br.readLine();
		voistleja.perenimi = perenimi;
        
        //anna võistlejale spordiala väli
		System.out.println("Sisesta võistleja spordiala:");
		String spordiala = br.readLine();
		voistleja.spordiala = spordiala;
        
        //anna võistlejale tulemuse väli
		System.out.println("Sisesta võistleja tulemus:");
		String tulemus = br.readLine();
		voistleja.tulemus = tulemus;
        
        //komtrolli, ega väljad tühjad ei ole
        if (eesnimi.equals("") || perenimi.equals("") || spordiala.equals("") || tulemus.equals("")) {
            
            System.out.println("\nViga: tühi väli.\n");
            return;
            
        } else {

            //sulge input stream
            br.close();

            //kutsu meetodit, kus tulemus kirja pannakse
            voistleja.kirjutaTulemus();
        }
	}
}

/*

>java olympia_input
>Sisesta võistleja eesnimi:
Usain
>Sisesta võistleja perekonnanimi:
Bolt
>Sisesta võistleja spordiala:
100m jooks
>Sisesta võistleja tulemus:
9.71s
>Tulemus on kirjas.


>Usain Bolt.txt
EESNIMI: Usain
PERENIMI: Bolt
SPORDIALA: 100m jooks
TULEMUS: 9.71s

*/