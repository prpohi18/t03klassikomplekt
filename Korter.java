import java.io.*;
public class Korter{
    protected String korternr;
    public static final String korterKaust="korterid/";
    public Korter(String korternr){
        this.korternr=korternr;
        
    }
    protected String korterNumber(){
        return korternr;
    }
    protected String korterFail(){
        return korterKaust+korternr+".txt";
    }
    public boolean kirjutaN2it(int kwh){
        try{
          PrintWriter pw=new PrintWriter(new FileWriter(korterFail(), true));
          pw.println(kwh);
          pw.close();
          return true;
         } catch(Exception ex){
             ex.printStackTrace();
         }
         return false;
    }
    public int loeN2it(int kesk){
        try{
            BufferedReader br=new BufferedReader(new FileReader(korterFail()));
            String n2it=br.readLine();
            int summa=0;
            int i = 0;
            int vastus=0;
            if (kesk==1){
                while(n2it != null){
                    i++;
                    summa = summa + Integer.parseInt(n2it);
                    n2it=br.readLine();
                }
                vastus = summa / i;
            }else{
                String viimane="";
                while(n2it != null){
                    viimane = n2it;
                    n2it=br.readLine();
                    
                }
                vastus = Integer.parseInt(viimane);
            }
            br.close();
            return vastus;
            } catch(Exception ex){
                ex.printStackTrace();
            }
            return -1;
    }
}