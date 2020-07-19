package projet3;

public class Main {

	public static void main(String[] args) {
		
		Player player1 = new Player("Spartrox", 30, 400);
		System.out.println("vie : " + player1.getHealth());
		player1.damage(30);
		System.out.println("vie : " + player1.getHealth());
		
		Player player2 = new Player("Bina", 20, 300);
		player2.setName("Test");
		player1.damage(40);
		player2.setName("Test");
		
				
	}

}
