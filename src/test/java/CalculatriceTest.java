import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest extends TestCase {
    private Calculatrice calculatrice1;
    private Calculatrice calculatrice2;
    private Calculatrice calculatrice3;

    @Override
    public void setUp() throws Exception {
        calculatrice1 = new Calculatrice(5,2);
        calculatrice2 = new Calculatrice(-2,-7);
        calculatrice3 = new Calculatrice(-6, 10);
    }

    @Before


    @Test
    public void testMultiplierDeuxPositifs() {
        int excepted = 10;

        int actual = calculatrice1.multiplier();

        assertEquals(excepted, actual);
    }

    @Test
    public void testMultiplierDeuxNegatif() {
        int excepted = 14;

        int actual = calculatrice2.multiplier();

        assertEquals(excepted, actual);
    }

    @Test
    public void testMultiplierUnNegatifEtUnPositif() {
        int excepted = -60;

        int actual = calculatrice3.multiplier();

        assertEquals(excepted, actual);
    }

    public void testAdditionnerDeuxPositif() {
        int excepted = 7;

        int actual = calculatrice1.additionner();

        assertEquals(excepted, actual);
    }

    public void testDiviser() {
    }

    public void testSoustraire() {
        int excepted = 5;

        int actual = calculatrice2.soustraire();

        assertEquals(excepted, actual);
    }
}
