package Plateau;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSplitPane;
import javax.swing.TransferHandler;

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
	static JLabel titre = new JLabel();
	static JLabel plateau = new JLabel();
	static JEditorPane edit = new JEditorPane();
	static JRadioButton plateau_carre = new JRadioButton();
	static JRadioButton plateau_triangle = new JRadioButton();
	static JRadioButton plateau_losange = new JRadioButton();
	static JButton valider = new JButton("Jouer");
	static JSlider niveau = new JSlider(JSlider.HORIZONTAL,0,100,50);
	static Container contenu = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
	static Container contenu1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
	
	static String name;
	static JFrame mdj;
	
	/**
	 * Constructeur permettant la récupération des valeurs de la fenêtre de lancement
	 * @param name : Nom du joueur
	 * @param mdj : Fenetre
	 */
	public ModeDeJeu(final String name, final JFrame mdj){
		this.name = name;
		this.mdj = mdj;
		
		PageModeJeu();
		
		valider.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//nom = name.getText();
				String[] args = null;
				Plateau jeu = new Plateau(name, mdj);
				pan.setVisible(false);
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
		plateau.setText("Bonjour "+name+" !");
		
		plateau.setTransferHandler(new TransferHandler("text"));
		plateau.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				JComponent lab = (JComponent)e.getSource();
				TransferHandler handle = lab.getTransferHandler();
				handle.exportAsDrag(lab,e,TransferHandler.COPY);
			}
		});
		pan.add(plateau);
		
		// Contenu du second panneau : Sélection du choix du plateau
		pan1.setBorder(BorderFactory.createTitledBorder("Choix du plateau et de la difficulté"));
		pan1.setLayout(new BoxLayout(pan1, BoxLayout.Y_AXIS));
		
		plateau_carre.setText("Carrée (défaut)");
		plateau_triangle.setText("Triangle");
		plateau_losange.setText("Losange");
		titre.setText("Choix de la difficulté");
		
	//	pan1.setDragEnabled(true);
		
		pan1.add(plateau_carre);
		pan1.add(plateau_triangle);
		pan1.add(plateau_losange);
		pan1.add(titre);
		pan1.add(niveau);
		pan1.add(valider);
		//pan1.add(edit);
		
		// Contenu de troisième panneau : Sélection du niveau de difficulté
		//pan2.setBorder(BorderFactory.createTitledBorder("Choix de la difficulté"));
		//pan2.add(niveau);
		
		// Ajout des panneaux dans un conteneur (2 composants MAXIMUM par conteneur)
		contenu.add(pan);
		contenu.add(pan1);
		
		// Ajout du conteneur dans la fenêtre pour l'affichage
		mdj.getContentPane().setLayout(new BorderLayout());
		mdj.getContentPane().add(contenu);
		mdj.setVisible(true);
	}

}
