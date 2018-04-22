public class Punkt{
    private double x;
    private double y;

    Punkt(double abstsiss, double ordinaat){
        x = abstsiss;
        y = ordinaat;
    }

    public double x(){
        return x;
    }

    public double y(){
        return y;
    }

    public double kaugus(){
        return Math.sqrt(x*x + y*y);
    }

    public int veerand(){
        int v = 0;
        if(x == 0 || y == 0)
            v = 0;
        else if (x>0 && y>0)
            v = 1;
        else if (x<0 && y>0)
            v = 2;
        else if (x<0 && y<0)
            v = 3;
        else if (x>0 && y<0)
            v = 4;
        return v;
    }

    public double kaugus(Punkt p){
        return Math.sqrt((x-p.x) * (x-p.x) + (y-p.y) * (y-p.y));
    }

    public double kaugus(Sirge s){
        return Math.abs(s.tous()*x - y + s.algordinaat()) / Math.sqrt(s.tous() * s.tous() * s.tous() + 1.0);
    }

    public String toString(){
        return "(" + Test_PS.ymar(x) + "; " + Test_PS.ymar(y) + ")";
    }
}