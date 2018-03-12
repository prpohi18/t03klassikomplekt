public class ladu1 {

	public static void main(String[] args) {
		toode makaronid = new toode ();
		makaronid.Id = 48;
		makaronid.nimi = "Makaronid";
		makaronid.hind = 0.99;
		makaronid.kogus = 15;
		makaronid.koguhind();
		System.out.println("Toote id: "+makaronid.Id+ ", toode: "+makaronid.nimi+", toote hind: "+makaronid.hind+", toote kogus: "+makaronid.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +makaronid.k6ik);
		
		toode kartulid = new toode ();
		kartulid.Id = 39;
		kartulid.nimi = "Kartulid";
		kartulid.hind = 0.28;
		kartulid.kogus = 30;
		kartulid.koguhind();
		System.out.println("Toote id: "+kartulid.Id+ ", toode: "+kartulid.nimi+", toote hind: "+kartulid.hind+", toote kogus: "+kartulid.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +kartulid.k6ik);

		
		toode kohupiim = new toode ();
		kohupiim.Id = 15;
		kohupiim.nimi = "Kohupiim";
		kohupiim.hind = 1.09;
		kohupiim.kogus = 7;
		kohupiim.koguhind();
		System.out.println("Toote id: "+kohupiim.Id+ ", toode: "+kohupiim.nimi+", toote hind: "+kohupiim.hind+", toote kogus: "+kohupiim.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +kohupiim.k6ik);

		
		toode juust = new toode ();
		juust.Id = 42;
		juust.nimi = "Juust";
		juust.hind = 1.20;
		juust.kogus = 27;
		juust.koguhind();
		System.out.println("Toote id: "+juust.Id+ ", toode: "+juust.nimi+", toote hind: "+juust.hind+", toote kogus: "+juust.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +juust.k6ik);
		
		toode keeduvorst = new toode ();
		keeduvorst.Id = 44;
		keeduvorst.nimi = "Keeduvorst";
		keeduvorst.hind = 1.23;
		keeduvorst.kogus = 20;
		keeduvorst.koguhind();
		System.out.println("Toote id: "+keeduvorst.Id+ ", toode: "+keeduvorst.nimi+", toote hind: "+keeduvorst.hind+", toote kogus: "+keeduvorst.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +keeduvorst.k6ik);

		
		toode sibul = new toode ();
		sibul.Id = 56;
		sibul.nimi = "Sibul";
		sibul.hind = 0.36;
		sibul.kogus = 32;
		sibul.koguhind();
		System.out.println("Toote id: "+sibul.Id+ ", toode: "+sibul.nimi+", toote hind: "+sibul.hind+", toote kogus: "+sibul.kogus+ ". Et k6ik korraga saaksite osta, peaksite maksma: " +sibul.k6ik);

	}

}
