public class Sirge{
    private double k;
    private double b;

    Sirge(Punkt p1, Punkt p2){
        k = (p2.y() - p1.y()) / (p2.x() - p1.x());
        b = (p2.x() * p1.y() - p1.x() * p2.y()) / (p2.x() - p1.x());
    }

    Sirge(double x_kordaja, double vabaliige){
        k = x_kordaja;
        b = vabaliige;
    }

    Sirge(double a, double b, double c){
        k = -a/b;
        this.b = -c/b;
    }

    public double tous(){
        return k;
    }

    public double algordinaat(){
        return b;
    }

    public double kaugus(Punkt p){
        return p.kaugus(this);
    }

    public Punkt loikepunt(Sirge s){
        double x = (s.b - b) / (k - s.k);
        double y = k*(s.b - b) / (k - s.k) + b;
        Punkt p = new Punkt(x,y);
        return p;
    }

    public double nurk(Sirge s){
        double k1 = k;
        double k2 = s.k;
        double f = Math.abs((k1 - k2) / (1 + k1 * k2));
        double fi = Math.atan(f);
        return fi;
    }
}