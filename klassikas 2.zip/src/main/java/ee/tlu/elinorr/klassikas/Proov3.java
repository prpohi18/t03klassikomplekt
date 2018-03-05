//Koosta eraldi prooviprogramm, kus määratakse lendajale samm
//ning näidatakse 20 sammu juures lendaja koordinaadid ja tabamus
package ee.tlu.elinorr.klassikas;
public class Proov3 {
    public static void main(String[] args){
        Pallivise mang1=new Pallivise();
        Pallivise mang2=new Pallivise();
        mang1.alusta();
        mang2.alusta();
        /*for(int i=0; i<20; i++){
            mang1.liigu();
        }*/
        while(mang1.kysiSeisund()==Seisundid.ALUSTATUD){
            mang1.liigu();
            if(mang1.kysiSeisund()==Seisundid.PIHTAS){
                System.out.println();
            }
        }
         
    }
    
}
