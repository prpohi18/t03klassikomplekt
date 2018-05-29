import java.io.*;
import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) throws IOException{
		String nimi;
		String hotell;
		String hinne;
		String kommentaar;
		
		
		Hotellid hotell1 = new Hotellid(); 
		Scanner input = new Scanner (System.in);
		System.out.println("Sisestage enda nimi: ");
		hotell1.nimi = input.nextLine();
		System.out.println("Sisesta hotelli nimi: ");
		hotell1.hotell = input.nextLine();
		System.out.println("Sisesta teeninduse hinne:(1-5) ");
		hotell1.hinne = input.nextInt();
		input.nextLine();
		System.out.println("Sisesta hotelli kommentaar: ");
		hotell1.kommentaar = input.nextLine();
		input.close();
		hotell1.hotellidFaili();
	}
	
}