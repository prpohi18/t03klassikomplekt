
package ee.tlu.sergei.vorkandmed1;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;
import java.awt.image.*;
import java.io.File;
import javax.imageio.*;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Ountejoonis2 extends JPanel{
    double grkoef=10;
    java.util.List<double[]> ounad;
    java.util.List<DescriptiveStatistics> kirjeldused;
    DescriptiveStatistics kirjeldusAugust;
    DescriptiveStatistics kirjeldusSeptember;
    
    public java.util.List<double[]> kysiOunteAndmed(){
        
        if(ounad==null){
            
            ounad=new ArrayList<>();
            kirjeldused=new ArrayList<>();
            kirjeldusAugust = new DescriptiveStatistics();
            kirjeldusSeptember = new DescriptiveStatistics();
            try{
                String aadress="http://www.tlu.ee/~jaagup/andmed/muu/ounad/antoonovka2.txt";
                BufferedReader br = new BufferedReader(new InputStreamReader(new URL(aadress).openStream()));
                String rida= br.readLine();
                rida = br.readLine();
                for (int i = 0; i < rida.split(",").length; i++) {
                    kirjeldused.add(new DescriptiveStatistics());
                }
        while(rida!=null){
                String[] m = rida.split(",");
                double[] dm = new double[m.length];
                for (int i = 0; i < m.length; i++) {
                    dm[i]=Double.parseDouble(m[i]);
                    kirjeldused.get(i).addValue(dm[i]);
            }
                ounad.add(dm);
//                kirjeldusAugust.addValue(dm[0]);
//                kirjeldusSeptember.addValue(dm[1]);
                rida = br.readLine();
    }
        br.close();
            } catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return ounad;
    }
    int ekraaniY(double y){
        return getHeight()-(int)(y*grkoef);
    }
    int ekraaniX(double x){
        return (int)(x*grkoef);
    } 
    
    void joonistaOunad(Graphics g){
        for(double[] m: kysiOunteAndmed()){
            g.fillOval(ekraaniX(m[0]), ekraaniY(m[1]), 5, 5);
     
        }
        int minX=ekraaniX(kirjeldused.get(0).getMin());
        //int sepAvgY=(int)((kirjeldusSeptember.getMin()+(int)(kirjeldusSeptember.getMax())/2)*koef);
        int keskY=ekraaniY(kirjeldused.get(1).getMean());
        int ylaY=ekraaniY(kirjeldused.get(1).getMean()+kirjeldused.get(1).getStandardDeviation());
        g.drawLine(minX, 0, minX, 300);
        g.drawLine(0, keskY, 400, keskY);
        g.setColor(Color.GRAY);
        g.drawLine(0, ylaY, 400, ylaY);
        
    }
    
    void ounteJoonisFaili(){
        try{
            BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
            Graphics g = bi.createGraphics();
            g.setColor(Color.YELLOW);
            g.fillRect(0, 0, 400, 300);
            g.setColor(Color.RED);
            joonistaOunad(g);
            ImageIO.write(bi, "png", new File("C:\\Users\\user\\Desktop\\TLU\\Semester 2\\ProgPohikursus\\ounad1.png"));
        } catch(Exception ex){ex.printStackTrace();}
    }
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        joonistaOunad(g);
        ounteJoonisFaili();
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Ounte joonis");
        f.getContentPane().add(new Ountejoonis2());
        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
}
