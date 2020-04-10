
package WAR.Decorador.TiposDeCafe;

import WAR.Decorador.Cafe;
import WAR.Decorador.DecoradorCafe;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class CafeConLeche extends DecoradorCafe{

    private Cafe base;   

    public CafeConLeche(Cafe cafe) {
        super(cafe);
        this.base = cafe;
    }
    
    

    @Override
    public String getDescripcion() {
        return "Shot de " + base.getDescripcion() + "con leche[230ml]";
    }

    @Override
    public int getPrecio() {
        return base.getPrecio() + 2000;
    }
}
