package projet3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();    // <> mettre ce que l'on veux stocker dans le tableau : String, Integer...
		list.add(25 " 25 ne fonctionnera pas");
		list.add("Text");
		list.add("Le texte fonctionne");
		
		System.out.println(list);
		
		list.remove(0);   // PERMET DE SUPPRIMER UN ELEMENT DANS LE TABLEAU
		
		list.clear();     // PERMET DE SUPPRIMER TOUTES LES DONNÉES DU TABLEAU
		
		 
		System.out.println(list);
				
		
		
		
		
		
		
		
		


		
				
	}

}
