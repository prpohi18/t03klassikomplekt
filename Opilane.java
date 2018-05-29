
package klassikomplekt;

import java.io.*;

public class Opilane {
    public static void main(String[] args) throws IOException{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		
		opilaseandmed opilaneID=new opilaseandmed();
		
		System.out.println("Sisesta õpilase eesnimi:");
		String eesnimi=buffer.readLine();
		opilaneID.eesnimi=eesnimi;
		
		System.out.println("Sisesta õpilase perekonnanimi:");
		String perekonnanimi=buffer.readLine();
		opilaneID.perekonnanimi=perekonnanimi;
		
		System.out.println("Sisesta õpilase kood:");
		String kood=buffer.readLine();
		opilaneID.kood=kood;
                
                System.out.println("Sisesta aine EAP maht:")
+		String Aine1EAP=buffer.readLine();
+		int aine1eap=Integer.parseInt(Aine1EAP);
+		opilaneID.aine1eap=aine1eap;
    
}
