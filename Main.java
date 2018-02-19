public class Main{
	public static void main(String[] arg) {
		Player player1 = new Player("James_Harden", 13, "Houston Rockets", 1565, 50, 1788, 28000000);
		Player player2 = new Player("Games_Barden", 13, "Houston Crockets", 1565, 50, 1788, 28000000);
		System.out.println(player1.checkFile());
		player1.createPlayer();
		player2.createPlayer();
		System.out.println(player1.readPlayer());
		System.out.println(player1.getTeam());
		System.out.println(player2.getTeam());
		Team t = new Team("Houston Rockets");
		t.createRoster();
	}
}