package POOEj3;

public class MainEj3 {

    public static void main(String[] args) {

        Operacion operacion = new Operacion();
        operacion.crearOperacion();

        System.out.println("El numero 1 es " + operacion.getNum1());
        System.out.println("El numero 2 es " + operacion.getNum2());
        
        operacion.sumar();
        operacion.restar();
        operacion.dividir();
        operacion.imprimirdivision();
        operacion.multiplicar();
        operacion.imprimirmultip();
               
    }
}
