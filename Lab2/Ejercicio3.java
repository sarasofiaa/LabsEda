import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la base: ");
        int basePiramide = sc.nextInt();

        piramide(basePiramide, 1);
        sc.close();
    }

    public static void piramide(int basePiramide, int fila) {
        if (fila > basePiramide) {
            return;
        }

        imprimirAsteriscos(fila, 1);

        System.out.println();

        piramide(basePiramide, fila + 1);
    }

    public static void imprimirAsteriscos(int cantidad, int contador) {
        if (contador > cantidad) {
            return;
        }

        System.out.print("*");
        imprimirAsteriscos(cantidad, contador + 1);
    }
}
