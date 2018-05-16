import java.io.*;

public class autod{
	protected int parkimiskoht;
	protected String mudel;
	protected String omanik;
	
	public void writer(){
		try{
			PrintWriter pw = new PrintWriter(new FileWriter(parkimiskoht + ".txt"));
			
			pw.println("Parkimiskoht: " + parkimiskoht);
			pw.println("Auto mudel: " + mudel);
			pw.println("Omaniku nimi: " + omanik);
			pw.close();
		} catch(Exception ex) {
			System.out.println(ex);
		}
	}
}