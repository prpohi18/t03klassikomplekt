import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Players mangija = new Players();

		System.out.println("Sisesta mängija eesnimi: ");
		mangija.eesnimi = br.readLine();

		System.out.println("Sisesta mängija perekonnanimi: ");
		mangija.perekonnanimi = br.readLine();
		
		System.out.println("Sisesta mängija number: ");
		mangija.number = Integer.parseInt(br.readLine());

		System.out.println("Sisesta mängija meeskond: ");
		mangija.meeskond = br.readLine();

		br.close();

		mangija.mangijadFaili();
		Teams t = new Teams();
		//t.kasOlemas(mangija.meeskond);
		System.out.println(t.kasOlemas(mangija.meeskond));
		t.lisaMeeskonda(mangija.eesnimi, mangija.perekonnanimi, mangija.number, mangija.meeskond);
	}
}