public class Task{
	public static void main(String [] arg){
		User u1=new User("admin");
		User u2=new User("test");
		User u3=new User("Qwerty");
		User u4=new User("asdfg");
		User u5=new User("56zzz");
		User u7=new User("!(£*$^£)!+");
    System.out.println(u5.checkCreation());
    System.out.println(u1.addScore(15));
    System.out.println(u2.addScore(5));
    System.out.println(u3.addScore(29));
    System.out.println(u4.addScore(11));
    System.out.println(u5.addScore(17));
    System.out.println(u7.addScore(9));
    Score s=new Score();
    System.out.println(s.userScore("Qwerty"));
    System.out.println(s.userScore("!(£*$^£)!+"));
    System.out.println(s.competitorSearch("test", "Qwerty"));
    System.out.println(s.competitorSearch("admin", "56zzz"));
  }
}
