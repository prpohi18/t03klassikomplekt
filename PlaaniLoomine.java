import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlaaniLoomine{
	public String tegevus;
	public String algus;
	public String lopp;
	public String kategooria;

	public void looPlaan(){
		File fail = new File("");
		PrintWriter printWriter = null;
		
		try {
			printWriter = new PrintWriter (new FileWriter("Plaan.txt", true));
            printWriter.println (tegevus + " kestab " + algus + " - " + lopp + " ning on " + kategooria);
        } 
		catch (Exception ex) {
			Logger.getLogger(PlaaniLoomine.class.getName()).log(Level.SEVERE, null, ex);
        } 
        printWriter.close ();
	}
}