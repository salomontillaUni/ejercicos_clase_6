import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalCompra = 0;
        double precioItem = 0;
        int q = 1;
        ArrayList<Double> items = new ArrayList<>();
        do{
            System.out.println("Ingrese el precio del item: ");
            precioItem = sc.nextInt();
            items.add(precioItem);
            System.out.println("¿Desea ingresar otro item? (1 = Sí, 0 = No)");
            q = sc.nextInt();
        }while(q != 0);
        for (double precio : items) {
            totalCompra += precio;
        }
        if(totalCompra > 1200) {
            totalCompra = totalCompra - (totalCompra * 0.20);
            System.out.println("El total de la compra con descuento es: " + totalCompra);
        }else{
            System.out.println("El total de la compra es: " + totalCompra);
        }
    }
}
