package n1exercici1;

public class Percusion extends Instrumento {
    public Percusion(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String tocar() {
        return "Està sonant un instrument de percussió";
    }
}
