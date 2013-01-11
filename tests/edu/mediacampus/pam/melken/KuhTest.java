package edu.mediacampus.pam.melken;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author retokiefer
 */
public class KuhTest {

    @Test
    public void testKuh() {

        Kuh kuh = new Kuh(10);

        for (int i = 1; i <= 5; i++) {
            kuh.werdeGemolken();
        }

        assertEquals(kuh.getMilch(), 5);

    }

    @Test
    public void testGemolken() {

        Kuh kuh = new Kuh(10);

        for (int i = 1; i <= 10; i++) {
            kuh.werdeGemolken();
        }

        assertTrue(kuh.isGemolken());

    }


}
