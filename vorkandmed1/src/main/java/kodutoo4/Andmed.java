
package kodutoo4;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Andmed{
public static void main(String[] args) {
        try{
            String url="http://www.tlu.ee/~jaagup/veeb1/loomad.txt";
            BufferedReader br = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            String line= br.readLine();
            System.out.println("Tulbad: " + line);

            List<Loom> loomad = new ArrayList<>();
            int kassideMass = 0;
            int koerteMass = 0;
            int keskMass = 0;
            int vahimMass = 0;
            int suurimMass = 0;
            int abiMuutuja = 0;
            int a = 0;
            while ((line = br.readLine()) != null) {
                final String[] temp = line.split(",");

                Loom loom = new Loom();

                loom.setLoomad(temp[0]);
                loom.setMass(Integer.valueOf(temp[1]));
                loom.setKorgus(Integer.valueOf(temp[2]));
                if("kass".equals(temp[0])){
                    kassideMass += Integer.valueOf(temp[1]);
                }
                if("koer".equals(temp[0])){
                    koerteMass += Integer.valueOf(temp[1]);
                }
                loomad.add(loom);
                abiMuutuja += loom.getMass();
                if(loom.getMass()>suurimMass){
                    suurimMass = loom.getMass();
                }
                
                if(vahimMass > loom.getMass() || vahimMass == 0){
                    vahimMass = loom.getMass();
                }
                a += 1;
            }
            
            br.close();
            
            Loom loom = new Loom();
            keskMass = abiMuutuja / a;
            
            loom.setSuurimMass(suurimMass);
            loom.setVahimMass(vahimMass);
            loom.setKeskMass(keskMass);
            
            
            System.out.println(loom);
            //loomad.forEach(System.out::println);
            
            System.out.println("Koerte mass: " + koerteMass);
            System.out.println("Kasside mass: " + kassideMass);
            /*System.out.println("Suurim mass: " + suurimMass);
            System.out.println("Vahim mass: " + vahimMass);
            System.out.println("Keskmine mass: " + keskMass);*/

        } catch(Exception ex){
            System.out.println("Probleem: "+ ex);
            ex.printStackTrace();
        }
    }
}


/*

Tulbad: liik,mass,korgus
Suurim mass: 12000
Vahim mass: 800
Keskmine mass: 4138
Koerte mass: 46000
Kasside mass: 7800

*/