import java.io.*;
import java.time.LocalDateTime;

public class Parkla {

	protected String nrmark;
    
	public void salvestaAndmed() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("autod.txt"));
			//System.currentTimeMillis()+10800000;
			final long parkimise_algus = System.currentTimeMillis();
			final long parkimise_lopp = System.currentTimeMillis()+10800000;
			//SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");    
			//Date p_algus = new Date(parkimise_algus);
			//Date p_lopp = new Date(parkimise_lopp);
			System.out.println("Parkimise algus: " + parkimise_algus);
			System.out.println("Parkimise lopp: " + parkimise_lopp);
			pw.println(nrmark + " " + parkimise_algus + " " + parkimise_lopp );
            System.out.println("Andmed salvestatud.\n");

            pw.close();
			

        } catch(Exception ex) {
            System.out.println("\nViga:" + ex + "\n");
        }
	}
}