import java.io.*;
import java.util.*;

public class Piletid{
    public static void main(String[]args) throws IOException{
        BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));

        Hinnad isik = new Hinnad();

        System.out.println("Sisesta eesnimi: ");
        String eesnimi = sisse.readLine();
        isik.eesnimi = eesnimi;

        System.out.println("Sisesta perekonnanimi: ");
        String perekonnanimi = sisse.readLine();
        isik.perekonnanimi = perekonnanimi;
        
        Hinnad ost = new Hinnad();
        
        System.out.println("Sisesta kohtade arv: ");
        String kogus = sisse.readLine();
        int mitu = Integer.parseInt(kogus);
        ost.mitu = mitu;
        
        System.out.println("Sisesta piletityyp: ");
        String tyyp = sisse.readLine();
        ost.tyyp = tyyp;
       
        double piletiHind = ost.piletiHind(mitu, tyyp);
        
        System.out.println("Kas soovite popkorni või kr6psu? ");
        String n2ks = sisse.readLine();
        ost.n2ks = n2ks;

        System.out.println("Mitu tykki? ");
        String k = sisse.readLine();
        int n2ksKogus = Integer.parseInt(k);
        ost.n2ksKogus = n2ksKogus;
        

        System.out.println("Mis jooki soovite? (fanta/cola/sprite)");
        String jook = sisse.readLine();
        ost.jook = jook;

        System.out.println("Mitu tykki? ");
        String j = sisse.readLine();
        int jookKogus = Integer.parseInt(j);
        ost.jookKogus = jookKogus;
        
        double toit = ost.lisaToit(n2ks, jook, n2ksKogus, jookKogus);

        double summa = piletiHind + toit;
       
       // System.out.println("Kogu arve summa: " + summa);

        String Failinimi = eesnimi + "-" + perekonnanimi +".txt"; 
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(Failinimi));
            pw.println("Ostja - " +eesnimi+" "+perekonnanimi);
            pw.println("Piletityyp ja kogus - " +tyyp+", "+mitu + " tykki");
            pw.println("N2ksid ja kogus - " +n2ks+", "+n2ksKogus+ " tykki");
            pw.println("Joogid ja kogus - " +jook+", "+jookKogus+ " tykki");
            pw.println("Arve maksumus - " +summa+ " eurot");
            pw.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}