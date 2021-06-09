
package ejercicio1a.a;

import java.util.Scanner;

public class Ejercicio1AA {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
	System.out.print("Primer Numero: ");
	int n1 = teclado.nextInt();
	System.out.print("Segundo Numero: ");
	int n2 = teclado.nextInt();
	System.out.print("Tercer Numero: ");
	int n3 = teclado.nextInt();
        
	System.out.println("\nEl producto es: "+n1*n2*n3);
        
    }
    
}
