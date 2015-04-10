package Piece;

public class Piece {
	
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
	
	int posx;
	int posy;
	
	
	public Piece(int N, int O, int S, int E) {
		
		this.N_face=N;
		this.O_face=O;
		this.S_face=S;
		this.E_face=E;	
		
		this.orientation=0;
				
		this.posx=posx;
		this.posy=posy;
		
	
		
		//this.pieces_tab = tab;
	}

}
