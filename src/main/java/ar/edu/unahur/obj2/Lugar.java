package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Lugar {
    String nombre;
    List<Alma> almasQueLoHabitan;

    public Lugar(String nombre) {
        this.nombre = nombre;
        almasQueLoHabitan = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alma> getAlmasQueLoHabitan() {
        return almasQueLoHabitan;
    }

    public void setAlmasQueLoHabitan(List<Alma> almasQueLoHabitan) {
        this.almasQueLoHabitan = almasQueLoHabitan;
    }

    public void recibirAlma(Alma alma) {
        almasQueLoHabitan.add(alma);
    }

    public void liberarAlma(Alma alma) {
        almasQueLoHabitan.remove(alma);
    }

    public void liberarAlmas(List<Alma> alma) {
        almasQueLoHabitan.removeAll(alma);
    }


}
