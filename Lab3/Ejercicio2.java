public class Ejercicio2 {
    public static void main(String[] args) {
        Objetos objeto1 = new Objetos(165, 74,42, "madera");
        objeto1.mostrarObjeto();
    }
}

class Color {
    protected int red;
    protected int green;
    protected int blue;
    protected String nombreColor;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.nombreColor = convertirColorANombre(red, green, blue);
    }

    private String convertirColorANombre(int red, int green, int blue) {
        //Colores basicos en rgb
        if (red == 255 && green == 0 && blue == 0) {
            return "Rojo";
        } else if (red == 0 && green == 255 && blue == 0) {
            return "Verde";
        } else if (red == 0 && green == 0 && blue == 255) {
            return "Azul";
        } else if (red == 0 && green == 0 && blue == 0) {
            return "Negro";
        } else if (red == 255 && green == 255 && blue == 255) {
            return "Blanco";
        } else if (red == 165 && green == 74 && blue == 42) {
            return "Café";
        } else {
            return "Color desconocido";
        }
    }

    public void mostrarColor() {
        System.out.println("Color: " + nombreColor + " (RGB: " + red + ", " + green + ", " + blue + ")");
    }
}

class Material {
    protected String descripcion;

    public Material(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarMaterial() {
        System.out.println("Material: " + descripcion);
    }
}

class Objetos extends Color {
    private String descripcionMaterial;

    public Objetos(int red, int green, int blue, String descripcionMaterial) {
        super(red, green, blue);
        this.descripcionMaterial = descripcionMaterial;
    }

    public void mostrarObjeto() {
        System.out.println("Objeto de color " + nombreColor + " y material: " + descripcionMaterial);
    }
}
