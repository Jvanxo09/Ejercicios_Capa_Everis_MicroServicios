package Ejercicio7;


public class Ejercicio7 {

    public static void main(String[] args) {
        double output=0;
	
	for(String newArgs : args){
		output += Double.parseDouble(newArgs);
	}
	
	System.out.println(output);

    }
}
