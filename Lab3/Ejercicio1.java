//Clase base
class Persona {
    protected String nombre;
    protected int edad;

    public Persona() {
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void asignarEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarDatosBase() {
        System.out.println("Persona Nombre: " + nombre + ", Edad: " + edad);
    }
}

//Clase derivada
class Alumno extends Persona {
    private String curso;

    public Alumno(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public void mostrarDatosDerivada() {
        System.out.println("Alumno Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso);
    }
}

//Main
public class Ejercicio1 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Sara Sofia", 19, "EDA");
        alumno1.mostrarDatosDerivada();
        alumno1.mostrarDatosBase();
    }
}
