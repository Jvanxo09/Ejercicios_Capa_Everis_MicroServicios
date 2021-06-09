
package ejercicio1ba;

import java.util.Scanner;

public class Ejercicio1Ba {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cuenta miCuenta = new Cuenta("Juan", (float) 1000.00);

        System.out.printf("El NOMBRE es: %s %n", miCuenta.getNombre());
        System.out.printf("El SALDO es: %s %n", miCuenta.getSaldo());
        System.out.println("Introduzca el monto a retirar:");
        float monto = entrada.nextFloat();
        //System.out.printf("QUIERO RETIRAR : %n %s %n", monto);
        String msg = miCuenta.retirar(monto);
        System.out.println(msg);
        System.out.printf("El SALDO es: %s %n", miCuenta.getSaldo());
    }
    
}
