package ejerciciogeometria;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @since 01/06/2014
 * @author Tomas Martinez Sempere
 * @see Clase Circulo (la cual testea)
 */
public class CirculoTest {
    
    private final Punto p;
    private final Punto p1;
    private final Punto p2;
    private final Punto p3;
    private Circulo c1;
    private Circulo c2;
    private Circulo c3;
    
    public CirculoTest() {
        p = new Punto(4,-2);
        p1 = new Punto(19,-2);
        p2 = new Punto(4,-2);
        p3 = new Punto(25, -30);
        
        try {
            c1 = new Circulo(p, 0);
            c2 = new Circulo(p, 15);
            c3 = new Circulo(p, -9.5);   // Probamos la exception para radios negativos
        } catch (ExceptionAritmetica e) {
            System.out.println(e);
        }
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of area method, of class Circulo.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        
        assertEquals(0, c1.area(), 0.0000001);
        assertEquals(706.8583470577035, c2.area(), 0.0000001);
        
    }

    /**
     * Test of perimetro method, of class Circulo.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");

        assertEquals(0, c1.perimetro(), 0.0000001);
        assertEquals(94.24777960769, c2.perimetro(), 0.0000001);
        
    }

    /**
     * Test of insidePoint method, of class Circulo.
     */
    @Test
    public void testInsidePoint() {
        System.out.println("insidePoint");
        
        assertFalse(c1.insidePoint(p1));
        assertFalse(c2.insidePoint(p3));
        assertTrue(c2.insidePoint(p2));
        assertTrue(c2.insidePoint(p1));
        
    }
}
