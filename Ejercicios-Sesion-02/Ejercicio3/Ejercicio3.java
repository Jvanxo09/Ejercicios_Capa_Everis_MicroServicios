package Ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        int residuo = 0;

        while (i <= 8) {
            while (j <= 8) {
                residuo = i % 2;
                if (residuo == 0) {
                    System.out.print(" ");
                    System.out.print("* ");
                } else {
                    System.out.print("* ");
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }
    }
}
