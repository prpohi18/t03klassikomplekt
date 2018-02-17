import java.io.*;

public class Auto_andmete_sisestamine{

public static void main(String[] args) throws IOException{
		BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));
		
		Auto_andmed auto1=new Auto_andmed();
		
		System.out.println("Sisesta auto omaniku eesnimi:");
		String eesnimi=sisse.readLine();
		auto1.omaniku_eesnimi=eesnimi;
		
		System.out.println("Sisesta auto omaniku perekonnanimi:");
		String perekonnanimi=sisse.readLine();
		auto1.omaniku_perekonnanimi=perekonnanimi;
		
		System.out.println("Sisesta auto mark:");
		String mark=sisse.readLine();
		auto1.mark=mark;
		
		System.out.println("Sisesta auto registri number:");
		String registrinr=sisse.readLine();
		auto1.registrinr=registrinr;
		
		System.out.println("Sisesta auto v2ljalaske_aasta:");
		String V2ljalaske_aasta=sisse.readLine();
		int v2ljalaske_aasta=Integer.parseInt(V2ljalaske_aasta);
		auto1.v2ljalaske_aasta=v2ljalaske_aasta;
		
		System.out.println("Millise kytusega auto s6idab (diisel/bensiin)?");
		String kytus=sisse.readLine();
		auto1.kytus=kytus;
		
		System.out.println("Sisesta auto l2bis6it:");
		String L2bis6it=sisse.readLine();
		int l2bis6it=Integer.parseInt(L2bis6it);
		auto1.l2bis6it=l2bis6it;
		
		String FailiNimi = "Autode_myyk/" +auto1.omaniku_eesnimi+ "_" +auto1.omaniku_perekonnanimi+ ".txt";

		try{
            PrintWriter pw=new PrintWriter(new FileWriter(FailiNimi));
            pw.println("Auto mark: " +auto1.mark);
			pw.println("Registrinumber: " +auto1.registrinr);
			pw.println("V2ljalaske_aasta: " +auto1.v2ljalaske_aasta);
			pw.println("Auto kytus: " +auto1.kytus);
			pw.println("Auto l2bis6it: " +l2bis6it);
            pw.close();
           } catch(Exception ex){
               ex.printStackTrace();
           }
    }	
}