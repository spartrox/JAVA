package projet3;

public class Kiwi extends Fruit implements PeelFruit{

	
	@Override
	public void taste() {
		System.out.println("Le kiwi  a un goût un peu bizare .");
		
	}

	@Override
	public int getSize() {
		
		return 1;
	}

	@Override
	public boolean hasSeed() {
		
		return true;
	}

	@Override
	public boolean isPeeled() {
		
		return true;
	}

	@Override
	public String getSkinType() {
		
		return " doux";
	}

}
