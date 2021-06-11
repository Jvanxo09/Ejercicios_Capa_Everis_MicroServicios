
package ejerciciofibonacci;

public class fibonacci {
    public static long fibonacciN(int n) {
    if (n <= 2) {
        return n - 1;
    }
    return fibonacciN(n - 1) + fibonacciN(n - 2);
} 
}
