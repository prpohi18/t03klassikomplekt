package ee.tlu.elinorr.klassikas;


public class Pall {
    protected double x;
    protected double y;
    protected double dx;
    protected double dy;
    

    //Lisage pallile raadius
    //Lisage käsk kontrollimaks kas kaks palli puutuvad kokku
    public Pall(double x, double y){
       this.x=x;
       this.y=y;

                      
    }
    public double kaugusNullist(){
        return Math.sqrt(x*x+y*y);
    }
    public double palliRaadius(){
        if(y>x){
            return((y-x)/2);
        }else if(x>y){
            return((x-y)/2);
        }else{
            return 0;
        }
    }
    public void sammuAndmed(double dx, double dy){
        this.dx=dx; this.dy= dy;
    }
    public void sammuNurgaAndmed(double nurk, double sammupikkus){
        this.sammuAndmed(sammupikkus*Math.cos(Math.toRadians(nurk)),
        sammupikkus*Math.sin(Math.toRadians(nurk)));
    }
    public void liigu(){
        x+=dx; y+=dy;
    }
    public boolean puutuja(Pall teine){
        if (kaugusPallist(teine) <= palliRaadius() + teine.palliRaadius()){
            return true;
        }else{
            return false;
        }
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public double kaugusPallist(Pall teine){
        double dx=getX() - teine.getX();
        double dy=getY() - teine.getY();
        return Math.sqrt(dx*dx+dy*dy);
    }
    
    @Override
    public String toString(){
        return "Pall kohal  ("+x+", "+y+", samm "+dx+" "+dy+")";
        
    }
}
 
