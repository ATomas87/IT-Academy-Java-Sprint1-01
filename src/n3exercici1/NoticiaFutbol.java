package n3exercici1;

public class NoticiaFutbol extends Noticia{
    private String competicion;
    private String club;
    private String jugador;

    public NoticiaFutbol(String titular, String competicion, String club, String jugador) {
        super(titular);
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;
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

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    @Override
    public void calcularPrecioNoticia() {
        this.precio = 300;
        if (this.competicion.equalsIgnoreCase("lliga de campions")) this.precio += 100;
        if (this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")) this.precio += 100;
        if (this.jugador.equalsIgnoreCase("ferran torres") || this.jugador.equalsIgnoreCase("benzema")) this.precio += 50;
    }

    @Override
    public void calcularPuntuacionNoticia() {
        this.puntuacion = 5;
        if (this.competicion.equalsIgnoreCase("lliga de campions")) this.puntuacion += 3;
        if (this.competicion.equalsIgnoreCase("lliga")) this.puntuacion += 2;
        if (this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")) this.puntuacion += 1;
        if (this.jugador.equalsIgnoreCase("ferran torres") || this.jugador.equalsIgnoreCase("benzema")) this.puntuacion += 1;
    }

    @Override
    public String toString() {
        return "Tipo: Fútbol Titular: " + this.getTitular();
    }
}
