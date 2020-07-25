package projet3;

public class PineApple extends Fruit implements PeelFruit {
	
	private boolean peeled = false;

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

	@Override
	public boolean isPeeled() {
		// TODO Auto-generated method stub
		return peeled;
	}

	@Override
	public String getSkinType() {
		// TODO Auto-generated method stub
		return " piquante ";
	}

}
