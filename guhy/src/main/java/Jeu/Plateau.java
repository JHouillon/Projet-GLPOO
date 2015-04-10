package Jeu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.geom.AffineTransform;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Plateau {

	private static void ConfigurationFenetre() {
		JFrame fenetre = new JFrame();
		
		//coucou
		Menu menu = new Menu();
		
		JPanel pan = new JPanel();
		JPanel pan1 = new JPanel();
		
		JTextField text = new JTextField("Maxime a un petit zizi !");
		JTextField text1 = new JTextField("Daniel à le sida !");
		
		fenetre.setSize(1024, 720);
		fenetre.setTitle("Eternity");		

		JLabel im = new JLabel( new ImageIcon( "src/main/java/Face/ESIEA_2014_logo.jpg"));
		
		pan.setBackground(Color.RED);
		pan.add(text);
		pan.add(im);
		
		pan1.setBackground(Color.ORANGE);
		pan1.add(text1);
		
		fenetre.setJMenuBar(menu);
		//fenetre.getContentPane().add(pan, BorderLayout.EAST);
		//fenetre.getContentPane().add(pan1, BorderLayout.WEST);
		fenetre.getContentPane().add(new Zone());
		fenetre.setLayout(new GridLayout(1,2));
		fenetre.setVisible(true);
	}
	
	public static void main(String[] args){
		ConfigurationFenetre();
	}
}

class Zone extends JComponent{
	protected void paintComponent(Graphics g) {
		int[] x_sud = {110, 170, 140};
		int[] x_est = {170, 170, 140};
		int[] x_nord = {170, 110, 140};
		int[] x_west = {110, 110, 140};
		
		int[] y_sud = {60, 60, 30};
		int[] y_est = {60, 0, 30};
		int[] y_nord = {0, 0, 30};
		int[] y_west = {0, 60, 30};
	    
		g.setColor(Color.BLUE);
	    g.fillPolygon(x_sud, y_sud, 3);// SUD
		g.setColor(Color.RED);
	    g.fillPolygon(x_est, y_est, 3);// EST
		g.setColor(Color.GREEN);
	    g.fillPolygon(x_nord, y_nord, 3);// NORD
		g.setColor(Color.BLACK);
	    g.fillPolygon(x_west, y_west, 3);// WEST

		//g.copyArea(110, 0, 60, 60, 60, 60);
	}
}

