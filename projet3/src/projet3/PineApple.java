package projet3;

public class PineApple extends Fruit {

	@Override
	public void taste() {
		System.out.println("L'ananas à un goût exotique . ");
		
	}

	@Override
	public int getSize() {
		
		return 2;
	}

	@Override
	public boolean hasSeed() {
		
		return true;
	}

}
