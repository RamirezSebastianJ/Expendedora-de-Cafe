
package WAR.Decorador.TiposDeCafe;

import WAR.Decorador.Cafe;
import WAR.Decorador.DecoradorCafe;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class Frappe extends DecoradorCafe{

    private Cafe base;   

    public Frappe(Cafe cafe) {
        super(cafe);
        this.base = cafe;
    }
    
    

    @Override
    public String getDescripcion() {
        return "Cafe instantaneo molido\n con hielo y crema de leche  [200ml]";
    }

    @Override
    public int getPrecio() {
        return base.getPrecio() + 2500;
    }
}
