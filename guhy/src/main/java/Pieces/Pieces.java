package Pieces;

import java.io.BufferedReader;
import java.io.FileReader;

import Plateau.Plateau;

public class Pieces {

	public static void main2(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("src/main/java/Pieces/pieces.csv"));
		String ligne = null;
		while ((ligne = br.readLine()) != null){
			// Retourner la ligne dans un tableau
			String[] data = ligne.split(";\n");

			// Afficher le contenu du tableau
			for (String val : data){
				if(val=="p"){
					val = "!";
				}
				else
					System.out.println(val);
			}
		}
		br.close();
	}
	
	public static void main(String[] args) {
		
		Plateau p=new Plateau("src/main/java/Pieces/pieces.csv");
		
	}
}
