package game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		player1 player=new player1("vikas", "sword", 100);
//		System.out.println(player.getName());
//		System.out.println(player.getwepon());
//		System.out.println(player.gethealth());
	
//		player.damagebygun1();
//		player.damagebygun1();
//		player.damagebygun2();
		
		player2 better =new player2("vicky", "sword", 100, true);
		better.damagebygun1();
	}

}
