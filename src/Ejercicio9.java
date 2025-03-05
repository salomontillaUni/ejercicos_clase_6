public class Ejercicio9 {
    public static void main(String[] args) {
        int[] array = new int[50];
        int resul = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            resul += array[i];
        }
        System.out.println("La suma de los 50 números es: " + resul);
    }
}
