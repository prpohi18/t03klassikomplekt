
package kodutoo4;


public class Loom {
    private String loomad;
    private int mass;
    private int korgus;
    private int suurimMass;
    private int vahimMass;
    private int keskMass;
    
   /* public Loom(int suurimMass, int keskMass, int vahimMass){
        
    }*/

    public String getLoomad() {
        return loomad;
    }

    public void setLoomad(String loomad) {
        this.loomad = loomad;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getKorgus() {
        return korgus;
    }

    public void setKorgus(int korgus) {
        this.korgus = korgus;
    }
    public int getSuurimMass(){
        return suurimMass;
    }
    public void setSuurimMass(int suurimMass){
        this.suurimMass = suurimMass;
    }
    
    public int getVahimMass(){
        return vahimMass;
    }
    public void setVahimMass(int vahimMass){
        this.vahimMass = vahimMass;
    }
    
    public int getKeskMass(){
        return keskMass;
    }
    public void setKeskMass(int keskmass){
        this.keskMass = keskmass;
    }

    @Override
    public String toString() {
        return "Suurim mass: " + suurimMass + "\nVahim mass: " 
                + vahimMass + "\nKeskmine mass: " + keskMass;
    }
}