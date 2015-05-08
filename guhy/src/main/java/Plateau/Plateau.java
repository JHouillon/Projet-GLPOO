package Plateau;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

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
	
	static int nbCaseTotalTab=100;
	static String name;
	static JFrame fenetre;
	static int difficulte;
	static JLabel text = new JLabel();
	static JEditorPane edit = new JEditorPane();
	
	static MouseEvent e;
	static PointerInfo pointer;
	static Point location;
	static Zone zone = new Zone(difficulte);
	static Graphics g;
	
	static int x,y;
	static int x1min=40, x1max=143, y1min=71, y1max=175;
	
	public Plateau(String name, JFrame fenetre, int difficulte){
		Plateau.name = name;
		Plateau.fenetre = fenetre;
		Plateau.difficulte = difficulte;
		
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
		pieces.add(new Zone(difficulte));
		pieces.addMouseMotionListener(new MouseMotionListener(){

			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub
				pointer = MouseInfo.getPointerInfo();
				location = pointer.getLocation();
				text.setText("Position : "+location.x+" ; "+location.y);
					
				if(location.x >= x1min && location.x <= x1max && location.y >= y1min && location.y <= y1max){
					text.setText("Vous êtes sur la pièce 1,1");
				}
				
				/*
				 * Position horizontale des pièces ligne1
				 */
				else if(location.x >= x1min+105 && location.x <= x1max+105 && location.y >= y1min+2 && location.y <= y1max+2){
					text.setText("Vous êtes sur la pièce 1,2");
				}
				else if(location.x >= x1min+(105*2) && location.x <= x1max+(105*2) && location.y >= y1min+(2*2) && location.y <= y1max+(2*2)){
					text.setText("Vous êtes sur la pièce 1,3");
				}

				/*
				 * Position verticale des pièces colone 1
				 */
				else if(location.x >= x1min+2 && location.x <= x1max+2 && location.y >= y1min+105 && location.y <= y1max+105){
					text.setText("Vous êtes sur la pièce 2,1");
				}
				else if(location.x >= x1min+(2*2) && location.x <= x1max+(2*2) && location.y >= y1min+(2*105) && location.y <= y1max+(2*105)){
					text.setText("Vous êtes sur la pièce 3,1");
				}
				
				/*
				 * Position horizontale des pièces ligne2
				 */
				else if(location.x >= x1min+2+105 && location.x <= x1max+2+105 && location.y >= y1min+105+2 && location.y <= y1max+105+2){
					text.setText("Vous êtes sur la pièce 2,2");
				}
				else if(location.x >= x1min+2+(105*2) && location.x <= x1max+2+(105*2) && location.y >= y1min+105+(2*2) && location.y <= y1max+105+(2*2)){
					text.setText("Vous êtes sur la pièce 2,3");
				}
				
				/*
				 * Position horizontale des pièces ligne3
				 */
				else if(location.x >= x1min+(2*2)+105 && location.x <= x1max+(2*2)+105 && location.y >= y1min+(2*105)+2 && location.y <= y1max+(2*105)+2){
					text.setText("Vous êtes sur la pièce 3,2");
				}
				else if(location.x >= x1min+(2*2)+(105*2) && location.x <= x1max+(2*2)+(105*2) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
					text.setText("Vous êtes sur la pièce 3,3");
				}
				
				if(difficulte >= 2){
					// ligne 1
					if(location.x >= x1min+(105*3) && location.x <= x1max+(105*3) && location.y >= y1min+(2*3) && location.y <= y1max+(2*3)){
						text.setText("Vous êtes sur la pièce 1,4");
					}
					// ligne 2
					else if(location.x >= x1min+2+(105*3) && location.x <= x1max+2+(105*3) && location.y >= y1min+105+(2*3) && location.y <= y1max+105+(2*3)){
						text.setText("Vous êtes sur la pièce 2,4");
					}
					// ligne 3
					else if(location.x >= x1min+(2*3)+(105*3) && location.x <= x1max+(2*3)+(105*3) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
						text.setText("Vous êtes sur la pièce 3,4");
					}
					// colonne 1
					else if(location.x >= x1min+(3*2) && location.x <= x1max+(3*2) && location.y >= y1min+(3*105) && location.y <= y1max+(3*105)){
						text.setText("Vous êtes sur la pièce 4,1");
					}
					// ligne 4
					else if(location.x >= x1min+(2*2)+105 && location.x <= x1max+(2*2)+105 && location.y >= y1min+(3*105)+2 && location.y <= y1max+(3*105)+2){
						text.setText("Vous êtes sur la pièce 4,2");
					}
					else if(location.x >= x1min+(2*2)+(105*2) && location.x <= x1max+(2*2)+(105*2) && location.y >= y1min+(3*105)+(3*2) && location.y <= y1max+(3*105)+(3*2)){
						text.setText("Vous êtes sur la pièce 4,3");
					}
					else if(location.x >= x1min+(2*3)+(105*3) && location.x <= x1max+(2*3)+(105*3) && location.y >= y1min+(3*105)+(3*2) && location.y <= y1max+(3*105)+(3*2)){
						text.setText("Vous êtes sur la pièce 4,4");
					}
				}
				if(difficulte >= 3){
					// ligne 1
					if(location.x >= x1min+(105*4) && location.x <= x1max+(105*4) && location.y >= y1min+(2*4) && location.y <= y1max+(2*4)){
						text.setText("Vous êtes sur la pièce 1,5");
					}
					// ligne 2
					else if(location.x >= x1min+2+(105*4) && location.x <= x1max+2+(105*4) && location.y >= y1min+105+(2*4) && location.y <= y1max+105+(2*4)){
						text.setText("Vous êtes sur la pièce 2,5");
					}
					// ligne 3
					else if(location.x >= x1min+(2*4)+(105*4) && location.x <= x1max+(2*4)+(105*4) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
						text.setText("Vous êtes sur la pièce 3,5");
					}
					// ligne 4
					else if(location.x >= x1min+(2*4)+(105*4) && location.x <= x1max+(2*4)+(105*4) && location.y >= y1min+(3*105)+(3*2) && location.y <= y1max+(3*105)+(3*2)){
						text.setText("Vous êtes sur la pièce 4,5");
					}
					// colonne 1
					else if(location.x >= x1min+(4*2) && location.x <= x1max+(4*2) && location.y >= y1min+(4*105) && location.y <= y1max+(4*105)){
						text.setText("Vous êtes sur la pièce 5,1");
					}
					// ligne 5
					else if(location.x >= x1min+(2*2)+105 && location.x <= x1max+(2*2)+105 && location.y >= y1min+(4*105)+2 && location.y <= y1max+(4*105)+2){
						text.setText("Vous êtes sur la pièce 5,2");
					}
					else if(location.x >= x1min+(2*2)+(105*2) && location.x <= x1max+(2*2)+(105*2) && location.y >= y1min+(4*105)+(4*2) && location.y <= y1max+(4*105)+(4*2)){
						text.setText("Vous êtes sur la pièce 5,3");
					}
					else if(location.x >= x1min+(2*3)+(105*3) && location.x <= x1max+(2*3)+(105*3) && location.y >= y1min+(4*105)+(4*2) && location.y <= y1max+(4*105)+(4*2)){
						text.setText("Vous êtes sur la pièce 5,4");
					}
					else if(location.x >= x1min+(2*4)+(105*4) && location.x <= x1max+(2*4)+(105*4) && location.y >= y1min+(4*105)+(4*2) && location.y <= y1max+(4*105)+(4*2)){
						text.setText("Vous êtes sur la pièce 5,5");
					}
				}
				if(difficulte == 4){
					// ligne 1
					if(location.x >= x1min+(105*5) && location.x <= x1max+(105*5) && location.y >= y1min+(2*5) && location.y <= y1max+(2*5)){
						text.setText("Vous êtes sur la pièce 1,6");
					}
					// ligne 2
					else if(location.x >= x1min+2+(105*5) && location.x <= x1max+2+(105*5) && location.y >= y1min+105+(2*5) && location.y <= y1max+105+(2*5)){
						text.setText("Vous êtes sur la pièce 2,6");
					}
					// ligne 3
					else if(location.x >= x1min+(2*5)+(105*5) && location.x <= x1max+(2*5)+(105*5) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
						text.setText("Vous êtes sur la pièce 3,6");
					}
					// ligne 4
					else if(location.x >= x1min+(2*5)+(105*5) && location.x <= x1max+(2*5)+(105*5) && location.y >= y1min+(3*105)+(3*2) && location.y <= y1max+(3*105)+(3*2)){
						text.setText("Vous êtes sur la pièce 4,6");
					}
					// ligne 5
					else if(location.x >= x1min+(2*5)+(105*5) && location.x <= x1max+(2*5)+(105*5) && location.y >= y1min+(4*105)+(4*2) && location.y <= y1max+(4*105)+(4*2)){
						text.setText("Vous êtes sur la pièce 5,6");
					}
					// colonne 1
					else if(location.x >= x1min+(5*2) && location.x <= x1max+(5*2) && location.y >= y1min+(5*105) && location.y <= y1max+(5*105)){
						text.setText("Vous êtes sur la pièce 6,1");
					}
					// ligne 5
					else if(location.x >= x1min+(2*2)+105 && location.x <= x1max+(2*2)+105 && location.y >= y1min+(5*105)+2 && location.y <= y1max+(5*105)+2){
						text.setText("Vous êtes sur la pièce 6,2");
					}
					else if(location.x >= x1min+(2*2)+(105*2) && location.x <= x1max+(2*2)+(105*2) && location.y >= y1min+(5*105)+(5*2) && location.y <= y1max+(5*105)+(5*2)){
						text.setText("Vous êtes sur la pièce 6,3");
					}
					else if(location.x >= x1min+(2*3)+(105*3) && location.x <= x1max+(2*3)+(105*3) && location.y >= y1min+(5*105)+(5*2) && location.y <= y1max+(5*105)+(5*2)){
						text.setText("Vous êtes sur la pièce 6,4");
					}
					else if(location.x >= x1min+(2*4)+(105*4) && location.x <= x1max+(2*4)+(105*4) && location.y >= y1min+(5*105)+(5*2) && location.y <= y1max+(5*105)+(5*2)){
						text.setText("Vous êtes sur la pièce 6,5");
					}
					else if(location.x >= x1min+(2*5)+(105*5) && location.x <= x1max+(2*5)+(105*5) && location.y >= y1min+(5*105)+(5*2) && location.y <= y1max+(5*105)+(5*2)){
						text.setText("Vous êtes sur la pièce 6,6");
					}
				}
				text.repaint();
			}
			
		});
		
		JPanel ajout = new JPanel();
		ajout.setLayout(new BoxLayout(ajout, BoxLayout.PAGE_AXIS));
		JButton plus = new JButton();
		plus.setText("Rafraîchissement");
		plus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				ConfigurationFenetre();
			}
		});
		ajout.add(plus);
		ajout.setBorder(BorderFactory.createTitledBorder("Rafraîchissement du plateau"));
		
		JPanel position = new JPanel();
		position.setLayout(new BoxLayout(position, BoxLayout.PAGE_AXIS));
		text = new JLabel();
		position.add(text);
		position.setBorder(BorderFactory.createTitledBorder("Position de la souris"));
		
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
		bck.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ModeDeJeu mdj = new ModeDeJeu(name, fenetre);
				mdj.PageModeJeu();
				plateau.setVisible(false);
			}
		});
		back.add(bck);
		back.setBorder(BorderFactory.createTitledBorder("Annuler la partie"));
		
		JPanel panelDroite = new JPanel();
		panelDroite.setLayout(new BoxLayout(panelDroite, BoxLayout.PAGE_AXIS));
		panelDroite.add(ajout);
		panelDroite.add(position);
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

