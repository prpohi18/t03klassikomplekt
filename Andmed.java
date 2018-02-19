public class Andmed{
	protected String korterinumber;
  protected int soe_vesi; // 3.04
  protected int kulm_vesi; // 2.07
  protected int paev_elekter;  //0.112
  protected int oo_elekter; //0.078

  public double veesumma(int soe_vesi, int kulm_vesi){
  	double vesi=(soe_vesi*3.04)+(kulm_vesi*2.07);
  		return vesi;	
  }
    
  public double elektrisumma(int paev_elekter, int oo_elekter){
    double elekter=(paev_elekter*0.112)+(oo_elekter*0.078);
      return elekter;	
  }

  public double kogusumma(int soe_vesi, int kulm_vesi, int paev_elekter, int oo_elekter){
    double summa=(soe_vesi*3.04)+(kulm_vesi*2.07)+(paev_elekter*0.112)+(oo_elekter*0.078);
    return summa;	
  }
} 