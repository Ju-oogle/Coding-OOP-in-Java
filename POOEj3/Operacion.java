/*
 3. Crear una clase llamada Operacion que tenga como atributos privados el numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package POOEj3;

import java.util.Scanner;

public class Operacion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Atributos
    private double num1;
    private double num2;

    //constructor vacio
    public Operacion() {

    }

    //constructor con atributos pasados por parametro
    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    //metodos get y set
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        System.out.println("Indicar el numero 1: ");
        num1 = leer.nextInt();
        System.out.println("Indicar el numero 2: ");
        num2 = leer.nextInt();
    }

    public void sumar() {
        double suma = num1 + num2;
        System.out.println("La suma de num1: " + num1 + " más num2: " + num2 + " es = " + suma);

    }

    public void restar() {
        double resta = num1 - num2;
        System.out.println("La resta de num1: " + num1 + " menos num2: " + num2 + " es = " + resta);
        
    }

    public double multiplicar() {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return num1 * num2;
        }
    }

    public void imprimirmultip() {
        if (multiplicar() == 0) {
            System.out.println("Error - No puedes multiplicar por 0");
        } else {
            System.out.println("La multiplicacion de num1: " + num1 + " x num2: " + num2 + " es = " + multiplicar());
        }
    }

    public double dividir() {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }
    
    public void imprimirdivision() {
        if (dividir() == 0) {
            System.out.println("Error - Division por 0");
        } else {
            System.out.println("La division de num1: " + num1 + " / num2: " + num2 + " es = " + dividir());
        }
    }
}
