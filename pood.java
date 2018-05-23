public class pood {

	public static void main(String[] args) {
		toode Sprite = new toode ();
		Sprite.Id = 48;
		Sprite.nimi = "Sprite";
		Sprite.hind = 1.20;
		Sprite.kogus = 20;
		Sprite.koguhind();
		Sprite.laos=134;
		Sprite.myyk();
		System.out.println("Toote id: "+Sprite.Id+ ", toode: "+Sprite.nimi+", toote hind: "+Sprite.hind+", toote kogus: "+Sprite.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +Sprite.k6ik+"€. "+ " Laos on " + Sprite.laos + " toodet. " + " Tootedi on kokku: " + Sprite.kokku);
		
		toode Fanta = new toode ();
		Fanta.Id = 39;
		Fanta.nimi = "Fanta";
		Fanta.hind = 1.25;
		Fanta.kogus = 30;
		Fanta.koguhind();
		Fanta.laos=58;
		Fanta.myyk();
		System.out.println("Toote id: "+Fanta.Id+ ", toode: "+Fanta.nimi+", toote hind: "+Fanta.hind+", toote kogus: "+Fanta.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +Fanta.k6ik+"€. "+ " Laos on " + Fanta.laos + " toodet. " + " Tootedi on kokku:  "+ Fanta.kokku);

		
		toode CocaCola = new toode ();
		CocaCola.Id = 15;
		CocaCola.nimi = "CocaCola";
		CocaCola.hind = 1.25;
		CocaCola.kogus = 13;
		CocaCola.koguhind();
		CocaCola.laos=32;
		CocaCola.myyk();
		System.out.println("Toote id: "+CocaCola.Id+ ", toode: "+CocaCola.nimi+", toote hind: "+CocaCola.hind+", toote kogus: "+CocaCola.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +CocaCola.k6ik+"€. "+ " Laos on " + CocaCola.laos + " toodet. " + " Tootedi on kokku: "+ CocaCola.kokku);

		
		toode Pepsi = new toode ();
		Pepsi.Id = 42;
		Pepsi.nimi = "Pepsi";
		Pepsi.hind = 0.90;
		Pepsi.kogus = 6;
		Pepsi.koguhind();
		Pepsi.laos=100;
		Pepsi.myyk();
		System.out.println("Toote id: "+Pepsi.Id+ ", toode: "+Pepsi.nimi+", toote hind: "+Pepsi.hind+", toote kogus: "+Pepsi.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +Pepsi.k6ik+"€. "+ " Laos on " + Pepsi.laos + " toodet. " + " Tootedi on kokku: "+ Pepsi.kokku);
		
		toode Kali = new toode ();
		Kali.Id = 44;
		Kali.nimi = "Kali";
		Kali.hind = 1.10;
		Kali.kogus = 16;
		Kali.koguhind();
		Kali.laos=350;
		Kali.myyk();
		System.out.println("Toote id: "+Kali.Id+ ", toode: "+Kali.nimi+", toote hind: "+Kali.hind+", toote kogus: "+Kali.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +Kali.k6ik+"€. "+ " Laos on " + Kali.laos + " toodet. " + " Tootedi on kokku: "+ Kali.kokku);

		
		toode Nestea = new toode ();
		Nestea.Id = 56;
		Nestea.nimi = "Nestea";
		Nestea.hind = 1.18;
		Nestea.kogus = 27;
		Nestea.koguhind();
		Nestea.laos=70;
		Nestea.myyk();
		System.out.println("Toote id: "+Nestea.Id+ ", toode: "+Nestea.nimi+", toote hind: "+Nestea.hind+", toote kogus: "+Nestea.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +Nestea.k6ik+"€. "+ " Laos on " + Nestea.laos + " toodet. " + " Tootedi on kokku: "+ Nestea.kokku);

	}

}