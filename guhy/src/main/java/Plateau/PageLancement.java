package Plateau;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


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
	static JPanel pan = new JPanel();
	static JPanel pan1 = new JPanel();
	static JLabel im = new JLabel( new ImageIcon( "src/main/java/Plateau/eternity2_.jpg"));
	final static JTextField name = new JTextField("Entrez votre nom");
	static JButton valider = new JButton("Jouer");
	static String nom;
	
	/**
	 * Methode de paramètrage de la fenêtre
	 */
	public static void Lancement(){
		
		
		lancement.setTitle("Eternity");
		lancement.setSize(720,720);
		lancement.setResizable(false);
		
		name.addFocusListener(new FocusAdapter() {
		    public void focusGained(FocusEvent e) {
		        name.setText("");
		    }
		});
		
		pan.add(im);
		pan.add(name);
		pan.add(valider);
		
		lancement.add(pan);
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
		
		valider.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				nom = name.getText();
				String[] args = null;
				ModeDeJeu mdj = new ModeDeJeu(nom, lancement);
				pan.setVisible(false);
			}
		});
	}

}
