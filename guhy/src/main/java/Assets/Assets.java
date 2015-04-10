package Assets;

import java.io.File;

import javax.swing.ImageIcon;

public class Assets {

	ImageIcon [] f_collect;
	ImageIcon [] p_collect;
	
	public Assets(String link_folder_face, String link_csv_pieces) {
		
		String link_piece_i;
		int i=1;
		boolean ok=true;
		
		while(!ok)
		{
			link_piece_i=link_folder_face+i+".png";
			
			if((new File(link_piece_i)).exists())
				this.f_collect[i]= new ImageIcon (link_piece_i);
			
			else ok=false;
			
			i++;
		}
		
		
		
		//this.p_collect = 
		
	}
	
	

}
