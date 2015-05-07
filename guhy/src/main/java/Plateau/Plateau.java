package Plateau;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

import DAO.CsvRW;
import Pieces.Pieces;
import Pieces.Zone;

public class Plateau {
	
	Pieces [] piecesTab;
	//static Zone zone = new Zone();
	
	static int nbCaseTotalTab=100;
	static String name;
	static JFrame fenetre;
	static JEditorPane edit = new JEditorPane();
//	static Container contenu = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	
	static Zone zone = new Zone();
	static Graphics g;
	
	public Plateau(String name, JFrame fenetre){
		Plateau.name = name;
		Plateau.fenetre = fenetre;
		
		System.out.println(name);
		
		ConfigurationFenetre();
		
	}

	public Plateau(String link) {
		
		System.out.println("Création PLateau");
		
		CsvRW ReaderCsv=new CsvRW(link);
		
		
		Pieces[] tab = ReaderCsv.findAllPieces();
		
		this.piecesTab = tab;
	}

	private static void ConfigurationFenetre() {	
		
		JFrame.setDefaultLookAndFeelDecorated(false);
		fenetre.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLocationRelativeTo(null);
		
		final JPanel plateau = new JPanel();
		SpringLayout sPlay = new SpringLayout();
		
		final JPanel pieces = new JPanel();		
		GridLayout grille = new GridLayout(1,1);
		pieces.setLayout(grille);
	//	pieces.setBackground(Color.BLACK);
		pieces.add(zone);
		
		JPanel ajout = new JPanel();
		ajout.setLayout(new BoxLayout(ajout, BoxLayout.PAGE_AXIS));
		JButton plus = new JButton();
		plus.setText("Rafraîchissement");
		plus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				fenetre.repaint();
			}
		});
		ajout.add(plus);
		ajout.setBorder(BorderFactory.createTitledBorder("Rafraîchissement du plateau"));
		
		JPanel score = new JPanel();
		score.setLayout(new BoxLayout(score, BoxLayout.PAGE_AXIS));
		JLabel text = new JLabel();
		text.setText("Vous êtes à X points");
		score.add(text);
		score.setBorder(BorderFactory.createTitledBorder("Score"));
		
		JPanel coups = new JPanel();
		coups.setLayout(new BoxLayout(coups, BoxLayout.PAGE_AXIS));
		JLabel nb = new JLabel();
		nb.setText("Vous êtes à X coups");
		coups.add(nb);
		coups.setBorder(BorderFactory.createTitledBorder("Nombre de coups"));
	
		JPanel retry = new JPanel();
		retry.setLayout(new BoxLayout(retry, BoxLayout.PAGE_AXIS));
		JButton btn = new JButton();
		btn.setText("Recommencer la partie");
		retry.add(btn);
		retry.setBorder(BorderFactory.createTitledBorder("Réessayer"));
		
		JPanel back = new JPanel();
		back.setLayout(new BoxLayout(back, BoxLayout.PAGE_AXIS));
		JButton bck = new JButton();
		bck.setText("Retourner au menu");
	/*	bck.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//fenetre.dispose();
				ModeDeJeu page = new ModeDeJeu();
				ModeDeJeu.PageModeJeu();
			}
		});*/
		back.add(bck);
		back.setBorder(BorderFactory.createTitledBorder("Annuler la partie"));
		
		JPanel panelDroite = new JPanel();
		panelDroite.setLayout(new BoxLayout(panelDroite, BoxLayout.PAGE_AXIS));
		panelDroite.add(ajout);
		panelDroite.add(score);
		panelDroite.add(coups);
		panelDroite.add(retry);
		panelDroite.add(back);
		
		plateau.add(pieces);
		plateau.add(panelDroite);
		
		SpringLayout.Constraints carteCons = sPlay.getConstraints(pieces);
		carteCons.setY(Spring.constant(5));
		
		SpringLayout.Constraints ajoutCons = sPlay.getConstraints(panelDroite);
		ajoutCons.setY(Spring.constant(5));
		
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)dimension.getHeight();
		int width  = (int)dimension.getWidth();
		
		carteCons.setWidth(Spring.constant(width - (width/4))); //on définit la largeur (en pixels) de la carte
		carteCons.setHeight(Spring.constant(height - (height/16))); //on définit la hauteur (en pixels) de la carte
		
		
		sPlay.putConstraint(SpringLayout.WEST, pieces, 20, SpringLayout.WEST, plateau); 
		sPlay.putConstraint(SpringLayout.WEST, panelDroite, 5, SpringLayout.EAST, pieces);
		
		
		plateau.setLayout(sPlay);
		
		fenetre.setContentPane(plateau);
		fenetre.setVisible(true);
	}

}

