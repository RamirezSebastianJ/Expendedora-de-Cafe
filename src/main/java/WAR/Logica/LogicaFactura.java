/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WAR.Logica;

/**
 *
 * @author SERVIDOR
 */
public class LogicaFactura {
    int precio;
    int pago;
    int devuelta;

    public LogicaFactura(int precio, int pago) {
        this.precio = precio;
        this.pago = pago;
        
    }
    
    public int getDevuelta(){
        return pago-precio;
    }
    
    
}
