package projet3;

public class Apple extends Fruit {

	@Override
	public void taste() {
		System.out.println("La pomme � un go�t sucr� .");
		
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
