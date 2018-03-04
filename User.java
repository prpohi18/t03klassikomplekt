import java.io.*;
public class User{
	protected String userid;
	public static final String userfolder="users/";
	public User(String userid){
		this.userid=userid;
		createUser();
	}

	public String checkUser(){
		return userid;
	}

	public boolean checkCreation(){
		return new File(userProfile()).exists();
	}

	protected String userProfile(){
	return userfolder + userid + ".txt";
	}

	protected void createUser(){
		if(!checkCreation()){
		submitScore(0);
		}
	}

	public int readScore(){
		try {
			BufferedReader br=new BufferedReader(new FileReader(userProfile()));
			int score = Integer.parseInt(br.readLine());
			br.close();
			return score;
		} catch(Exception ex){
			ex.printStackTrace();
		}
		return -1;
	}

	public boolean submitScore(int points){
		try{
		PrintWriter pw=new PrintWriter(new FileWriter(userProfile()));
		pw.println(points);
		pw.close();
		return true;
		} catch (Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

	public int addScore(int points){
		int amount=readScore();
		amount+=points;
		submitScore(amount);
		return amount;



	}




}
