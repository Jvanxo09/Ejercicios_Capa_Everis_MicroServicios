
package ejercicio1a.b;

import java.util.Scanner;

public class Ejercicio1AB {
    
    static boolean esPar(int numero){
        if (numero%2==0) 
            return true; 
        else 
            return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
	System.out.print("Ingrese Numero: ");
	int n1 = teclado.nextInt();
        
        if (esPar(n1) )
            System.out.println("===== El numero es par =====");
        else
            System.out.println("===== El número es impar =====");
        
    }
    
}
