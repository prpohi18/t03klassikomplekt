package soiduplats;

public class proov {
    public static void main(String[] args) {
        // Loob kaks autot
        Auto bmw = new Auto("123ABC", "BMW", "valge", 2009, 4, 5);
        Auto vw = new Auto("070BLC", "Volkswagen", "tumesinine", 2012, 1, 2);
        // Paneb need n-ö sõiduplatsile
        Soiduplats plats = new Soiduplats(bmw, vw);
        System.out.println(plats);
        System.out.println("Autod on üksteisest " + Math.round(plats.carDistances()) + " meetri kaugusel.");
        System.out.println(plats.warning());
    }
}
/*
Sõiduplatsil on valge BMW ja tumesinine Volkswagen
Autod on üksteisest 4 meetri kaugusel.
Hoidke pikemat vahet!
*/
