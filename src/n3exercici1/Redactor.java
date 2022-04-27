package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class Redactor {
    private String nombre;
    private String dni;
    private static final int SUELDO = 1500;
    private List<Noticia> noticias;

    public Redactor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.noticias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public List<Noticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<Noticia> noticias) {
        this.noticias = noticias;
    }

    @Override
    public String toString() {
        return "Redactor: " + this.nombre + " DNI: " + this.dni;
    }
}
