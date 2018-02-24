import java.util.*;
import java.io.*;

public class Elekter{
    Map<String, Korter> korterid=new HashMap<String, Korter>();
    public Elekter(){
        loeKorterid();
    }
    protected void loeKorterid(){
        String[] fnimed=new File(Korter.korterKaust).list();
        for(String fnimi: fnimed){
            String[] m=fnimi.split("\\.");
            if(m.length==2){
              korterid.put(m[0], new Korter(m[0]));
            }
        }
    }
    public String elektrin2it(String korternr, int kesk){
        if(korterid.get(korternr)!=null && kesk==0){
            return "Korteri "+korternr+" viimane näit on "+korterid.get(korternr).loeN2it(kesk);
        }else if(korterid.get(korternr)!=null && kesk==1){
            return "Korteri "+korternr+" keskmine näit on "+korterid.get(korternr).loeN2it(kesk);
        }
        return "Konto "+korternr+" puudub";
    }
    public String sisestaN2it(String korternr, int kwh){
        if(korterid.get(korternr)!=null){
            korterid.get(korternr).kirjutaN2it(kwh);
            return "Korteri "+korternr+" elektrinäit uuendatud";
        }
        return "Konto "+korternr+" puudub";
    }

}