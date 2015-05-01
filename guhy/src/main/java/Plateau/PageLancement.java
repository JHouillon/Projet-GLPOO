package Plateau;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PageLancement {

	final static JFrame lancement = new JFrame();
	static JPanel pan = new JPanel();
	static JPanel pan1 = new JPanel();
	static JLabel im = new JLabel( new ImageIcon( "src/main/java/Plateau/eternity2_.jpg"));
	final static JTextField name = new JTextField("Entrez votre nom");
	static JButton valider = new JButton("Jouer");
	static String nom;
	
	public static void Lancement(){
		
		
		lancement.setTitle("Eternity");
		lancement.setSize(720,720);
		lancement.setResizable(false);
		
		//pan = new JPanel(new GridLayout(0,1));
	//	pan.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		name.setSize(2, 5);
		
		name.addFocusListener(new FocusAdapter() {
		    public void focusGained(FocusEvent e) {
		        name.setText("");
		    }
		});
		
		pan.add(im);
		pan.add(name);
		pan.add(valider);
		

	//	pan1.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		pan.add(name);
		
		lancement.add(pan);
	//	lancement.add(pan1);
	//	lancement.getContentPane().add(pan);
	//	lancement.getContentPane().add(pan1);
		lancement.setVisible(true);
	}

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
