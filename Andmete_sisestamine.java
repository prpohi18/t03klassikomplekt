import java.io.*;

public class Andmete_sisestamine{

public static void main(String[] args) throws IOException{
  BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));
  
  Andmed andmed1=new Andmed();
  
  System.out.println("Sisesta korterinumber:");
  String korterinumber=sisse.readLine();
  andmed1.korterinumber=korterinumber;
  
  System.out.println("Sisesta veenäit (soe):");
  String Soe_vesi=sisse.readLine();
  int soe_vesi=Integer.parseInt(Soe_vesi);
  andmed1.soe_vesi=soe_vesi;

  System.out.println("Sisesta veenäit (külm):");
  String Kulm_vesi=sisse.readLine();
  int kulm_vesi=Integer.parseInt(Kulm_vesi);
  andmed1.kulm_vesi=kulm_vesi;

  System.out.println("Sisesta elektrinäit (päev):");
  String Paev_elekter=sisse.readLine();
  int paev_elekter=Integer.parseInt(Paev_elekter);
  andmed1.paev_elekter=paev_elekter;
  
  System.out.println("Sisesta elektrinäit (öö):");
  String Oo_elekter=sisse.readLine();
  int oo_elekter=Integer.parseInt(Oo_elekter);
  andmed1.oo_elekter=oo_elekter;

  double veesumma = andmed1.veesumma(soe_vesi, kulm_vesi);	
  double elektrisumma = andmed1.elektrisumma(paev_elekter, oo_elekter);
  double kogusumma = andmed1.kogusumma(soe_vesi, kulm_vesi, paev_elekter, oo_elekter);
  
  String FailiNimi = "Näidud_korter" +andmed1.korterinumber+".txt";

  try{
    PrintWriter pw=new PrintWriter(new FileWriter(FailiNimi));
    pw.println("Korterinumber: " +andmed1.korterinumber);
    pw.println("Veenäit soe: " +andmed1.soe_vesi);
    pw.println("Veenäit külm: " +andmed1.kulm_vesi);
    pw.println("Päev elekternäit: " +andmed1.paev_elekter);
    pw.println("Öö elektrinäit: " +andmed1.oo_elekter);
    pw.println("Vee summa: " +veesumma);
    pw.println("Elektri summa: " +elektrisumma);
    pw.println("Näitude maksumus: " +kogusumma);
    pw.close();
    } catch(Exception ex){
        ex.printStackTrace();
    }
  }	
} 