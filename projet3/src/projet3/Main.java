package projet3;

public class Main {

	public static void main(String[] args) {
		
		Player player1 = new Player("Spartrox", 30, 400);
		System.out.println("vie : " + player1.getHealth());
		player1.damage(130);
		System.out.println("vie : " + player1.getHealth());
		


		
				
	}

}
