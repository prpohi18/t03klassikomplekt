
public class Main {
	
	public static void main(String[] args) {
		Tunnid test1=new Tunnid("Inglise_keel", "A.Neem","A444",001,"E-1345");
		Tunnid test2=new Tunnid("Vene_keel", "A.Peem","A314",021,"T-1345");
		Tunnid test3=new Tunnid("Matemaatika", "P.Teem", "T432", 042,"E-1135");
		test1.saveTund();
		test2.saveTund();
		test3.saveTund();
		
		Tunniplaan tun1 = new Tunniplaan("Test");
		tun1.createTunniplaan();
	}

}
