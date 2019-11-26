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
public class Validacion {

    public void Validacion() {
            int cant=0;              
do{  
  
int mensaje = 0;
  int codigo  = 0;
  int veri [] = new int[21];
veri[0] = 1000;  
veri[1] = 2000;
veri[2] = 3000;
veri[3] = 4000;
veri[4] = 5000;
veri[5] = 6000;
veri[6] = 7000;
veri[7] = 8000;
veri[8] = 9000;
veri[9] = 1000;
veri[10]= 1100;
veri[11]= 1200;
veri[12]= 1300;
veri[13]= 1400;
veri[14]= 1500;
veri[15]= 1600;
veri[16]= 1700;
veri[17]= 1800;
veri[18]= 1900;
veri[19]= 1999;
veri[20]= 2999; 

int contra [] = new int[21];
contra[0] = 2345;  
contra[1] = 1256;
contra[2] = 1023;
contra[3] = 4654;
contra[4] = 7894;
contra[5] = 9856;
contra[6] = 1000;
contra[7] = 7895;
contra[8] = 7893;
contra[9] = 9658;
contra[10]= 9000;
contra[11]= 7000;
contra[12]= 7913;
contra[13]= 7025;
contra[14]= 7999;
contra[15]= 7635;
contra[16]= 7987;
contra[17]= 7123;
contra[18]= 7456;
contra[19]= 5432;
contra[20]= 10987;
      codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su codigo de accesso "));
     Validacion Ej = new Validacion();
     if(codigo == veri[0]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[0]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[0]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
             System.exit(0);
         }
         
     }
     else if(codigo == veri[1]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[1]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[1]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[2]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[2]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[2]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[3]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[3]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[3]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[4]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[4]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[4]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[5]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[5]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[5]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[6]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[6]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[6]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[7]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[7]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[7]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[8]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[8]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[8]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[9]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[9]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[9]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[10]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[10]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[10]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[11]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[11]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[11]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[12]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[12]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[12]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[13]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[13]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[13]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[14]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[14]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[14]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[15]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[15]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[15]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[16]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[16]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[16]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[17]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[17]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[17]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[18]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[18]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }else if(mensaje != contra[18]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
         }
     }
     else if(codigo == veri[19]){
         mensaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña: "));
         if(mensaje == contra[19]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue exitosa");
         }
         else if(mensaje != contra[19]){
             JOptionPane.showMessageDialog(null, "Su contraseña fue incorrecta");
             System.exit(0);
         }
     }
     else if(codigo != veri[0]||codigo != veri[1] ||codigo != veri[2] ||codigo != veri[3] ||codigo != veri[4] ||codigo != veri[5] ||codigo != veri[6] ||codigo != veri[7] ||codigo != veri[8] ||codigo != veri[9] ||codigo != veri[10] ||codigo != veri[12] ||codigo != veri[13] ||codigo != veri[14] ||codigo != veri[15]||codigo == veri[16]||codigo == veri[17]||codigo == veri[18]||codigo == veri[19]){
         JOptionPane.showMessageDialog(null, "Su ingreso  fue incorrecta");
     
      
          
        
}
    cant = cant +1;
    }while(cant<1);
        
    }
    }
    
    

