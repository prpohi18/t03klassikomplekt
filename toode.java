package klassikomplekt;

public class toode {
    public int Id;
    public String nimi;
    public double hind;
    public double kogus;
    public double k6ik;
	public double laos;
	public double kokku;
    
    void koguhind() {
    	k6ik = hind * kogus;
    }
	
	void myyk() {
    	kokku = kogus + laos;
    }
}

/*
Toote id: 48, toode: Õun, toote hind: 0.1, toote kogus: 40.0. Et k6ik korraga saaksite osta, peaksite maksma: 4.0€.  Laos on 183.0 toodet.  Tootedi on kokku: 223.0
Toote id: 39, toode: Apelsin, toote hind: 0.15, toote kogus: 25.0. Et k6ik korraga saaksite osta, peaksite maksma: 3.75€.  Laos on 86.0 toodet.  Tootedi on kokku:  111.0
Toote id: 15, toode: Mandariin, toote hind: 0.06, toote kogus: 24.0. Et k6ik korraga saaksite osta, peaksite maksma: 1.44€.  Laos on 49.0 toodet.  Tootedi on kokku: 73.0
Toote id: 42, toode: Kartul, toote hind: 0.25, toote kogus: 42.0. Et k6ik korraga saaksite osta, peaksite maksma: 10.5€.  Laos on 134.0 toodet.  Tootedi on kokku: 176.0
Toote id: 44, toode: Porgand, toote hind: 0.08, toote kogus: 16.0. Et k6ik korraga saaksite osta, peaksite maksma: 1.28€.  Laos on 350.0 toodet.  Tootedi on kokku: 366.0
Toote id: 56, toode: Redis, toote hind: 0.03, toote kogus: 19.0. Et k6ik korraga saaksite osta, peaksite maksma: 0.57€.  Laos on 81.0 toodet.  Tootedi on kokku: 100.0
*/