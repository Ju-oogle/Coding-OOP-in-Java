/*
4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Formulas: Superficie = base ∗ altura / Perímetro = (base + altura) ∗ 2. 
 */
package POOEj4;

import java.util.Scanner;

public class Rectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void LlenaRectangulo() {
        System.out.println("Indicar el valor de la base: ");
        this.base = leer.nextInt();
        System.out.println("Indicar el valor de la altura: ");
        this.altura = leer.nextInt();
    }

    public void CalcularSuperficie() {
        int superficie = this.base * this.altura;
        System.out.println("Superficie: " + superficie);
    }

    public void CalcularPerimetro() {
        int perimetro = (this.base + this.altura) * 2;
        System.out.println("Perimetro: "  + perimetro);
    }

    public void DibujaRectangulo() {
        int n, m;
        m = this.base;
        n = this.altura;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
