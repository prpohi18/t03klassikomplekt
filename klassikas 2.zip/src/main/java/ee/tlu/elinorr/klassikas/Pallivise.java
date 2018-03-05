package ee.tlu.elinorr.klassikas;
public class Pallivise {
    Pall lendaja;
    Pall sihtkoht;
    Pall vahepunkt;
    
    Seisundid seisund=Seisundid.ALUSTAMATA;
    void alusta(){
        lendaja=new Pall(10, 200);
        sihtkoht=new Pall(250, 100);
        vahepunkt = new Pall(200, 400);
        lendaja.sammuAndmed(2, 1);
        seisund = Seisundid.ALUSTATUD;
        
    }
    boolean kasVahepunktis(){
        return lendaja.puutuja(vahepunkt);
    }
    
    boolean kasPihtas(){
        return vahepunkt.puutuja(sihtkoht);
    }
    void liigu(){
        lendaja.liigu();
        System.out.println(lendaja+" "+kasVahepunktis());
        if(kasVahepunktis()){seisund=Seisundid.PIHTAS;
        System.out.println("Puutub esimest palli esimesena");}
        if(lendaja.getX()>vahepunkt.getX() && seisund ==Seisundid.ALUSTATUD){
            seisund=Seisundid.M88DAS;
            
        }
        if(kasPihtas()){seisund=Seisundid.PIHTAS; 
        System.out.println("Puutub teist palli esimesena");}
        if(lendaja.getX()>sihtkoht.getX() && seisund ==Seisundid.ALUSTATUD){
            seisund=Seisundid.M88DAS;
            
        }
    }
    Seisundid kysiSeisund(){
        return seisund;
    }
    
}
 /*
Pall kohal  (12.0, 201.0, samm 2.0 1.0) false
Pall kohal  (14.0, 202.0, samm 2.0 1.0) false
Pall kohal  (16.0, 203.0, samm 2.0 1.0) false
Pall kohal  (18.0, 204.0, samm 2.0 1.0) false
Pall kohal  (20.0, 205.0, samm 2.0 1.0) false
Pall kohal  (22.0, 206.0, samm 2.0 1.0) false
Pall kohal  (24.0, 207.0, samm 2.0 1.0) false
Pall kohal  (26.0, 208.0, samm 2.0 1.0) false
Pall kohal  (28.0, 209.0, samm 2.0 1.0) false
Pall kohal  (30.0, 210.0, samm 2.0 1.0) false
Pall kohal  (32.0, 211.0, samm 2.0 1.0) false
Pall kohal  (34.0, 212.0, samm 2.0 1.0) false
Pall kohal  (36.0, 213.0, samm 2.0 1.0) false
Pall kohal  (38.0, 214.0, samm 2.0 1.0) false
Pall kohal  (40.0, 215.0, samm 2.0 1.0) false
Pall kohal  (42.0, 216.0, samm 2.0 1.0) false
Pall kohal  (44.0, 217.0, samm 2.0 1.0) false
Pall kohal  (46.0, 218.0, samm 2.0 1.0) false
Pall kohal  (48.0, 219.0, samm 2.0 1.0) false
Pall kohal  (50.0, 220.0, samm 2.0 1.0) false
Pall kohal  (52.0, 221.0, samm 2.0 1.0) false
Pall kohal  (54.0, 222.0, samm 2.0 1.0) false
Pall kohal  (56.0, 223.0, samm 2.0 1.0) false
Pall kohal  (58.0, 224.0, samm 2.0 1.0) false
Pall kohal  (60.0, 225.0, samm 2.0 1.0) false
Pall kohal  (62.0, 226.0, samm 2.0 1.0) false
Pall kohal  (64.0, 227.0, samm 2.0 1.0) false
Pall kohal  (66.0, 228.0, samm 2.0 1.0) false
Pall kohal  (68.0, 229.0, samm 2.0 1.0) false
Pall kohal  (70.0, 230.0, samm 2.0 1.0) false
Pall kohal  (72.0, 231.0, samm 2.0 1.0) false
Pall kohal  (74.0, 232.0, samm 2.0 1.0) false
Pall kohal  (76.0, 233.0, samm 2.0 1.0) false
Pall kohal  (78.0, 234.0, samm 2.0 1.0) false
Pall kohal  (80.0, 235.0, samm 2.0 1.0) false
Pall kohal  (82.0, 236.0, samm 2.0 1.0) false
Pall kohal  (84.0, 237.0, samm 2.0 1.0) false
Pall kohal  (86.0, 238.0, samm 2.0 1.0) false
Pall kohal  (88.0, 239.0, samm 2.0 1.0) false
Pall kohal  (90.0, 240.0, samm 2.0 1.0) false
Pall kohal  (92.0, 241.0, samm 2.0 1.0) false
Pall kohal  (94.0, 242.0, samm 2.0 1.0) false
Pall kohal  (96.0, 243.0, samm 2.0 1.0) false
Pall kohal  (98.0, 244.0, samm 2.0 1.0) false
Pall kohal  (100.0, 245.0, samm 2.0 1.0) false
Pall kohal  (102.0, 246.0, samm 2.0 1.0) false
Pall kohal  (104.0, 247.0, samm 2.0 1.0) false
Pall kohal  (106.0, 248.0, samm 2.0 1.0) false
Pall kohal  (108.0, 249.0, samm 2.0 1.0) false
Pall kohal  (110.0, 250.0, samm 2.0 1.0) false
Pall kohal  (112.0, 251.0, samm 2.0 1.0) false
Pall kohal  (114.0, 252.0, samm 2.0 1.0) false
Pall kohal  (116.0, 253.0, samm 2.0 1.0) false
Pall kohal  (118.0, 254.0, samm 2.0 1.0) true
Puutub esimest palli esimesena
*/
