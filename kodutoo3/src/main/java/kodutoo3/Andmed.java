package kodutoo3;

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

            while ((line = br.readLine()) != null) {
                final String[] temp = line.split(",");

                Loom loom = new Loom();

                loom.setLoomad(temp[0]);
                loom.setMass(Integer.valueOf(temp[1]));
                loom.setKorgus(Integer.valueOf(temp[2]));

                loomad.add(loom);
            }

            br.close();

            loomad.forEach(System.out::println);

        } catch(Exception ex){
            System.out.println("Probleem: "+ ex);
            ex.printStackTrace();
        }
    }
}


/*
output
Tulbad: liik,mass,korgus
Loomad{loom='kass', mass=1000, korgus=1000}
Loomad{loom='kass', mass=1200, korgus=1200}
Loomad{loom='kass', mass=1800, korgus=1800}
Loomad{loom='kass', mass=2000, korgus=2000}
Loomad{loom='kass', mass=1000, korgus=1000}
Loomad{loom='kass', mass=800, korgus=800}
Loomad{loom='koer', mass=2000, korgus=2000}
Loomad{loom='koer', mass=3000, korgus=3000}
Loomad{loom='koer', mass=4000, korgus=4000}
Loomad{loom='koer', mass=6000, korgus=6000}
Loomad{loom='koer', mass=9000, korgus=9000}
Loomad{loom='koer', mass=10000, korgus=10000}
Loomad{loom='koer', mass=12000, korgus=12000}
*/