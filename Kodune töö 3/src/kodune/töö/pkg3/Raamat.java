/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodune.töö.pkg3;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;


public class Raamat {
    protected String kasutajanr;
    protected String pealkiri;
    protected String autor;
    protected String raamat;
    Map<String, Kasutaja> kasutajad=new HashMap<String, Kasutaja>();
    
    public Raamat(String kasutajanr,String pealkiri, String autor ){
        this.kasutajanr=kasutajanr;
        this.pealkiri=pealkiri;
        this.autor=autor;
        raamat = pealkiri+" "+autor;
        
        LisaR();
}
public String LisaR(){
   
if(Files.exists(Paths.get("Andmed/"+kasutajanr+".txt"))) { 
 
     try{
                          PrintWriter pw=new PrintWriter(new FileWriter("Andmed/"+kasutajanr+".txt"));
                          pw.println(raamat);
                          pw.close();

                    } catch(Exception ex){
                          ex.printStackTrace();
                    } 
}
return "ok";    
}  
    
    
    
}
