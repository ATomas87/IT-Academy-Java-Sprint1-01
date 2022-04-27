package n3exercici1;

public abstract class Noticia {
    private String titular;
    private String texto;
    protected int puntuacion;
    protected int precio;

    public Noticia(String titular) {
        this.titular = titular;
        this.texto = "";
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract void calcularPrecioNoticia();
    public abstract void calcularPuntuacionNoticia();

    @Override
    public String toString() {
        return this.titular;
    }

}
