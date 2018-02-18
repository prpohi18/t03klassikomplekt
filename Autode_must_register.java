public class Autode_must_register{
	protected String mark;
	protected String registrinr;
	protected String kaebus;
	
	public String informatsioon(String mark, String registrinr, String kaebus){
		String info = "Auto: " +mark+ " Registrinumber: " +registrinr+ " Kaebus: " +kaebus+ ".";
		return info;
	}
}