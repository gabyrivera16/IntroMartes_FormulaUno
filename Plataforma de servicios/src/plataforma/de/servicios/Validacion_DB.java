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
public class Validacion_DB {

    public void Validacion_DB() {
         int can = 0 ;
       do{
              
        String encargado = "Kevin Ruiz"; 
        String puesto = "Gerente";
        String contra = "10987";
        String credencial = "A1";
         
        String en = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String pues = JOptionPane.showInputDialog("Ingrese su puesto: ");
        String con = JOptionPane.showInputDialog("Ingrese su contraseña: ");
        String creden = JOptionPane.showInputDialog("Ingrese su credencial: ");
        
       if(encargado == en){
        if(puesto == pues){
         if(contra == con){
          if(credencial == creden){
          }   
         }   
        }
       }
       JOptionPane.showMessageDialog(null, "Accesso Autorizado");
       can=can+1;
         }while(can <1);

       }     
    }

