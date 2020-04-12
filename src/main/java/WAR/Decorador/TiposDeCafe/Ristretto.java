
package WAR.Decorador.TiposDeCafe;

import WAR.Decorador.Cafe;
import WAR.Decorador.DecoradorCafe;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class Ristretto extends DecoradorCafe{
    private Cafe base;   

    public Ristretto(Cafe cafe) {
        super(cafe);
        this.base = cafe;
    }
    
    

    @Override
    public String getDescripcion() {
        return "Extraccion corta de \nun doble Shot de " + base.getDescripcion() + " [300ml]";
    }

    @Override
    public int getPrecio() {
        return base.getPrecio() + 500;
    }
}
