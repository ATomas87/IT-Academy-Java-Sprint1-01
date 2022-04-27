package n3exercici1;

public class NoticiaMotociclismo extends Noticia {
    private String equipo;

    public NoticiaMotociclismo(String titular, String equipo) {
        super(titular);
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public void calcularPrecioNoticia() {
        this.precio = 100;
        if (this.equipo.equalsIgnoreCase("honda") || this.equipo.equalsIgnoreCase("yamaha")) this.precio += 50;
    }

    @Override
    public void calcularPuntuacionNoticia() {
        this.puntuacion = 3;
        if (this.equipo.equalsIgnoreCase("honda") || this.equipo.equalsIgnoreCase("yamaha")) this.puntuacion += 3;
    }

    @Override
    public String toString() {
        return "Categoría: Motociclismo Titular: " + this.getTitular();
    }
}
