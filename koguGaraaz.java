import java.io.*;

public class koguGaraaz{
	public void garageWriter(int parkimiskoht, String mudel, String omanik) throws Exception{
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("KoguGaraaz.txt"));
			bw.append("Parkimiskoht: " + parkimiskoht);
			bw.append("Auto mudel: " + mudel);
			bw.append("Omaniku nimi: " + omanik);
			bw.append("\n");
			bw.close();
		} catch(Exception ex){
			System.out.println(ex);
		}
	}
}