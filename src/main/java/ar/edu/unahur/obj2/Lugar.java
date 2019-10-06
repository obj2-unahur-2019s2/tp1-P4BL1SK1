package ar.edu.unahur.obj2;

import java.util.ArrayList;

public class Lugar {
    String nombre;
    ArrayList<Alma> almasQueLoHabitan;

    public Lugar(String nombre, ArrayList<Alma> almasQueLoHabitan) {
        this.nombre = nombre;
        this.almasQueLoHabitan = almasQueLoHabitan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alma> getAlmasQueLoHabitan() {
        return almasQueLoHabitan;
    }

    public void setAlmasQueLoHabitan(ArrayList<Alma> almasQueLoHabitan) {
        this.almasQueLoHabitan = almasQueLoHabitan;
    }
}
