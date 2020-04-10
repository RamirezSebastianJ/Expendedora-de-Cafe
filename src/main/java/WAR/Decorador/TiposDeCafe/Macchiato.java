
package WAR.Decorador.TiposDeCafe;

import WAR.Decorador.Cafe;
import WAR.Decorador.DecoradorCafe;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class Macchiato extends DecoradorCafe{

    private Cafe base;   

    public Macchiato(Cafe cafe) {
        super(cafe);
        this.base = cafe;
    }
    
    

    @Override
    public String getDescripcion() {
        return "Doble Shot de " + base.getDescripcion() + " con leche texturizada [100ml]";
    }

    @Override
    public int getPrecio() {
        return base.getPrecio() + 1000;
    }
}
