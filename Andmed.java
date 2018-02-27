import java.io.*;
import java.io.BufferedWriter;

public class Andmed{
	protected String FirstName;
	protected String LastName;
	protected String Position;
	protected String Team;
	
	public void addData(){
		try {
			//PrintWriter pw = new PrintWriter(new FileWriter(Team + ".txt"), true);
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(Team + ".txt", true)));
			
			out.println("Firstname: " + FirstName);
			out.println("Lastname: " + LastName);
			out.println("Position: " + Position);
			out.println("Team: " + Team);
			System.out.println("Mängija on lisatud!");
			out.close();
			
		
		} catch(Exception ex) {
			//anna teada veast
			System.out.println("\nViga:" + ex + "\n");
		}
	}
}