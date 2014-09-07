package ejerciciogeometria;

/**
 * @since 01/06/2014
 * @author Tomas Martinez Sempere
 * @see Clase abstracta Forma
 */
public class Circulo extends Forma {
    
    protected Punto centro;  // Centro del circulo
    protected double radio;  // Radio del circulo

    /**
     * Constructor para Circulo
     * @param centro
     * @param radio
     * @throws ExceptionAritmetica si el radio es negativo
     */
    public Circulo(Punto centro, double radio) throws ExceptionAritmetica {
        if ( radio >= 0 ) {
            this.centro = centro;
            this.radio = radio;
        }
        else {
            // Para el caso de radio negativo
            throw new ExceptionAritmetica("El radio no puede ser negativo");
        }
    }
    
    @Override
    public double area() {
        // r^2 * Pi = area
        return Math.pow(radio, 2)*Math.PI;
    }

    @Override
    public double perimetro() {
        // 2*r*Pi = Prerimetro
        return 2*radio*Math.PI;
    }

    @Override
    public boolean insidePoint(Punto p) {
        return p.distancia(centro)<=radio;
    }
    
    // Setters y getters
    public Punto getCentro() {
        return centro;
    }
    public double getRadio() {
        return radio;
    }
    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
