package projet2;

import java.util.Scanner;

public class Distance {
	
	public static void main(String[]arg) {
		
		Scanner sc = new Scanner(System.in);
		
		//initialisation des variables
		double aConvertir, convertit=0;
		char reponse = ' ', mode = ' ';
		
		System.out.println("CONVERTISSEUR KILOMETRES ET MILES ");
		System.out.println("--------------------------------------------------");		
		
		do {
			
			do {
				mode = ' ';
				System.out.println("Choisissez le mode de conversion : ");
		        System.out.println("1 - Convertisseur Kilomètres - Miles");
		        System.out.println("2 - Convertisseur Miles - Kilomètres ");
		        
		        mode = sc.nextLine().charAt(0);
			
			if(mode != '1' && mode != '2')
				System.out.println("Mode inconnu, veuillez réitérer votre choix.");

			} while (mode != '1' && mode != '2');
			
				System.out.println("Distance à convertir :");
				aConvertir = sc.nextDouble();
				
				sc.nextLine();
			if(mode == '1') {
				
		        convertit = aConvertir / 0.62;
		        System.out.print(aConvertir + " Km correspond à : ");
		        System.out.println(arrondi(convertit, 4) + " Miles.");
		      }
		      else {
		        convertit = aConvertir * 1.6;
		        System.out.print(aConvertir + " Miles correspond à : ");
		        System.out.println(arrondi(convertit, 4) + " Km.");
		      }
			
			do {
				System.out.println("Souhaitez vous convertir une autre distance ? (O/N) ");
				reponse = sc.nextLine().charAt(0);
				
			} while(reponse != 'O' && reponse != 'N');
				
				
		}while(reponse == 'O');
		
		System.out.println("Au revoir !");
	}
		  public static double arrondi(double A, int B) {
			    return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		} 
}
