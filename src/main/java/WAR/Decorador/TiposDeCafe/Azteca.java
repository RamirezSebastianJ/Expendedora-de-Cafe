
package WAR.Decorador.TiposDeCafe;

import WAR.Decorador.Cafe;
import WAR.Decorador.DecoradorCafe;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class Azteca extends DecoradorCafe{
    
    private Cafe base;   

    public Azteca(Cafe cafe) {
        super(cafe);
        this.base = cafe;
    }

    @Override
    public String getDescripcion() {
        return "Cafe Helado con una bola\n de Helado de Cholate";
    }

    @Override
    public int getPrecio() {
        return base.getPrecio() + 4000;
    }


}
