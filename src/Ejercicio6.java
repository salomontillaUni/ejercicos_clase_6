import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base de la potencia: ");
        int base = sc.nextInt();
        System.out.println("Ingrese el exponente de la potencia: ");
        int exp = sc.nextInt();
        double resultado = 1;
        if(exp == 0){
            System.out.println("El resultado de la potencia es: " + 1);
        }else if(exp < 0){
            exp = exp * -1;
            resultado = 1 / (Math.pow(base, exp));
            System.out.println("El resultado de la potencia es: " + resultado);
        }else{
            resultado = Math.pow(base, exp);
            System.out.println("El resultado de la potencia es: " + resultado);
        }

    }
}
