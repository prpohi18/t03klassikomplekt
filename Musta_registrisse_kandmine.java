import java.io.*;

public class Musta_registrisse_kandmine{

public static void main(String[] args) throws IOException{
		BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));
		
		Autode_must_register kaebus1=new Autode_must_register();
		
		System.out.println("Sisesta auto mark:");
		String mark=sisse.readLine();
		kaebus1.mark=mark;
		
		System.out.println("Sisesta auto registri number:");
		String registrinr=sisse.readLine();
		kaebus1.registrinr=registrinr;
		
		System.out.println("Sisesta kaebus:");
		String kaebus=sisse.readLine();
		kaebus1.kaebus=kaebus;
		
		String informatsioon = kaebus1.informatsioon(kaebus1.mark, kaebus1.registrinr, kaebus1.kaebus);
		
		String FailiNimi = "Must_register/" +kaebus1.mark+ "_" +kaebus1.registrinr+ ".txt";

		try{
            PrintWriter pw=new PrintWriter(new FileWriter(FailiNimi));
            pw.println(informatsioon);
            pw.close();
           } catch(Exception ex){
               ex.printStackTrace();
           }
	}	
}