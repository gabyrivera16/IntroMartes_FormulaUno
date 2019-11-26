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
public class Retiros {

     
    public void Retiros(){
        int terminal = 0;
        int opcion = 0;
        int saldo = 1000;
        int cantidad = 0;
        int monto = 0;
      
        do{
       
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opccion deceada: \n"
                    + "1.consulta de saldo \n"
                    + "2.realizar retiro \n"
                    + "3.salir"));
            
            if (opcion>=1 && opcion<=3){
               
            } else {
                JOptionPane.showMessageDialog(null, "Opcion no permitida, intente de nuevo");
            }    
        if(opcion == 1){
             JOptionPane.showMessageDialog(null, "Su saldo es: "+saldo);
        }else if(opcion == 2){
            monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a retirar: "));
            if(monto>saldo){
            JOptionPane.showMessageDialog(null,"El monto insuficiente ");
            
            }else if (saldo<monto){
                
            
             JOptionPane.showMessageDialog(null,"Su Movimiento ha sido realizado");
             cantidad = monto-saldo; 
             JOptionPane.showMessageDialog(null,"El monto retirado es: "+monto);
        }else if(opcion == 3){
             
             JOptionPane.showMessageDialog(null,"Gracias por utilizar nuestra Plataforma");
              
         }
        }
            
    terminal=terminal+1;     
    }while (terminal <1);
}
//fin void
}//fin clase

   
