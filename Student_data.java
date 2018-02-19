public class Student_data{
	protected String eesnimi;
	protected String perekonnanimi;	
	protected String kood;
	protected String aine1nimi;
	protected String aine1kood;
	protected int aine1eap;
	protected int aine1hinne;
	protected String aine2nimi;
	protected String aine2kood;
	protected int aine2eap;
	protected int aine2hinne;
	protected String aine3nimi;
	protected String aine3kood;
	protected int aine3eap;
	protected int aine3hinne;
	protected String aine4nimi;
	protected String aine4kood;
	protected int aine4eap;
	protected int aine4hinne;
	protected String aine5nimi;
	protected String aine5kood;
	protected int aine5eap;
	protected int aine5hinne;
	
	public int hinnesum(int aine1hinne, int aine2hinne, int aine3hinne, int aine4hinne, int aine5hinne){
		int HIN=aine1hinne+aine2hinne+aine3hinne+aine4hinne+aine5hinne;
		return HIN;	
	}
		
	public int eapsum(int aine1eap, int aine2eap, int aine3eap, int aine4eap, int aine5eap){
		int EAP=aine1eap+aine2eap+aine3eap+aine4eap+aine5eap;
		return EAP;				
	}
	
	public double kkh(int aine1eap, int aine1hinne, int aine2eap, int aine2hinne, int aine3eap, int aine3hinne, int aine4eap, int aine4hinne, int aine5eap, int aine5hinne){		
		double A=(aine1eap*aine1hinne)+(aine2eap*aine2hinne)+(aine3eap*aine3hinne)+(aine4eap*aine4hinne)+(aine5eap*aine5hinne);
		double KKH = A/(aine1eap+aine2eap+aine3eap+aine4eap+aine5eap);
		return KKH;			
		
	}	
}