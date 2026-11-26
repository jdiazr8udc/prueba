import java.util.Scanner;

public class menuRestaurante { 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("""
=== Factura Restaurante ===

1. Calcular valor de platos
2. Calcular valor de bebidas
3. Calcular propina
4. Calcular total de la factura
5. Salir""");

        
        System.out.print("\nSeleccione una opcion: ");
        int opcion = scanner.nextInt();

        if (opcion == 1){
            Mostrar.mostrar();
        }
    }
}