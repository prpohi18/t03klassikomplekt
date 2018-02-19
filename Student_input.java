import java.io.*;

public class Student_input{

public static void main(String[] args) throws IOException{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		
		Student_data opilaneID=new Student_data();
		
		System.out.println("Sisesta õpilase eesnimi:");
		String eesnimi=buffer.readLine();
		opilaneID.eesnimi=eesnimi;
		
		System.out.println("Sisesta õpilase perekonnanimi:");
		String perekonnanimi=buffer.readLine();
		opilaneID.perekonnanimi=perekonnanimi;
		
		System.out.println("Sisesta õpilase kood:");
		String kood=buffer.readLine();
		opilaneID.kood=kood;
		
// Aine 1		
		System.out.println("Sisesta aine nimetus:");
		String aine1nimi=buffer.readLine();
		opilaneID.aine1nimi=aine1nimi;
		
		System.out.println("Sisesta aine "+aine1nimi+" kood:");
		String aine1kood=buffer.readLine();
		opilaneID.aine1kood=aine1kood;
		
		System.out.println("Sisesta aine "+aine1nimi+" ("+aine1kood+")"+" EAP hulk:");
		String Aine1EAP=buffer.readLine();
		int aine1eap=Integer.parseInt(Aine1EAP);
		opilaneID.aine1eap=aine1eap;
		
		System.out.println("Sisesta õpilase "+eesnimi+" "+perekonnanimi+" aine "+aine1nimi+" ("+aine1kood+")"+" hinne:");
		String Aine1HINNE=buffer.readLine();
		int aine1hinne=Integer.parseInt(Aine1HINNE);
		opilaneID.aine1hinne=aine1hinne;
		
// Aine 2		
		System.out.println("Sisesta aine nimetus:");
		String aine2nimi=buffer.readLine();
		opilaneID.aine2nimi=aine2nimi;
		
		System.out.println("Sisesta aine "+aine2nimi+" kood:");
		String aine2kood=buffer.readLine();
		opilaneID.aine2kood=aine2kood;
		
		System.out.println("Sisesta aine "+aine2nimi+" ("+aine2kood+")"+" EAP hulk:");
		String Aine2EAP=buffer.readLine();
		int aine2eap=Integer.parseInt(Aine2EAP);
		opilaneID.aine2eap=aine1eap;
		
		System.out.println("Sisesta õpilase "+eesnimi+" "+perekonnanimi+" aine "+aine2nimi+" ("+aine2kood+")"+" hinne:");
		String Aine2HINNE=buffer.readLine();
		int aine2hinne=Integer.parseInt(Aine2HINNE);
		opilaneID.aine2hinne=aine2hinne;
		
// Aine 3		
		System.out.println("Sisesta aine nimetus:");
		String aine3nimi=buffer.readLine();
		opilaneID.aine3nimi=aine3nimi;
		
		System.out.println("Sisesta aine "+aine3nimi+" kood:");
		String aine3kood=buffer.readLine();
		opilaneID.aine3kood=aine3kood;
		
		System.out.println("Sisesta aine "+aine3nimi+" ("+aine3kood+")"+" EAP hulk:");
		String Aine3EAP=buffer.readLine();
		int aine3eap=Integer.parseInt(Aine2EAP);
		opilaneID.aine3eap=aine3eap;
		
		System.out.println("Sisesta õpilase "+eesnimi+" "+perekonnanimi+" aine "+aine3nimi+" ("+aine3kood+")"+" hinne:");
		String Aine3HINNE=buffer.readLine();
		int aine3hinne=Integer.parseInt(Aine3HINNE);
		opilaneID.aine3hinne=aine3hinne;
		
// Aine 4		
		System.out.println("Sisesta aine nimetus:");
		String aine4nimi=buffer.readLine();
		opilaneID.aine4nimi=aine4nimi;
		
		System.out.println("Sisesta aine "+aine4nimi+" kood:");
		String aine4kood=buffer.readLine();
		opilaneID.aine4kood=aine4kood;
		
		System.out.println("Sisesta aine "+aine4nimi+" ("+aine4kood+")"+" EAP hulk:");
		String Aine4EAP=buffer.readLine();
		int aine4eap=Integer.parseInt(Aine2EAP);
		opilaneID.aine4eap=aine4eap;
		
		System.out.println("Sisesta õpilase "+eesnimi+" "+perekonnanimi+" aine "+aine4nimi+" ("+aine4kood+")"+" hinne:");
		String Aine4HINNE=buffer.readLine();
		int aine4hinne=Integer.parseInt(Aine3HINNE);
		opilaneID.aine4hinne=aine4hinne;
		
// Aine 5		
		System.out.println("Sisesta aine nimetus:");
		String aine5nimi=buffer.readLine();
		opilaneID.aine5nimi=aine5nimi;
		
		System.out.println("Sisesta aine "+aine5nimi+" kood:");
		String aine5kood=buffer.readLine();
		opilaneID.aine5kood=aine5kood;
		
		System.out.println("Sisesta aine "+aine5nimi+" ("+aine5kood+")"+" EAP hulk:");
		String Aine5EAP=buffer.readLine();
		int aine5eap=Integer.parseInt(Aine5EAP);
		opilaneID.aine5eap=aine5eap;
		
		System.out.println("Sisesta õpilase "+eesnimi+" "+perekonnanimi+" aine "+aine5nimi+" ("+aine5kood+")"+" hinne:");
		String Aine5HINNE=buffer.readLine();
		int aine5hinne=Integer.parseInt(Aine5HINNE);
		opilaneID.aine5hinne=aine5hinne;		
		
		int hinnesum = opilaneID.hinnesum(aine1hinne, aine2hinne, aine3hinne, aine4hinne, aine5hinne);	
		int eapsum = opilaneID.eapsum(aine1eap, aine2eap, aine3eap, aine4eap, aine5eap);	
		double kkh = opilaneID.kkh(aine1eap, aine1hinne, aine2eap, aine2hinne, aine3eap, aine3hinne, aine4eap, aine4hinne, aine5eap, aine5hinne);	
		
		String Opilased = "Õpilased/" +opilaneID.kood+ ".txt";
		String OpilasteHinnetelehed = "Õpilaste hinnetelehed/" +opilaneID.kood+ ".txt";

		try{
            PrintWriter pw=new PrintWriter(new FileWriter(Opilased));
			pw.println("Õpilase eesnimi: " +opilaneID.eesnimi);	
			pw.println("Õpilase perekonnanimi: " +opilaneID.perekonnanimi);
			pw.println("Õpilase kood: " +opilaneID.kood);
			pw.println("Õpilase õppekava täidetud mahus: " +eapsum+" EAP");
			pw.printf("Õpilase KKH: %.2f",kkh);
            pw.close();
           } catch(Exception ex){
               ex.printStackTrace();
           }
		   
		try{
            PrintWriter pw=new PrintWriter(new FileWriter(OpilasteHinnetelehed));
			pw.println("Õpilase nimi: " +opilaneID.eesnimi+" "+opilaneID.perekonnanimi);	
			pw.println("Õpilase kood: " +opilaneID.kood);
			pw.println("Õpilase hinnete summa: " +hinnesum);
			pw.println("Õpilase õppekava täidetud mahus: " +eapsum" EAP");
			pw.printf("Õpilase KKH: %.2f\n\n",kkh);
			pw.println("HINNETELEHT");			
			pw.println(opilaneID.aine1nimi+"("+opilaneID.aine1kood+") [Hinne: "+opilaneID.aine1hinne+" / "+opilaneID.aine1eap+" EAP]");
			pw.println(opilaneID.aine2nimi+"("+opilaneID.aine2kood+") [Hinne: "+opilaneID.aine2hinne+" / "+opilaneID.aine2eap+" EAP]");
			pw.println(opilaneID.aine3nimi+"("+opilaneID.aine3kood+") [Hinne: "+opilaneID.aine3hinne+" / "+opilaneID.aine3eap+" EAP]");
			pw.println(opilaneID.aine4nimi+"("+opilaneID.aine4kood+") [Hinne: "+opilaneID.aine4hinne+" / "+opilaneID.aine4eap+" EAP]");
			pw.println(opilaneID.aine5nimi+"("+opilaneID.aine5kood+") [Hinne: "+opilaneID.aine5hinne+" / "+opilaneID.aine5eap+" EAP]");
			
            pw.close();
           } catch(Exception ex){
               ex.printStackTrace();
           }		   
    }	
}