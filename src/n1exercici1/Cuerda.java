package n1exercici1;

public class Cuerda extends Instrumento {
    private static int contador;

    public Cuerda(String nombre, double precio) {
        super(nombre, precio);
    }

    static {
        contador++;
        System.out.println("Clase Cuerda cargada.");
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}
