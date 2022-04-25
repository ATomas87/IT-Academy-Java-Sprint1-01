package n1exercici1;

public class Viento extends Instrumento {
    public Viento(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String tocar() {
        return "Està sonant un instrument de vent";
    }
}
