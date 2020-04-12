
package WAR.Decorador.TiposDeCafe;

import WAR.Decorador.Cafe;
import WAR.Decorador.DecoradorCafe;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class CafeVienes extends DecoradorCafe{

    private Cafe base;   

    public CafeVienes(Cafe cafe) {
        super(cafe);
        this.base = cafe;
    }
    
    

    @Override
    public String getDescripcion() {
        return "Shot de " + base.getDescripcion() + "\ncon crema [200ml]";
    }

    @Override
    public int getPrecio() {
        return base.getPrecio() + 2000;
    }
}
