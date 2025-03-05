import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.println("Ingrese un número: ");
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < array.length; i++){
            System.out.println("El número en la posición " + i + " es: " + array[i]);
        }
    }
}
