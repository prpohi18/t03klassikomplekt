import java.io.*;

public class Proov1 {
	public static void main(String[] args) throws IOException {

        //tekita uus input stream
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //loo uus võistleja
		opilased opilane = new opilased();

        //anna võistllejale eesnimi väli
		System.out.println("Sisesta õpilase eesnimi:");
		String eesnimi = br.readLine();
		voistleja.eesnimi = eesnimi;

        //anna võistlejale perenimi väli
		System.out.println("Sisesta õpilase perekonnanimi:");
		String perenimi = br.readLine();
		voistleja.perenimi = perekonnanimi;

        //anna võistlejale spordiala väli
		System.out.println("Sisesta klass:");
		String spordiala = br.readLine();
		voistleja.spordiala = spordiala;

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
