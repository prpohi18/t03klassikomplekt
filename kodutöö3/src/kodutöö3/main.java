package kodutöö3;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class main{  
public static void main(String[] arg){
	
        Ruumala r1=new Ruumala (250,150,6);
        Ruumala r2=new Ruumala (250,150,9);
           
        System.out.println("Põhja Pindala on "+r1.põhjaPindala()+"\n");
        System.out.println("Põhja Pindala on "+r2.põhjaPindala()+"\n");
        System.out.println("Diagonaal on "+r1.diagonaal()+"\n");
        System.out.println("Diagonaal on "+r2.diagonaal()+"\n");
        System.out.println("Ruumala "+r1.ristRuumala()+"\n");
        System.out.println("Ruumala "+r2.ristRuumala()+"\n");
        System.out.println(r1.KasOnSuurem(r2)+"\n");
       
        JFrame f=new JFrame("Joonis3");
 		f.getContentPane().add(new Joonis(r1,r2));//siin saab edasi saata v��rtusi jpaneelile
 		f.setSize(380,340);
 		f.setVisible(true);
 		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}