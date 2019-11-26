/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plataforma.de.servicios;
import javax.swing.JOptionPane;
/**
 *
 * @author jvsan
 */
public class Transaccion {

    public void Transaccion() {
         int terminal = 0;
        int opcion = 0;
        int cuenta = 0;
        int cantidad = 0;
        int monto = 0;
        int saldo = 0;
      
        do{
       
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opccion deceada: \n"
                    + "1.realizar transaccion \n"
                    + "2.salir"));
            
            if (opcion>=1 && opcion<=3){
               
            } else {
                JOptionPane.showMessageDialog(null, "Opcion no permitida, intente de nuevo");
            }    
       
        if(opcion == 2){
            saldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su saldo: "));
            monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a retirar: "));
            cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta a acreditar: "));
            if(monto>saldo){
            JOptionPane.showMessageDialog(null,"El monto insuficiente ");
            
            }else if (saldo<monto){
                
            
             JOptionPane.showMessageDialog(null,"Su Movimiento ha sido realizado");
             cantidad = monto-saldo; 
             JOptionPane.showMessageDialog(null,"El monto a transferir es: "+monto);
             JOptionPane.showMessageDialog(null,"Su saldo es de: "+cantidad);
             JOptionPane.showMessageDialog(null,"Se transfirio el monto de: "+monto+ "a la cuneta:"+cuenta);
        }else if(opcion == 3){
             
             JOptionPane.showMessageDialog(null,"Gracias por utilizar nuestra Plataforma");
              
         }
        }
            
    terminal=terminal+1;     
    }while (terminal <1);
    }
    
    
}
