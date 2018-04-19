package homework03;

import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;

public class Homework03 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        school student = new school();
        
        System.out.println("Sisestage palun õpilase nimi:");
        String name = br.readLine();
        student.name = name;
        
        System.out.println("Sisestage palun aine nimetus:");
        String subject = br.readLine();
        student.subject = subject;
        
        System.out.println("Sisestage palun hinne:");
        String result = br.readLine();
        student.result = result;
        
        if (name.equals("") || subject.equals("") || result.equals("")) {
            System.out.println("\nPalun täitke kõik väljad!\n");
        } else {
            br.close();
        
        student.writeResult();
        }
    }   
}
