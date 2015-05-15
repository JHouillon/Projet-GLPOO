package Pieces;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class Zone extends JComponent {

	/**
	 * Génération automatique de l'id de la classe
	 * 
	 * Création des faces triangle par triangle
	 **/
	private static final long serialVersionUID = 1001045674066908253L;	
	
	int face, faceAvant;
	int click;
	Pieces[] p = new Pieces[17];
	
	int separation = 105;
	int nombre;
	
	public Zone(int nombre, Pieces[] p){
		this.nombre = nombre;
		this.click = -15;
		this.p = p;
	}
	
	public Zone(int x, int y, Pieces[] p)
	{
		this.p = p;
		click = -15;
		face=x;
	}
	
	public Zone(int nombre, int face, int faceAvant, int click, Pieces[] p)
	{
		this.nombre = nombre;
		this.faceAvant = faceAvant;
		this.face = face;
		this.click = click;
		this.p = p;
	}

	protected void paintComponent(Graphics g)
	{
		for(int i=0;i<p.length;i++)
	    {
		    doTriangle(p[i].getX_nord(), p[i].getY_nord(), g, p[i].getCouleur(0));// NORD
	    	doTriangle(p[i].getX_sud(), p[i].getY_sud(), g, p[i].getCouleur(1));// SUD
		    doTriangle(p[i].getX_est(), p[i].getY_est(), g, p[i].getCouleur(2));// EST
		    doTriangle(p[i].getX_west(), p[i].getY_west(), g, p[i].getCouleur(3));// WEST
	    }
	    
	    if(click%2 == 1 && click != -15)
	    {
			doTriangleN(p[face-1].getX_nord()[1],p[face-1].getY_nord()[1],g);
	    	inverser(g);
	    }
	    if((click%2 == 0 || face == 0) && click != -15)
	    {
			delTriangleN(p[faceAvant-1].getX_nord()[1],p[faceAvant-1].getY_nord()[1],g);
	    	inverser(g);
	    }
	}
	
	public void inverser(Graphics g)
	{
		if(click%2 == 0) //Changement pieces
		{
			doTriangle(p[faceAvant-1].getX_nord(), p[faceAvant-1].getY_nord(), g, p[face-1].getCouleur(0));// NORD
	    	doTriangle(p[faceAvant-1].getX_sud(), p[faceAvant-1].getY_sud(), g, p[face-1].getCouleur(1));// SUD
		    doTriangle(p[faceAvant-1].getX_est(), p[faceAvant-1].getY_est(), g, p[face-1].getCouleur(2));// EST
		    doTriangle(p[faceAvant-1].getX_west(), p[faceAvant-1].getY_west(), g, p[face-1].getCouleur(3));// WEST

		    doTriangle(p[face-1].getX_nord(), p[face-1].getY_nord(), g, p[faceAvant-1].getCouleur(0));// NORD
	    	doTriangle(p[face-1].getX_sud(), p[face-1].getY_sud(), g, p[faceAvant-1].getCouleur(1));// SUD
		    doTriangle(p[face-1].getX_est(), p[face-1].getY_est(), g, p[faceAvant-1].getCouleur(2));// EST
		    doTriangle(p[face-1].getX_west(), p[face-1].getY_west(), g, p[faceAvant-1].getCouleur(3));// WEST

			String[] tmpCouleur = p[faceAvant-1].getCouleur();
			p[faceAvant-1].setCouleur(p[face-1].getCouleur());
			p[face-1].setCouleur(tmpCouleur);
		}
		
		if(click%2 == 0 && face == faceAvant) //rotation
		{
			String tmpCouleurN = p[faceAvant-1].getCouleur(0);
			String tmpCouleurS = p[faceAvant-1].getCouleur(1);
			String tmpCouleurE = p[faceAvant-1].getCouleur(2);
			String tmpCouleurO = p[faceAvant-1].getCouleur(3);

			p[faceAvant-1].setCouleur(tmpCouleurN, 2);
			p[faceAvant-1].setCouleur(tmpCouleurS, 3);
			p[faceAvant-1].setCouleur(tmpCouleurE, 1);
			p[faceAvant-1].setCouleur(tmpCouleurO, 0);

			doTriangle(p[faceAvant-1].getX_nord(), p[faceAvant-1].getY_nord(), g, p[face-1].getCouleur(0));// NORD
	    	doTriangle(p[faceAvant-1].getX_sud(), p[faceAvant-1].getY_sud(), g, p[face-1].getCouleur(1));// SUD
		    doTriangle(p[faceAvant-1].getX_est(), p[faceAvant-1].getY_est(), g, p[face-1].getCouleur(2));// EST
		    doTriangle(p[faceAvant-1].getX_west(), p[faceAvant-1].getY_west(), g, p[face-1].getCouleur(3));// WEST
		}

	    puzzleComplet(g);
	}

	public void puzzleComplet(Graphics g)
	{
		int x = 0;
		if(nombre == 0)
		{
			for (int i = 0; i < p.length-4; i++)
			{
				if(p[i].getCouleur(2) != "N")
				{
					if(p[i].getCouleur(2) != p[i+1].getCouleur(3) || p[i].getCouleur(1) != p[i+4].getCouleur(0))
					{
						x++;
					}
				}
			}
		}
		else if(nombre == 1)
		{
			for (int i = 0; i < p.length-2; i++)
			{
				if(p[i].getCouleur(2) != "N")
				{
					if(p[i].getCouleur(2) != p[i+1].getCouleur(3))
					{
						x++;
					}
				}
			}
			if(p[0].getCouleur(1) != p[4].getCouleur(0))
				x++;
			if(p[1].getCouleur(1) != p[5].getCouleur(0))
				x++;
			if(p[3].getCouleur(1) != p[9].getCouleur(0))
				x++;
			if(p[4].getCouleur(1) != p[10].getCouleur(0))
				x++;
			if(p[5].getCouleur(1) != p[11].getCouleur(0))
				x++;
			if(p[6].getCouleur(1) != p[12].getCouleur(0))
				x++;
			if(p[10].getCouleur(1) != p[14].getCouleur(0))
				x++;
			if(p[11].getCouleur(1) != p[15].getCouleur(0))
				x++;
		}
        else if(nombre == 2)
		{
			for (int i = 0; i < p.length-2; i++)
			{
				if(p[i].getCouleur(2) != "N")
				{
					if(p[i].getCouleur(2) != p[i+1].getCouleur(3))
					{
						x++;
					}
				}
			}
			if(p[0].getCouleur(1) != p[3].getCouleur(0))
				x++;
			if(p[1].getCouleur(1) != p[4].getCouleur(0))
				x++;
			if(p[2].getCouleur(1) != p[7].getCouleur(0))
				x++;
			if(p[3].getCouleur(1) != p[8].getCouleur(0))
				x++;
			if(p[4].getCouleur(1) != p[9].getCouleur(0))
				x++;
			if(p[5].getCouleur(1) != p[10].getCouleur(0))
				x++;
			if(p[7].getCouleur(1) != p[12].getCouleur(0))
				x++;
			if(p[8].getCouleur(1) != p[13].getCouleur(0))
				x++;
			if(p[9].getCouleur(1) != p[14].getCouleur(0))
				x++;
			if(p[10].getCouleur(1) != p[15].getCouleur(0))
				x++;
			if(p[13].getCouleur(1) != p[16].getCouleur(0))
				x++;
			if(p[14].getCouleur(1) != p[17].getCouleur(0))
				x++;
		}
		
		if(x == 0)
		{
			JOptionPane.showMessageDialog(null,"Vous avez gagné :D","Réussi !",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void doTriangle(int[] x, int[]y, Graphics g, String couleur)
	{
		Color col = null;
		if(couleur == "N")
			col = Color.BLACK;
		else if(couleur == "B")
			col = Color.BLUE;
		else if(couleur == "R")
			col = Color.RED;
		else if(couleur == "V")
			col = Color.GREEN;
		g.setColor(col);
		g.fillPolygon(x, y, 3);
		col = Color.BLACK;		
		g.setColor(col);
		g.drawPolygon(x, y, 3);
	}
	
	public static void doTriangleN(int x, int y, Graphics g)
	{
		g.setColor(Color.ORANGE);
		g.drawRect(x-1, y-1, 102, 102);
		g.drawRect(x-2, y-2, 104, 104);
		g.drawRect(x-3, y-3, 106, 106);
	}
	
	public static void delTriangleN(int x, int y, Graphics g)
	{
		g.setColor(Color.getHSBColor(Color.RGBtoHSB(238, 238, 238, null)[0], Color.RGBtoHSB(238, 238, 238, null)[1], Color.RGBtoHSB(238, 238, 238, null)[2]));
		g.drawRect(x-1, y-1, 102, 102);
		g.drawRect(x-2, y-2, 104, 104);
		g.drawRect(x-3, y-3, 106, 106);
	}
}
