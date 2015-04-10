package DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Piece.Piece;



public class CsvRW {
	
	private String link_file;
	
	int nbCaseTotalTab=100;
	
	static int Hoffset=1; // horizontal offset
	static int Voffset=3; // Vertical offset
	
    public CsvRW(final String link) {
    	System.out.println("CsvRW créé");
        this.link_file = link;
    }

    public Piece [] findAllPieces() {
    	
    	System.out.println("Lecture du fichier : findAllPieces");
    	
    	int i=0; 
    	
        Piece[] pieces_tab= new Piece[nbCaseTotalTab];
        
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
							System.out.println("Pièce i="+i);
							final Piece piece = ligneToPiece(ligne);
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

    private static Piece ligneToPiece(String ligne) {
    	
    	System.out.println("Lecture de la pièce");
    	
    	String[] data = ligne.split(";");
    	
        final Piece piece = new Piece(Integer.parseInt(data[Hoffset+0]),Integer.parseInt(data[Hoffset+1]),Integer.parseInt(data[Hoffset+2]),Integer.parseInt(data[Hoffset+3]));

        return piece;
    }

}
