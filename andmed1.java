import java.io.*;
import java.io.BufferedWriter;

public class andmed1{
	protected String FirstName;
	protected String LastName;
	protected String Team;
	protected String Number;
	protected String LastGame;
	protected String SecondGame;
	
	public void addData(){
		try{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(Team + ".txt", true)));
			pw.println("Eesnimi: " + FirstName);
			pw.println("Perekonnanimi: " + LastName);
			pw.println("Võistkond: " + Team);
			pw.println("Number: " + Number);
			pw.println("Punkte viimases mängus: " + LastGame);
			pw.println("Punkte viimases mängus: " + SecondGame);
			pw.close();
		
		} catch(Exception ex){
			System.out.println(ex);
		}
	}
	
}