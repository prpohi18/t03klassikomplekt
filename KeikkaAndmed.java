import java.io.*;
import java.io.BufferedWriter;

public class KeikkaAndmed{
	protected String Asukoht;
	protected String Kuup2ev;
	protected String Lamp;
	protected String Kogus;
	protected String Kommentaar;
	
	public void lisaAndmed(){
        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(Asukoht +"-"+ Kuup2ev + ".txt")));
            pw.println("Keikka toimub " + Kuup2ev + " sellises asukohas nagu " + Asukoht + ". Kaasa tuleb võtta " + Lamp + 
            ", mille koguseks on määratud " + Kogus + ". Kommentaar: " + Kommentaar);
			pw.close();            
          }catch(IOException e){
            e.printStackTrace();
          }
	
	}
	
}