
package WAR.Decorador;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class Expreso implements Cafe{

    @Override
    public String getDescripcion() {
        return "Café tipo expreso";
    }

    @Override
    public int getPrecio() {
        return 3000;
    }
    
}
