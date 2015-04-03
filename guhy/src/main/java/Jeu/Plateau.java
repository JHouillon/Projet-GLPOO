package Jeu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Plateau {

	private static void ConfigurationFenetre() {
		JFrame fenetre = new JFrame();
		
		Menu menu = new Menu();
		
		JPanel pan = new JPanel();
		JPanel pan1 = new JPanel();
		
		JTextField text = new JTextField("Maxime a un petit zizi !");
		JTextField text1 = new JTextField("Daniel à la sida !");
		
		fenetre.setSize(1024, 720);
		fenetre.setTitle("Eternity");		
		//mtest
		
		pan.setBackground(Color.RED);
		pan.add(text);
		
		pan1.setBackground(Color.ORANGE);
		pan1.add(text1);
		
		fenetre.setJMenuBar(menu);
		fenetre.getContentPane().add(pan, BorderLayout.EAST);
		fenetre.getContentPane().add(pan1, BorderLayout.WEST);
		fenetre.setLayout(new GridLayout(1,2));
		fenetre.setVisible(true);
	}
	
	public static void main(String[] args){
		ConfigurationFenetre();
	}
}

