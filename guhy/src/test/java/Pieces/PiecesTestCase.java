package Pieces;

import junit.framework.TestCase;

public class PiecesTestCase extends TestCase
{
	Pieces p = new Pieces(1,0);

	public void testGetId()
	{
		assertEquals(p.getId(), 1);
	}
	
	public void testGetIdFail()
	{
		assertFalse(p.getId() == 0);
	}

	public void testGetX_nord()
	{
		int[] x = {120,20,70};
		assertEquals(p.getX_nord()[0], x[0]);
		assertEquals(p.getX_nord()[1], x[1]);
		assertEquals(p.getX_nord()[2], x[2]);
	}
	
	public void testGetX_nordFail()
	{
		assertFalse(p.getX_nord()[0] == 1);
	}

	public void testSetX_nord()
	{
		int[] x = {50,50,50};
		p.setX_nord(x[0], 0);
		p.setX_nord(x[1], 1);
		p.setX_nord(x[2], 2);

		assertEquals(p.getX_nord()[0], x[0]);
		assertEquals(p.getX_nord()[1], x[1]);
		assertEquals(p.getX_nord()[2], x[2]);
	}

	public void testSetX_nordFail()
	{
		p.setX_nord(0, 0);
		assertFalse(p.getX_nord()[0] == 1);
	}

	public void testGetX_est()
	{
		int[] x = {120,120,70};
		assertEquals(p.getX_est()[0], x[0]);
		assertEquals(p.getX_est()[1], x[1]);
		assertEquals(p.getX_est()[2], x[2]);
	}
	
	public void testGetX_estFail()
	{
		assertFalse(p.getX_est()[0] == 1);
	}

	public void testSetX_est()
	{
		int[] x = {50,50,50};
		p.setX_est(x[0], 0);
		p.setX_est(x[1], 1);
		p.setX_est(x[2], 2);

		assertEquals(p.getX_est()[0], x[0]);
		assertEquals(p.getX_est()[1], x[1]);
		assertEquals(p.getX_est()[2], x[2]);
	}

	public void testSetX_estFail()
	{
		p.setX_est(0, 0);
		assertFalse(p.getX_est()[0] == 1);
	}

	public void testGetX_sud()
	{
		int[] x = {20,120,70};
		assertEquals(p.getX_sud()[0], x[0]);
		assertEquals(p.getX_sud()[1], x[1]);
		assertEquals(p.getX_sud()[2], x[2]);
	}
	
	public void testGetX_sudFail()
	{
		assertFalse(p.getX_sud()[0] == 1);
	}

	public void testSetX_sud()
	{
		int[] x = {50,50,50};
		p.setX_sud(x[0], 0);
		p.setX_sud(x[1], 1);
		p.setX_sud(x[2], 2);

		assertEquals(p.getX_sud()[0], x[0]);
		assertEquals(p.getX_sud()[1], x[1]);
		assertEquals(p.getX_sud()[2], x[2]);
	}

	public void testSetX_sudFail()
	{
		p.setX_sud(0, 0);
		assertFalse(p.getX_sud()[0] == 1);
	}

	public void testGetX_west()
	{
		int[] x = {20,20,70};
		assertEquals(p.getX_west()[0], x[0]);
		assertEquals(p.getX_west()[1], x[1]);
		assertEquals(p.getX_west()[2], x[2]);
	}
	
	public void testGetX_westFail()
	{
		assertFalse(p.getX_west()[0] == 1);
	}

	public void testSetX_west()
	{
		int[] x = {50,50,50};
		p.setX_west(x[0], 0);
		p.setX_west(x[1], 1);
		p.setX_west(x[2], 2);

		assertEquals(p.getX_west()[0], x[0]);
		assertEquals(p.getX_west()[1], x[1]);
		assertEquals(p.getX_west()[2], x[2]);
	}

	public void testSetX_westFail()
	{
		p.setX_west(0, 0);
		assertFalse(p.getX_west()[0] == 1);
	}

	public void testGetY_sud()
	{
		int[] Y = {120,120,70};
		assertEquals(p.getY_sud()[0], Y[0]);
		assertEquals(p.getY_sud()[1], Y[1]);
		assertEquals(p.getY_sud()[2], Y[2]);
	}
	
	public void testGetY_sudFail()
	{
		assertFalse(p.getY_sud()[0] == 1);
	}

	public void testSetY_sud()
	{
		int[] Y = {50,50,50};
		p.setY_sud(Y[0], 0);
		p.setY_sud(Y[1], 1);
		p.setY_sud(Y[2], 2);

		assertEquals(p.getY_sud()[0], Y[0]);
		assertEquals(p.getY_sud()[1], Y[1]);
		assertEquals(p.getY_sud()[2], Y[2]);
	}

