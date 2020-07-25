package projet3;

public class Main {

	public static void main(String[] args) {
		
		PineApple a = new PineApple();
		a.hasSeed();
		a.miam();
		a.taste();
		
		if(!(a instanceof PeelFruit)) {
			System.out.println("Ce fruit ne fais rien");
		}
		
		
		
		


		
				
	}

}
