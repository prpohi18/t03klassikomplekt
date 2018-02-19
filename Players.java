import java.io.*;

public class Players{
	protected String eesnimi;
	protected String perekonnanimi;
	protected int number;
	protected String meeskond;

	public void mangijadFaili() {
		try{
			PrintWriter pw = new PrintWriter(new FileWriter("mangijad/" + eesnimi + "_" + perekonnanimi+ "_" + number + ".txt"));

			pw.println("Eesnimi: " + eesnimi);
			pw.println("Perekonnanimi: " + perekonnanimi);
			pw.println("Number: " + number);
			pw.println("Meeskond: " + meeskond);
			pw.close();
		} catch(Exception ex) {
			System.out.println(ex);
		}
	}
}