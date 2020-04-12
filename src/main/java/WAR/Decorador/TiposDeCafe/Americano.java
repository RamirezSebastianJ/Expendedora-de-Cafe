
package WAR.Decorador.TiposDeCafe;

import WAR.Decorador.Cafe;
import WAR.Decorador.DecoradorCafe;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class Americano extends DecoradorCafe{

    private Cafe base;   

    public Americano(Cafe cafe) {
        super(cafe);
        this.base = cafe;
    }
    
    

    @Override
    public String getDescripcion() {
        return "Shot de " + base.getDescripcion() + "Doble \ncon Agua Filtrada [200ml]";
    }

    @Override
    public int getPrecio() {
        return base.getPrecio() + 1600;
    }
    
}
