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
            printWriter = new PrintWriter ("Tulemused.txt");
            for(int i=0; i<200; i++){
                printWriter.println ("Õpilase " + name + " hinne aines " + subject + " on " + result);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(school.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        printWriter.close ();
    }
}
