package n1exercici2;

public class Coche {
    public static final String MARCA = "Seat";
    public static String modelo;
    public final int potencia;

    public Coche(int potencia) {
        this.potencia = potencia;
    }

    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }

    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }
}
