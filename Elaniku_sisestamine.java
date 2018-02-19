import java.io.*;

public class Elaniku_sisestamine{

public static void main(String[] args) throws IOException{
  BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));
  
  Elanik elanik1=new Elanik();
  
  System.out.println("Sisesta korteriomaniku eesnimi:");
  String eesnimi=sisse.readLine();
  elanik1.omaniku_eesnimi=eesnimi;
  
  System.out.println("Sisesta korteriomaniku perekonnanimi:");
  String perekonnanimi=sisse.readLine();
  elanik1.omaniku_perekonnanimi=perekonnanimi;
  
  System.out.println("Sisesta korterinumber:");
  String korterinumber=sisse.readLine();
  elanik1.korterinumber=korterinumber;
  
  System.out.println("Sisesta elaniku telefoninumber:");
  String telefoninumber=sisse.readLine();
  elanik1.telefoninumber=telefoninumber;
  
  String FailiNimi = "elanik_" + elanik1.omaniku_perekonnanimi + "_" +elanik1.korterinumber+ ".txt";

  try{
    PrintWriter pw=new PrintWriter(new FileWriter(FailiNimi));
    pw.println("Omaniku nimi: " +elanik1.omaniku_eesnimi+ " " +elanik1.omaniku_perekonnanimi);
    pw.println("Korterinumber: " +elanik1.korterinumber);
    pw.println("Telefoninumber: " +elanik1.telefoninumber);
    pw.close();
    } catch(Exception ex){
        ex.printStackTrace();
    }
  }	
} 