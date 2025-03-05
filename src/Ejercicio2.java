import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de dia de la semana (1 - 7): ");
        int dia = sc.nextInt();
        sc.close();
        String semana = "";
        switch (dia) {
            case 1:
                semana = "Lunes";
                break;
            case 2:
                semana = "Martes";
                break;
            case 3:
                semana = "Miercoles";
                break;
            case 4:
                semana = "Jueves";
                break;
            case 5:
                semana = "Viernes";
                break;
            case 6:
                semana = "Sabado";
                break;
            case 7:
                semana = "Domingo";
                break;
            default:
                System.out.println("Numero invalido");
        }
        System.out.println("El dia de la semana es: " +semana);
    }
}
