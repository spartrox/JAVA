package projet3;

public class Main {

	public static void main(String[] args) {
		
		PineApple a = new PineApple();
		a.hasSeed();
		a.miam();
		a.taste();
		
		if(!(a instanceof PeelFruit)) {
			System.out.println("Ce fruit ne fais rien .");
		}
		
		Day moment = Day.MATIN;
		
		System.out.println(moment.name());
		
		moment = Day.MIDI;
		
		System.out.println("Nous sommes actuellement le " + moment.name() + " il est actuellement : " + moment.getHeure() + " h .");
		
		
		
		


		
				
	}

}
