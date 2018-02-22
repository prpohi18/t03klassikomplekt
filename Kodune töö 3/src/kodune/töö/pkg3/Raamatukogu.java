/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodune.töö.pkg3;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ketuo
 */
public class Raamatukogu {
   Map<String, Kasutaja> kasutajad=new HashMap<String, Kasutaja>();
    public Raamatukogu(){
        loeKasutajad();
    }
    protected void loeKasutajad(){
        String[] fnimed=new File(Kasutaja.kasutajakaust).list();
        for(String fnimi: fnimed){
            String[] m=fnimi.split("\\.");
            if(m.length==2){
              kasutajad.put(m[0], new Kasutaja(m[0]));
              System.out.println("Loodi: "+m[0]);
            }
        }
    }
    public String laenutatud(String kasutajanr){
        if(kasutajad.get(kasutajanr)!=null){
            return "Kasutaja "+kasutajanr+" on laenutanud "+kasutajad.get(kasutajanr).Raamatud();
        }
        return "Kasutaja "+kasutajanr+" puudub";
    }
    
    
}
