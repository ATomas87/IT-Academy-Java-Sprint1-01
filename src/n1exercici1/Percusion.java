package n1exercici1;

public class Percusion extends Instrumento {
    private static int contador;

    public Percusion(String nombre, double precio) {
        super(nombre, precio);
    }

    static {
        contador++;
        System.out.println("Clase Percusión cargada.");
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
