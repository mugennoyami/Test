

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse HotelTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HotelTest
{
    private Hotel Hotel;
    private Zimmer zimmer1;
    private Zimmer zimmer2;

    /**
     * Konstruktor fuer die Test-Klasse HotelTest
     */
    public HotelTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        Hotel = new Hotel();
        zimmer1 = new Zimmer(6, 50);
        zimmer2 = new Zimmer(4, 30);
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGibAnzahlBetten()
    {
        assertEquals(10, Hotel.gibAnzahlBetten());
    }
}


