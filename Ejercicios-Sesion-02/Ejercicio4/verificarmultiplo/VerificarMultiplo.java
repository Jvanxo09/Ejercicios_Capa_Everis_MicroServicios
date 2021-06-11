package verificarmultiplo;
import java.util.Scanner;

public class VerificarMultiplo {

    public static void main(String[] args) {
        
       int value1, value2;
       Scanner number = new Scanner(System.in);
       
       System.out.print("Introduce 1° valor: ");                                                 
       value1= number.nextInt();
       System.out.print("Introduce 2° valor: ");                                                 
       value2= number.nextInt();
      
       if (esMultiplo(value1,value2)){
            System.out.print("-> "+value2+" SI es multiplo de "+value1+"\n\n ");
        }else{
           System.out.println(value2+" NO es multiplo de "+value1+"\n\n ");
       }
    }

    private static boolean esMultiplo(int value1, int value2) {
        if (value2%value1==0)
		return true;
	else
		return false;
        
    }
    
}
