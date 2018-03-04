import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class perekond{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Andmed pereliige = new Andmed();
		System.out.println("Tere, kasutaja! Siia saad sisestada oma perekonna.");
		
		System.out.println("Sisesta eesnimi: ");
		String eesnimi = br.readLine();
		pereliige.eesnimi = eesnimi;
		
		System.out.println("Sisesta perenimi: ");
		String perenimi = br.readLine();
		pereliige.perenimi = perenimi;
		
		System.out.println("Sisesta sugu: ");
		String sugu = br.readLine();
		pereliige.sugu = sugu;
		
		System.out.println("Sisesta vanus: ");
		String vanus = br.readLine();
		pereliige.vanus = vanus;
		
		br.close();
		
		pereliige.lisaPere();
	}
}