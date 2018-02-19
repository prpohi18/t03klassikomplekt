import java.io.*;
public class Player{
	protected String name;
	protected int number;
	protected String team;
	protected int points;
	protected int games;
	protected int minutes;
	protected int salary;
	public static final String playerFolder = "players/";
	
	public Player(String name, int number, String team, int points, int games, int minutes, int salary) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.points = points;
		this.games = games;
		this.minutes = minutes;
		this.salary = salary;
	}
	
	public boolean checkFile(){
		return new File(playerFolder+name).exists();
	}
	public String playerFilename(){
		return playerFolder+name+".txt";
	}
	
	public void createPlayer() {
		if(!checkFile()) {
			try{
			PrintWriter pw = new PrintWriter (new FileWriter(playerFilename()));
			pw.println(name + " " + number + " " + team + " " + points + " " + games + " " + minutes +" "+salary);
			pw.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public String readPlayer() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(playerFilename()));
			String playerinfo = reader.readLine();
			return playerinfo;
		} catch(Exception ex) {
				ex.printStackTrace();
				return "Error";
			}	 
	}
	
	public String getName() {
		return name;
	}
	
	public String getTeam() {
		return team;
	}
	
}	

	
	