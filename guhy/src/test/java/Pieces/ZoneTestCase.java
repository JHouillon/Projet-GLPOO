package Pieces;

import junit.framework.TestCase;

public class ZoneTestCase extends TestCase
{
	Pieces[] p = {new Pieces(1, 2), new Pieces(2, 2)};
	Pieces tmpP1 = p[0];
	Pieces tmpP2 = p[1];

	public void testInverser()
	{
		new Zone(0, 2, 1, 0, p);

		assertEquals(p[0].getCouleur(0), tmpP1.getCouleur(0));
		assertEquals(p[0].getCouleur(1), tmpP1.getCouleur(1));
		assertEquals(p[0].getCouleur(2), tmpP1.getCouleur(2));
		assertEquals(p[0].getCouleur(3), tmpP1.getCouleur(3));

		assertEquals(p[0].getX_est(), tmpP1.getX_est());
		assertEquals(p[0].getX_sud(), tmpP1.getX_sud());
		assertEquals(p[0].getX_nord(), tmpP1.getX_nord());
		assertEquals(p[0].getX_west(), tmpP1.getX_west());
		
		assertEquals(p[0].getY_est(), tmpP1.getY_est());
		assertEquals(p[0].getY_sud(), tmpP1.getY_sud());
		assertEquals(p[0].getY_nord(), tmpP1.getY_nord());
		assertEquals(p[0].getY_west(), tmpP1.getY_west());

		assertEquals(p[1].getCouleur(0), tmpP2.getCouleur(0));
		assertEquals(p[1].getCouleur(1), tmpP2.getCouleur(1));
		assertEquals(p[1].getCouleur(2), tmpP2.getCouleur(2));
		assertEquals(p[1].getCouleur(3), tmpP2.getCouleur(3));

		assertEquals(p[1].getX_est(), tmpP2.getX_est());
		assertEquals(p[1].getX_sud(), tmpP2.getX_sud());
		assertEquals(p[1].getX_nord(), tmpP2.getX_nord());
		assertEquals(p[1].getX_west(), tmpP2.getX_west());
		
		assertEquals(p[1].getY_est(), tmpP2.getY_est());
		assertEquals(p[1].getY_sud(), tmpP2.getY_sud());
		assertEquals(p[1].getY_nord(), tmpP2.getY_nord());
		assertEquals(p[1].getY_west(), tmpP2.getY_west());
	}

	public void testRotation()
	{
		new Zone(0, 2, 2, 0, p);
		assertEquals(p[0].getCouleur(0), tmpP1.getCouleur(0));
		assertEquals(p[0].getCouleur(1), tmpP1.getCouleur(1));
		assertEquals(p[0].getCouleur(2), tmpP1.getCouleur(2));
		assertEquals(p[0].getCouleur(3), tmpP1.getCouleur(3));

		assertEquals(p[0].getX_est(), tmpP1.getX_est());
		assertEquals(p[0].getX_sud(), tmpP1.getX_sud());
		assertEquals(p[0].getX_nord(), tmpP1.getX_nord());
		assertEquals(p[0].getX_west(), tmpP1.getX_west());
		
		assertEquals(p[0].getY_est(), tmpP1.getY_est());
		assertEquals(p[0].getY_sud(), tmpP1.getY_sud());
		assertEquals(p[0].getY_nord(), tmpP1.getY_nord());
		assertEquals(p[0].getY_west(), tmpP1.getY_west());
	}
}
