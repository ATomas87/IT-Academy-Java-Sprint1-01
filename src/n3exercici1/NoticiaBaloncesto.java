package n3exercici1;

public class NoticiaBaloncesto extends Noticia {
    private String competicion;
    private String club;

    public NoticiaBaloncesto(String titular, String competicion, String club) {
        super(titular);
        this.competicion = competicion;
        this.club = club;
    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public void calcularPrecioNoticia() {
        this.precio = 250;
        if (this.competicion.equalsIgnoreCase("eurolliga")) this.precio += 75;
        if (this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")) this.precio += 75;
    }

    @Override
    public void calcularPuntuacionNoticia() {
        this.puntuacion = 4;
        if (this.competicion.equalsIgnoreCase("eurolliga")) this.puntuacion += 3;
        if (this.competicion.equalsIgnoreCase("acb")) this.puntuacion += 2;
        if (this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")) this.puntuacion += 1;
    }

    @Override
    public String toString() {
        return "Categoría: Baloncesto Titular: " + this.getTitular();
    }
}
