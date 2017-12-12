package visual;

import java.util.Scanner;

public class Pantalla {

    
    enum Provincia {SALTA,TUCUMAN,CATAMARCA,JUJUY}; 
    
   
    public Pantalla(){
        
        Scanner sc = new Scanner(System.in);
        int salteñas,tucumanas,promo;
       
        
        System.out.println("Ingrese La Cantidad De Empanadas Salteñas Cocinadas Hoy:");
        salteñas = sc.nextInt();
        System.out.println("Ingrese La Cantidad De Empanadas Tucumanas Cocinadas Hoy:");
        tucumanas = sc.nextInt();
   
        
        promo = promocionLocal(Provincia.SALTA,salteñas,tucumanas);
        
        System.out.println("La Cantidad De Cajas Son:");
        System.out.println(promo);
        
}
    
    
     int promocionLocal(Provincia provincia, int salteñas, int tucumanas) {
         int cajas,empanadas;
         
         empanadas = salteñas+tucumanas;
         cajas= empanadas/6;
         
         
        return cajas;
         
    }
    
}
