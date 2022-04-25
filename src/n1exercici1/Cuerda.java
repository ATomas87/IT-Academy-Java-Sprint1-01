package n1exercici1;

public class Cuerda extends Instrumento {
    public Cuerda(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String tocar() {
        return "Està sonant un instrument de corda";
    }
}
