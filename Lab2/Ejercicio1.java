import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los numeros:");
        String input = sc.nextLine();

        ArrayList<Integer> numeros = stringToArrayList(input);

        System.out.println("Lista original:");
        System.out.println(numeros);

        invertirArrayList(numeros);

        System.out.println("Lista invertida:");
        System.out.println(numeros);
        sc.close();
    }

    public static ArrayList<Integer> stringToArrayList(String input) {
        ArrayList<Integer> lista = new ArrayList<>();
        String[] numerosString = input.split(" ");

        for (String num : numerosString) {
            lista.add(Integer.parseInt(num));
        }

        return lista;
    }

    public static void invertirArrayList(ArrayList<Integer> lista) {
        int inicio = 0;
        int fin = lista.size() - 1;

        while (inicio < fin) {
            int temp = lista.get(inicio);
            lista.set(inicio, lista.get(fin));
            lista.set(fin, temp);
            inicio++;
            fin--;
        }
    }
}
