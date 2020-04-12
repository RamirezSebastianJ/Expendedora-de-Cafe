
package WAR.ExpendedoraCafe;

import WAR.Controlador.PrincipalControlador;
import WAR.Logica.PrincipalLogica;
import WAR.Vista.PrincipalVista;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 * @version 09/04/2020
 */

public class Principal  {


    public static void main(String[] args) {
        PrincipalLogica model = new PrincipalLogica();
        PrincipalVista ventanaPricipal = new PrincipalVista();
        PrincipalControlador inspector = new PrincipalControlador(model, ventanaPricipal);
        
        inspector.iniciar();
        ventanaPricipal.setVisible(true);
    }
}
