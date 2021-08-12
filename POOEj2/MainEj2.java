package POOEj2;

public class MainEj2 {

    public static void main(String[] args) {
        
        Circunferencia circ1 = new Circunferencia();
        
        circ1.CrearCircunferencia();
        
        System.out.println("El área de la circunferencia es: " + circ1.CalcularArea());
        System.out.println("El perímetro de la circunferencia es: " + circ1.CalcularPerimetro());

    }
}
