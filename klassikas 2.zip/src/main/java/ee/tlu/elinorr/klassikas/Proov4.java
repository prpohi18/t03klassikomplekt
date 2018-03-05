package ee.tlu.elinorr.klassikas;
import javax.swing.*;
import java.awt.*;
public class Proov4 extends JPanel{
    Pallivise mang= new Pallivise();
    public Proov4(){
        mang.alusta();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval((int)(mang.lendaja.getX()-mang.lendaja.palliRaadius()), 
                   (int)(mang.lendaja.getY()-mang.lendaja.palliRaadius()), 
                   (int)(2*mang.lendaja.palliRaadius()), 
                   (int)(2*mang.lendaja.palliRaadius()));
        g.fillOval((int)(mang.sihtkoht.getX()-mang.sihtkoht.palliRaadius()), 
                   (int)(mang.sihtkoht.getY()-mang.sihtkoht.palliRaadius()), 
                   (int)(2*mang.sihtkoht.palliRaadius()), 
                   (int)(2*mang.sihtkoht.palliRaadius()));
        g.fillOval((int)(mang.vahepunkt.getX()-mang.vahepunkt.palliRaadius()), 
                   (int)(mang.vahepunkt.getY()-mang.vahepunkt.palliRaadius()), 
                   (int)(2*mang.vahepunkt.palliRaadius()), 
                   (int)(2*mang.vahepunkt.palliRaadius()));
    }
    public static void main(String[] args){
        JFrame f=new JFrame("Pallimäng");
        f.getContentPane().add(new Proov4());
        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
