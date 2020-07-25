package projet3;

public class Fraise extends Fruit{

	@Override
	public void taste() {
		System.out.println("La fraise est super bonne .");
		
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
