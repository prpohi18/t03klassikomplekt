import java.io.*;


public class Keikka{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		KeikkaAndmed ka = new KeikkaAndmed();
		
		String Asukoht;
		String Kuup2ev;
		String Lamp;
		String Kogus;
		String Kommentaar;
		
		System.out.println("Keikka asukoht: ");
		Asukoht = br.readLine();
		ka.Asukoht = Asukoht;
		
		System.out.println("Keikka kuupäev: ");
		Kuup2ev = br.readLine();
		ka.Kuup2ev = Kuup2ev;

		System.out.println("Mis lampi vaja on: ");
		Lamp = br.readLine();
		ka.Lamp = Lamp;

		System.out.printf("Mitu %s vaja on: ", Lamp);
		Kogus = br.readLine();
		ka.Kogus = Kogus;

		System.out.println("Vajadusel lisa kommentaar, kui ei, jäta tühjaks: ");
		Kommentaar = br.readLine();
		if (Kommentaar != "" && !("".equals(Kommentaar))){
			ka.Kommentaar = Kommentaar;
		} else {
			Kommentaar = "Kommentaare pole!";
			ka.Kommentaar = Kommentaar;
		}
		
		System.out.println("Teie andmed on salvestatud!");
		br.close();
		ka.lisaAndmed();
		
	}
}	
