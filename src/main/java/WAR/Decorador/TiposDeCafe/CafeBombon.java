
package WAR.Decorador.TiposDeCafe;

import WAR.Decorador.Cafe;
import WAR.Decorador.DecoradorCafe;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class CafeBombon extends DecoradorCafe{

    private Cafe base;   

    public CafeBombon(Cafe cafe) {
        super(cafe);
        this.base = cafe;
    }


    @Override
    public String getDescripcion() {
        return "Shot de " + base.getPrecio() + "endulzado con leche condensada.";
    }

    @Override
    public int getPrecio() {
        return base.getPrecio() + 2200;
    }

}
