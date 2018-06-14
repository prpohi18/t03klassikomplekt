import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class meeskond{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Andmed tiim = new Andmed();
		System.out.println("Tere, kasutaja! Siia saad sisestada oma perekonna.");
		
		System.out.println("Sisesta nimi: ");
		String nimi = br.readLine();
		tiim.nimi = nimi;
		
		System.out.println("Sisesta positsioon: ");
		String positsioon = br.readLine();
		tiim.positsioon = positsioon;
		
		System.out.println("Sisesta vanus: ");
		String vanus = br.readLine();
		tiim.vanus = vanus;
		
		System.out.println("Sisesta klubi: ");
		String klubi = br.readLine();
		tiim.klubi = klubi;
		
		br.close();
		
		tiim.lisaLiige();
	}
}