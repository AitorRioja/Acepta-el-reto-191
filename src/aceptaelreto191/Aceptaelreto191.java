package aceptaelreto191;

import java.util.Scanner;

public class Aceptaelreto191 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int num = sc.nextInt(); // Aqui introducimos por teclado con el scanner el numero de veces que vamos a introducir datos
        int comp; // Aqui declaramos la variable compartimentos 
        int capacidad; // Aqui declaramos la variable capacidad 
        int dif; // Aqui declaramos la variable diferencia 
        int litros; // Aqui declaramos la variable litros
        
        for (int i = 0; i < num ; i++){ // En este bucle vamos a repetirlo siempre que i sea menor que num, que es el numero de veces que vamos a introducir datos que lo hemos introducido por el scanner
            comp = sc.nextInt(); // Aqui introducimos por teclado los datos de compartimentos   
            capacidad = sc.nextInt(); // Aqui introducimos por teclado los datos de capacidad de los tanques  
            dif = sc.nextInt(); // Aqui introducimos por teclado la diferencia entre los compartimentos 
            litros = capacidad; // Aqui igualamos los litros a la capacidad 
            capacidad = capacidad - dif; // En la capacidad restamos la capacidad menos la diferencia 
            
              for (int a = 0; a < comp - 1; a++){ // En este bucle lo vamos a repetir siempre que a sea menor que los compartimentos - 1  
                litros = litros + capacidad; // Aqui los litros le damos el valor de los litros mas la capacidad
                capacidad = capacidad - dif; // En la capacidad restamos la capacidad a la diferencia 
            }    
            System.out.println(litros); // Aqui mostramos los litros totales de la suma de todos los compartimentos
      
        }
    }
    
}
