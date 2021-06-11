package Ejercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String vendedor;
        double pago = 0;
        String continuar = "si";

        System.out.println("Ingresar nombre del Vendedor:");
        vendedor = entrada.nextLine();

        while (continuar.equals("si")) {
            System.out.println("Ingresar el valor de articulo:");
            double valor = entrada.nextDouble();
            pago = pago + valor * 0.09;
            System.out.println("Desea Continuar (si/no)? ");
            continuar = entrada.next();

        }
        pago = pago + 200;
        System.out.printf("Vendedor: %s %n", vendedor);
        System.out.printf("pago: %s %n", pago);


    }
}
