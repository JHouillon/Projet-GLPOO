package Face;

import java.io.BufferedReader;
import java.io.FileReader;

public class Face {
	
	private String id;
	private Integer face;
	private String couleur;
	
	private Face(String id, Integer face, String  couleur){
		
	}
	
	/*
	 * Récupération d'un fichier .csv et affichage des 
	 * données dans le log
	 * */
	/*public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("src/main/java/Pieces/faces.csv"));
		String ligne = null;
		while ((ligne = br.readLine()) != null){
			// Retourner la ligne dans un tableau
			String[] data = ligne.split(";");

			// Afficher le contenu du tableau
			for (String val : data){
				System.out.println(val);
			}
		}
		br.close();
	}*/
	
}
