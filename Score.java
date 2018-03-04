import java.util.*;
import java.io.*;
public class Score{
	Map<String, User> users=new HashMap <String, User>();
	public Score(){
		readUser();
	}


 protected void readUser(){
		String[] names=new File(User.userfolder).list();
		for(String name: names){
			String []m=name.split("\\.");
			if(m.length==2){
				users.put(m[0], new User(m[0]));
				System.out.println(" Created: "+m[0]);
			}

		}


	}
	public String userScore(String userid){
		if (users.get(userid)!=null){
			return "User "+userid+" scored "+users.get(userid).readScore()+" points.";
		}
		return "User "+userid+" missing.";
	}

	public String competitorSearch(String user1, String user2){
		if (users.get(user1)==null){return "false";}
		if (users.get(user2)==null){return "false";}
		if (users.get(user1).readScore()>users.get(user2).readScore()){
			if (users.get(user1).readScore()-users.get(user2).readScore()>10){
				return "User "+user2 +" is to weak for this battle!";
			}
			return "Users "+user1+" & "+user2+ "can have a battle!";

			}
		if (users.get(user2).readScore()>users.get(user1).readScore()){
			if (users.get(user2).readScore()-users.get(user1).readScore()>10){
				return "User " +user1+ " is to weak for this battle!";
			}
			return "Users "+user2+" & "+user1+ " can have a battle!";

			}
    return " Competitor finder ";
		}
}
