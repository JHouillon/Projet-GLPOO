package Plateau;

import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class PageLancement {

	/**
	 * Création des variables pour l'instanciation de la fenêtre de jeu
	 * Fenêtre (JFrame) : variable pour créer la fenêtre
	 * Panneaux (JPannel) : couche visible de la fenêtre par les utilisateurs
	 * Texte (JLabel)
	 * Bouton de progression (JSlider) : choix de la diffculté du jeu
	 * Conteneur des panneaux (Container) : contient les panneaux pour une optimisation visuelle
	 */
	final static JFrame lancement = new JFrame();
	static Menu menu = new Menu();
	//static URL url = getResource("src/main/java/Plateau/ETERNITY.gif");
	static JLabel eternity = new JLabel(new ImageIcon("src/main/java/Plateau/ETERNITY.png"));
	static JPanel titre = new JPanel(new BorderLayout());
	static JPanel mainPan = new JPanel(new BorderLayout());
	static JPanel pan = new JPanel(new BorderLayout());
	static JPanel pan1 = new JPanel(new BorderLayout());
	static ImageIcon ico = new ImageIcon(new ImageIcon("src/main/java/Plateau/img00.jpg").getImage().getScaledInstance(280,280,Image.SCALE_DEFAULT));
	static JLabel img00 = new JLabel(ico);
	static JLabel img01 = new JLabel( new ImageIcon( "src/main/java/Plateau/img01.jpg"));
	static JLabel img02 = new JLabel( new ImageIcon( "src/main/java/Plateau/img02.jpg"));
	final static JTextField name = new JTextField("Entrez votre nom");
	static JButton jouer = new JButton("Jouer");
	static JButton commande = new JButton("Règles / Commandes");
	static JButton valider = new JButton("C'est parti!");
	static String nom;
	
	/**
	 * Methode de paramètrage de la fenêtre
	 */
	

	public static void Lancement(){
		
		
		lancement.setTitle("Eternity");
		lancement.setSize(720,720);
		lancement.setResizable(false);
	
		name.setPreferredSize( new Dimension( 100, 24 ) );
		name.addFocusListener(new FocusAdapter() {
		    public void focusGained(FocusEvent e) {
		        name.setText("");
		    }
		});
		
		titre.add(eternity);
		pan.add(img00, "North");
		pan1.add(name, "North");
		pan1.add(valider, "Center");
		pan1.add(commande,"South");
		mainPan.add(titre,"North");
		mainPan.add(pan,"Center");
		mainPan.add(pan1,"South");
		
		
		lancement.add(mainPan);
		
		lancement.setJMenuBar(menu);
		lancement.setVisible(true);
	}

	/**
	 * Méthode de lancement automatique de la fenêtre
	 * Action lors de l'appuie sur le boutonde validation
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lancement();
		
		commande.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//Règle et Commande
			}
		});
		
		valider.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				nom = name.getText();
				//String[] args = null;
				//ModeDeJeu mdj = new ModeDeJeu(nom, lancement);
				mainPan.setVisible(false);
				
			}
		});
		
		
	}

}
