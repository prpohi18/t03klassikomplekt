import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		UserFile uf = new UserFile();
		uf.CreateFile("Pikkused.txt", "Juku 197\nKati 163\nMati 178\nTiit 188");
	
	try{
		System.out.println("Keskmine pikkus on: "+uf.AverageHeight("Pikkused.txt") + "cm");
	} catch (IOException e){
		e.printStackTrace();	
	}
	try{
		uf.CreateFile("Keskmine.txt", uf.AverageHeight("Pikkused.txt").toString());
	} catch (IOException  e){
		e.printStackTrace();
	}
	
  }
	
}

//Keskmine pikkus on: 180.5cm
//Keskmine pikkus on: 173.75cm
