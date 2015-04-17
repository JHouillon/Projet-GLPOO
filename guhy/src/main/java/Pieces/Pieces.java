package Pieces;

import java.io.BufferedReader;
import java.io.FileReader;

import Plateau.Plateau;

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

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public int getN_face() {
		return N_face;
	}


	public void setN_face(int n_face) {
		N_face = n_face;
	}


	public int getO_face() {
		return O_face;
	}


	public void setO_face(int o_face) {
		O_face = o_face;
	}


	public int getS_face() {
		return S_face;
	}


	public void setS_face(int s_face) {
		S_face = s_face;
	}


	public int getE_face() {
		return E_face;
	}


	public void setE_face(int e_face) {
		E_face = e_face;
	}


	public int getOrientation() {
		return orientation;
	}


	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}


	public int getPosx() {
		return posx;
	}


	public void setPosx(int posx) {
		this.posx = posx;
	}


	public int getPosy() {
		return posy;
	}


	public void setPosy(int posy) {
		this.posy = posy;
	}


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
