import java.io.*;

public class Tunniplaan {
	
	protected String tundInfo;
	protected String tpName;
	protected String[] eTund = new String[99];
	protected int eCount=0;
	protected String[] tTund = new String[99];
	protected int tCount=0;
	protected String[] kTund = new String[99];
	protected int kCount=0;
	protected String[] nTund = new String[99];
	protected int nCount=0;
	protected String[] rTund = new String[99];
	protected int rCount=0;
	


	public Tunniplaan(String tpName) {
		this.tpName=tpName;
	}



	public void createTunniplaan() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"tunnid.txt"));
			String line = reader.readLine();
			while (line != null) {
				tundInfo = line;
				String[] splitlines = tundInfo.split(" ");
				String[] splitdate = splitlines[4].split("-");
				if(splitdate[0].equals("E")) {
					
					eTund[eCount]=tundInfo;
					eCount++;
				}
				if(splitdate[0].equals("T")) {
					
					tTund[tCount]=tundInfo;
					tCount++;
				}
				if(splitdate[0].equals("K")) {
					
					kTund[kCount]=tundInfo;
					kCount++;
				}
				if(splitdate[0].equals("N")) {
					
					nTund[nCount]=tundInfo;
					nCount++;
				}
				if(splitdate[0].equals("R")) {
					
					rTund[rCount]=tundInfo;
					rCount++;
				}
				
				
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("ESMASP횱V \n");
		for(int i=0; i<eCount;i++) {
			System.out.println(eTund[i]+"\n");
		}
		System.out.println("TEISIP횱V \n");
		for(int i=0; i<tCount;i++) {
			System.out.println(tTund[i]+"\n");
		}
		System.out.println("KOLMAP횱V \n");
		for(int i=0; i<kCount;i++) {
			System.out.println(kTund[i]+"\n");
		}
		System.out.println("NELJAP횱V \n");
		for(int i=0; i<nCount;i++) {
			System.out.println(nTund[i]+"\n");
		}
		System.out.println("REEDE \n");
		for(int i=0; i<rCount;i++) {
			System.out.println(rTund[i]+"\n");
		}
		
	}
	
	
	
		
}
	



