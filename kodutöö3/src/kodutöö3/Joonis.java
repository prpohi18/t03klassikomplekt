package kodutöö3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Joonis extends JPanel {
    
	Ruumala r1;
	Ruumala r2;
	
    public Joonis(Ruumala r1, Ruumala r2){    
    	this.r1=r1;
    	this.r2=r2;
    }
    public void paintComponent(Graphics g){  
        g.drawRect(10,10,r1.a,r2.a);  
        g.setColor(Color.RED);  
        g.fillRect(50,50,r2.a,r2.b);
    }
}
