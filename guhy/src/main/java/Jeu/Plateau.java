package Jeu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.io.IOException;

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
		JTextField text1 = new JTextField("Daniel à la sida !");
		
		fenetre.setSize(1024, 720);
		fenetre.setTitle("Eternity");		
		//mtest
		JLabel im = new JLabel( new ImageIcon( "src/main/java/Face/ESIEA_2014_logo.jpg"));
		
		pan.setBackground(Color.RED);
		pan.add(text);
		pan.add(im);
		
		pan1.setBackground(Color.ORANGE);
		pan1.add(text1);
		
		//coucou
		fenetre.setJMenuBar(menu);
		fenetre.getContentPane().add(pan, BorderLayout.EAST);
		fenetre.getContentPane().add(pan1, BorderLayout.WEST);
		fenetre.getContentPane().add(new Zone());
		fenetre.setLayout(new GridLayout(1,2));
		fenetre.setVisible(true);
	}
	
	public static void main(String[] args){
		ConfigurationFenetre();
	}
}

class Zone extends JComponent {
	   protected void paintComponent(Graphics g) {
		   
	   }   
}

