package ovh.sepradc;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatriceNGTest {
    private Calculatrice calculatrice1;
    private Calculatrice calculatrice2;
    private Calculatrice calculatrice3;
    private Calculatrice calculatrice4;

    @BeforeMethod
    public void setUp() {
        calculatrice1 = new Calculatrice(5,2);
        calculatrice2 = new Calculatrice(-2,-7);
        calculatrice3 = new Calculatrice(-6, 10);
        calculatrice4 = new Calculatrice(10,2);
    }

    @Test
    public void testMultiplierDeuxPositifs() {
        int expected = 10;

        int actual = calculatrice1.multiplier();

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplierDeuxNegatif() {
        int expected = 14;

        int actual = calculatrice2.multiplier();

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplierUnNegatifEtUnPositif() {
        int expected = -60;

        int actual = calculatrice3.multiplier();

        assertEquals(expected, actual);
    }

    @Test
    public void testAdditionnerDeuxPositif() {
        int expected = 7;

        int actual = calculatrice1.additionner();

        assertEquals(expected, actual);
    }

    @Test
    public void testDiviser() {
        int expected = 5;

        int actual = calculatrice4.diviser();

        assertEquals(expected, actual);

    }

    @Test
    public void testSoustraire() {
        int excepted = 5;

        int actual = calculatrice2.soustraire();

        assertEquals(excepted, actual);
    }
}
