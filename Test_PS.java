public class Test_PS{

    static final int KOHTI_PEALE_KOMA = 2;

    public static double ymar(double x){
        double arv = Math.pow(10, KOHTI_PEALE_KOMA);
        return Math.round(x * arv) / arv;
    }

    static Punkt p1, p2;
    static Sirge s1, s2;

    public static void main(String[] args){

        p1 = new Punkt(-3.4, -0.6);
        int v1 = p1.veerand();
        p2 = new Punkt(2.6, 1.1);
        int v2 = p2.veerand();

        System.out.println("Vaadeldavad punktid on: ");
        System.out.println("p1" + p1);
        System.out.println("p2" + p2);

        if (v1 != 0)
            System.out.println("Punkt p1 on " +  v1 + ".veerandis");
        else
            System.out.println("Punkt p1 asub teljel");
        if (v2 != 0)
            System.out.println("Punkt p2 on " +  v2 + ".veerandis");
        else
            System.out.println("Punkt p2 asub teljel");
        
        double d1 = ymar(p1.kaugus());
        System.out.println("Punkti p1 kaugus nullpunktist on " + d1);
        double d2 = ymar(p2.kaugus());
        System.out.println("Punkti p2 kaugus nullpunktist on " + d2);
        double d = ymar(p1.kaugus(p2));
        System.out.println("Punkti p2 kaugus punktist p1 on " + d);

        s1 = new Sirge(p1, p2);
        double k1 = ymar(s1.tous());
        double b1 = ymar(s1.algordinaat());
        System.out.println("Sirge s1 tõus on " + k1 + "ja algordinaat on " + b1);

        s2 = new Sirge(1.2, 2.3);
        double k2 = ymar(s2.tous());
        double b2 = ymar(s2.algordinaat());
        System.out.println("Sirge s2 tõus on " + k2 + "ja algordinaat on " + b2);

        double m2 = ymar(p1.kaugus(s2));
        System.out.println("Punkti p1 kaugus sirgest s2 on " + m2);

        double n2 = ymar(s2.kaugus(p2));
        System.out.println("Sirge s2 on punktist p2 kaugusel " + n2);

       if(k1 != k2){
            System.out.println("Sirged loikuvad punktis " + s1.loikepunkt(s2));
            System.out.println("Nurk sirgete vahel on " + ymar(s1.nurk(s2)));
        }
        else
            System.out.println("Sirged on paralleelsed");
    }
}