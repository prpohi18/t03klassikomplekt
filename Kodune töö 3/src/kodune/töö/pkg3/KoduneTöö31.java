
package kodune.töö.pkg3;

public class KoduneTöö31 {
public static void main(String[] args) {
        Kasutaja k1=new Kasutaja("0001");
        Kasutaja k2=new Kasutaja("0002");
        Raamatukogu k=new Raamatukogu();
        Raamat r1 = new Raamat("0001","'Tower Lord'","Anthony Ryan");
        Raamat r2 = new Raamat("0002","'Queen of Fire'","Anthony Ryan");
        System.out.println(k.laenutatud("0001"));
        System.out.println(k.laenutatud("0002"));  
        
    }
    
}