	public void testSetY_sudFail()
	{
		p.setY_sud(0, 0);
		assertFalse(p.getY_sud()[0] == 1);
	}

	public void testGetY_est()
	{
		int[] Y = {120,20,70};
		assertEquals(p.getY_est()[0], Y[0]);
		assertEquals(p.getY_est()[1], Y[1]);
		assertEquals(p.getY_est()[2], Y[2]);
	}
	
	public void testGetY_estFail()
	{
		assertFalse(p.getY_est()[0] == 1);
	}

	public void testSetY_est()
	{
		int[] Y = {50,50,50};
		p.setY_est(Y[0], 0);
		p.setY_est(Y[1], 1);
		p.setY_est(Y[2], 2);

		assertEquals(p.getY_est()[0], Y[0]);
		assertEquals(p.getY_est()[1], Y[1]);
		assertEquals(p.getY_est()[2], Y[2]);
	}

	public void testSetY_estFail()
	{
		p.setY_est(0, 0);
		assertFalse(p.getY_est()[0] == 1);
	}

	public void testGetY_nord()
	{
		int[] Y = {20,20,70};
		assertEquals(p.getY_nord()[0], Y[0]);
		assertEquals(p.getY_nord()[1], Y[1]);
		assertEquals(p.getY_nord()[2], Y[2]);
	}
	
	public void testGetY_nordFail()
	{
		assertFalse(p.getY_nord()[0] == 1);
	}

	public void testSetY_nord()
	{
		int[] Y = {50,50,50};
		p.setY_nord(Y[0], 0);
		p.setY_nord(Y[1], 1);
		p.setY_nord(Y[2], 2);

		assertEquals(p.getY_nord()[0], Y[0]);
		assertEquals(p.getY_nord()[1], Y[1]);
		assertEquals(p.getY_nord()[2], Y[2]);
	}

	public void testSetY_nordFail()
	{
		p.setY_nord(0, 0);
		assertFalse(p.getY_nord()[0] == 1);
	}

	public void testGetY_west()
	{
		int[] Y = {20,120,70};
		assertEquals(p.getY_west()[0], Y[0]);
		assertEquals(p.getY_west()[1], Y[1]);
		assertEquals(p.getY_west()[2], Y[2]);
	}
	
	public void testGetY_westFail()
	{
		assertFalse(p.getY_west()[0] == 1);
	}

	public void testSetY_west()
	{
		int[] Y = {50,50,50};
		p.setY_west(Y[0], 0);
		p.setY_west(Y[1], 1);
		p.setY_west(Y[2], 2);

		assertEquals(p.getY_west()[0], Y[0]);
		assertEquals(p.getY_west()[1], Y[1]);
		assertEquals(p.getY_west()[2], Y[2]);
	}

	public void testSetY_westFail()
	{
		p.setY_west(0, 0);
		assertFalse(p.getY_west()[0] == 1);
	}

	public void testGetCouleurInt()
	{
		String[] x = {"V","R","B","V"};
		assertEquals(p.getCouleur(0), x[0]);
		assertEquals(p.getCouleur(1), x[1]);
		assertEquals(p.getCouleur(2), x[2]);
		assertEquals(p.getCouleur(3), x[3]);
	}

	public void testGetCouleur()
	{
		String[] x = {"V","R","B","V"};
		assertEquals(p.getCouleur()[0], x[0]);
		assertEquals(p.getCouleur()[1], x[1]);
		assertEquals(p.getCouleur()[2], x[2]);
		assertEquals(p.getCouleur()[3], x[3]);
	}

	public void testSetCouleurStringArray()
	{
		String[] x = {"V","R","B","V"};
		p.setCouleur(x[0], 0);
		p.setCouleur(x[1], 1);
		p.setCouleur(x[2], 2);
		p.setCouleur(x[3], 3);

		assertEquals(p.getCouleur()[0], x[0]);
		assertEquals(p.getCouleur()[1], x[1]);
		assertEquals(p.getCouleur()[2], x[2]);
		assertEquals(p.getCouleur()[3], x[3]);
	}

	public void testSetCouleurStringInt()
	{
		String[] x = {"V","R","B","V"};
		p.setCouleur(x[0], 0);
		p.setCouleur(x[1], 1);
		p.setCouleur(x[2], 2);
		p.setCouleur(x[3], 3);
		
		assertEquals(p.getCouleur(0), x[0]);
		assertEquals(p.getCouleur(1), x[1]);
		assertEquals(p.getCouleur(2), x[2]);
		assertEquals(p.getCouleur(3), x[3]);
	}
}
