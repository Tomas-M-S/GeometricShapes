package ejerciciogeometria;

/**
 * @since 01/06/2014
 * @author Tomas Martinez Sempere
 */
public class Punto {
    
    protected double x;
    protected double y;

    /**
     * Constructor para Punto
     * @param x
     * @param y 
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * @param p
     * @return Devuelve la distancia entre dos puntos
     */
    public double distancia(Punto p) {
        // Sqrt((x1 - x2)^2 + (y1 - y2)^2) = Distancia
        return Math.sqrt(Math.pow((x-p.getX()), 2) + Math.pow((y-p.getY()), 2));
    }
    
    // Setters y getters
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
