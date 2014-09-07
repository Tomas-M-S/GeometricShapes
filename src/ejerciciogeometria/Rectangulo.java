package ejerciciogeometria;

/**
 * @since 02/06/2014
 * @author Tomas Martinez Sempere
 * @see Clase abstracta Forma
 */
public class Rectangulo extends Forma {
    
    protected Punto corner1;  // Esquina inferior izquierda
    protected Punto corner2;  // Esquina superior derecha

    /**
     * Constructor para Rectangulo
     * @param corner1
     * @param corner2
     * @throws ExceptionAritmetica si los puntos son incorrectos
     */
    public Rectangulo(Punto corner1, Punto corner2) throws ExceptionAritmetica {
        // Asignamos las esquinas según su posicion
        if (corner1.getX() <= corner2.getX() && corner1.getY() <= corner2.getY()) {
            this.corner1 = corner1;
            this.corner2 = corner2;
        }
        else if (corner1.getX() >= corner2.getX() && corner1.getY() >= corner2.getY()) {
            this.corner1 = corner2;
            this.corner2 = corner1;
        }
        else {
            // No se pueden dar los casos:
            // * (x1 <= x2) y (y1 > y2)
            // * (x1 >= x2) y (y1 < y2)
            // // Esto no es correcto, se debe de corregir //
            throw new ExceptionAritmetica("Los puntos no son válidos, revísalos");
        }
    }

    @Override
    public double area() {
        // |x2 - x1|*|y2 - y1| = Area
        return Math.abs(corner2.getX() - corner1.getX())
                * Math.abs(corner2.getY() - corner1.getY());
    }

    @Override
    public double perimetro() {
        // |x2 - x1|*2 + |y2 - y1|*2 = Perimetro
        return 2*Math.abs(corner2.getX() - corner1.getX())
                + 2*Math.abs(corner2.getY() - corner1.getY());
    }

    @Override
    public boolean insidePoint(Punto p) {
        // Si (x2 <= xp <= x1) y (y2 <= yp <= y1) entonces se sumple la condicion
        return corner1.getX() <= p.getX()
                && corner2.getX() >= p.getX()
                && corner1.getY() <= p.getY()
                && corner2.getY() >= p.getY();
    }
    
    /**
     * @return Devuelve true si es un cuadrado, o false si no lo es
     */
    public boolean esCuadrado() {
        /// Si (x2 - x1) == (y2 - y1), entonces se cumple la condicion
        return (corner2.getX() - corner1.getX())
                == (corner2.getY() - corner1.getY());
    }
    
    // Setters y getters
    public Punto getCorner1() {
        return corner1;
    }
    public Punto getCorner2() {
        return corner2;
    }
    public void setCorner1(Punto corner1) {
        this.corner1 = corner1;
    }
    public void setCorner2(Punto corner2) {
        this.corner2 = corner2;
    }
}
