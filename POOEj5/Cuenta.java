/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes.
 */
package POOEj5;

public class Cuenta {
    
    private int num_Cta;
    private long dni;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int num_Cta, long dni, double saldoActual) {
        this.num_Cta = num_Cta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNum_Cta() {
        return num_Cta;
    }

    public void setNum_Cta(int num_Cta) {
        this.num_Cta = num_Cta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

}
