package POOEj6;

import java.util.Scanner;

public class ServicioCafetera {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Cafetera crearCafetera() {
        Cafetera c1 = new Cafetera();

        System.out.println("Bienvenido!");
        System.out.println("Ingresa la capacidad máxima de la cafetera");
        int cap_max = leer.nextInt();
        System.out.println("Ingresa la cantidad actual que tiene la cafetera");
        int cant_actual = leer.nextInt();

        c1.setCapacidadMaxima(cap_max);
        c1.setCantidadActual(cant_actual);
        return c1;
    }

    /**
     * Método llenarCafetera(): hace que la cantidad actual sea igual a la
     * capacidad máxima.
     */
    private void llenarCafetera(Cafetera c1) {
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("La cant ahora es " +c1.getCantidadActual()+ "cc de café.");
    }

    /**
     * Método servirTaza(int): se pide el tamaño de una taza vacía, el método
     * recibe el tamaño de la taza y simula la acción de servir la taza con la
     * capacidad indicada. Si la cantidad actual de café “no alcanza” para
     * llenar la taza, se sirve lo que quede. El método le informará al usuario
     * si se llenó o no la taza, y de no haberse llenado en cuanto quedó la
     * taza.
     *
     * @param c1, tazaVacia
     */
    private void servirTaza(Cafetera c1, int tazaVacia) {

        if (tazaVacia <= c1.getCantidadActual()) {
            c1.setCantidadActual(c1.getCantidadActual() - tazaVacia);
            System.out.println("He llenado su taza");
            System.out.println("Quedan disponibles " + c1.getCantidadActual() + "cc de café.");
        } else if (c1.getCantidadActual() > 0 && c1.getCantidadActual() < tazaVacia) {
            System.out.println("No hay suficiente cafe para llenar su taza\n");
            System.out.println("De su requerimiento (" + tazaVacia + ""
                    + "cc), sólo se han servido " + c1.getCantidadActual() + "cc de café.");
            c1.setCantidadActual(0);
        } else {
            System.out.println("Lo siento!, no hay suficiente cafe disponible( "
                    + c1.getCantidadActual() + "cc)");
        }

    }

    /**
     * Método vaciarCafetera(): pone la cantidad de café actual en cero.
     *
     * @param c1
     */
    private void vaciarCafetera(Cafetera c1) {
        c1.setCantidadActual(0);
        System.out.println("La cafetera ha sido vaciada. "
                + "Quedan disponibles "
                + c1.getCantidadActual() + "cc.");
    }

    /**
     * Método agregarCafe(int): se le pide al usuario una cantidad de café, el
     * método lo recibe y se añade a la cafetera la cantidad de café indicada.
     *
     * @param c1, cantCafe
     */
    
    private void agregarCafe(Cafetera c1, int cantCafe) {
        if (c1.getCantidadActual() < c1.getCapacidadMaxima()) {
            int agregar = c1.getCantidadActual() + cantCafe;
            if (c1.getCapacidadMaxima() > agregar) {
                c1.setCantidadActual(c1.getCantidadActual() + cantCafe);
            } else if (c1.getCapacidadMaxima() < agregar) {
                int agregado = c1.getCapacidadMaxima() - c1.getCantidadActual();
                int sobra = cantCafe - agregado;
                System.out.println("No hay suficiente capacidad para todo el cafe que quiere agregar, sobraron" + sobra + "cc");
                System.out.println("De los" + cantCafe + "cc que solicitó, solo se agregaron" + agregado + "cc de cafe");
                c1.setCantidadActual(c1.getCapacidadMaxima());
            } else {
                System.out.println("No es necesario agregar cafe");
                System.out.println("La cafetera dispone de" + c1.getCantidadActual() + "cc.");
            }
        }
    }
    
    private void mostrarMenu() {
        System.out.println("********** MENU **********\n"
                + "(1). Llenar cafetera.\n"
                + "(2). Servir una taza de cafe (indicando el tamaño deseado)\n"
                + "(3). Preparar una cant. determinada de cafe.\n"
                + "(4). Vaciar cafetera.\n"
                + "(5). Apagar cafetera.\n"
                + "********** Escoja una opción **********"
        );
    }
    
    private int elegirOpc(){
        int choice;
        do {            
            choice = leer.nextInt();
            if (choice < 1 || choice > 5) {
                System.out.println("Selección invalida, intente nuevamente: ");
            }
        } while (choice < 1 || choice > 5);
        return choice;
    }

    public void ejecutarMenu(){
        Cafetera cafe1 = crearCafetera();
        mostrarMenu();
        int choice;
        do {            
            choice = elegirOpc();
            switch (choice){
                case 1:
                    llenarCafetera(cafe1);
                    System.out.println("La cafetera ha sido llenada a su capacidad maxima");
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de su taza (en cc)");
                    int tazaVacia = leer.nextInt();
                    servirTaza(cafe1, tazaVacia);
                    break;
                case 3:
                    vaciarCafetera(cafe1);
                    System.out.println("La cafetera ha quedado vacía");
                    break;
                case 4:
                    System.out.println("Ingrese la cant de cafe que que desea agregar (en cc)");
                    int cantCafe = leer.nextInt();
                    agregarCafe(cafe1, cantCafe);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar nuestros productos");
                    break;
            }
            if (choice != 5){ 
                System.out.println("");
                mostrarMenu();
                System.out.println("");}
            
        } while (choice != 5);
    }
}


