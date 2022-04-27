package n3exercici1;

public class NoticiaTenis extends Noticia {
    private String competicion;
    private String tenista;

    public NoticiaTenis(String titular, String competicion, String tenista) {
        super(titular);
        this.competicion = competicion;
        this.tenista = tenista;
    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public String getTenista() {
        return tenista;
    }

    public void setTenista(String tenista) {
        this.tenista = tenista;
    }

    @Override
    public void calcularPrecioNoticia() {
        this.precio = 150;
        if (this.tenista.equalsIgnoreCase("nadal")
                || this.tenista.equalsIgnoreCase("federer")
                || this.tenista.equalsIgnoreCase("djokovic"))
            this.precio += 100;
    }

    @Override
    public void calcularPuntuacionNoticia() {
        this.puntuacion = 4;
        if (this.tenista.equalsIgnoreCase("nadal")
                || this.tenista.equalsIgnoreCase("federer")
                || this.tenista.equalsIgnoreCase("djokovic"))
            this.puntuacion += 3;
    }

    @Override
    public String toString() {
        return "Categoría: Tenis Titular: " + this.getTitular();
    }
}
