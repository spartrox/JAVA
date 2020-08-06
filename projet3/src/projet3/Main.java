package projet3;

import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
				
		
		
		Map<String, Integer> ages = new HashMap<>();
		
		ages.put("Spartrox", 22);
		ages.put("Sabrina", 23);
		
		System.out.println(ages);
		
		
		
		int[] numbers = { 4, 18 , 25, 52};
		
		try {
			System.out.println(numbers[5]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("l'erreur est ici");
		} finally{
			System.out.println(" Finalement je met quand même l'erreur");
		}
		
		
		
		
		


		
				
	}

}
