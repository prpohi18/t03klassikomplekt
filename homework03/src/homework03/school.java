package homework03;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class school {
    protected String name;
    protected String subject;
    protected String result;

    public void writeResult() {
        
        File file = new File ("");
        PrintWriter printWriter = null;
        
        try {
            printWriter = new PrintWriter (new FileWriter("Tulemused.txt", true));
            printWriter.println ("Õpilase " + name + " hinne aines " + subject + " on " + result);

        } catch (Exception ex) {
            Logger.getLogger(school.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        printWriter.close ();
    }
}

/*
run:
Sisestage palun õpilase nimi:
Maritana Sampu
Sisestage palun aine nimetus:
Programmeerimise põhikursus
Sisestage palun hinne:
A

*/