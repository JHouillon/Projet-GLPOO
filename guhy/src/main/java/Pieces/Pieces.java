package Pieces;

import java.io.BufferedReader;
import java.io.FileReader;

public class Pieces {
	
	int id;
	
	int type;
	// 1 bord
	// 2 coin
	// 3 normal
	
	int N_face;
	int O_face;
	int S_face;
	int E_face;
	
	int orientation;
	
	int posx=0;
	int posy=0;
	
	
	public Pieces(int N, int O, int S, int E) {
		
		this.N_face=N;
		this.O_face=O;
		this.S_face=S;
		this.E_face=E;	
		
		this.orientation=0;
		
		/**
		 * Quentin tu reprends le même posx et posy
		 * tu ne l'affectes à aucune variable défini 
		 * dans ta parenthèse du constructeur
		 * Je ne peux pas les rajouter car tu utilises un tableau
		 * de 4 valeurs dans DAO->CsvRW.java
		 * 
		 * Je te laisse jeter un coup d'oeil
		 */
		this.posx=posx;
		this.posy=posy;
		
	
		
		//this.pieces_tab = tab;
	}



	public static void main(String[] args) throws Exception{
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
}
