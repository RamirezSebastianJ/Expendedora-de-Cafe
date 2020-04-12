
package WAR.Decorador.TiposDeCafe;

import WAR.Decorador.Cafe;
import WAR.Decorador.DecoradorCafe;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class Capuchino extends DecoradorCafe{
    
    private Cafe base;   

    public Capuchino(Cafe cafe) {
        super(cafe);
        this.base = cafe;
    }
    

    @Override
    public String getDescripcion() {
        return  base.getDescripcion() + "Doble con Leche Texturizada\n con algo de cacao [200ml]";
    }

    @Override
    public int getPrecio() {
        return base.getPrecio() + 3000;
    }

}
