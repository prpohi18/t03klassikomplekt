import java.io.*;

public class Players{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Andmed mängija = new Andmed();
		
		//Mängija eesnime sisestus
		System.out.println("Sisesta mängija eesnimi: ");
		String FirstName = br.readLine();
		mängija.FirstName = FirstName;
		
		//Mängija perekonnanime sisestus
		System.out.println("Sisesta mängija perekonnanimi: ");
		String LastName = br.readLine();
		mängija.LastName = LastName;
		
		//Mängija positsiooni sisestus
		System.out.println("Sisesta mängija positsioon: ");
		String Position = br.readLine();
		mängija.Position = Position;
		
		//Mängija tiimi sisestus
		System.out.println("Sisesta mängija tiim: ");
		String Team = br.readLine();
		mängija.Team = Team;
		
		br.close();
		
		mängija.addData();
	}
}