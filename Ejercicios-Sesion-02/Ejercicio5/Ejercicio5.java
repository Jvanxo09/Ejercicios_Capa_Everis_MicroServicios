package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int valor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un valor entero");
        valor = entrada.nextInt();
        invertir(valor);
    }

    static void invertir(int valor) {
        int caracter;
        int valorInverso = 0;
        while (valor != 0) {
            caracter = valor % 10;
            valorInverso = (valorInverso * 10) + caracter;
            valor = valor / 10;
        }
        System.out.printf("Valor inverso: %s %n", valorInverso);
    }
}
