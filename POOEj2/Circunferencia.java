/*
2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).

 */
package POOEj2;

import java.util.Scanner;

public class Circunferencia {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void CrearCircunferencia() {
        System.out.println("Indicar el valor del radio: ");
        radio = leer.nextDouble();  
        
    }
   
    public double CalcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
   
    public double CalcularPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
           
    }
}
