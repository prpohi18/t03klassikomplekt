import java.util.Scanner;

public class Auto_Andmed {
    public static void main(String[] args){
        String mark;
		String kytus;
        double mootor = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Palun lisage auto mark, kütuse tüüp (bensiin / diisel), mootori suurus: ");
        mark = scan.next();
        kytus = scan.next();
		mootor = scan.nextDouble();

        scan.close();

        Auto auto = new Auto(mark, kytus, mootor);
        Auto auto1 = new Auto ("BMW", "Bensiin", 2.0);
        Auto auto2 = new Auto ("Toyota", "Diisel", 1.9);
        Auto auto3 = new Auto ("Mercedes-Benz", "Diisel", 2.0);

        System.out.println(auto);
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
    }
}