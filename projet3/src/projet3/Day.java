package projet3;

public enum Day {
	
	MATIN(8), MIDI(12), APREMIDI(15), SOIR(22), NUIT(2);

	private int heure;
	
	Day(int heure){
		this.heure = heure;
		
	}
	
	public int getHeure() {
		return heure;
	}
}
