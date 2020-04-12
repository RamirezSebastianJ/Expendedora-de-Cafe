
package WAR.Logica;


import WAR.Decorador.Cafe;
import WAR.Decorador.Expreso;


/**
 *
 * @author kai
 */
public class PrincipalLogica {
    int precio;
    String descripcion;
    Cafe cafe = new Expreso();
    
    public PrincipalLogica(){
    }
    public PrincipalLogica(int precio) {
        this.precio = precio;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }
    
    public String descripcionCafe(){
        descripcion = cafe.getDescripcion();
        return descripcion;
    }
    
    public int precioCafe(){
        precio = cafe.getPrecio();
        return precio;
    }

}
