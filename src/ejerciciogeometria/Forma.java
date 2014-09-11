package ejerciciogeometria;

/**
 * @since 01/06/2014
 * @author Tomas Martinez Sempere
 * @see Clase herederas: Circulo y Rectangulo
 */
abstract class Forma {
    
    /**
     * @return Devuelve el area de la figura
     */
    public abstract double area();
    
    /**
     * @return Devuelve el perimetro de la figura
     */
    public abstract double perimetro();
    
    /**
     * @param p
     * @return Devuelve true si esta dentro o en el borde de la figura,
     *          o un false si no lo esta
     */
    public abstract boolean insidePoint(Punto p);
    
}
