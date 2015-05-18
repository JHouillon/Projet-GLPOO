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
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;

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
	final static JPanel plateau = new JPanel();
	static int difficulte;
	static JLabel text = new JLabel();
	static JLabel nb;
	static JEditorPane edit = new JEditorPane();
	
	static MouseEvent e;
	static PointerInfo pointer;
	static Point location;
	static Graphics g;
	
	static int faceAvant;
	
	static int x1min=40, x1max=143, y1min=71, y1max=175;
	
	static int click=0;
	

	static Pieces[] p = new Pieces[18];
	
	public Plateau(final String name, final JFrame fenetre, int difficulte){
		Plateau.name = name;
		Plateau.fenetre = fenetre;
		Plateau.difficulte = difficulte;
		Pieces[] p;
		
		if(difficulte == 0 || difficulte == 1)
		{
			Pieces[] p1 = {new Pieces(1, difficulte), new Pieces(2, difficulte), new Pieces(3, difficulte), new Pieces(4, difficulte), new Pieces(5, difficulte),
				new Pieces(6, difficulte), new Pieces(7, difficulte), new Pieces(8, difficulte), new Pieces(9, difficulte), new Pieces(10, difficulte),
				new Pieces(11, difficulte), new Pieces(12, difficulte), new Pieces(13, difficulte), new Pieces(14, difficulte), new Pieces(15, difficulte),
				new Pieces(16, difficulte)};

			p = p1;
		}
		else if (difficulte == 2)
		{
			Pieces[] p1 = {new Pieces(1, difficulte), new Pieces(2, difficulte), new Pieces(3, difficulte), new Pieces(4, difficulte), new Pieces(5, difficulte),
				new Pieces(6, difficulte), new Pieces(7, difficulte), new Pieces(8, difficulte), new Pieces(9, difficulte), new Pieces(10, difficulte),
				new Pieces(11, difficulte), new Pieces(12, difficulte), new Pieces(13, difficulte), new Pieces(14, difficulte), new Pieces(15, difficulte),
				new Pieces(16, difficulte), new Pieces(17, difficulte), new Pieces(18, difficulte)};

			p = p1;
		}
		else
		{
			Pieces[] p1 = null;

			p = p1;
		}
		Plateau.p = p;
		
		ConfigurationFenetre();	
	}

	public Plateau(String link) {
		
		System.out.println("Création Plateau");
		
		CsvRW ReaderCsv=new CsvRW(link);
		
		Pieces[] tab = ReaderCsv.findAllPieces();
		
		this.piecesTab = tab;
	}

	private static void ConfigurationFenetre() {	
		
		JFrame.setDefaultLookAndFeelDecorated(false);
		fenetre.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLocationRelativeTo(null);
		
		final SpringLayout sPlay = new SpringLayout();
		
		final JPanel pieces = new JPanel();		
		GridLayout grille = new GridLayout(1,1);
		pieces.setLayout(grille);
		pieces.add(new Zone(difficulte, p));
		pieces.addMouseListener(new MouseListener(){

			public void mouseClicked(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
				click++;
				nb.setText("Votre nombre de coup : "+click);
				
				pointer = MouseInfo.getPointerInfo();
				location = pointer.getLocation();
				
				// Limitation de la zone à 4x4 par défaut
                if(difficulte == 0)
                {
				    if(location.x < x1min || location.x > x1max+(105*3) && location.y < y1min || location.y > y1max+(105*3)){
					    text.setText("Vous êtes en dehors de la zone de jeu !");
				    }
				
				    else if(e.getButton() == 3)
				    {
					    pieces.removeAll();
					    pieces.add(new Zone(0, 0, p));
				    }
				
				    else if(location.x >= x1min && location.x <= x1max && location.y >= y1min && location.y <= y1max){
					
					    text.setText("Vous êtes sur la pièce 1,1");
					    pieces.removeAll();
				        pieces.add(new Zone(difficulte, 1, faceAvant, click, p));
				        faceAvant = 1;
				    }
				
				     // Position horizontale des pièces ligne1
				 
				    else if(location.x >= x1min+105 && location.x <= x1max+105 && location.y >= y1min+2 && location.y <= y1max+2){
					    text.setText("Vous êtes sur la pièce 1,2");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 2, faceAvant, click, p));
					    faceAvant = 2;
				    }
				    else if(location.x >= x1min+(105*2) && location.x <= x1max+(105*2) && location.y >= y1min+(2*2) && location.y <= y1max+(2*2)){
					    text.setText("Vous êtes sur la pièce 1,3");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 3, faceAvant, click, p));
					    faceAvant = 3;
				    }

				
				     // Position verticale des pièces colone 1
				 
				    else if(location.x >= x1min+2 && location.x <= x1max+2 && location.y >= y1min+105 && location.y <= y1max+105){
					    text.setText("Vous êtes sur la pièce 2,1");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 5, faceAvant, click, p));
					    faceAvant = 5;
				    }
				    else if(location.x >= x1min+(2*2) && location.x <= x1max+(2*2) && location.y >= y1min+(2*105) && location.y <= y1max+(2*105)){
					    text.setText("Vous êtes sur la pièce 3,1");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 9, faceAvant, click, p));
					    faceAvant = 9;
				    }
				
				
				     // Position horizontale des pièces ligne2
				 
				    else if(location.x >= x1min+2+105 && location.x <= x1max+2+105 && location.y >= y1min+105+2 && location.y <= y1max+105+2){
					    text.setText("Vous êtes sur la pièce 2,2");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 6, faceAvant, click, p));
					    faceAvant = 6;
				    }
				    else if(location.x >= x1min+2+(105*2) && location.x <= x1max+2+(105*2) && location.y >= y1min+105+(2*2) && location.y <= y1max+105+(2*2)){
					    text.setText("Vous êtes sur la pièce 2,3");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 7, faceAvant, click, p));
					    faceAvant = 7;
				    }
				
				
				     // Position horizontale des pièces ligne3
				 
				    else if(location.x >= x1min+(2*2)+105 && location.x <= x1max+(2*2)+105 && location.y >= y1min+(2*105)+2 && location.y <= y1max+(2*105)+2){
					    text.setText("Vous êtes sur la pièce 3,2");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 10, faceAvant, click, p));
					    faceAvant = 10;
				    }
				    else if(location.x >= x1min+(2*2)+(105*2) && location.x <= x1max+(2*2)+(105*2) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
					    text.setText("Vous êtes sur la pièce 3,3");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 11, faceAvant, click, p));
					    faceAvant = 11;
				    }
				
				    // ligne 1
				    if(location.x >= x1min+(105*3) && location.x <= x1max+(105*3) && location.y >= y1min+(2*3) && location.y <= y1max+(2*3)){
					    text.setText("Vous êtes sur la pièce 1,4");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 4, faceAvant, click, p));
					    faceAvant = 4;
				    }
				    // ligne 2
				    else if(location.x >= x1min+2+(105*3) && location.x <= x1max+2+(105*3) && location.y >= y1min+105+(2*3) && location.y <= y1max+105+(2*3)){
					    text.setText("Vous êtes sur la pièce 2,4");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 8, faceAvant, click, p));
					    faceAvant = 8;
				    }
				    // ligne 3
				    else if(location.x >= x1min+(2*3)+(105*3) && location.x <= x1max+(2*3)+(105*3) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
					    text.setText("Vous êtes sur la pièce 3,4");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 12, faceAvant, click, p));
					    faceAvant = 12;
				    }
				    // colonne 1
				    else if(location.x >= x1min+(3*2) && location.x <= x1max+(3*2) && location.y >= y1min+(3*105) && location.y <= y1max+(3*105)){
					    text.setText("Vous êtes sur la pièce 4,1");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 13, faceAvant, click, p));
					    faceAvant = 13;
				    }
				    // ligne 4
				    else if(location.x >= x1min+(2*2)+105 && location.x <= x1max+(2*2)+105 && location.y >= y1min+(3*105)+2 && location.y <= y1max+(3*105)+2){
					    text.setText("Vous êtes sur la pièce 4,2");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 14, faceAvant, click, p));
					    faceAvant = 14;
				    }
				    else if(location.x >= x1min+(2*2)+(105*2) && location.x <= x1max+(2*2)+(105*2) && location.y >= y1min+(3*105)+(3*2) && location.y <= y1max+(3*105)+(3*2)){
					    text.setText("Vous êtes sur la pièce 4,3");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 15, faceAvant, click, p));
					    faceAvant = 15;
				    }
				    else if(location.x >= x1min+(2*3)+(105*3) && location.x <= x1max+(2*3)+(105*3) && location.y >= y1min+(3*105)+(3*2) && location.y <= y1max+(3*105)+(3*2)){
					    text.setText("Vous êtes sur la pièce 4,4");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 16, faceAvant, click, p));
					    faceAvant = 16;
				    }
                }
				else if(difficulte == 2){ 
                    
					// limite de la zone 
					if(location.x < x1min || location.x > x1max+(105*5) && location.y < y1min || location.y > y1max+(105*5)){
						text.setText("Vous êtes en dehors de la zone de jeu !");
					}
				    else if(e.getButton() == 3)
				    {
					    pieces.removeAll();
					    pieces.add(new Zone(0, 0, p));
				    }

                    //Ligne 1
				    else if(location.x >= x1min+(105*2) && location.x <= x1max+(105*2) && location.y >= y1min+(2*2) && location.y <= y1max+(2*2)){
					    text.setText("Vous êtes sur la pièce 1,3");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 1, faceAvant, click, p));
					    faceAvant = 1;
				    }
				    else if(location.x >= x1min+(105*3) && location.x <= x1max+(105*3) && location.y >= y1min+(2*3) && location.y <= y1max+(2*3)){
					    text.setText("Vous êtes sur la pièce 1,4");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 2, faceAvant, click, p));
					    faceAvant = 2;
				    }

				     //Ligne 2
                    else if(location.x >= x1min+2+105 && location.x <= x1max+2+105 && location.y >= y1min+105+2 && location.y <= y1max+105+2){
					    text.setText("Vous êtes sur la pièce 2,2");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 3, faceAvant, click, p));
					    faceAvant = 3;
				    }
                    else if(location.x >= x1min+2+(105*2) && location.x <= x1max+2+(105*2) && location.y >= y1min+105+(2*2) && location.y <= y1max+105+(2*2)){
					    text.setText("Vous êtes sur la pièce 2,3");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 4, faceAvant, click, p));
					    faceAvant = 4;
				    }
                    else if(location.x >= x1min+2+(105*3) && location.x <= x1max+2+(105*3) && location.y >= y1min+105+(2*3) && location.y <= y1max+105+(2*3)){
					    text.setText("Vous êtes sur la pièce 2,4");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 5, faceAvant, click, p));
					    faceAvant = 5;
				    }
					else if(location.x >= x1min+2+(105*4) && location.x <= x1max+2+(105*4) && location.y >= y1min+105+(2*4) && location.y <= y1max+105+(2*4)){
						text.setText("Vous êtes sur la pièce 2,5");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 6, faceAvant, click, p));
					    faceAvant = 6;
					}

                    //Ligne 3
				    else if(location.x >= x1min+(2*2) && location.x <= x1max+(2*2) && location.y >= y1min+(2*105) && location.y <= y1max+(2*105)){
					    text.setText("Vous êtes sur la pièce 3,1");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 7, faceAvant, click, p));
					    faceAvant = 7;
				    }
				    else if(location.x >= x1min+(2*2)+105 && location.x <= x1max+(2*2)+105 && location.y >= y1min+(2*105)+2 && location.y <= y1max+(2*105)+2){
					    text.setText("Vous êtes sur la pièce 3,2");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 8, faceAvant, click, p));
					    faceAvant = 8;
				    }
				    else if(location.x >= x1min+(2*2)+(105*2) && location.x <= x1max+(2*2)+(105*2) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
					    text.setText("Vous êtes sur la pièce 3,3");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 9, faceAvant, click, p));
					    faceAvant = 9;
				    }
                    else if(location.x >= x1min+(2*3)+(105*3) && location.x <= x1max+(2*3)+(105*3) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
					    text.setText("Vous êtes sur la pièce 3,4");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 10, faceAvant, click, p));
					    faceAvant = 10;
				    }
                    else if(location.x >= x1min+(2*4)+(105*4) && location.x <= x1max+(2*4)+(105*4) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
						text.setText("Vous êtes sur la pièce 3,5");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 11, faceAvant, click, p));
					    faceAvant = 11;
					}
                    else if(location.x >= x1min+(2*5)+(105*5) && location.x <= x1max+(2*5)+(105*5) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
						text.setText("Vous êtes sur la pièce 3,6");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 12, faceAvant, click, p));
					    faceAvant = 12;
					}

				    //Ligne 4
				    else if(location.x >= x1min+(2*2)+105 && location.x <= x1max+(2*2)+105 && location.y >= y1min+(3*105)+2 && location.y <= y1max+(3*105)+2){
					    text.setText("Vous êtes sur la pièce 4,2");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 13, faceAvant, click, p));
					    faceAvant = 13;
				    }
				    else if(location.x >= x1min+(2*2)+(105*2) && location.x <= x1max+(2*2)+(105*2) && location.y >= y1min+(3*105)+(3*2) && location.y <= y1max+(3*105)+(3*2)){
					    text.setText("Vous êtes sur la pièce 4,3");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 14, faceAvant, click, p));
					    faceAvant = 14;
				    }
				    else if(location.x >= x1min+(2*3)+(105*3) && location.x <= x1max+(2*3)+(105*3) && location.y >= y1min+(3*105)+(3*2) && location.y <= y1max+(3*105)+(3*2)){
					    text.setText("Vous êtes sur la pièce 4,4");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 15, faceAvant, click, p));
					    faceAvant = 15;
				    }
					else if(location.x >= x1min+(2*4)+(105*4) && location.x <= x1max+(2*4)+(105*4) && location.y >= y1min+(3*105)+(3*2) && location.y <= y1max+(3*105)+(3*2)){
						text.setText("Vous êtes sur la pièce 4,5");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 16, faceAvant, click, p));
					    faceAvant = 16;
					}

					// ligne 5
					else if(location.x >= x1min+(2*2)+(105*2) && location.x <= x1max+(2*2)+(105*2) && location.y >= y1min+(4*105)+(4*2) && location.y <= y1max+(4*105)+(4*2)){
						text.setText("Vous êtes sur la pièce 5,3");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 17, faceAvant, click, p));
					    faceAvant = 17;
					}
					else if(location.x >= x1min+(2*3)+(105*3) && location.x <= x1max+(2*3)+(105*3) && location.y >= y1min+(4*105)+(4*2) && location.y <= y1max+(4*105)+(4*2)){
						text.setText("Vous êtes sur la pièce 5,4");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 18, faceAvant, click, p));
					    faceAvant = 18;
					}
				}
				if(difficulte == 1){
					// limite de la zone 
					if(location.x < x1min || location.x > x1max+(105*5) && location.y < y1min || location.y > y1max+(105*5)){
						text.setText("Vous êtes en dehors de la zone de jeu !");
					}
                    else if(e.getButton() == 3)
				    {
					    pieces.removeAll();
					    pieces.add(new Zone(0, 0, p));
				    }

                    //Ligne 1
				    else if(location.x >= x1min+(105*2) && location.x <= x1max+(105*2) && location.y >= y1min+(2*2) && location.y <= y1max+(2*2)){
					    text.setText("Vous êtes sur la pièce 1,3");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 1, faceAvant, click, p));
					    faceAvant = 1;
				    }
				    else if(location.x >= x1min+(105*3) && location.x <= x1max+(105*3) && location.y >= y1min+(2*3) && location.y <= y1max+(2*3)){
					    text.setText("Vous êtes sur la pièce 1,4");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 2, faceAvant, click, p));
					    faceAvant = 2;
				    }

					//Ligne 2
                    else if(location.x >= x1min+2 && location.x <= x1max+2 && location.y >= y1min+105 && location.y <= y1max+105){
					    text.setText("Vous êtes sur la pièce 2,1");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 3, faceAvant, click, p));
					    faceAvant = 3;
				    }
                    else if(location.x >= x1min+2+105 && location.x <= x1max+2+105 && location.y >= y1min+105+2 && location.y <= y1max+105+2){
					    text.setText("Vous êtes sur la pièce 2,2");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 4, faceAvant, click, p));
					    faceAvant = 4;
				    }
                    else if(location.x >= x1min+2+(105*2) && location.x <= x1max+2+(105*2) && location.y >= y1min+105+(2*2) && location.y <= y1max+105+(2*2)){
					    text.setText("Vous êtes sur la pièce 2,3");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 5, faceAvant, click, p));
					    faceAvant = 5;
				    }
                    else if(location.x >= x1min+2+(105*3) && location.x <= x1max+2+(105*3) && location.y >= y1min+105+(2*3) && location.y <= y1max+105+(2*3)){
					    text.setText("Vous êtes sur la pièce 2,4");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 6, faceAvant, click, p));
					    faceAvant = 6;
				    }
					else if(location.x >= x1min+2+(105*4) && location.x <= x1max+2+(105*4) && location.y >= y1min+105+(2*4) && location.y <= y1max+105+(2*4)){
						text.setText("Vous êtes sur la pièce 2,5");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 7, faceAvant, click, p));
					    faceAvant = 7;
					}
					else if(location.x >= x1min+2+(105*5) && location.x <= x1max+2+(105*5) && location.y >= y1min+105+(2*5) && location.y <= y1max+105+(2*5)){
						text.setText("Vous êtes sur la pièce 2,6");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 8, faceAvant, click, p));
					    faceAvant = 8;
					}

					//Ligne 3
				    else if(location.x >= x1min+(2*2) && location.x <= x1max+(2*2) && location.y >= y1min+(2*105) && location.y <= y1max+(2*105)){
					    text.setText("Vous êtes sur la pièce 3,1");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 9, faceAvant, click, p));
					    faceAvant = 9;
				    }
				    else if(location.x >= x1min+(2*2)+105 && location.x <= x1max+(2*2)+105 && location.y >= y1min+(2*105)+2 && location.y <= y1max+(2*105)+2){
					    text.setText("Vous êtes sur la pièce 3,2");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 10, faceAvant, click, p));
					    faceAvant = 10;
				    }
				    else if(location.x >= x1min+(2*2)+(105*2) && location.x <= x1max+(2*2)+(105*2) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
					    text.setText("Vous êtes sur la pièce 3,3");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 11, faceAvant, click, p));
					    faceAvant = 11;
				    }
                    else if(location.x >= x1min+(2*3)+(105*3) && location.x <= x1max+(2*3)+(105*3) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
					    text.setText("Vous êtes sur la pièce 3,4");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 12, faceAvant, click, p));
					    faceAvant = 12;
				    }
                    else if(location.x >= x1min+(2*4)+(105*4) && location.x <= x1max+(2*4)+(105*4) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
						text.setText("Vous êtes sur la pièce 3,5");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 13, faceAvant, click, p));
					    faceAvant = 13;
					}
                    else if(location.x >= x1min+(2*5)+(105*5) && location.x <= x1max+(2*5)+(105*5) && location.y >= y1min+(2*105)+(2*2) && location.y <= y1max+(2*105)+(2*2)){
						text.setText("Vous êtes sur la pièce 3,6");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 14, faceAvant, click, p));
					    faceAvant = 14;
					}

					//Ligne 4
					else if(location.x >= x1min+(2*2)+(105*2) && location.x <= x1max+(2*2)+(105*2) && location.y >= y1min+(3*105)+(3*2) && location.y <= y1max+(3*105)+(3*2)){
					    text.setText("Vous êtes sur la pièce 4,3");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 15, faceAvant, click, p));
					    faceAvant = 15;
				    }
				    else if(location.x >= x1min+(2*3)+(105*3) && location.x <= x1max+(2*3)+(105*3) && location.y >= y1min+(3*105)+(3*2) && location.y <= y1max+(3*105)+(3*2)){
					    text.setText("Vous êtes sur la pièce 4,4");

					    pieces.removeAll();
					    pieces.add(new Zone(difficulte, 16, faceAvant, click, p));
					    faceAvant = 16;
				    }

				}
				text.repaint();
			}

			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JPanel position = new JPanel();
		position.setLayout(new BoxLayout(position, BoxLayout.PAGE_AXIS));
		text = new JLabel();
		position.add(text);
		position.setBorder(BorderFactory.createTitledBorder("Position de la souris"));
		
		JPanel coups = new JPanel();
		coups.setLayout(new BoxLayout(coups, BoxLayout.PAGE_AXIS));
		nb = new JLabel();
		coups.add(nb);
		coups.setBorder(BorderFactory.createTitledBorder("Nombre de coups"));
	
		JPanel retry = new JPanel();
		retry.setLayout(new BoxLayout(retry, BoxLayout.PAGE_AXIS));
		JButton btn = new JButton();
		btn.setText("Recommencer la partie");
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				Pieces[] p;
				if(difficulte == 0 || difficulte == 1)
				{
					Pieces[] np = {new Pieces(1, difficulte), new Pieces(2, difficulte), new Pieces(3, difficulte), new Pieces(4, difficulte), new Pieces(5, difficulte),
						new Pieces(6, difficulte), new Pieces(7, difficulte), new Pieces(8, difficulte), new Pieces(9, difficulte), new Pieces(10, difficulte),
						new Pieces(11, difficulte), new Pieces(12, difficulte), new Pieces(13, difficulte), new Pieces(14, difficulte), new Pieces(15, difficulte),
						new Pieces(16, difficulte)};
					p = np;
				}
				else if(difficulte == 2)
				{
					Pieces[] np = {new Pieces(1, difficulte), new Pieces(2, difficulte), new Pieces(3, difficulte), new Pieces(4, difficulte), new Pieces(5, difficulte),
							new Pieces(6, difficulte), new Pieces(7, difficulte), new Pieces(8, difficulte), new Pieces(9, difficulte), new Pieces(10, difficulte),
							new Pieces(11, difficulte), new Pieces(12, difficulte), new Pieces(13, difficulte), new Pieces(14, difficulte), new Pieces(15, difficulte),
							new Pieces(16, difficulte), new Pieces(17, difficulte), new Pieces(18, difficulte)};
					p = np;
				}
				else
				{
					Pieces[] np = null;
					p = np;
				}
				
				Plateau.p = p;
				click = 0;
				pieces.removeAll();
				pieces.add(new Zone(0, 0, p));
			}
		});
		retry.add(btn);
		retry.setBorder(BorderFactory.createTitledBorder("Réessayer"));
		
		JPanel back = new JPanel();
		back.setLayout(new BoxLayout(back, BoxLayout.PAGE_AXIS));
		JButton bck = new JButton();
		bck.setText("Retourner au menu");
		bck.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				//new ModeDeJeu(Lancement.name, null);
			}
		});
		
		back.add(bck);
		back.setBorder(BorderFactory.createTitledBorder("Annuler la partie"));
		
		JPanel panelDroite = new JPanel();
		panelDroite.setLayout(new BoxLayout(panelDroite, BoxLayout.PAGE_AXIS));
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

