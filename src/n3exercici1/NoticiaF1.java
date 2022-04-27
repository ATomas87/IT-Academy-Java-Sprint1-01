package n3exercici1;

public class NoticiaF1 extends Noticia {
    private String escuderia;

    public NoticiaF1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public void calcularPrecioNoticia() {
        this.precio = 100;
        if (this.escuderia.equalsIgnoreCase("ferrari") || this.escuderia.equalsIgnoreCase("mercedes")) this.precio += 50;
    }

    @Override
    public void calcularPuntuacionNoticia() {
        this.puntuacion = 4;
        if (this.escuderia.equalsIgnoreCase("ferrari") || this.escuderia.equalsIgnoreCase("mercedes")) this.puntuacion += 2;
    }

    @Override
    public String toString() {
        return "Categoría: Formula 1 Titular: " + this.getTitular();
    }
}
