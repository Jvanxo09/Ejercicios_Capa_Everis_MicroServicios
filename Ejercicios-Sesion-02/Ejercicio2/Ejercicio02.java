/*VERIFICAR UNA CADENA ES CAPICUA CON TAMAÑO DE CADENA DE 5 DIGITOS */
package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        int N = 0, aux, inverso = 0;
	int cifra;
        String flag;
        Scanner number = new Scanner(System.in);
        do {
            System.out.print("Introduce un número: ");                                                 
            N = number.nextInt();
            flag=Integer.toString(N);  
            if(flag.length()!=5){
                System.out.println("ERROR - Ingrese otro valor\n\n");
            }
        } while (flag.length()!=5);
       
        aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
    
        if(N == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
    
}
