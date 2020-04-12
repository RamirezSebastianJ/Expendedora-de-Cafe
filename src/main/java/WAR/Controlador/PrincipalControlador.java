package WAR.Controlador;




import WAR.Decorador.Cafe;
import WAR.Decorador.Expreso;
import WAR.Decorador.TiposDeCafe.Americano;
import WAR.Decorador.TiposDeCafe.Azteca;
import WAR.Decorador.TiposDeCafe.CafeBombon;
import WAR.Decorador.TiposDeCafe.CafeConLeche;
import WAR.Decorador.TiposDeCafe.CafeIrlandes;
import WAR.Decorador.TiposDeCafe.CafeVienes;
import WAR.Decorador.TiposDeCafe.Capuchino;
import WAR.Decorador.TiposDeCafe.Carajillo;
import WAR.Decorador.TiposDeCafe.Frappe;
import WAR.Decorador.TiposDeCafe.Macchiato;
import WAR.Decorador.TiposDeCafe.Mocca;
import WAR.Decorador.TiposDeCafe.Ristretto;
import WAR.Logica.PrincipalLogica;
import WAR.Vista.PrincipalVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Juan Sebastian Ramirez Arias
 */
public class PrincipalControlador implements ActionListener{
    PrincipalLogica controlLogica;
    PrincipalVista interfazPrincipal;
    Cafe cafe = new Expreso();

    public PrincipalControlador(){}

    public PrincipalControlador(PrincipalLogica controlLogica, PrincipalVista interfazPrincipal){
    this.controlLogica = controlLogica;
    this.interfazPrincipal = interfazPrincipal;

    //Botones de los Espresos
    this.interfazPrincipal.jButton1.addActionListener(this);
    this.interfazPrincipal.jButton2.addActionListener(this);
    this.interfazPrincipal.jButton3.addActionListener(this);
    this.interfazPrincipal.jButton4.addActionListener(this);
    this.interfazPrincipal.jButton5.addActionListener(this);
    this.interfazPrincipal.jButton6.addActionListener(this);
    this.interfazPrincipal.jButton7.addActionListener(this);
    this.interfazPrincipal.jButton8.addActionListener(this);
    this.interfazPrincipal.jButton9.addActionListener(this);
    this.interfazPrincipal.jButton10.addActionListener(this);
    this.interfazPrincipal.jButton11.addActionListener(this);
    this.interfazPrincipal.jButton12.addActionListener(this);
    this.interfazPrincipal.jButton13.addActionListener(this);

    //Boton de comprar
    this.interfazPrincipal.jButton14.addActionListener(this); 	
    }
  	
    public void iniciar(){
      	interfazPrincipal.setTitle("Expendedora De Cafe");
      	interfazPrincipal.setLocationRelativeTo(null);
    }
  	
    @Override
    public void actionPerformed(ActionEvent ae){
        
        JButton boton = (JButton) ae.getSource();
        String op = boton.getText();
        cafe = new Expreso();
        switch(op){
            //Espresos
            case "1":
                
                controlLogica.setCafe(cafe);
                op = controlLogica.descripcionCafe();
                
                interfazPrincipal.CajonDescripcion.setText(controlLogica.descripcionCafe());
                interfazPrincipal.CajonPrecio.setText(String.valueOf(controlLogica.precioCafe()));
                break;
            case "2":
                
                cafe = new Ristretto (cafe);
                controlLogica.setCafe(cafe);
                interfazPrincipal.CajonDescripcion.setText(controlLogica.descripcionCafe());
                interfazPrincipal.CajonPrecio.setText(String.valueOf(controlLogica.precioCafe()));
                break;
            case "3":
                
                cafe = new Macchiato (cafe);
                controlLogica.setCafe(cafe);
                interfazPrincipal.CajonDescripcion.setText(controlLogica.descripcionCafe());
                interfazPrincipal.CajonPrecio.setText(String.valueOf(controlLogica.precioCafe()));
                break;
            case "4":
               
                cafe = new Americano (cafe);
                controlLogica.setCafe(cafe);
                interfazPrincipal.CajonDescripcion.setText(controlLogica.descripcionCafe());
                interfazPrincipal.CajonPrecio.setText(String.valueOf(controlLogica.precioCafe()));
                break;
            case "5":
               
                cafe = new Carajillo (cafe);
                controlLogica.setCafe(cafe);
                interfazPrincipal.CajonDescripcion.setText(controlLogica.descripcionCafe());
                interfazPrincipal.CajonPrecio.setText(String.valueOf(controlLogica.precioCafe()));
                break;
            case "6":
                
                cafe = new CafeConLeche (cafe);
                controlLogica.setCafe(cafe);
                interfazPrincipal.CajonDescripcion.setText(controlLogica.descripcionCafe());
                interfazPrincipal.CajonPrecio.setText(String.valueOf(controlLogica.precioCafe()));
                break;
            case "7":
                
                cafe = new Capuchino (cafe);
                controlLogica.setCafe(cafe);
                interfazPrincipal.CajonDescripcion.setText(controlLogica.descripcionCafe());
                interfazPrincipal.CajonPrecio.setText(String.valueOf(controlLogica.precioCafe()));
                break;
            case "8":
                
                cafe = new Mocca (cafe);
                controlLogica.setCafe(cafe);
                interfazPrincipal.CajonDescripcion.setText(controlLogica.descripcionCafe());
                interfazPrincipal.CajonPrecio.setText(String.valueOf(controlLogica.precioCafe()));
                break;
            case "9":
                
                cafe = new CafeIrlandes (cafe);
                controlLogica.setCafe(cafe);
                interfazPrincipal.CajonDescripcion.setText(controlLogica.descripcionCafe());
                interfazPrincipal.CajonPrecio.setText(String.valueOf(controlLogica.precioCafe()));
                break;
            case "10":
                
                cafe = new CafeVienes (cafe);
                controlLogica.setCafe(cafe);
                interfazPrincipal.CajonDescripcion.setText(controlLogica.descripcionCafe());
                interfazPrincipal.CajonPrecio.setText(String.valueOf(controlLogica.precioCafe()));
                break;
            case "11":
                
                cafe = new Frappe (cafe);
                controlLogica.setCafe(cafe);
                interfazPrincipal.CajonDescripcion.setText(controlLogica.descripcionCafe());
                interfazPrincipal.CajonPrecio.setText(String.valueOf(controlLogica.precioCafe()));
                break;
            case "12":
                
                cafe = new Azteca (cafe);
                controlLogica.setCafe(cafe);
                interfazPrincipal.CajonDescripcion.setText(controlLogica.descripcionCafe());
                interfazPrincipal.CajonPrecio.setText(String.valueOf(controlLogica.precioCafe()));
                break;
            case "13":
                
                cafe = new CafeBombon (cafe);
                controlLogica.setCafe(cafe);
                interfazPrincipal.CajonDescripcion.setText(controlLogica.descripcionCafe());
                interfazPrincipal.CajonPrecio.setText(String.valueOf(controlLogica.precioCafe()));
                break;

            //Comprar
            case "jButton14":
                break;
        }
        
    }
    
}

