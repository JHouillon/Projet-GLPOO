package Piece;

import javax.swing.ImageIcon;

public class Piece {
	
	private int id;
	
	private int type;
	// 1 bord
	// 2 coin
	// 3 normal
	
	private int N_face;
	private int O_face;
	private int S_face;
	private int E_face;
	
	private int orientation;
	
	private int posx;
	private int posy;
	
	private ImageIcon img;
	
	public Piece(int N, int O, int S, int E) {
		
		this.N_face=N;
		this.O_face=O;
		this.S_face=S;
		this.E_face=E;	
		
		// on dessine la pièce
		
		
		this.orientation=0;
				
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


}
