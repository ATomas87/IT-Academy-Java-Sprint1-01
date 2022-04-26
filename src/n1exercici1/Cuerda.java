package n1exercici1;

public class Cuerda extends Instrumento {
    private static int contador;

    public Cuerda(String nombre, double precio) {
        super(nombre, precio);
    }

    static {
        contador++;
        System.out.println("Clase Viento cargada.");
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String tocar() {
        return "Està sonant un instrument de corda";
    }
}
