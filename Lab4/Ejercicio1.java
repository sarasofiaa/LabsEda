import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        String input1 = scanner.nextLine();
        System.out.print("Ingrese el segundo número: ");
        String input2 = scanner.nextLine();

        Number num1 = convertirNumero(input1);
        Number num2 = convertirNumero(input2);

        if (num1 instanceof Integer && num2 instanceof Integer) {
            Calculadora<Integer> calculadora = new Calculadora<>(num1.intValue(), num2.intValue());
            mostrarResultados(calculadora);
        } else {
            Calculadora<Double> calculadora = new Calculadora<>(num1.doubleValue(), num2.doubleValue());
            mostrarResultados(calculadora);
        }
        
        scanner.close();
    }

    private static Number convertirNumero(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return Double.parseDouble(input);
        }
    }
    private static <T extends Number> void mostrarResultados(Calculadora<T> calculadora) {
        System.out.println("Suma: " + calculadora.sumar());
        System.out.println("Resta: " + calculadora.restar());
        System.out.println("Multiplicación: " + calculadora.multiplicar());
        System.out.println("División: " + calculadora.dividir());
    }
}

class Calculadora<T extends Number> {
    private final T numero1;
    private final T numero2;
    
    public Calculadora(T num1, T num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }
    
    public double sumar() {
        return numero1.doubleValue() + numero2.doubleValue();
    }
    
    public double restar() {
        return numero1.doubleValue() - numero2.doubleValue();
    }
    
    public double multiplicar() {
        return numero1.doubleValue() * numero2.doubleValue();
    }
    
    public double dividir() {
        if (numero2.doubleValue() == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return numero1.doubleValue() / numero2.doubleValue();
    }
}
