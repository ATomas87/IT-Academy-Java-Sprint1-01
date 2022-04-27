package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class Redaccion {
    private List<Redactor> redactores;

    public Redaccion() {
        this.redactores = new ArrayList<>();
    }

    public List<Redactor> getRedactores() {
        return redactores;
    }

    public void setRedactores(List<Redactor> redactores) {
        this.redactores = redactores;
    }
}
