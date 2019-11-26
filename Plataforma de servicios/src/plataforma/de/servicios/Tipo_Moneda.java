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
public class Tipo_Moneda {

    public void Tipo_Moneda() {
        int Seleccion = 0;
        int monto=0;
int moneda = 0;
int cantidad = 0; 
 do {
Seleccion = Integer.parseInt(JOptionPane.showInputDialog("Selecione:\n"
        + "1.Colones \n"
        + "2.Dolares \n"
        + "3.euros"
        + "Ingrese la moneda a Retirar:"));

switch (Seleccion){
case 1:
	int mond = 0;
mond = Integer.parseInt(JOptionPane.showInputDialog(" Seleccione el monto a retirar\n"
        + "1.5000 colones\n"
        + "2.10000 colones\n"
        + "3.20000 colones\n"
        + "4.Ingresar saldo"));

switch (mond){
case 1: JOptionPane.showMessageDialog(null,"Selecciono 5000 colones."); break;
case 2: JOptionPane.showMessageDialog(null,"Selecciono 10000 colones."); break;
case 3: JOptionPane.showMessageDialog(null,"Selecciono 20000 colones."); break ;
case 4: monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su saldo"));
        JOptionPane.showMessageDialog(null, "Selecciono "+monto+ " colones");
        break;
default: JOptionPane.showMessageDialog(null, "Saliendo....."); break;
}
break;
case 2:
int dol = 0;
dol = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el monto a retirar: \n"
        + "1.1 dolar \n "
        + "2.5 dolares \n "
        + "3.10 dolares \n"
        + "4. Ingrese su saldo: \n"
        + "Ingrese Opción:"));

switch (dol){
case 1: JOptionPane.showMessageDialog(null,"Selecciono 1 dolar."); break;
case 2: JOptionPane.showMessageDialog(null,"Selecciono 5 dolares."); break;
case 3: JOptionPane.showMessageDialog(null,"Selecciono 10 dolares."); break ;
case 4: monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su monto deseado: ")); break;
default: JOptionPane.showMessageDialog(null, "Saliendo......");break;
}
case 3:   	
	
int eur = 0;
				
eur = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el monto a retirar: \n"
        + "1.5 euro \n"
        + "2.10 euro \n"
        + "3.20 euro.\n"
        + "4. Ingrese su saldo deseado\n"
        + "Ingrese Opción: "));

switch (eur){
case 1: JOptionPane.showMessageDialog(null,"Selecciono 1 euro."); break;
case 2: JOptionPane.showMessageDialog(null,"Selecciono 5 euros."); break;
case 3: JOptionPane.showMessageDialog(null,"Selecciono 10 euros."); break ;
case 4: monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cantidad deseada: "));
        JOptionPane.showMessageDialog(null, "Selecciono "+monto+" euros");break;
default: System.out.println("Saliendo..."); break;
}
break;
    }
cantidad = cantidad + 1;
}while(cantidad<1);
    }
}
