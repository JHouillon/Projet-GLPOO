package Pieces;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Zone extends JComponent {

	/**
	 * Génération automatique de l'id de la classe
	 * 
	 * Création des faces triangle par triangle
	 */
	private static final long serialVersionUID = 1001045674066908253L;	

	int[] x_sud = {0, 60, 30};
	int[] x_est = {60, 60, 30};
	int[] x_nord = {60, 0, 30};
	int[] x_west = {0, 0, 30};
	
	int[] y_sud = {60, 60, 30};
	int[] y_est = {60, 0, 30};
	int[] y_nord = {0, 0, 30};
	int[] y_west = {0, 60, 30};
	

	double rand ;
	Color col = null;
	
	public Zone(){
	}
	
	public Zone(int N, int O, int S, int E){
		
	}

	protected void paintComponent(Graphics g) {
	    
		g.setColor(Color.BLUE);
	    g.fillPolygon(x_sud, y_sud, 3);// SUD
		g.setColor(Color.RED);
	    g.fillPolygon(x_est, y_est, 3);// EST
		g.setColor(Color.GREEN);
	    g.fillPolygon(x_nord, y_nord, 3);// NORD
		g.setColor(Color.BLACK);
	    g.fillPolygon(x_west, y_west, 3);// WEST

		//g.copyArea(110, 0, 60, 60, 60, 60);
	    
	  /*  for(int l=0;l<5;l++){
	    	for(int i=0; i<5; i++){
		    	verticaldroite(g);
		    }
		    horizontal(g);
		    for(int i=0; i<5; i++){
		    	verticalgauche(g);
		    }
	    }*/
	    
	    
	}

	public void verticaldroite(Graphics g){
		
		
		for(int i=0; i<x_sud.length;i++){
			x_sud[i] = x_sud[i]+120;
		}
		for(int i=0; i<x_sud.length;i++){
			x_nord[i] = x_nord[i]+120;
		}
		for(int i=0; i<x_sud.length;i++){
			x_est[i] = x_est[i]+120;
		}
		for(int i=0; i<x_sud.length;i++){
			x_west[i] = x_west[i]+120;
		}
		
		CouleurRandom();		
		g.setColor(col);
	    g.fillPolygon(x_sud, y_sud, 3);// SUD
	    CouleurRandom();
		g.setColor(col);
	    g.fillPolygon(x_est, y_est, 3);// EST
	    CouleurRandom();
		g.setColor(col);
	    g.fillPolygon(x_nord, y_nord, 3);// NORD
	    CouleurRandom();
		g.setColor(col);
	    g.fillPolygon(x_west, y_west, 3);// WEST
	    

    	//g.copyArea(x_sud[0], y_est[1], y_sud[0], y_sud[0], y_sud[0], y_sud[0]);
	}
	
	public void verticalgauche(Graphics g){

		for(int i=0; i<x_sud.length;i++){
			x_sud[i] = x_sud[i]-120;
		}
		for(int i=0; i<x_sud.length;i++){
			x_nord[i] = x_nord[i]-120;
		}
		for(int i=0; i<x_sud.length;i++){
			x_est[i] = x_est[i]-120;
		}
		for(int i=0; i<x_sud.length;i++){
			x_west[i] = x_west[i]-120;
		}
		CouleurRandom();		
		g.setColor(col);
	    g.fillPolygon(x_sud, y_sud, 3);// SUD
	    CouleurRandom();
		g.setColor(col);
	    g.fillPolygon(x_est, y_est, 3);// EST
	    CouleurRandom();
		g.setColor(col);
	    g.fillPolygon(x_nord, y_nord, 3);// NORD
	    CouleurRandom();
		g.setColor(col);
	    g.fillPolygon(x_west, y_west, 3);// WEST
	    

    	//g.copyArea(x_sud[0], y_est[1], y_sud[0], y_sud[0], y_sud[0], y_sud[0]);
	
	}
	
	public void horizontal(Graphics g){
		 for(int i=0; i<y_sud.length;i++){
				y_sud[i] = y_sud[i]+120;
			}
			for(int i=0; i<x_sud.length;i++){
				y_nord[i] = y_nord[i]+120;
			}
			for(int i=0; i<x_sud.length;i++){
				y_est[i] = y_est[i]+120;
			}
			for(int i=0; i<x_sud.length;i++){
				y_west[i] = y_west[i]+120;
			}
			CouleurRandom();		
			g.setColor(col);
		    g.fillPolygon(x_sud, y_sud, 3);// SUD
		    CouleurRandom();
			g.setColor(col);
		    g.fillPolygon(x_est, y_est, 3);// EST
		    CouleurRandom();
			g.setColor(col);
		    g.fillPolygon(x_nord, y_nord, 3);// NORD
		    CouleurRandom();
			g.setColor(col);
		    g.fillPolygon(x_west, y_west, 3);// WEST
	}
	
	public void CouleurRandom() {
		
		rand = Math.random();
		if(rand == 0)
			col = Color.RED;
		else if(rand==1)
			col = Color.GREEN;
		else if(rand==2)
			col = Color.BLUE;
		else if(rand==3)
			col = Color.BLACK;
	}
}
