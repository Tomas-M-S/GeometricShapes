package ejerciciogeometria;

/**
 * Main class
 * @since 01/06/2014
 * @author Tomas Martinez Sempere
 */
public class EjercicioGeometria {

    /**
     * Function main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Probamos la exception para radio negativo en Circulo
        try {
            Circulo cir = new Circulo(new Punto(5, 5), -14);
        } catch (ExceptionAritmetica e) {
            System.out.println(e);
        }
        
        // Probamos la exception para puntos incorrectos en Rectangulo
        try {
            Rectangulo rec1 = new Rectangulo(new Punto(1, 8), new Punto (8, 1));
        } catch (ExceptionAritmetica e) {
            System.out.println(e);
        }
        
        try {
            Rectangulo rec2 = new Rectangulo(new Punto(8, 1), new Punto (1, 8));
        } catch (ExceptionAritmetica e) {
            System.out.println(e);
        }
    }
}
