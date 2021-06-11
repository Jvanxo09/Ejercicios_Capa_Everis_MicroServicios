package ejerciciopuntoscalidad;

import java.util.Scanner;

public class EjercicioPuntosCalidad {

    public static void main(String[] args) {
        int number1, number2;
        
        Scanner data= new Scanner(System.in);
        puntosCalidad miObject =  new puntosCalidad();
        String opc;
        
        do{    
            System.out.println("================================");
            System.out.print("Ingrese promedio de alumno: ");
            number1 = data.nextInt();
            number2 = miObject.Calidad(number1);

            System.out.printf("La calificacion del alumno es: %d\n", number2);
            System.out.println("================================");
            System.out.println ("Ejecutar de nuevo?");
            System.out.print("S / N : ");
            opc = data.next();
            System.out.println("\n");
            }while ( (opc.equals("s") || opc.equals("S")) && (0 <= number1 && 100 >= number1));

    }    
    
}
