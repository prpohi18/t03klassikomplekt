import java.util.*;
import java.io.*;
public class Team{
	String playerFolder = "players/";
	String teamFolder = "teams/";
	protected String teamName;
	ArrayList<Player> players = new ArrayList<Player>();
	public Team(String teamName) {
		readPlayers();
		this.teamName = teamName;
		System.out.println(teamName);
	}
	protected void readPlayers() {
		String[] fnimed = new File("players/").list();
		for(String fnimi: fnimed) {
				String[] m=fnimi.split("\\.");
				String Info[] = (getInfo(fnimi)).split("\\s+");
				if(m.length==2){
					if (teamName == (Info[2] + " " +Info[3])){
						String name = Info[0];
						int number = Integer.parseInt(Info[1]);
						String team = Info[2] + " " +Info[3];
						int points = Integer.parseInt(Info[4]);
						int games = Integer.parseInt(Info[5]);
						int minutes = Integer.parseInt(Info[6]);
						int salary = Integer.parseInt(Info[7]);
						players.add(new Player(name, number, team, points, games, minutes, salary));
					}
					//System.out.println(Info[0]);
					//System.out.println("Loodi: "+m[0]);				
				}
			}
	}
	
	public String getInfo(String playerFileName) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(playerFileName));
			String playerinfo = reader.readLine();
			return playerinfo;
		} catch(Exception ex) {
				ex.printStackTrace();
				return "Error";
			}	 
	}
	public boolean checkFile(){
		return new File(teamFolder+teamName).exists();
	}
	public String teamFilename() {
		return teamFolder+teamName+".txt";
	}
	public void createRoster() {
		if(!checkFile()) {
			try{
				int index = 0;
				PrintWriter pw = new PrintWriter (new FileWriter(teamFilename()));
				for (Player p: players) {
					pw.println(((players.get(index)).getName()));
					index++;
				}	
				pw.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}