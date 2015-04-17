package DAO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Pieces.Pieces;



public class CsvRW {
	
	private String link_file;
	
	int nbCaseTotalTab=100;
	
	static int Hoffset=1; // horizontal offset
	static int Voffset=3; // Vertical offset
	
    public CsvRW(final String link) {
    	System.out.println("CsvRW créé");
        this.link_file = link;
    }

    public Pieces [] findAllPieces() {
    	
    	System.out.println("Lecture du fichier : findAllPieces");
    	
    	int i=0; 
    	
        Pieces[] pieces_tab= new Pieces[nbCaseTotalTab];
        
        try {
        	
	        	BufferedReader br;
			
				br = new BufferedReader(new FileReader(link_file));
				
				System.out.println("BufferedReader créé");
			
				String ligne = null;
				
				for (int j=0;j<Voffset;j++)
				{
					System.out.println("Ligne "+j+" ignorée");
					ligne = br.readLine(); // on ignore les premières lignes
				}
	       
				try {
	        	
						while ((ligne = br.readLine()) != null)
						{
							final Pieces piece = ligneToPiece(ligne);
							System.out.println("Pièce i="+i);
							System.out.println("N="+piece.getN_face()+"/ E="+piece.getE_face()+"/ S="+piece.getS_face()+"/ O="+piece.getO_face());
							pieces_tab[i]=piece;
							System.out.println("pièce intégrée au tableau");
							
							i++;
						}
					} catch (IOException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
	        
				try {
					
						br.close();
						System.out.println("BufferedReader fermé");
					
					} catch (IOException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
	       
	        } catch (FileNotFoundException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        	return pieces_tab;
        	
    }

    private static Pieces ligneToPiece(String ligne) {

    	String[] data = ligne.split(";");
    	System.out.println("Lecture de la pièce");
    	
        final Pieces piece = new Pieces(Integer.parseInt(data[0]),Integer.parseInt(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3]),0,0);

        return piece;
    }

}
