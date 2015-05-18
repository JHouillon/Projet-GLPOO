package Plateau;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

public class ModeDeJeu {

	/**
	 * Définition des variables de la fenêtre.
	 * Panneaux (JPannel) : couche visible de la fenêtre par les utilisateurs
	 * Texte (JLabel)
	 * Bouton de sélection (JRadioButton) : choix du plateau
	 * Bouton de validation (JButton) : enregistrements des préférences et lancement du jeu
	 * Bouton de progression (JSlider) : choix de la diffculté du jeu
	 * Conteneur des panneaux (Container) : contient les panneaux pour une optimisation visuelle
	 */
	static JPanel pan = new JPanel();
	static JPanel pan1 = new JPanel();
	static JPanel pan2 = new JPanel();
	static JPanel pan01 = new JPanel();
	static JPanel pan02 = new JPanel();
	static JPanel pan03 = new JPanel();
	static JLabel titre = new JLabel();
	static JLabel plateau = new JLabel();
	static JEditorPane edit = new JEditorPane();
	static ButtonGroup choix = new ButtonGroup();
	static JRadioButton plateau_carre = new JRadioButton("Carré : 4x4");
	static JRadioButton plateau_autre = new JRadioButton("Croix : 6x4");
	static JRadioButton plateau_losange = new JRadioButton("Losange : 5x5");
	static JButton valider = new JButton("Jouer");
	static JButton retour = new JButton("Retour");
	static JButton quitter = new JButton("Quitter");
	static JSlider niveau = new JSlider(JSlider.HORIZONTAL,1,4,2);
	static ImageIcon iCarre = new ImageIcon(new ImageIcon("src/main/java/Plateau/img01.jpg").getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
	static ImageIcon iAutre = new ImageIcon(new ImageIcon("src/main/java/Plateau/img03.jpg").getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
	static ImageIcon iLos = new ImageIcon(new ImageIcon("src/main/java/Plateau/img02.jpg").getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
	static String name;
	static JFrame mdj;
	static int n = 1;
    static int type = 0;
	
	/**
	 * Constructeur permettant la récupération des valeurs de la fenêtre de lancement
	 * @param name : Nom du joueur
	 * @param mdj : Fenetre
	 */
	
	public ModeDeJeu(final String name, final JFrame mdj){
		
		pan.removeAll();
		pan1.removeAll();
		pan2.removeAll();
		ModeDeJeu.name = name;
		ModeDeJeu.mdj = mdj;
		
		PageModeJeu();
		
		valider.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//nom = name.getText();
				if(plateau_carre.isSelected()){
						n = 0;
				}
				else if(plateau_autre.isSelected()){
						n = 1;
				}					
				else if(plateau_losange.isSelected()){
						n = 2;
				}
				new Plateau(name, mdj, n);
				pan.setVisible(false);
			}
		});
		
		retour.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				new PageLancement();
				pan2.setVisible(false);
				mdj.dispose();
				PageLancement.Lancement();
			}
		});
		
		quitter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
	}
	
	/**
	 * Création des différentes parties de la page 
	 * pour la sélection du mode de jeu : 
	 * difficulté et choix du plateau
	 */
	public static void PageModeJeu(){

		// Contenu du premier panneau : Récupération du nom du joueur
		// Et affichage
		pan.setBorder(BorderFactory.createTitledBorder(""));
		pan.setMaximumSize(new Dimension((mdj.getWidth()),(mdj.getHeight())/8));
		
		JLabel bjr = new JLabel("Bonjour "+name+" !");
		bjr.setFont(new Font("Arial",Font.PLAIN,42));
		
		pan.add(bjr);
		
		// Contenu du second panneau : Sélection du choix du plateau
		pan1.setBorder(BorderFactory.createTitledBorder("Choix du plateau et de la difficulté"));
		pan1.setLayout(new BoxLayout(pan1, BoxLayout.Y_AXIS));

		choix.add(plateau_carre);
		choix.add(plateau_autre);
		choix.add(plateau_losange);
		
		pan01.setLayout(new BoxLayout(pan01,BoxLayout.X_AXIS));
		pan02.setLayout(new BoxLayout(pan02,BoxLayout.X_AXIS));
		pan03.setLayout(new BoxLayout(pan03,BoxLayout.X_AXIS));
		
		pan01.add(plateau_carre);
		pan01.add(new JLabel(iCarre));
		pan02.add(plateau_autre);
		pan02.add(new JLabel(iAutre));
		pan03.add(plateau_losange);
		pan03.add(new JLabel(iLos));
		
		pan2.setLayout(new BoxLayout(pan2,BoxLayout.Y_AXIS));
		
		// Ajout des panneaux dans un conteneur (2 composants MAXIMUM par conteneur)
		pan2.add(pan);
		pan.setAlignmentX(Component.CENTER_ALIGNMENT);
		pan1.add(pan01);
		pan01.setAlignmentX(Component.CENTER_ALIGNMENT);
		pan1.add(pan02);
		pan02.setAlignmentX(Component.CENTER_ALIGNMENT);
		pan1.add(pan03);
		pan03.setAlignmentX(Component.CENTER_ALIGNMENT);
		pan1.add(new JLabel("\n\n"));
		pan2.add(pan1);
		retour.setAlignmentX(Component.CENTER_ALIGNMENT);
		pan2.add(valider);
		valider.setAlignmentX(Component.CENTER_ALIGNMENT);
		pan2.add(new JLabel(" "));
		pan2.add(retour);
		retour.setAlignmentX(Component.CENTER_ALIGNMENT);
		pan2.add(new JLabel(" "));
		pan2.add(quitter);
		quitter.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		// Ajout du conteneur dans la fenêtre pour l'affichage
		mdj.getContentPane().setLayout(new BorderLayout());
		mdj.getContentPane().add(pan2);
		mdj.setVisible(true);
	}

}
