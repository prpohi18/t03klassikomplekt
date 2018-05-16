import java.io.*;

public class Uusauto {
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			Parkla auto = new Parkla();
			
			System.out.println("Sisesta registrinumber:");
			String nrmark = br.readLine();
			auto.nrmark = nrmark;

	 
			if (nrmark.equals("")) {
				
				System.out.println("Tühi väli.");
				
			} else {

				br.close();

				auto.salvestaAndmed();
			}
	}
}