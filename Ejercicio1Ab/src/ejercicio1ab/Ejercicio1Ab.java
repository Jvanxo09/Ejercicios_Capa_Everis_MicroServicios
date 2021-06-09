
package ejercicio1ab;

import java.util.Scanner;

public class Ejercicio1Ab {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        String msgFinal;

        System.out.println("INGRESA EL PRIMER ENTERO");
        num1 = entrada.nextInt();
        System.out.println("INGRESA EL SEGUNDO ENTERO");
        num2 = entrada.nextInt();

        if (num1 == num2) {
            msgFinal = "Los números son Iguales";
        } else if (num1 > num2) {
            msgFinal = num1 + " es mayor";
        } else {
            msgFinal = num2 + " es mayor";
        }
        System.out.println(msgFinal);
    }
    
}
