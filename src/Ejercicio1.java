import java.util.Scanner;
/* Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final
con IVA. EI IVA será una constante que será del 21%.*/
public class Ejercicio1 {

    public static void main(String[] args) {
        final double IVA = 0.21;
        double precio = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio de un producto:");
        precio = sc.nextDouble();
        System.out.println("El precio total con iva es: " + (precio*IVA+precio));
        sc.close();
    }
}
