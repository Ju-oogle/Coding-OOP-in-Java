/*
 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package POOEj1;

import java.util.Scanner;

public class Book {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String INSB, title, author;
    private int pages;

    public Book() {
    }

    public Book(String INSB, String title, String author, int pages) {
        this.INSB = INSB;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getINSB() {
        return INSB;
    }

    public void setINSB(String INSB) {
        this.INSB = INSB;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void cargarLibro() {
        System.out.println("Introduce el ISBN: ");
        INSB = leer.next();

        System.out.println("Introduce titulo: ");
        title = leer.next();

        System.out.println("Introduce autor: ");
        author = leer.next();

        System.out.println("Numero de paginas: ");
        pages = leer.nextInt();

    }

    @Override
    public String toString() {
        return "La información del libro ingresado es: {" + "INSB = " + INSB
                + ", title = " + title
                + ", author = " + author
                + ", pages = " + pages + '}';
    }
}
