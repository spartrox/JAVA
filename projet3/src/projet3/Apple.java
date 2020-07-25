package projet3;

public class Apple extends Fruit {

	@Override
	public void taste() {
		System.out.println("La pomme à un goût sucré .");
		
	}

	@Override
	public int getSize() {
		
		return 1;
	}

	@Override
	public boolean hasSeed() {
		
		return false;
	}

}
