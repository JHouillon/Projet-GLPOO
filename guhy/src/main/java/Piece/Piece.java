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
	
	int act_posx;
	int act_posy;
	
	
	public Piece(int N, int O, int S, int E, int posx, int posy) {
		
		this.N_face=N;
		this.O_face=O;
		this.S_face=S;
		this.E_face=E;	
				
		this.act_posx=posx;
		this.act_posy=posy;
		
	
		
		//this.pieces_tab = tab;
	}

}
