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
public class Consulta {

    public void Consulta() {
         int sald = 0;
         int cantidad=0;
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

  int saldo [] = new int[20];
  saldo[0]= 5000;
  saldo[1]= 3000;
  saldo[2]= 690000;
  saldo[3]= 250000;
  saldo[4]= 1500;
  saldo[5]= 46542;
  saldo[6]= 855621;
  saldo[7]= 56624;
  saldo[8]= 99652;
  saldo[9]= 225648;
  saldo[10]=11025;
  saldo[11]= 996332;
  saldo[12]=896521;
  saldo[13]= 789521;
  saldo[14]= 12156;
  saldo[15]= 8965412;
  saldo[16]= 8976512;
  saldo[17]= 78945124;
  saldo[18]= 100000;
  saldo[19] = 20000;
  
  
  
  
 
  do{
   
  
 
   sald= Integer.parseInt(JOptionPane.showInputDialog("Seleccionar: \n"
           + "1. Ingrese su numero de cliente para conocer su saldo? \n"
           + "2. De lo contrario ingrese 20 para Salir \n"));
  
   if(sald == 1){
      int sal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cliente para conocer su saldo?"));
   if (sal == veri[0]) {
    JOptionPane.showMessageDialog(null,"Ivannia Segura su saldo es de: "+saldo[0]);
   } 
   
   else if (sal == veri[1]) {
     JOptionPane.showMessageDialog(null,"Alverto Morales su saldo es de: "+saldo[1]);
   } 
   
  else if (sal == veri[2]) {
     JOptionPane.showMessageDialog(null,"Juan Pereira su saldo es de: "+saldo[2]);
    
   } 
   
 else if (sal == veri[3]) {
     JOptionPane.showMessageDialog(null,"Juan Perez su saldo es de: "+saldo[3]);
      }
   else if (sal == veri[4]) {
     JOptionPane.showMessageDialog(null,"Alejandro Moneste su saldo es de: "+saldo[4]);
          }    
  else if (sal == veri[5]) {
     JOptionPane.showMessageDialog(null,"Marvin Carranza su saldo es de: "+saldo[5]);
    
   }
  else if (sal == veri[6]) {
     JOptionPane.showMessageDialog(null, "Melvin Padilla su saldo es de: "+saldo[6]);
    
   }
  else if (sal == veri[7]) {
     JOptionPane.showMessageDialog(null,"Paula Hernàndez su saldo es de: "+saldo[7]);
    
   }
  else if (sal == veri[8]) {
     JOptionPane.showMessageDialog(null,"Paolo Martinez su saldo es de: "+saldo[8]);
    
   }
  else if (sal == veri[9]) {
     JOptionPane.showMessageDialog(null, "Juan Mora su saldo es de: "+saldo[9]);
    
   }
  else if (sal == veri[10]) {
     JOptionPane.showMessageDialog(null,"Eduardo Gamboa su saldo es de: "+saldo[10]);
    
   }
  else if (sal == veri[11]) {
     JOptionPane.showMessageDialog(null,"Ana Bonilla su saldo es de: "+saldo[11]);
    
   }
  else if (sal == veri[12]) {
     JOptionPane.showMessageDialog(null,"Alfonso Morales su saldo es de: "+saldo[12]);
    
   }
  else if (sal == veri[13]) {
     JOptionPane.showMessageDialog(null,"Pamela Chu su saldo es de: "+saldo[13]);
    
   }
  else if (sal == veri[14]) {
     JOptionPane.showMessageDialog(null,"Ariel Mora su saldo es de: "+saldo[14]);
    
   }
  
  else if (sal == veri[15]) {
    JOptionPane.showMessageDialog(null,"Danni Bejarano su saldo es de: "+saldo[15]);
    
   }
  else if (sal == veri[16]) {
     JOptionPane.showMessageDialog(null,"Jose Paniagaua  su saldo es de: "+saldo[16]);
    
   }
  else if (sal == veri[17]) {
     JOptionPane.showMessageDialog(null,"Jaikel Fonseca su saldo es de: "+saldo[17]);

   }
  else if (sal == veri[18]) {
     JOptionPane.showMessageDialog(null,"Juan Navarro  su saldo es de: "+saldo[18]);
    
   }
  else if (sal == veri[19]) {
     JOptionPane.showMessageDialog(null,"Armando Broncas su saldo es de: "+saldo[19]);

   }
   }
  if(sald==2){
      
   int sa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 20 para Salir "));
 if(sa == 20){
    JOptionPane.showMessageDialog(null,"gracias !");
   }
  }
   else {
    JOptionPane.showMessageDialog(null,"Opcion no valida");
   
   }
   cantidad = cantidad + 1;
  }while(cantidad <0);
 }
 }
    
  
