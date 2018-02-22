/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodune.töö.pkg3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author ketuo
 */
public class Kasutaja {
 

    protected String kasutajanr;
    protected String pealkiri;
    protected String autor;
    protected String raamat;
    
    
   public static final String kasutajakaust="Andmed/";
     
    public String  Raamat(){
        pealkiri = " ";
        autor = " ";        
        raamat = pealkiri+" "+autor;
        return raamat;
    }
    
    
    public Kasutaja(String kasutajanr){
        this.kasutajanr=kasutajanr;
        looKonto();
    }
    public String kysiKasutajaNr(){
        return kasutajanr;
    }
    public boolean kasOlemas(){
        return new File(kasutajaFailiNimi()).exists();
    }
    public String kasutajaFailiNimi(){
        return kasutajakaust+kasutajanr+".txt";
    }
    protected void looKonto(){
        
        if(!kasOlemas()){
          try{
            PrintWriter pw=new PrintWriter(new FileWriter(kasutajaFailiNimi()));
            pw.println(Raamat());
            pw.close();
            
           } catch(Exception ex){
               ex.printStackTrace();
           }
        }
    }
    public String Raamatud(){
        try{
           BufferedReader br=new BufferedReader(new FileReader(kasutajaFailiNimi()));
           String raamat = br.readLine();
           br.close();
           return raamat;
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return " ";
    }
    
    public boolean LisaRaamat(){
          try{
            PrintWriter pw=new PrintWriter(new FileWriter(kasutajaFailiNimi()));
            pw.println(Raamat());
            pw.close();
            return true;
           } catch(Exception ex){
               ex.printStackTrace();
           }
           return false;
    }
  
 
}
