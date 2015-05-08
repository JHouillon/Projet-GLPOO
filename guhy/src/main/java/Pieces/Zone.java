package Pieces;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Zone extends JComponent {

	/**
	 * Génération automatique de l'id de la classe
	 * 
	 * Création des faces triangle par triangle
	 **/
	private static final long serialVersionUID = 1001045674066908253L;	

	int[] x_sud = {20, 120, 70};
	int[] x_est = {120, 120, 70};
	int[] x_nord = {120, 20, 70};
	int[] x_west = {20, 20, 70};
	
	int[] y_sud = {120, 120, 70};
	int[] y_est = {120, 20, 70};
	int[] y_nord = {20, 20, 70};
	int[] y_west = {20, 120, 70};
	
	static int X;
	static int Y;
	
	int separation = 105;
	int nombre;

	double rand ;
	Color col = null;
	
	public Zone(int nombre){
		this.nombre = nombre + 1;
		if(nombre == 0 || nombre == 1){
			nombre = 3;
		}
	}
	
	public Zone(int N, int O, int S, int E){
		
	}

	protected void paintComponent(Graphics g)
	{
	    doTriangle(x_sud, y_sud, g);// SUD
	    doTriangle(x_est, y_est, g);// EST
	    doTriangle(x_nord, y_nord, g);// NORD
	    doTriangle(x_west, y_west, g);// WEST
	    
	    for(int i=0;i<nombre;i++)
	    {
	    	for(int j=0; j<nombre; j++)
	    	{
			    verticaldroite(g);
	    	}
	    	
		    horizontal(g);
		    for(int j=0; j<nombre; j++)
	    	{
			    verticalgauche(g);
	    	}
	    }
	}
	
	public void inverser(Graphics g){
		
	}

	public void verticaldroite(Graphics g){
		
		
		for(int i=0; i<x_sud.length;i++){
			x_sud[i] = x_sud[i]+separation;
		}
		for(int i=0; i<x_sud.length;i++){
			x_nord[i] = x_nord[i]+separation;
		}
		for(int i=0; i<x_sud.length;i++){
			x_est[i] = x_est[i]+separation;
		}
		for(int i=0; i<x_sud.length;i++){
			x_west[i] = x_west[i]+separation;
		}

	    doTriangle(x_sud, y_sud, g);// SUD
	    doTriangle(x_est, y_est, g);// EST
	    doTriangle(x_nord, y_nord, g);// NORD
	    doTriangle(x_west, y_west, g);// WEST
	    

    	//g.copyArea(x_sud[0], y_est[1], y_sud[0], y_sud[0], y_sud[0], y_sud[0]);
	}
	
	public void verticalgauche(Graphics g){

		for(int i=0; i<x_sud.length;i++){
			x_sud[i] = x_sud[i]-separation;
		}
		for(int i=0; i<x_sud.length;i++){
			x_nord[i] = x_nord[i]-separation;
		}
		for(int i=0; i<x_sud.length;i++){
			x_est[i] = x_est[i]-separation;
		}
		for(int i=0; i<x_sud.length;i++){
			x_west[i] = x_west[i]-separation;
		}

	    doTriangle(x_sud, y_sud, g);// SUD
	    doTriangle(x_est, y_est, g);// EST
	    doTriangle(x_nord, y_nord, g);// NORD
	    doTriangle(x_west, y_west, g);// WEST
	    

    	//g.copyArea(x_sud[0], y_est[1], y_sud[0], y_sud[0], y_sud[0], y_sud[0]);
	
	}
	
	public void horizontal(Graphics g){
		 for(int i=0; i<y_sud.length;i++){
				y_sud[i] = y_sud[i]+separation;
			}
			for(int i=0; i<x_sud.length;i++){
				y_nord[i] = y_nord[i]+separation;
			}
			for(int i=0; i<x_sud.length;i++){
				y_est[i] = y_est[i]+separation;
			}
			for(int i=0; i<x_sud.length;i++){
				y_west[i] = y_west[i]+separation;
			}
			
		    doTriangle(x_sud, y_sud, g);// SUD
		    doTriangle(x_est, y_est, g);// EST
		    doTriangle(x_nord, y_nord, g);// NORD
		    doTriangle(x_west, y_west, g);// WEST
	}
	
	public void CouleurRandom() {
		
		int rand = (int) (Math.random()*4);
		if(rand == 0)
			col = Color.RED;
		else if(rand==1)
			col = Color.GREEN;
		else if(rand==2)
			col = Color.BLUE;
		else if(rand==3)
			col = Color.BLACK;
	}
	
	public void doTriangle(int[] x, int[]y, Graphics g)
	{
		CouleurRandom();
		g.setColor(col);
		g.fillPolygon(x, y, 3);
		col = Color.BLACK;		
		g.setColor(col);
		g.drawPolygon(x, y, 3);
	}
	
	public static void doTriangleN(int x, int y, Graphics g)
	{
		g.setColor(Color.ORANGE);
		g.drawRect(x, y, 100, 100);
		g.drawRect(x-1, y-1, 102, 102);
		g.drawRect(x-2, y-2, 104, 104);
		g.drawRect(x-3, y-3, 106, 106);
	}
}
