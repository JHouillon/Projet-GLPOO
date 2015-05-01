package Plateau;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class ModeDeJeu {

	//final JFrame modejeu = new JFrame();		
	static JPanel pan = new JPanel();
	static JPanel pan1 = new JPanel();
	static JPanel pan2 = new JPanel();
	static JLabel titre = new JLabel();
	static JLabel plateau = new JLabel();
	static JRadioButton plateau_carre = new JRadioButton();
	static JRadioButton plateau_triangle = new JRadioButton();
	static JRadioButton plateau_losange = new JRadioButton();
	static JButton valider = new JButton("Jouer");
	static JSlider niveau = new JSlider(JSlider.HORIZONTAL,0,100,50);
	static Container contenu = new JTabbedPane(JSplitPane.VERTICAL_SPLIT);
	
	static String name;
	static JFrame mdj;
	
	public ModeDeJeu(String name, JFrame mdj){
		this.name = name;
		this.mdj = mdj;
		
		System.out.println(name);
		PageModeJeu();
	}
	
	public static void PageModeJeu(){
		
		//pan = new JPanel(new GridLayout(0,1));

		pan.setBorder(BorderFactory.createTitledBorder(""));
		plateau.setText(name);
		pan.add(plateau);
		
		pan1.setBorder(BorderFactory.createTitledBorder("Choix du plateau"));

		//titre.setText("Mode de Jeu");
		
		plateau_carre.setText("Carrée (défaut)");
		plateau_triangle.setText("Triangle");
		plateau_losange.setText("Losange");
		
		//niveau.highlight(Color.BLUE);
		System.out.println(niveau.getValue());
		
	//	pan.add(titre);
	//	pan.add(plateau);
		pan1.add(plateau_carre);
		pan1.add(plateau_triangle);
		pan1.add(plateau_losange);
		pan1.add(niveau);
		
		
		pan2.setBorder(BorderFactory.createTitledBorder("Choix de la Difficulté"));
		
	//	plateau.setText("Choix du plateau");
		pan2.add(niveau);
	//	System.out.println(niveau.getValue());
		
		contenu.add(pan);
		contenu.add(pan1);
	//	contenu.add(pan2);
		
		mdj.getContentPane().setLayout(new BorderLayout());
		mdj.getContentPane().add (contenu);
		//mdj.getContentPane().add (pan1);
		mdj.setVisible(true);

		if(plateau_carre.isSelected()){
			plateau_triangle.setFocusable(false);
		}
	}

}
