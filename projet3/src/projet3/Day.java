package projet3;

public enum Day {
	
	MATIN(8, " Il est l'heure de se lever"),
	MIDI(12, " A table !"),
	APRESMIDI(15," C'est l'heure du gouter"),
	SOIR(22, " Bonne nuit"),
	NUIT(2, " Fais de beau rêve");

	private int heure;
	private String message;
	
	Day(int heure, String message){
		this.heure = heure;
		this.message = message;
		
	}
	
	public int getHeure() {
		return heure;
	}
	
	public String getMessage() {
		return message;
	}
}
