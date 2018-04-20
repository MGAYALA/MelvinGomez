/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author practica evaluada 2
 */
public class VectoresParalelos {
    
public static void main(String[] args) {
  
    int numEm =Integer.parseInt(JOptionPane.showInputDialog
        ("ingrese el numero de empleados "));
        
        
       String Nombre[] = new String[numEm];
       String CantHora[] = new String[numEm];
       double SalHora[] = new double[numEm];
       double Sueldo[] = new double[numEm];
        
       double au = 0;
       
       
       for(int i = 0 ; i < numEm ; i++){
           //Pidiendo el nommbre
           
           Nombre[i] = JOptionPane.showInputDialog("ingrese el nombre del empleado "+ i);
           //cantidad de horas
           CantHora[i] = JOptionPane.showInputDialog("ingrese las horas trabajadas "+ i);
           // salario por horas
           SalHora[i] =Double.parseDouble(JOptionPane.showInputDialog("ingrese el "
                    + "Sueldo por hora "+ i));
           
           
           
           
            if(Sueldo[i] < 650){
                
                double afp,isss,renta,desc;
                
                renta=Sueldo[i]*0.10;
                isss=Sueldo[i]*0.07;
                afp=Sueldo[i]*0.04;
                desc=renta+isss+afp;
                
                           
                au = Sueldo[i] * 0.15;
               
                
                Sueldo[i] += au;
            }
            
           
           
       }
       
       
       for(int j = 0 ; j < numEm ; j++){
           
       JOptionPane.showMessageDialog(null,"Empleado: "+ Nombre[j] +"\n Cantidad de horas: "+ CantHora[j] +"\n sueldo: " + Sueldo[j],"Empleados",2, null);
           
       }   
       
       
    }
}


    
        
    
    

