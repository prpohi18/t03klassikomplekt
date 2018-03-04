public class lillepood {
	String eesnimi;
	String perenimi;
	String aadress;
	String lillenimi;
	double lilleHind;
	int lilledeArv;
	
	public double kimbuhind (double lilleHind, int lilledeArv){
		double kimbuhind = lilleHind*(double)lilledeArv;
		return kimbuhind;
	}
	
}