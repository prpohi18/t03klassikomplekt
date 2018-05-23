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
Toote id: 48, toode: Sprite, toote hind: 1.2, toote kogus: 20.0. Et k6ik korraga saaksite osta, peaksite maksma: 24.0€.  Laos on 134.0 toodet.  Tootedi on kokku: 154.0
Toote id: 39, toode: Fanta, toote hind: 1.25, toote kogus: 30.0. Et k6ik korraga saaksite osta, peaksite maksma: 37.5€.  Laos on 58.0 toodet.  Tootedi on kokku:  88.0
Toote id: 15, toode: CocaCola, toote hind: 1.25, toote kogus: 13.0. Et k6ik korraga saaksite osta, peaksite maksma: 16.25€.  Laos on 32.0 toodet.  Tootedi on kokku: 45.0
Toote id: 42, toode: Pepsi, toote hind: 0.9, toote kogus: 6.0. Et k6ik korraga saaksite osta, peaksite maksma: 5.4€.  Laos on 100.0 toodet.  Tootedi on kokku: 106.0
Toote id: 44, toode: Kali, toote hind: 1.1, toote kogus: 16.0. Et k6ik korraga saaksite osta, peaksite maksma: 17.6€.  Laos on 350.0 toodet.  Tootedi on kokku: 366.0
Toote id: 56, toode: Nestea, toote hind: 1.18, toote kogus: 27.0. Et k6ik korraga saaksite osta, peaksite maksma: 31.86€.  Laos on 70.0 toodet.  Tootedi on kokku: 97.0
*/