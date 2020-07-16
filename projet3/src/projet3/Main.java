package projet3;

public class Main {

	public static void main(String[] args) {
		

		
		int[] notes = { 12, 16, 15, 18};
		int calcul = 0;
		
		for(int note : notes) {
			calcul = calcul + note;
		}
		System.out.println("La moyenne de l'élève est  : " + (calcul / notes.length) + " de moyenne .");
	}

}
