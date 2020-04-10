
package WAR.Decorador.TiposDeCafe;

import WAR.Decorador.Cafe;
import WAR.Decorador.DecoradorCafe;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class CafeIrlandes extends DecoradorCafe{
    
    private Cafe base;   

    public CafeIrlandes(Cafe cafe) {
        super(cafe);
        this.base = cafe;
    }
    
    

    @Override
    public String getDescripcion() {
        return "Shot doble de " + base.getDescripcion() + "con Whisky y una cpa de Crema [300ml]";
    }

    @Override
    public int getPrecio() {
        return base.getPrecio() + 4000;
    }
}
