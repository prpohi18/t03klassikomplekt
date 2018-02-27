
package kodutoo4;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;
import java.awt.image.*;
import java.io.File;
import javax.imageio.*;


/*public class joonis1 extends JPanel{
java.util.List<int[]> loomad;
public java.util.List<int[]> kysiLoomadeAndmed(){
if(loomad ==null){
loomad = new ArrayList<>();
try{
String url="http://www.tlu.ee/~jaagup/veeb1/loomad.txt";
BufferedReader br = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
String rida= br.readLine();
rida = br.readLine();

List<Loom> loomad = new ArrayList<>();

while ((rida = br.readLine()) != null) {
final String[] temp = rida.split(",");

Loom loom = new Loom();

loom.setLoomad(temp[0]);
loom.setMass(Integer.valueOf(temp[1]));
loom.setKorgus(Integer.valueOf(temp[2]));

loomad.add(loom);
}

br.close();

loomad.forEach(System.out::println);

} catch(Exception ex){
System.out.println("Probleem: "+ ex);
ex.printStackTrace();
}
}
    return loomad;
}
}
*/

public class Joonis1 extends JPanel{
    java.util.List<int[]> loomad;
    public java.util.List<int[]> kysiLoomadeAndmed(){
        if(loomad==null){
            loomad=new ArrayList<>();
            try{
                String aadress="http://www.tlu.ee/~jaagup/veeb1/loomad.txt";
                BufferedReader br = new BufferedReader(new InputStreamReader(new URL(aadress).openStream()));
                String rida= br.readLine();
                rida = br.readLine();
                
        while(rida!=null){
                String[] m = rida.split(",");
                int[] dm = new int[m.length];
                for (int i = 0; i < m.length; i++) {    
                
                
                
            }
                loomad.add(dm);
                //System.out.println(loomad);
                rida = br.readLine();
    }
        br.close();
                
            } catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return loomad;
    }
    
    void joonistaOunad(Graphics g){
        double koef=10;
        for(int[] m: kysiLoomadeAndmed()){
            g.fillOval(getHeight()-(int) (m[1]*koef), (int)(m[2]*koef), 5, 5);
        }
    }
    
    void loomadeJoonisFaili(){
        try{
            BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
            Graphics g = bi.createGraphics();
            g.setColor(Color.YELLOW);
            g.fillRect(0, 0, 400, 300);
            g.setColor(Color.RED);
            joonistaOunad(g);
            ImageIO.write(bi, "png", new File("C:\\Users\\user\\Desktop\\TLU\\Semester 2\\ProgPohikursus\\loomad.png"));
        } catch(Exception ex){ex.printStackTrace();}
    }
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        joonistaOunad(g);
        loomadeJoonisFaili();
        
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Loomade joonis");
        f.getContentPane().add(new Joonis1());
        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
