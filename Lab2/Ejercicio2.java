import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una serie de numeros:");
        String input = sc.nextLine();

        ArrayList<Integer> numeros = new ArrayList<>();
        String[] numerosString = input.split(" ");
        for (String num : numerosString) {
            numeros.add(Integer.parseInt(num));
        }

        System.out.println("Ingrese un numero para el reordenamiento:");
        int puntoPartida = sc.nextInt();

        reordenarArray(numeros, puntoPartida);

        System.out.println("ArrayList reordenado:");
        System.out.println(numeros);
        sc.close();
    }

    public static void reordenarArray(ArrayList<Integer> lista, int puntoPartida) {
        puntoPartida = puntoPartida % lista.size();
        if (puntoPartida < 0) {
            puntoPartida += lista.size();
        }

        if (puntoPartida > 0) {
            ArrayList<Integer> parte1 = new ArrayList<>(lista.subList(0, puntoPartida));
            ArrayList<Integer> parte2 = new ArrayList<>(lista.subList(puntoPartida, lista.size()));

            lista.clear();
            lista.addAll(parte2);
            lista.addAll(parte1);

            reordenarArray(lista, puntoPartida - parte2.size());
        }
    }
}
