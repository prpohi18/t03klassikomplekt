package kodutöö3;

public class Ruumala {
    protected int a;
    protected int b;
    protected double c;

    public Ruumala(int a, int b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
  }
   
    public double põhjaPindala(){
       return a*b;
    }
    
    public double ristRuumala(){
        return a*b*c;
    }
    
    public double diagonaal(){
        return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2));
    }
    
    public double getX(){return a;}
    public double getY(){return b;}
    public double getC(){return c;}
        
    public String KasOnSuurem(Ruumala teine){
        double ruum1=a*b*c;
        double ruum2=teine.getX()*teine.getY()*teine.getC();
        if (ruum1>ruum2){
                return "Esimene risttahukas on suurem";
        } else {
                return "Teine Risttahukas on suurem";
        }
    }
    
     public double kaugusRist(Ruumala teine){
     double dx=getX()-teine.getX();
     double dy=getY()-teine.getY();
     return Math.sqrt(dx*dx+dy*dy);
  }
     
}

/*
Põhja Pindala on 37500.0

Põhja Pindala on 37500.0

Diagonaal on 291.6093276971778

Diagonaal on 291.6864755178066

Ruumala 225000.0

Ruumala 337500.0

Teine Risttahukas on suurem
*/