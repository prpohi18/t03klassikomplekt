package klassikomplekt;

public class Pood {

	public static void main(String[] args) {
		toode oun = new toode ();
		oun.Id = 48;
		oun.nimi = "Õun";
		oun.hind = 0.10;
		oun.kogus = 40;
		oun.koguhind();
		oun.laos=183;
		oun.myyk();
		System.out.println("Toote id: "+oun.Id+ ", toode: "+oun.nimi+", toote hind: "+oun.hind+", toote kogus: "+oun.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +oun.k6ik+"€. "+ " Laos on " + oun.laos + " toodet. " + " Tootedi on kokku: " + oun.kokku);
		
		toode apelsin = new toode ();
		apelsin.Id = 39;
		apelsin.nimi = "Apelsin";
		apelsin.hind = 0.15;
		apelsin.kogus = 25;
		apelsin.koguhind();
		apelsin.laos=86;
		apelsin.myyk();
		System.out.println("Toote id: "+apelsin.Id+ ", toode: "+apelsin.nimi+", toote hind: "+apelsin.hind+", toote kogus: "+apelsin.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +apelsin.k6ik+"€. "+ " Laos on " + apelsin.laos + " toodet. " + " Tootedi on kokku:  "+ apelsin.kokku);

		
		toode mandariin = new toode ();
		mandariin.Id = 15;
		mandariin.nimi = "Mandariin";
		mandariin.hind = 0.06;
		mandariin.kogus = 24;
		mandariin.koguhind();
		mandariin.laos=49;
		mandariin.myyk();
		System.out.println("Toote id: "+mandariin.Id+ ", toode: "+mandariin.nimi+", toote hind: "+mandariin.hind+", toote kogus: "+mandariin.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +mandariin.k6ik+"€. "+ " Laos on " + mandariin.laos + " toodet. " + " Tootedi on kokku: "+ mandariin.kokku);

		
		toode kartul = new toode ();
		kartul.Id = 42;
		kartul.nimi = "Kartul";
		kartul.hind = 0.25;
		kartul.kogus = 42;
		kartul.koguhind();
		kartul.laos=134;
		kartul.myyk();
		System.out.println("Toote id: "+kartul.Id+ ", toode: "+kartul.nimi+", toote hind: "+kartul.hind+", toote kogus: "+kartul.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +kartul.k6ik+"€. "+ " Laos on " + kartul.laos + " toodet. " + " Tootedi on kokku: "+ kartul.kokku);
		
		toode porgand = new toode ();
		porgand.Id = 44;
		porgand.nimi = "Porgand";
		porgand.hind = 0.08;
		porgand.kogus = 16;
		porgand.koguhind();
		porgand.laos=350;
		porgand.myyk();
		System.out.println("Toote id: "+porgand.Id+ ", toode: "+porgand.nimi+", toote hind: "+porgand.hind+", toote kogus: "+porgand.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +porgand.k6ik+"€. "+ " Laos on " + porgand.laos + " toodet. " + " Tootedi on kokku: "+ porgand.kokku);

		
		toode redis = new toode ();
		redis.Id = 56;
		redis.nimi = "Redis";
		redis.hind = 0.03;
		redis.kogus = 19;
		redis.koguhind();
		redis.laos=81;
		redis.myyk();
		System.out.println("Toote id: "+redis.Id+ ", toode: "+redis.nimi+", toote hind: "+redis.hind+", toote kogus: "+redis.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +redis.k6ik+"€. "+ " Laos on " + redis.laos + " toodet. " + " Tootedi on kokku: "+ redis.kokku);

	}

}