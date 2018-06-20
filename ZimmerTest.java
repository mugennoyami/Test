

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse ZimmerTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ZimmerTest
{
    private Hotel HotelBooster;
    private Zimmer zimmer1;
    private Zimmer Zimmer1;
    private Zimmer Zimmer2;
    private Person person1;
    private Person person2;

    
    
    
    
    
    

    
    
    
    
    
    

    /**
     * Konstruktor fuer die Test-Klasse ZimmerTest
     */
    public ZimmerTest()
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
        HotelBooster = new Hotel();
        zimmer1 = new Zimmer(4, 60);
        Zimmer1 = new Zimmer(4, 30);
        Zimmer2 = new Zimmer(2, 20);
        person1 = new Person("Simon", 18);
        person2 = new Person("Memo", 18);
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
        assertEquals(4, Zimmer1.gibAnzBetten());
        assertEquals(2, Zimmer2.gibAnzBetten());
    }

    @Test
    public void testGibPreis()
    {
        assertEquals(30, Zimmer1.gibPreis(), 0.1);
        assertEquals(20, Zimmer2.gibPreis(), 0.1);
    }

    @Test
    public void testIstFrei()
    {
        assertEquals(true, Zimmer1.istFrei());
        assertEquals(true, Zimmer2.istFrei());
    }

    @Test
    public void testPersonHinzufuegen()
    {
        Zimmer1.personHinzufuegen(person1);
        Zimmer2.personHinzufuegen(person2);
        Zimmer1.personHinzufuegen(person2);
    }

    @Test
    public void testPersonEntfernen()
    {
        Zimmer1.personHinzufuegen(person1);
        Zimmer1.personEntfernen(person1);
    }

    @Test
    public void testPersonenEntfernen()
    {
        Zimmer1.personHinzufuegen(person1);
        Zimmer1.personHinzufuegen(person2);
        Zimmer1.personenEntfernen("m");
    }
}






