/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.tlu.sergei.vorkandmed1;

import java.net.*;

import java.io.*;
/**
 *
 * @author student
 */
public class Vork1 {
    
   
    
    public static void main(String[] args) {
       try{
        String aadress="http://www.tlu.ee/~jaagup/andmed/muu/ounad/antoonovka2.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(new URL(aadress).openStream()));
        String rida= br.readLine();
        double[] summad = new double[rida.split(",").length];
        System.out.println("Tulbad: " + rida);
        rida = br.readLine();
        
        
        int kogus = 0;
        while(rida!=null){
                String[] m = rida.split(",");
                for (int i = 0; i < m.length; i++) {
                    summad[i] += Double.parseDouble(m[i]);
                
            }
                kogus++;
                //System.out.println(m[1]);
                rida=br.readLine();
    }
        br.close();
        System.out.println("Augusti summa: "+summad[0]);
        System.out.println("Septembri keskmine: "+summad[1]/kogus);
       } catch(Exception ex){
           System.out.println("Probleem: "+ ex);
           ex.printStackTrace();
       }
    }
    /*void alusta(){
    try{
    String aadress="http://www.tlu.ee/~jaagup/andmed/muu/ounad/antoonovka2.txt";
    BufferedReader br = new BufferedReader(new InputStreamReader(new URL(aadress).openStream()));
    String rida= br.readLine();
    double[] summad = new double[rida.split(",").length];
    int aug;
    int sep;
    while(rida!=null){
    for (int i = 0; i < summad.length; i++) {
    String[] m = rida.split(",");
    summad[i] += Double.parseDouble(m[i]);
    double[] aug = summad[0];
    
    }
    br.close();
    }
    } catch (Exception ex){
    System.out.println("Probleem: " + ex);
    ex.printStackTrace();
    }*/
}
