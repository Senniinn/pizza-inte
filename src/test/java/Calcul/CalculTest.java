package Calcul;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculTest {
    private Calculs c1 = null;
    private Calculs c2 = null;
    private Calculs c3 = null;

    /**
     * Initialise les valeurs avant chaque test
     */
    @Before
    public void setUp() throws Exception
    {
        c1 = new Calculs(1,2);
        c2 = new Calculs(10,20);
        c3 = new Calculs(100,200);
    }

    /**
     * Test method for {@link Calculs#multiplier()}
     */
    @Test
    public void testMultiplier()
    {
        if(c1.multiplier() != 2)
        {
            fail("Methode multiplier non conforme 2*1=2 ne fonctionne pas.");
        }
        assertEquals(c1.multiplier(), 2);
    }

    /**
     * Test method for {@link Calculs#additionner()}
     */
    @Test
    public void testAdditionner() {
        assertEquals(c1.additionner(), 3);
    }


}
