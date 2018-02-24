public class Haldus{
    public static void main(String[] args) {
        Korter k1=new Korter("105");
        Korter k2=new Korter("106");
        Korter k3=new Korter("107");

        System.out.println(k1.korterNumber()+" viimati sisestatud näit: "+k1.loeN2it(0));
        Elekter n=new Elekter();
        System.out.println(n.sisestaN2it("106", 5692));
        System.out.println(n.elektrin2it("106", 1));
        System.out.println(n.elektrin2it("107", 0));
    }
}