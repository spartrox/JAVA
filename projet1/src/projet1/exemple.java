package projet1;

import java.util.Scanner;

public class exemple {

	public static void main(String[] args) {
		String prenom;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		while (reponse == 'O')
		{
		  System.out.println("Donnez un pr�nom : ");
		  prenom = sc.nextLine();
		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");                        
		  //Sans �a, nous n'entrerions pas dans la deuxi�me boucle
		  reponse = ' ';
		                        
		  //Tant que la r�ponse n'est pas O ou N, on repose la question
		  while(reponse != 'O' && reponse != 'N')
		  {
		    //On demande si la personne veut faire un autre essai
		    System.out.println("Voulez-vous r�essayer ? (O/N)");
		    reponse = sc.nextLine().charAt(0);
		  }
		}
		System.out.println("Au revoir�");

	}
	
}
