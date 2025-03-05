import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int i = 0;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];

        for(int j = 0; j < array.length; j++){
            System.out.println("Ingresa un numero:");
            int num = sc.nextInt();

            array[i] = num;
            if(num == 0){
                ceros++;
            }else if(num > 0){
                positivos++;
            }else{
                negativos++;
            }
        }
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
