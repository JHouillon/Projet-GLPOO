package Face;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import au.com.bytecode.opencsv.CSVReader;

public class Face {
	
	private String id;
	private Integer face;
	private String couleur;
	
	private Face(String id, Integer face, String  couleur){
		
	}
	
	/*
	 * Récupération d'un fichier .csv et affichage des 
	 * données dans le log
	 * */
	
	public static void main(String[] args) throws Exception{
		JFrame jTable = new JFrame();
		jTable.setSize(1024,720);
		
		/*JTable jTable1 = new JTable();
		
		BufferedReader br = new BufferedReader(new FileReader("src/main/java/Face/faces.csv"));
		CSVReader csv = new CSVReader(br,';');
		
		List<String[] > data = new ArrayList<String[] >();

		String[] nextLine = null;
		while ((nextLine = csv.readNext()) != null) {
		    int size = nextLine.length;

		    // ligne vide
		    if (size == 0) {
		        continue;
		    }
		    String debut = nextLine[0].trim();
		    if (debut.length() == 0 && size == 1) {
		        continue;
		    }

		    // ligne de commentaire
		    if (debut.startsWith("#")) {
		        continue;
		    }
		    data.add(nextLine);
		}*/
		    
	   // jTable.getContentPane().add(jTable1, BorderLayout.CENTER);
	   JPanel pan = new JPanel();
	   JTextField text=null;
		BufferedReader br = new BufferedReader(new FileReader("src/main/java/Face/faces.csv"));
		String ligne = null;
		while ((ligne = br.readLine()) != null){
			// Retourner la ligne dans un tableau
			String[] data = ligne.split(";");

			// Afficher le contenu du tableau
			for (String val : data){

				text = new JTextField(val);
				//System.out.println(val);
			}
		}
		br.close();
		pan.add(text);
		jTable.getContentPane().add(pan);
	    jTable.setVisible(true);
		
	}
	
}
