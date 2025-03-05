import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base de la potencia: ");
        int base = sc.nextInt();
        System.out.println("Ingrese el exponente de la potencia: ");
        int exp = sc.nextInt();
        int j = 0;
        double resultado = 1;
        if(exp == 0){
            System.out.println("El resultado de la potencia es: " + 1);
        }else if(exp < 0){
            int expNeg = 1/-exp;
            resultado = Math.pow(base, expNeg);
        }else{
            resultado = Math.pow(base, exp);
        }

        System.out.println("El resultado de la potencia es: " + resultado);
    }
}
