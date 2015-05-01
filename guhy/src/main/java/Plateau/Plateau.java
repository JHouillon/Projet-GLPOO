package Plateau;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import DAO.CsvRW;
import Pieces.Pieces;
import Pieces.Zone;

public class Plateau {
	
	Pieces [] piecesTab;
	static Zone zone = new Zone();
	
	static int nbCaseTotalTab=100;
	static String name;
	static JFrame fenetre;
	
	public Plateau(String name, JFrame fenetre){
		this.name = name;
		this.fenetre = fenetre;
		
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
		//JFrame fenetre = new JFrame();
		
		Menu menu = new Menu();
		
		JPanel pan = new JPanel();
		JPanel pan1 = new JPanel();
		//JPanel pan1 = new JPanel();
		
		//JTextField text = new JTextField("Maxime a un petit zizi !");
		//JTextField text1 = new JTextField("Daniel à le sida !");
		
		fenetre.setSize(720, 720);
		fenetre.setTitle(name);		

		//JLabel im = new JLabel( new ImageIcon( "src/main/java/Pieces/ESIEA_2014_logo.jpg"));
		
		//pan.setBackground(Color.RED);
		//pan.add(text);
		//pan.add(im);
		//pan.setSize(60, 60);
		//pan1.setSize(60, 60);
		
		pan.add(pan1);
		pan1.add(zone);

		pan.setBounds(0, 0, 60, 60);
		pan1.setBounds(60, 60, 60, 60);

	//	System.out.println(pan.getLocation());
	//	System.out.println(pan1.getLocation());
		
		//pan1.setBackground(Color.ORANGE);
		//pan1.add(text1);
		
		fenetre.setJMenuBar(menu);
		fenetre.setContentPane(pan);
		fenetre.setContentPane(pan1);
		//fenetre.getContentPane().add(pan);
		//fenetre.getContentPane().add(pan1);
		fenetre.setLayout(new GridLayout());
		fenetre.setVisible(true);
	}

}

