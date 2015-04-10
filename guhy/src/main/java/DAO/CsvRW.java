package DAO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Piece.Piece;



public class CsvRW {
	
	private String link_file;
	
	int nbCaseTotalTab=100;
	
    public CsvRW(final String link) {
        this.link_file = link;
    }

    public Piece [] findAllPieces() {
    	
    	int i=0; 
    	
        Piece[] pieces_tab= new Piece[nbCaseTotalTab];
        
        try {
        	
	        	BufferedReader br;
			
				br = new BufferedReader(new FileReader(link_file));
				
			
				String ligne = null;
	       
				try {
	        	
						while ((ligne = br.readLine()) != null)
						{
							final Piece piece = ligneToPiece(ligne);
							pieces_tab[i]=piece;
					
							i++;
						}
					} catch (IOException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
	        
				try {
					
						br.close();
					
					} catch (IOException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
	       
	        } catch (FileNotFoundException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}

        	return pieces_tab;
        	
    }

    private static Piece ligneToPiece(String ligne) {
    	
    	String[] data = ligne.split(",");
    	
        final Piece piece = new Piece(Integer.parseInt(data[0]),Integer.parseInt(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3]));

        return piece;
    }

}
