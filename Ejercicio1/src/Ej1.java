import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el tamaño de su vector");
        int tam = scanner.nextInt();

        int[] numeros = new int[tam];
        System.out.println("ingrese los numeros que compondran a su vector:");
        for (int i=0 ; i<tam;i++){
            numeros[i]=scanner.nextInt();
        }

        System.out.print("Ingrese el numero objetivo de la suma: ");
        int targetSum = scanner.nextInt();

        buscaRangos(numeros, targetSum);
    }

    public static void buscaRangos(int[] array, int targetSum) {
        int inicio = 0;
        int fin = 0;
        int sumaParcial = 0;

        while (fin < array.length) {
            sumaParcial += array[fin];

            while (sumaParcial > targetSum) {
                sumaParcial -= array[inicio];
                inicio++;
            }

            if (sumaParcial == targetSum) {
                System.out.println("Los elementos entre (" + inicio + "," + fin + ") suman " + targetSum);
                sumaParcial -= array[inicio];
                inicio++;
            }

            fin++;
        }
    }
}