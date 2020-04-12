
package WAR.Decorador.TiposDeCafe;

import WAR.Decorador.Cafe;
import WAR.Decorador.DecoradorCafe;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class Mocca extends DecoradorCafe{
    private Cafe base;   

    public Mocca(Cafe cafe) {
        super(cafe);
        this.base = cafe;
    }
    
    

    @Override
    public String getDescripcion() {
        return "Doble Shot de " + base.getDescripcion() + "\nleche texturizada y chocolate peruano\n organico 70% cacao [300ml]";
    }

    @Override
    public int getPrecio() {
        return base.getPrecio() + 5000;
    }
}
