package testde;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.*;

  
public class Testde {
	@Test
	public void testCtor() {
		
	DE d = new DE();
	assertNotNull(d);
	}
	@Test
	public void testLancer() {
		DE d = new DE();
		int resultat = d.lancer();
		assertTrue(resultat>0&&resultat<7);
	}

}
