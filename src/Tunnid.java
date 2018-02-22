import java.io.*;

public class Tunnid {

	protected String tundNimi;
	protected String tundOjoud;
	protected String tundRuum;
	protected int tundKood;
	protected String tundAeg;
	
	
	public Tunnid(String tundNimi, String tundOjoud, String tundRuum, int tundKood, String tundAeg) {
		this.tundNimi=tundNimi;
		this.tundOjoud=tundOjoud;
		this.tundRuum=tundRuum;
		this.tundKood=tundKood;
		this.tundAeg=tundAeg;
	}
	
	public void saveTund() {
		String fileName = "tunnid.txt";
		
		try {
			
			FileWriter fileWriter=new FileWriter(fileName,true);
			
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write(tundNimi+" "+tundOjoud+" "+tundRuum+" "+tundKood+
					" "+tundAeg);
			bufferedWriter.newLine();
			
			bufferedWriter.close();
			System.out.println("Kirje tehtud!");
		}
		catch(IOException ex) {
			System.out.println(
					"Error writing to file "
					+fileName+" ");
		}
	}
	
}
