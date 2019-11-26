/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Historial;
import javax.swing.JOptionPane;
/**
 *
 * @author jvsan
 */
public class Historial {
 static String mensaje = "" ;
    public static void Historial() {
        int can=0;
        do{
     mensaje = JOptionPane.showInputDialog("Ingrese la hora de accesso");
        JOptionPane.showMessageDialog(null, "Gracias por ingresar la hora, puede continuar ");
        can = can + 1;
        }while(can<1);
    }
    
    
}
