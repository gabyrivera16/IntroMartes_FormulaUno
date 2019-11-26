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
public class DB {
        public void DB(){
            int can=0;
  do{          
 String no= "";
 int te= 0;
 String di ="";
 int cuen = 0;
 int men = 0;
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

String nombre [] = new String [20];
       nombre [0]= "Ivannia Segura";
       nombre [1]= "Juan Perez";
       nombre [2]= "Alverto Morales";
       nombre [3]= "Juan Pereira";
       nombre [4]= "Alejandro Monestel";
       nombre [5]= "Marvin Carranza";
       nombre [6]= "Melvin Padilla";
       nombre [7]= "Paula Hernàndez";
       nombre [8]= "Paolo Martinez";
       nombre [9]= "Juan Mora";
       nombre [10]= "Eduardo Gamboa";
       nombre [11]= "Ana Bonilla";
       nombre [12]= "Alfonso Morales";
       nombre [13]= "Pamela Chu";
       nombre [14]= "Ariel Mora";
       nombre [15]= "Danni Bejarano";
       nombre [16]= "Jose Paniagaua ";
       nombre [17]= "Jaikel Fonseca";
       nombre [18]= "Juan Navarro";
       nombre [19]= "Armando Broncas";
 int telefono[] = new int[20];
       telefono [0]= 85970666;
       telefono [1]= 85970889;
       telefono [2]= 98541236;
       telefono [3]= 66201368;
       telefono [4]= 78451203;
       telefono [5]= 23015694;
       telefono [6]= 89520163;
       telefono [7]= 78963215;
       telefono [8]= 75964897;
       telefono [9]= 88965417;
       telefono [10]= 95623015;
       telefono [11]= 98996541;
       telefono [12]= 88995046;
       telefono [13]= 78965488;
       telefono [14]= 99887456;
       telefono [15]= 65899475;
       telefono [16]= 79954521;
       telefono [17]= 55684235;
       telefono [18]= 95623100;
       telefono [19]= 59846231;
       String dirreccion [] = new String[20];
       dirreccion [0]= "La Capri";
       dirreccion [1]= "San Miguel ";
       dirreccion [2]= "San Jose ";
       dirreccion [3]= "Alajuelita ";
       dirreccion [4]= "Cartago ";
       dirreccion [5]= "Puntarenas";
       dirreccion [6]= "Limonal";
       dirreccion [7]= "Guanacaste";
       dirreccion [8]= "Higuito";
       dirreccion [9]= "Santa Barbara";
       dirreccion [10]= "Alajuela ";
       dirreccion [11]= "Limon";
       dirreccion [12]= "Desamparados";
       dirreccion [13]= "La Carpio";
       dirreccion [14]= "Sabana Sur";
       dirreccion [15]= "Sabana norte";
       dirreccion [16]= "Encinales ";
       dirreccion [17]= "San Juan susr";
       dirreccion [18]= "Corralillo";
       dirreccion [19]= "Tarbaca";

   int cuenta [] = new int[20];
       cuenta [0]= 178456;
       cuenta [1]= 453457;
       cuenta [2]= 852458;
      cuenta [3]= 123568;
       cuenta [4]= 856471;
       cuenta [5]= 136984;
       cuenta [6]= 178589;
       cuenta [7]= 196584;
       cuenta[8]= 112458;
       cuenta [9]= 954715;
       cuenta [10]= 560212;
       cuenta [11]= 212355;
       cuenta [12]= 778412;
       cuenta [13]= 219645;
       cuenta [14]= 956320;
       cuenta [15]= 321569;
       cuenta [16]= 369855;
       cuenta [17]= 741025;
       cuenta [18]= 852036;
       cuenta [19]= 963214;
    
        men= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de acceso de la persona a buscar"));
       
       if(men == veri[0]){
         no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
        if(no.equals(nombre[0])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[0]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
        te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
        if(te==telefono[0]){
            JOptionPane.showMessageDialog(null, "Su  Telefono fue correcto ");
        }
        else if(te!=telefono[0]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
         di = JOptionPane.showInputDialog("Ingrese su Direccion: ");     
        if(di.equals(dirreccion[0])){
            JOptionPane.showMessageDialog(null, "Su Direccion fue correcto ");
        }
        else if(di!=dirreccion[0]){
            JOptionPane.showMessageDialog(null, "Su Direccion es incorrecto");
        }
        cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta: "));
        if(cuen==cuenta[0]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[0]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
       JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
       }
       else if(men == veri[1]){
           no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
           if(no.equals(nombre[1])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[1]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
           te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
        if(te==telefono[1]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[1]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
        di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
          if(di.equals(dirreccion[1])){
            JOptionPane.showMessageDialog(null, "Su  Direccion fue correcto: ");
        }
        else if(di!=dirreccion[1]){
            JOptionPane.showMessageDialog(null, "Su  Direccion es incorrecto");
        }
          cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
               if(cuen==cuenta[1]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[1]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto ");
        }
               JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
       }
       else if(men == veri[2]){
           no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
           if(no.equals(nombre[2])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[2]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
         te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
        if(te==telefono[2]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[2]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
        di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
        if(di.equals(dirreccion[2])){
            JOptionPane.showMessageDialog(null, "Su  Direccion fue correcto ");
        }
        else if(di!=dirreccion[2]){
            JOptionPane.showMessageDialog(null, "Su  Direccion es incorrecto");
        }
          cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
            if(cuen==cuenta[2]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[2]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
            JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
       }
       else if(men == veri[3]){
           no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
           if(no.equals(nombre[3])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[3]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
            te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
        if(te==telefono[3]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[3]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
        di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
         
        if(di.equals(dirreccion[3])){
            JOptionPane.showMessageDialog(null, "Su  Direccion fue correcto " );
        }
        else if(di!=dirreccion[3]){
            JOptionPane.showMessageDialog(null, "Su  Direccion es incorrecto");
        }
        if(cuen==cuenta[3]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[3]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
        JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
       }
       else if(men==veri[4]){
           no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
           if(no.equals(nombre[4])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[4]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
            te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
           if(te==telefono[4]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[4]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
           di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
            if(di.equals(dirreccion[4])){
            JOptionPane.showMessageDialog(null, "Su  Direccion fue correcto ");
        }
        else if(di!=dirreccion[4]){
            JOptionPane.showMessageDialog(null, "Su  Direccion es incorrecto");
        }  
            cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));; 
        if(cuen==cuenta[4]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[4]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
        JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
       }
       
       else if(men == veri[5]){ 
           no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
            if(no.equals(nombre[5])){    
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[5]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
             te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
             if(te==telefono[5]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[5]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
             di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
             
              if(di==dirreccion[5]){
            JOptionPane.showMessageDialog(null, "Su  Direccion fue correcto ");
        }
        else if(di!=dirreccion[5]){
            JOptionPane.showMessageDialog(null, "Su  Direccion es incorrecto");
        }
              cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
            if(cuen==cuenta[5]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[5]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
         JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);    
        }
       else if(men == veri[6]){
           no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
        if(no==nombre[6]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[6]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
         te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
        if(te==telefono[6]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[6]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
        di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
        if(di.equals(dirreccion[6])){
            JOptionPane.showMessageDialog(null, "Su  Direccion fue correcto ");
        }
        else if(di!=dirreccion[6]){
            JOptionPane.showMessageDialog(null, "Su  Direccion es incorrecto");
        }
        cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
         if(cuen==cuenta[6]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[6]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
         JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
        }
       else if(men == veri[7]){
           no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
        if(no.equals(nombre[7])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[7]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
         te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
        if(te==telefono[7]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[7]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
        di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
         if(di.equals(dirreccion[7])){
            JOptionPane.showMessageDialog(null, "Su Direccion fue correcto ");
        }
        else if(di!=dirreccion[7]){
            JOptionPane.showMessageDialog(null, "Su  Direccion es incorrecto");
        }
         cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
          if(cuen==cuenta[7]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[7]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
          JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
        }
        
      else if(men == veri[8]){
          no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
        if(no.equals(nombre[8])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[8]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
         te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
         if(te==telefono[8]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[8]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
         di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
           if(di.equals(dirreccion[8])){
            JOptionPane.showMessageDialog(null, "Su  Direccion fue correcto ");
        }
        else if(di!=dirreccion[8]){
            JOptionPane.showMessageDialog(null, "Su  Direccion  es incorrecto");
        }
           cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
           if(cuen==cuenta[8]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[8]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
           JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
        }
      
      else if(men == veri[9]){
          no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
        if(no.equals(nombre[9])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[9]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
         te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
        if(te==telefono[9]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[9]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
        di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
         if(di==dirreccion[9]){
            JOptionPane.showMessageDialog(null, "Su   Direccion fue correcto ");
        }
        else if(di.equals(dirreccion[9])){
            JOptionPane.showMessageDialog(null, "Su   Direccion es incorrecto");
        }
         cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
          if(cuen==cuenta[9]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[9]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
          JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
      }
      
      else if(men == veri[10]){
          no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
        if(no.equals(nombre[10])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[10]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
         te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
         if(te==telefono[10]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[10]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
         di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
       if(di.equals(dirreccion[10])){
            JOptionPane.showMessageDialog(null, "Su  Direccion fue correcto ");
        }
        else if(di!=dirreccion[10]){
            JOptionPane.showMessageDialog(null, "Su   Direccion es incorrecto");
        } 
       cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
         if(cuen==cuenta[10]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[10]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
         JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
      }
      else if(men == veri[11]){
          no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
        if(no.equals(nombre[11])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[11]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
         te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
         if(te==telefono[11]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[11]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
         di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
         if(di.equals(dirreccion[11])){
            JOptionPane.showMessageDialog(null, "Su  Direccion fue correcto ");
        }
        else if(di!=dirreccion[11]){
            JOptionPane.showMessageDialog(null, "Su Direccion es incorrecto");
        }
         cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
         if(cuen==cuenta[11]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[11]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
         JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
      }
      
      else if(men == veri[12]){
          no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
        if(no.equals(nombre[12])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[12]){
             JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue incorrecto ");
        }
         te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
        if(te==telefono[12]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[12]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue incorrecto ");
        }
        di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
         if(di.equals(dirreccion[12])){
            JOptionPane.showMessageDialog(null, "Su Direccion fue correcto ");
        }else if(di!=dirreccion[12]){
            JOptionPane.showMessageDialog(null, "Su Direccion fue incorrecto ");
        }
         cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
         if(cuen==cuenta[12]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }else if(cuen!=cuenta[12]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue incorrecto ");
        }
         
        JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
      }
      
      else if(men == veri[13]){
          no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
         if(no.equals(nombre[13])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es correcto");
        }
         else if(no!=nombre[13]){
             JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
         }
          te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
            if(te==telefono[13]){
            JOptionPane.showMessageDialog(null, "Su Telefono es correcto");
        }
           else if(te!=telefono[13]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
            di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
          if(di.equals(dirreccion[13])){
            JOptionPane.showMessageDialog(null, "Su Direccion es correcto");
        }
             else if(di!=dirreccion[13]){
            JOptionPane.showMessageDialog(null, "Su Direccion es incorrecto");
        }
          cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
             if(cuen==cuenta[13]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es correcto");
        }
            else if(cuen!=cuenta[13]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
          JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);   
      }
       else if(men == veri[14]){
           no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
           if(no.equals(nombre[14])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[14]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        } 
            te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
           if(te==telefono[14]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[14]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
           di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
              if(di.equals(dirreccion[14])){
            JOptionPane.showMessageDialog(null, "Su Direccion fue correcto ");
        }
        else if(di!=dirreccion[14]){
            JOptionPane.showMessageDialog(null, "Su Direccion es incorrecto");
        }
         cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
        if(cuen==cuenta[14]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[14]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
                 JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
       }
       else if(men == veri[15]){
           no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
           if(no.equals(nombre[15])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[15]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
            te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
        if(te==telefono[15]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[15]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
        di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
         if(di.equals(dirreccion[15])){
            JOptionPane.showMessageDialog(null, "Su Direccion fue correcto ");
        }
        else if(di!=dirreccion[15]){
            JOptionPane.showMessageDialog(null, "Su Direccion es incorrecto");
        }
         cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
         if(cuen==cuenta[15]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[15]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
         JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
       }
        else if(men == veri[16]){
            no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
        if(no.equals(nombre[16])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[16]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
         te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
         if(te==telefono[16]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[16]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
         di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
          if(di.equals(dirreccion[16])){
            JOptionPane.showMessageDialog(null, "Su Direccion fue correcto ");
        }
        else if(di!=dirreccion[16]){
            JOptionPane.showMessageDialog(null, "Su Direccion es incorrecto");
        }
          cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
          if(cuen==cuenta[16]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[16]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
          JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
        }
       else if(men == veri[17]){
           no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
        if(no.equals(nombre[17])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[17]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");     
        }
        te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
        if(te==telefono[17]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[17]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
        di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
        if(di.equals(dirreccion[17])){
            JOptionPane.showMessageDialog(null, "Su Direccion fue correcto ");
        }
        else if(di!=dirreccion[17]){
            JOptionPane.showMessageDialog(null, "Su Direccion es incorrecto");
        }
        cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
         if(cuen==cuenta[17]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[17]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
         JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
       }
       else if(men == veri[18]){
           no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
        if(no.equals(nombre[18])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[18]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
         te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
         if(te==telefono[18]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[18]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
           di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
        if(di.equals(dirreccion[18])){
            JOptionPane.showMessageDialog(null, "Su Direccion fue correcto ");
        }
        else if(di!=dirreccion[18]){
            JOptionPane.showMessageDialog(null, "Su Direccion es incorrecto");
        }
        cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
         if(cuen==cuenta[18]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[18]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
         JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
       }
       else if(men == veri[19]){
           no = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
        if(no.equals(nombre[19])){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido fue correcto ");
        }
        else if(no!=nombre[19]){
            JOptionPane.showMessageDialog(null, "Su Nombre y Apellido es incorrecto");
        }
         te = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Telefono: "));
          if(te==telefono[19]){
            JOptionPane.showMessageDialog(null, "Su Telefono fue correcto ");
        }
        else if(te!=telefono[19]){
            JOptionPane.showMessageDialog(null, "Su Telefono es incorrecto");
        }
          di = JOptionPane.showInputDialog("Ingrese su Direccion: ");
           if(di.equals(dirreccion[19])){
            JOptionPane.showMessageDialog(null, "Su Direccion fue correcto ");
        }
        else if(di!=dirreccion[19]){
            JOptionPane.showMessageDialog(null, "Su Direccion es incorrecto");
        }
           cuen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuenta: "));
              if(cuen==cuenta[19]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta fue correcto ");
        }
        else if(cuen!=cuenta[19]){
            JOptionPane.showMessageDialog(null, "Su numero de cuenta es incorrecto");
        }
              JOptionPane.showMessageDialog(null, " "+no+" \n "+te+" \n"+di+" \n"+cuen);
       }
       can=can+1;
  }while(can<1);
    }
}

