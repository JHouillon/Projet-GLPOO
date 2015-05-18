package Plateau;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	static Menu menu = new Menu();
	static JLabel eternity = new JLabel(new ImageIcon("src/main/java/Plateau/ETERNITY.png"));
	static JPanel mainPan = new JPanel();
	static JPanel pan1 = new JPanel();
	static JPanel pan2 = new JPanel();
	static ImageIcon ico = new ImageIcon(new ImageIcon("src/main/java/Plateau/img01.jpg").getImage().getScaledInstance(280,280,Image.SCALE_DEFAULT));
	static JLabel img00 = new JLabel(ico);
	static JLabel player = new JLabel("Nom : ");
	final static JTextField name = new JTextField("Entrez votre nom");
	static JButton jouer = new JButton("Jouer");
	static JButton commande = new JButton("Règles / Commandes");
	static JButton valider = new JButton("C'est parti!");
	static JButton retour = new JButton("Retour");
	static JButton quitter = new JButton("Quitter");
	static String nom;
	/**
	 * Methode de paramètrage de la fenêtre
	 */
	
	public static void Lancement(){
		
		lancement.repaint();
		lancement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lancement.setTitle("Eternity");
		lancement.setSize(700,700);
	
		//Déclaration du champ "Nom du joueur"
		name.setMaximumSize( new Dimension( 300, 24 ) );
		name.addFocusListener(new FocusAdapter() {
		    public void focusGained(FocusEvent e) {
		        name.setText("");
		    }
		});
		
		//Déclaration du Layout du Panel principal
		mainPan.setLayout(new BoxLayout(mainPan,BoxLayout.Y_AXIS));
		
		//Ajout des conteneurs dans le conteneur principal
		mainPan.add(eternity);
		eternity.setAlignmentX(Component.CENTER_ALIGNMENT);
		mainPan.add(img00);
		img00.setAlignmentX(Component.CENTER_ALIGNMENT);
		pan1.setLayout(new BoxLayout(pan1,BoxLayout.X_AXIS));
		pan1.add(player);
		pan1.add(name);
		mainPan.add(new JLabel (" "));
		mainPan.add(pan1);
		mainPan.add(new JLabel (" "));
		mainPan.add(valider);
		valider.setAlignmentX(Component.CENTER_ALIGNMENT);
		mainPan.add(new JLabel (" "));
		mainPan.add(commande);
		commande.setAlignmentX(Component.CENTER_ALIGNMENT);
		mainPan.add(new JLabel (" "));
		mainPan.add(quitter);
		quitter.setAlignmentX(Component.CENTER_ALIGNMENT);

		//Ajout du panel principal dans le Frame
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
		Lancement();
		
		//Règles du jeu et Commande
		commande.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(lancement,"Le plateau est composé de pièces carrées.\n\n"
					+ "Le but du jeu est de faire correspondre les cotés des carrés\n"
					+ "avec les carrés adjacents en faisant pivoter les pièces :\n"
					+ "		- 2 clique pour pivoter une pièce\n"
					+ "		- 1 clique sur une puis un 1 clique sur une autre pour les interchanger\n"
					+ "		- clique droit pour arrêter le focus sur une pièce","Règles du jeu",JOptionPane.INFORMATION_MESSAGE);
		}});
		
		//Jouer
		valider.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				lancement.repaint();
				nom = name.getText();
				if(nom.length() > 1){
					//String[] args = null;
					new ModeDeJeu(nom, lancement);
					mainPan.setVisible(false);
					pan2.setVisible(false);
				}
				else{
					Lancement();
					JOptionPane.showMessageDialog(lancement,"Veuillez entrer"
							+ "votre nom pour accéder au jeu svp\n"
							+ "(minimum 2 lettres)","Erreur !",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		quitter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		
	}

}
