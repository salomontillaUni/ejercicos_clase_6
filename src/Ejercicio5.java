import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un dia de la semana: ");
        String dia = sc.next();
        boolean esLaboral = false;
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                esLaboral = true;
                break;
            case "sabado":
            case "domingo":
                break;
            default:
                System.out.println("Dia invalido");
        }
        if (esLaboral) {
            System.out.println("El dia " + dia + " es laboral");
        }
    }
}
