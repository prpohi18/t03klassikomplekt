import java.io.*;


public class korvpallur{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		andmed1 m2ngija = new andmed1();
		
		//saab sisestada mängija eesnime, perenimi, positsiooni ja meeskonna ja kahe viimase mängu punktide arvu
		
		System.out.println("Sisesta mängija eesnimi: ");
		String FirstName = br.readLine();
		m2ngija.FirstName = FirstName;
		
		System.out.println("Sisesta mängija perekonnanimi: ");
		String LastName = br.readLine();
		m2ngija.LastName = LastName;
		
		System.out.println("Sisesta mängija meeskond: ");
		String Team = br.readLine();
		m2ngija.Team = Team;
		
		System.out.println("Sisesta mängija number: ");
		String Number = br.readLine();
		m2ngija.Number = Number;
		
		System.out.println("Sisesta mängija viimases mängus visatud punktide arv: ");
		String LastGame = br.readLine();
		m2ngija.LastGame = LastGame;
		
		System.out.println("Sisesta mängija eelviimases mängus visatud punktide arv: ");
		String SecondGame= br.readLine();
		m2ngija.SecondGame = SecondGame;

		
		br.close();
		
		m2ngija.addData();
		
	}
}	
