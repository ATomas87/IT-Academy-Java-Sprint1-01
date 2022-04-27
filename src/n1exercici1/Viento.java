package n1exercici1;

public class Viento extends Instrumento {
    private static int contador;
    public Viento(String nombre, double precio) {
        super(nombre, precio);
    }

    static {
        contador++;
        System.out.println("Clase Viento cargada.");
    }

    public static int getContador(){
        return contador;
    }
    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
}
