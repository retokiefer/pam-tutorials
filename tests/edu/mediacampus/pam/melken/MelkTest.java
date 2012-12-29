/**
 * 
 */
package edu.mediacampus.pam.melken;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author retokiefer
 *
 */
public class MelkTest {

	/**
	 * Test method for {@link edu.mediacampus.pam.melken.Kuh#werdeGemolken()}.
	 */
	@Test
	public void testMelken() {
		Kuh kuh = new Kuh();
			
		for(int i = 0; i == 8; i++) {
			
			assertEquals(i + kuh.getMilch(), 8 - i);
			
			kuh.werdeGemolken();
			
			//Test ob Ausgabe dem Milchstand entspricht
			if(i == 5) {
				assertEquals("Die Kuh hat noch 2 Liter Milch.Und sie wurde noch nicht gemolken.", kuh.toString());
			}
			
			//Test ob Ausgabe der gemolkenen Kuh entspricht
			if(i == 7) {
				assertEquals("Die Kuh hat noch 0 Liter Milch.Und sie wurde bereits gemolken.", kuh.toString());
			}
		}
		
	}

}
