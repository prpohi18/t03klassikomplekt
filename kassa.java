import java.io.*;

public class kassa {
	public static void main (String[] args) throws IOException{
		BufferedReader sisse = new BufferedReader(new InputStreamReader(System.in));
		
		lillepood lill=new lillepood();

		System.out.println("Sisesta eesnimi:");
		String eesnimi=sisse.readLine();
		lill.eesnimi=eesnimi;
		
		System.out.println("Sisesta perenimi:");
		String perenimi=sisse.readLine();
		lill.perenimi=perenimi;
		
		System.out.println("Sisesta aadress:");
		String aadress=sisse.readLine();
		lill.aadress=aadress;
		
		String lillenimi="";
		while(!lillenimi.equals("roos") && !lillenimi.equals("nelk") &&
			!lillenimi.equals("karikakar") && !lillenimi.equals("nartsiss") &&
			!lillenimi.equals("maikelluke") && !lillenimi.equals("sinilill") &&
			!lillenimi.equals("rukkilill") && !lillenimi.equals("nurmenukk")){
				System.out.println("Mis lilli soovite?");
				lillenimi=sisse.readLine();
				lill.lillenimi=lillenimi;
		}
		
		System.out.println("Sisesta lillede arv:");
		String Lilledearv=sisse.readLine();
		int lilledearv=Integer.parseInt(Lilledearv);
		lill.lilledeArv=lilledearv;
		
		hinnad hind=new hinnad();
		
		double lillehind=0;
		
		if(lillenimi.equals("roos")){
			lillehind=hind.roos;
		}else if(lillenimi.equals("nelk")){
			lillehind=hind.nelk;
		}else if(lillenimi.equals("karikakar")){
			lillehind=hind.karikakar;
		}else if(lillenimi.equals("nartsiss")){
			lillehind=hind.nartsiss;
		}else if(lillenimi.equals("maikelluke")){
			lillehind=hind.maikelluke;
		}else if(lillenimi.equals("sinilill")){
			lillehind=hind.sinilill;
		}else if(lillenimi.equals("rukkilill")){
			lillehind=hind.rukkilill;
		}else if(lillenimi.equals("nurmenukk")){
			lillehind=hind.nurmenukk;
		}
		double kimbuhind=lill.kimbuhind(lillehind, lilledearv);
		
		String Failinimi="tellimused/"+lill.eesnimi+"_"+lill.perenimi+".txt";
		
		try{
			PrintWriter pw=new PrintWriter(new FileWriter(Failinimi));
			pw.println("Saaja: "+eesnimi+" "+perenimi);
			pw.println("Aadress: "+aadress);
			pw.println("Lilletüüp: "+lillenimi);
			pw.println("Lillede arv: "+lilledearv);
			pw.println("Kimbu hind kokku on "+kimbuhind+" eurot");
			pw.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}
}