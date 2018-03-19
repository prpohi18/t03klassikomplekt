package soiduplats;

public class Soiduplats {
    
    Auto esimene;
    Auto teine;
    
    public Soiduplats(Auto üks, Auto kaks) {
        esimene = üks;
        teine = kaks;
    }
    public double carDistances() {
        double dx = esimene.getLocation()[0] - teine.getLocation()[0];
        double dy = esimene.getLocation()[1] - teine.getLocation()[1];
        return Math.sqrt(dx*dx+dy*dy);
    }
    
    public String warning() {
        if (carDistances() < 20) {
            return "Hoidke pikemat vahet!";
        }
        return "Olete piisava vahega!";
    }
   
    @Override
    public String toString() {
        return "Sõiduplatsil on " + esimene.getColor() + " " + esimene.getBrand() + " ja " + teine.getColor() + " " + teine.getBrand();
    }
}
