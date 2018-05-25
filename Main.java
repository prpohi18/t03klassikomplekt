import java.io.*;
import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) throws IOException{
		String restoran;
		String hinne;
		String kommentaar;
		String nimi;
		
		Restoranid restoran1 = new Restoranid(); 
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Sisestage enda nimi: ");
		restoran1.nimi = input.nextLine();
		System.out.println("Sisesta restorani nimi: ");
		restoran1.restoran = input.nextLine();
		
		System.out.println("Sisesta restorani hinne:(1-5) ");
		restoran1.hinne = input.nextInt();
		
		input.nextLine();
		System.out.println("Sisesta restorani kommentaar: ");
		restoran1.kommentaar = input.nextLine();
		
		input.close();
		restoran1.restoranidFaili();
	}
	
}
		