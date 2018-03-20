package kodu3;

import java.io.*;
import java.io.BufferedWriter;

public class Andmed {
    protected String eesnimi;
    protected String perenimi;
    protected String sugu;
    protected String vanus;
    
    public void lisaPere() {
        try {
            try (PrintWriter out = new PrintWriter (new BufferedWriter(new FileWriter(vanus + ".txt", true)))) {
                out.println("Eesnimi: " + eesnimi);
                out.println("Perenimi: " + perenimi);
                out.println("Sugu: " + sugu);
                out.println("Vanus: " + vanus);
                System.out.println("Pereliige on lisatud!");
            }
        } catch(Exception ex) {
            System.out.println("\nPereliikme lisamisel tekkis viga: " + ex + "\n");
        }
    }
}
