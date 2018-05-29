import java.io.*;
import java.io.PrintWriter;
public class Hotellid{
	protected String nimi;
	protected String hotell;
	protected int hinne;
	protected String kommentaar;
	
		
	public void hotellidFaili() {
					
		try{
			PrintWriter pw = new PrintWriter(hotell + ".txt");
			pw.println("Nimi: " + nimi);
			pw.println("Hinne: " + hinne);
			pw.println("Kommentaar: " + kommentaar);
			pw.close();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	
}