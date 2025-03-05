import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int n = sc.nextInt();
        int resultado = 0;
        for (int i = 1; i <= n; i++ ) {
            resultado += i;
        }
        System.out.println(resultado);
    }
}
