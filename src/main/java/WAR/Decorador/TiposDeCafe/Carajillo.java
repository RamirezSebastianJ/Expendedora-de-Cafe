
package WAR.Decorador.TiposDeCafe;

import WAR.Decorador.Cafe;
import WAR.Decorador.DecoradorCafe;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class Carajillo extends DecoradorCafe{

    private Cafe base;   

    public Carajillo(Cafe cafe) {
        super(cafe);
        this.base = cafe;
    }
    
    

    @Override
    public String getDescripcion() {
        return "Shot de " + base.getDescripcion() + "\ncon Brandy, Orujo o Whisky[200ml]";
    }

    @Override
    public int getPrecio() {
        return base.getPrecio() + 5000;
    }
    
}
