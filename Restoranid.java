import java.io.*;
import java.io.PrintWriter;
public class Restoranid{
	protected String restoran;
	protected int hinne;
	protected String kommentaar;
	protected String nimi;
		
	public void restoranidFaili() {
					
		try{
			PrintWriter pw = new PrintWriter(restoran + ".txt");
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
		