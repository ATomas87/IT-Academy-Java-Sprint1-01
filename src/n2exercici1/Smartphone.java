package n2exercici1;

public class Smartphone extends Telefono implements Camera, Reloj{
    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void fotografiar() {
        System.out.println("S'està fent una foto");
    }

    @Override
    public void alarmar() {
        System.out.println("Està sonant l'alarma");
    }
}
