import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;

public class Paevaplaan {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PlaaniLoomine plaan = new PlaaniLoomine();
		
		System.out.println("Sisesta tegevus ");
		String tegevus = br.readLine();
		plaan.tegevus = tegevus;
		System.out.println("Sisesta alguskellaaeg ");
		String algus = br.readLine();
		plaan.algus = algus;
		System.out.println("Sisesta lõpukellaaeg ");
		String lopp = br.readLine();
		plaan.lopp = lopp;
		System.out.println("Sisesta kategooria ");
		String kategooria = br.readLine();
		plaan.kategooria = kategooria;

        br.close();
        plaan.looPlaan();
	}
}