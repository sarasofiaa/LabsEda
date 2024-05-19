public class Ejercicio3 {
    public static void main(String[] args) {
        Ganso ganso = new Ganso("Ganso Nevado", 3, "Largo", "Blancas", "Grandes");
        Pato pato = new Pato("Pato arlequín​", 3, "Mediano", "Verdes", "Medianas");
        Gallina gallina = new Gallina("Gallina Rhode", 2, "Corto", "Marrones", "Pequeñas");

        ganso.mostrarDetalles();
        pato.mostrarDetalles();
        gallina.mostrarDetalles();
    }
}

class Ave {
    protected String tipo;
    protected int edad;
    protected String pico;
    protected String plumas;
    protected String alas;

    public Ave(String tipo, int edad, String pico, String plumas, String alas) {
        this.tipo = tipo;
        this.edad = edad;
        this.pico = pico;
        this.plumas = plumas;
        this.alas = alas;
    }

    public void mostrarDetalles() {
        System.out.println("Tipo de ave: " + tipo + ", Edad: " + edad + " años");
        System.out.println("Pico: " + pico + ", Plumas: " + plumas + ", Alas: " + alas);
    }
}

class Ganso extends Ave {
    public Ganso(String tipo, int edad, String pico, String plumas, String alas) {
        super(tipo, edad, pico, plumas, alas);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Ganso: " + tipo + ", Edad: " + edad + " años");
        System.out.println("Pico: " + pico + ", Plumas: " + plumas + ", Alas: " + alas);
    }
}

class Pato extends Ave {
    public Pato(String tipo, int edad, String pico, String plumas, String alas) {
        super(tipo, edad, pico, plumas, alas);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Pato: " + tipo + ", Edad: " + edad + " años");
        System.out.println("Pico: " + pico + ", Plumas: " + plumas + ", Alas: " + alas);
    }
}

class Gallina extends Ave {
    public Gallina(String tipo, int edad, String pico, String plumas, String alas) {
        super(tipo, edad, pico, plumas, alas);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Gallina: " + tipo + ", Edad: " + edad + " años");
        System.out.println("Pico: " + pico + ", Plumas: " + plumas + ", Alas: " + alas);
    }
}

