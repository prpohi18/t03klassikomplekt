package Teenused;

import Teenused.arve;
import java.io.*;
public class autopesula_teenused {
    public static void main(String[] args)throws IOException {
        String teenus = null;
        double hind = 0;
        double koguhind = 0;
        int end = 1;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        arve andmed = new arve();
        
        //Looma omanniku nimi
        System.out.println("Sisesta kliendi nime");
	String nimi = br.readLine();
	andmed.nimi = nimi;
        
        //Looma nimi
	System.out.println("Sisesta auto mudel");
	String mudel = br.readLine();
	andmed.mudel = mudel;
        
        while( end == 1 ){
			//Sisesta tehtud teenus
			System.out.println("Sisesta teenus:");
			if (teenus == null){
				teenus = br.readLine();
				//Sisesta teenuse hind
				System.out.println("Sisesta teenuse hind:");
				hind = Double.parseDouble(br.readLine());
				teenus = teenus + " " + hind + "€ \n";
				andmed.teenus = teenus;
				andmed.hind = hind;
			}
			else{
				teenus = teenus + br.readLine();
				System.out.println("Sisesta teenuse hind:");
				koguhind = Double.parseDouble(br.readLine());
				teenus = teenus + " " + koguhind + "€ \n";
				hind = hind + koguhind;
				andmed.teenus = teenus;
				andmed.hind = hind;
			}
			System.out.println("1 - veel, 0 - lopeta");
			end = Integer.parseInt(br.readLine());
			
                    }
        
                   //komtrolli, ega muutujad tühjad ei ole
                    if (nimi.equals("") || mudel.equals("") || teenus.equals("") || String.valueOf(hind).equals("")) {           
                        System.out.println("\nViga: tühi väli.\n"); 
                        return;
                    } else {
                        //sulge input stream
                        br.close();

                        //kutsu meetodit, kus tulemus kirja pannakse
                        andmed.kirjutaTulemus();
    }
    }
}
