public class Hinnad{
   
    protected String eesnimi;
    protected String perekonnanimi;
    protected String tyyp;
    protected int mitu;
    protected String n2ks;
    protected String jook;
    protected int n2ksKogus;
    protected int jookKogus;
    protected double koguSumma;
    protected double pere = 17.50; // 17.50
    protected double taiskasvanu= 7.50; //7.50
    protected double laps= 4.50; //4.50
    protected double opilane= 6.50; //6.50 
    protected double popkorn= 3.50;
    protected double kr6ps= 2.50;
    protected double fanta = 1.00;
    protected double cola = 1.50;
    protected double sprite = 1.20;

    double piletihind = 0;

    public double piletiHind(int mitu, String tyyp){
        if(tyyp.equals("pere")){
            piletihind += pere;
        }
        if(tyyp.equals("taiskasvanu")){
            piletihind += taiskasvanu;
        }
        if(tyyp.equals("laps")){
            piletihind += laps;
        }
        if(tyyp.equals("opilane")){
            piletihind += opilane;
        }
        
        double hind = mitu * piletihind;
        return hind;
    }

    double joogiHind = 0;
    double toiduHind = 0;

    public double lisaToit(String n2ks, String jook, int n2ksKogus, int jookKogus){
        if(n2ks.equals("popkorn")){
            toiduHind += popkorn;
        }
        if(n2ks.equals("kr6ps")){
            toiduHind += kr6ps;
        }
        if(jook.equals("fanta")){
            joogiHind += fanta;
        }
        if(jook.equals("cola")){
            joogiHind += cola;
        }
        if(jook.equals("sprite")){
            joogiHind += sprite;
        }

        double toidud = (toiduHind * n2ksKogus) + (joogiHind * jookKogus);
        return toidud;
    }
}