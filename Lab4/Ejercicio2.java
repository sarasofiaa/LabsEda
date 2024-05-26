import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el identificador: ");
        String identificador = sc.nextLine();

        Persona<?> persona = crearPersona(nombre, identificador);

        System.out.println("Persona registrada:");
        System.out.println(persona);
    }

    private static Persona<?> crearPersona(String nombre, String identificador) {
        if (identificador.matches("\\d+")) {
            return new Persona<>(nombre, Integer.parseInt(identificador));
        } else {
            return new Persona<>(nombre, identificador);
        }
    }
}

class Persona<T> {
    private final String nombre;
    private final T id;

    public Persona(String nombre, T id) {
        this.nombre = nombre;
        this.id = id;
    }

    public T getDocumento() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Documento: " + id;
    }
}
