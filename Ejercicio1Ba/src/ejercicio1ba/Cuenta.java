
package ejercicio1ba;

public class Cuenta {
    private String nombre;
    private float saldo;

    public Cuenta(String nombre, float saldo) {
        this.nombre = nombre;
        this.saldo = (float) saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = (float) saldo;
    }

    public String retirar(double monto) {
        String msg;
        if (monto > saldo) {
            msg = "El monto a retirar excede el saldo de la cuenta";
        } else {
            saldo = (float) (saldo - monto);
            msg = "Retiro Existoso";
        }
        return msg;
    }
}
