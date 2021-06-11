package ejerciciofibonacci;

import java.util.Scanner;

public class EjercicioFibonacci {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese N: "); 
        int number = input.nextInt();
        
        if (number <= 0) {
            System.out.printf("ERROR - El numero debe ser mayor a 0");
        } else {
            for ( int i = 1; i <= number; i++) {
                System.out.printf("%d ", fibonacci.fibonacciN(i));
            }
        } 
    }
}
