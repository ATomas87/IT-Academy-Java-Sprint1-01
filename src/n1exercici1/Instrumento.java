package n1exercici1;

public abstract class Instrumento {
    private String nombre;
    private double precio;

    private static int contador;

    public Instrumento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    static {
        contador++;
        System.out.println("Clase Instrumento cargada.");
    }

    public static int getContador(){
        return contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract void tocar();
}
