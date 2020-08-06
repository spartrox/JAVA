package projet3;

public class NouvelleExeption extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NouvelleExeption() {
		super("Attention la balance ne peux pas être Négative ! ");
	}

}
