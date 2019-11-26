/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plataforma.de.servicios;

import javax.swing.JOptionPane;
import Validacion.Validacion_contra;
import Historial.Historial;
/**
 *
 * @author jvsan
 */
public class PlataformaDeServicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Validacion_contra.Validacion_contra();
    
     int menu = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la plataforma de servicios de la empresa F1 \n"
       + "Seleccione: \n "
       + "1-Consultar su saldo:\n"
       + "2-Transaccion: \n"
       + "3-Retiros:\n"
       + "4-Ingreso a la DB: "));
      
      switch(menu){
          case 1:
              Consulta con = new Consulta();
              con.Consulta();
              
              break;
              
          case 2:
               Historial.Historial();
               Tipo_Moneda moneda = new Tipo_Moneda();
               moneda.Tipo_Moneda();
               Transaccion tran = new Transaccion();
               tran.Transaccion();
              break;
              
          case 3:
               Historial.Historial();
               Tipo_Moneda mon = new Tipo_Moneda();
               mon.Tipo_Moneda();
               Retiros re = new Retiros();
               re.Retiros();
              break;
          
          case 4:
             int mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña de acceso, Señor Gerente"));
             if(mensaje == 10987){
                Validacion_DB dato = new Validacion_DB();
               dato.Validacion_DB();
               
             }else if(mensaje != 10987){
                 JOptionPane.showMessageDialog(null, "Accesso Denegado");
                 System.exit(0);
              }
              DB dato = new DB();
              dato.DB();
               
              break;
              
      }
        
    }
    
}
