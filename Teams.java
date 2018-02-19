import java.io.*;

public class Teams{
	public void lisaMeeskonda(String eesnimi, String perekonnanimi, int number, String meeskond) throws Exception{
		if(!kasOlemas(meeskond)){
			looMeeskond(meeskond);
		}
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("meeskonnad/" + meeskond + ".txt", true));
			bw.append("Eesnimi: " + eesnimi + "\n");
			bw.append("Perekonnanimi: " + perekonnanimi + "\n");
			bw.append("Number: " + number + "\n");
			bw.append("Meeskond: " + meeskond + "\n");
			bw.append("\n");
			bw.close();
		} catch(Exception ex){
			System.out.println(ex);
		}
	}

	public boolean kasOlemas(String meeskond){
		return new File("meeskonnad/" + meeskond + ".txt").exists();
	}

	protected void looMeeskond(String meeskond) throws Exception{
		try{
			PrintWriter pw = new PrintWriter(new FileWriter("meeskonnad/" + meeskond + ".txt"));
		pw.close();
		} catch(Exception ex){
			System.out.println(ex);
		}
	}
}