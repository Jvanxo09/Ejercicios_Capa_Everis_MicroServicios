
package ejerciciopuntoscalidad;

public class puntosCalidad {
    public int Calidad( int x ){
        if (90 <= x && 100 >= x) {
            return 4;
        } else {
            if (80 <= x && 89 >= x) {
                return 3;
            } else {
                if ( 70 <= x && 79 >= x) {
                    return 2;
                } else {
                    if (60 >= x && 69 >= x) {
                        return 1;
                    } else {
                        if (60 > x) {
                            return 0;
                        }else{
                            return -1;
                        }
                    }
                }
            }
        }        
    }

}
