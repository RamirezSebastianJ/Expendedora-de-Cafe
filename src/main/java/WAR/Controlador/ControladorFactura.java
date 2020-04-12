
package WAR.Controlador;

import WAR.Logica.LogicaFactura;
import WAR.Vista.PrincipalVista;
import WAR.Vista.VistaComprar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author SERVIDOR
 */
public class ControladorFactura implements ActionListener{
    
    VistaComprar ventanaComprar;
    LogicaFactura objetoFactura;
    PrincipalVista interfazPrincipal;
    int precio;
    String descripcion;

    public ControladorFactura(VistaComprar ventanaComprar, int precio, String descripcion, PrincipalVista interfazPrincipal) {
        this.ventanaComprar = ventanaComprar;
        this.precio = precio;
        this.descripcion = descripcion;
        this.interfazPrincipal = interfazPrincipal;
        
        //Botones de los Espresos
        this.ventanaComprar.BotonComprar.addActionListener(this);
    }
    
    public void iniciar(){
      	ventanaComprar.setTitle("Expendedora De Cafe - Fcatura");
      	ventanaComprar.setLocationRelativeTo(null);
        ventanaComprar.setResizable(false);
        ventanaComprar.jTextArea2.setText(descripcion);
        ventanaComprar.jTextArea1.setText(String.valueOf(precio));
        
    }
    
    public int terminar(){
        int resp = JOptionPane.showConfirmDialog(null, "Quieres Seguir Comprando?", "Alerta!", JOptionPane.YES_NO_OPTION);
        return resp;
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        
        JButton boton = (JButton) ae.getSource();
        String op = boton.getText();
        
        if(op == "COMPRAR"){
            String cadenaPrecio = ventanaComprar.CajonPago.getText();
            if(cadenaPrecio.length()>0){
                int pago = Integer.parseInt(cadenaPrecio) ;
                objetoFactura = new LogicaFactura(precio, pago);
                if(objetoFactura.getDevuelta()>0){
                    JOptionPane.showMessageDialog(null, "Gracias Por tuu Compra"+
                        "\n\nDisfruta tu"
                        + descripcion
                        + "\n\n Te sobraron: "
                        + objetoFactura.getDevuelta()
                    );
                    ventanaComprar.setVisible(false);
                    int resp = terminar();
                    if(resp == 0){
                        interfazPrincipal.setVisible(true);
                    }else{
                        System.exit(0);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Tu efectivo no alpcanza para compra el Café"+
                            "\nREVISA TU EFECTIVO"
                    );
                }
            }
        }
    }
    
}
