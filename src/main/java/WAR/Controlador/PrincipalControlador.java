
package WAR.Controlador;

import WAR.Decorador.Cafe;
import WAR.Decorador.Expreso;
import WAR.Decorador.TiposDeCafe.Azteca;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class PrincipalControlador {
    
    public static void main(String[] args) {
        Cafe Expreso = new Expreso();
        System.out.println(Expreso.getDescripcion() + "-" + Expreso.getPrecio());
        Expreso = new Azteca(Expreso);
        System.out.println(Expreso.getDescripcion() + Expreso.getPrecio());
    }
}
