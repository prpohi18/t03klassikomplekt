import java.io.*;

public class garaaz{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		autod auto = new autod();
		
		System.out.println("Sisesta auto parkimiskoha nr: ");
		auto.parkimiskoht = Integer.parseInt(br.readLine());
		
		System.out.println("Sisesta auto mudel: ");
		auto.mudel = br.readLine();
		
		System.out.println("Sisesta auto omaniku nimi: ");
		auto.omanik = br.readLine();
		
		br.close();
		
		auto.writer();
		
		koguGaraaz a = new koguGaraaz();
		
		a.garageWriter(auto.parkimiskoht, auto.mudel, auto.omanik);
	}
	
	
}