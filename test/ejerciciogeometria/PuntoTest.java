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
 * @see Clase Punto (la cual testea)
 */
public class PuntoTest {
    
    private final Punto p1;
    private final Punto p2;
    private final Punto p3;
    private final Punto p4;
    private final Punto p5;
    private final Punto p6;
    private final Punto p7;
    private final Punto p8;
        
    public PuntoTest() {
        p1 = new Punto(0,0);
        p2 = new Punto(5,0);
        p3 = new Punto(17,6);
        p4 = new Punto(3,-8);
        p5 = new Punto(-2,-6);
        p6 = new Punto(3,-8);
        p7 = new Punto(-9,0);
        p8 = new Punto(1,55);
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
     * Test of distancia method, of class Punto.
     */
    @Test
    public void testDistancia() {
        System.out.println("distancia");

        assertEquals(5, p1.distancia(p2), 0.0000001);
        assertEquals(p1.distancia(p2), p2.distancia(p1), 0.0000001);
        assertEquals(19.79898987322, p3.distancia(p4), 0.0000001);
        assertEquals(p3.distancia(p4), p4.distancia(p3), 0.0000001);
        assertEquals(5.38516480713, p5.distancia(p6), 0.0000001);
        assertEquals(p5.distancia(p6), p6.distancia(p5), 0.0000001);
        assertEquals(55.90169943749, p7.distancia(p8), 0.0000001);
        assertEquals(p7.distancia(p8), p8.distancia(p7), 0.0000001);
        
    }
}
