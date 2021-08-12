package POOEj5;

import java.util.Random;
import java.util.Scanner;

public class ServicioCuenta {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
     *
     * @return new Cuenta(num_Cta, dni, saldoActual, interes)
     */
    private Cuenta crearCuenta() {

        Cuenta cta = new Cuenta();
        System.out.println("Bienvenido! Ingrese sus datos para crear una nueva cuenta.");
        int num_Cta = new Random().nextInt(99999999);

        System.out.println("Ingresa el DNI: ");
        long dni = (leer.nextInt());

        System.out.println("Ingresa el Saldo Actual: ");
        double saldoActual = (leer.nextDouble());

        cta.setNum_Cta(num_Cta);
        cta.setDni(dni);
        cta.setSaldoActual(saldoActual);

        return cta;
    }

    /**
     * Método ingresar(double ingreso): el método recibe una cantidad de dinero
     * a ingresar y se la sumara a saldo actual.
     *
     * @param cta
     * @param ingreso
     */
    private void ingresar(Cuenta cta, double ingreso) {
        cta.setSaldoActual(cta.getSaldoActual() + ingreso);

    }

    /**
     * Método retirar(double retiro): el método recibe una cantidad de dinero a
     * retirar y se la restará al saldo actual. Si la cuenta no tiene la
     * cantidad de dinero a retirar, se pondrá el saldo actual en 0.
     *
     * @param cta
     */
    private void Retirar(Cuenta cta) {
        double retiro;
        System.out.println("Ingrese el monto que quiere retirar: $");
        retiro = leer.nextDouble();

        if (cta.getSaldoActual() < retiro) {
            System.out.println("No dispone de suficiente dinero");
            cta.setSaldoActual(0);
        } else {
            cta.setSaldoActual(cta.getSaldoActual() - retiro);
        }
    }

    /**
     * Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
     * Validar que el usuario no saque más del 20%.
     *
     * @param cta
     */
    private void extraccionRapida(Cuenta cta) {
        double retiro;
        System.out.println("Ingrese el monto que quiere retirar: $");
        retiro = leer.nextDouble();

        if (cta.getSaldoActual() * 0.2 < retiro) {
            System.out.println("No puede retirar un importe mayor al 20% de su saldo");
        } else {
            cta.setSaldoActual(cta.getSaldoActual() - retiro);
            System.out.println("Retiro exitoso de $" + retiro + " su saldo actual es de $" + cta.getSaldoActual());
        }
    }

    /**
     * Método consultarSaldo(): permitirá consultar el saldo disponible en la
     * cuenta.
     *
     * @param cta
     *
     */
    private void consultarSaldo(Cuenta cta) {
        System.out.println("El saldo disponible es de $" + cta.getSaldoActual());
    }

    /**
     * Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
     *
     * @param cta
     */
    private void consultarDatos(Cuenta cta) {
        System.out.println(" Los datos de la cuenta son: "
                + " DNI: " + cta.getDni()
                + " N de CUENTA: " + cta.getNum_Cta()
                + " El saldo actual $: " + cta.getSaldoActual());
    }

    private void mostrarMenu() {
        System.out.println("********** MENU **********\n"
                + "(1). Ingreso\n"
                + "(2). Extracción\n"
                + "(3). Extracción rápida\n"
                + "(4). Consulta saldo disponible\n"
                + "(5). Consulta datos de cuenta\n"
                + "(6). Salir\n"
                + "********** Escoja una opción **********"
        );
    }

    private int elegirOpc() {
        int choice;
        do {
            choice = leer.nextInt();
            if (choice < 1 || choice > 6) {
                System.out.println("Selección invalida, intente nuevamente: ");
            }
        } while (choice < 1 || choice > 6);
        return choice;
    }

    public void ejecutarMenu() {
        Cuenta cta1 = crearCuenta();
        mostrarMenu();
        int choice;

        do {
            choice = elegirOpc();
            switch (choice) {
                case 1:
                    System.out.println("Indique la cantidad de dinero a ingresar $");
                    double ingreso = leer.nextDouble();
                    ingresar(cta1, ingreso);
                    break;
                case 2:
                    Retirar(cta1);
                    break;
                case 3:
                    extraccionRapida(cta1);
                    break;
                case 4:
                    consultarSaldo(cta1);
                    break;
                case 5:
                    consultarDatos(cta1);
                    break;
                case 6:
                    System.out.println("Gracias por utilizar ntro servicio");
                    break;
            }
            if (choice != 6) {
                System.out.println("");
                mostrarMenu();
                System.out.println("");
            }
        } while (choice!= 6);
    }
}
