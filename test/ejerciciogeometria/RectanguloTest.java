package ejerciciogeometria;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @since 02/06/2014
 * @author Tomas Martinez Sempere
 * @see Clase Rectangulo (la cual testea)
 */
public class RectanguloTest {
    
    private final Punto p1;
    private final Punto p2;
    private final Punto p3;
    private final Punto p4;
    private final Punto p5;
    private final Punto p6;
    private final Punto p7;
    private final Punto p8;
    private final Punto p9;
    private final Punto p10;
    private Rectangulo r1;
    private Rectangulo r2;
    private Rectangulo r3;
    private Rectangulo r4;
    private Rectangulo r5;
    private Rectangulo r6;
    private Rectangulo r7;
    private Rectangulo r8;
    private Rectangulo r9;
    private Rectangulo r10;
    private Rectangulo r11;
    private Rectangulo r12;
    
    public RectanguloTest() {
        p1 = new Punto(-5,4);
        p2 = new Punto(-1,5);
        p3 = new Punto(1,4);
        p4 = new Punto(5,5);
        p5 = new Punto(-5,-5);
        p6 = new Punto(-1,-4);
        p7 = new Punto(1,-5);
        p8 = new Punto(5,-4);
        p9 = new Punto(0,0);
        p10 = new Punto(2,0);
        try {
            r1 = new Rectangulo(p1, p2);
            r2 = new Rectangulo(p3, p4);
            r3 = new Rectangulo(p5, p6);
            r4 = new Rectangulo(p7, p8);
            r5 = new Rectangulo(p6, p3);
            r6 = new Rectangulo(p4, p9);
            r7 = new Rectangulo(p6, p2);
            r8 = new Rectangulo(p3, p1);
            r9 = new Rectangulo(p3, p3);
            r10 = new Rectangulo(p2, p8); // Probamos la exception
            r11 = new Rectangulo(p2, p6); // Probamos la exception
            r12 = new Rectangulo(p1, p3); // Probamos la exception
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
     * Test of area method, of class Rectangulo.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        
        assertEquals(4, r1.area(), 0.0000001);
        assertEquals(4, r2.area(), 0.0000001);
        assertEquals(4, r3.area(), 0.0000001);
        assertEquals(4, r4.area(), 0.0000001);
        assertEquals(16, r5.area(), 0.0000001);
        assertEquals(25, r6.area(), 0.0000001);
        assertEquals(0, r7.area(), 0.0000001);
        assertEquals(0, r8.area(), 0.0000001);
        assertEquals(0, r9.area(), 0.0000001);
        
    }

    /**
     * Test of perimetro method, of class Rectangulo.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        
        assertEquals(10, r1.perimetro(), 0.0000001);
        assertEquals(10, r2.perimetro(), 0.0000001);
        assertEquals(10, r3.perimetro(), 0.0000001);
        assertEquals(10, r4.perimetro(), 0.0000001);
        assertEquals(20, r5.perimetro(), 0.0000001);
        assertEquals(20, r6.perimetro(), 0.0000001);
        assertEquals(18, r7.perimetro(), 0.0000001);
        assertEquals(12, r8.perimetro(), 0.0000001);
        assertEquals(0, r9.perimetro(), 0.0000001);

    }

    /**
     * Test of insidePoint method, of class Rectangulo.
     */
    @Test
    public void testInsidePoint() {
        System.out.println("insidePoint");

        assertFalse(r1.insidePoint(p7));
        assertFalse(r2.insidePoint(p5));
        assertFalse(r3.insidePoint(p7));
        assertFalse(r4.insidePoint(p1));
        assertTrue(r5.insidePoint(p9));
        assertTrue(r6.insidePoint(p3));
        assertTrue(r6.insidePoint(p10));
        
    }

    /**
     * Test of esCuadrado method, of class Rectangulo.
     */
    @Test
    public void testEsCuadrado() {
        System.out.println("esCuadrado");
        
        assertFalse(r1.esCuadrado());
        assertFalse(r2.esCuadrado());
        assertFalse(r3.esCuadrado());
        assertFalse(r4.esCuadrado());
        assertFalse(r5.esCuadrado());
        assertTrue(r6.esCuadrado());
        assertFalse(r7.esCuadrado());
        assertFalse(r8.esCuadrado());
        assertTrue(r9.esCuadrado());
        
    }
}
