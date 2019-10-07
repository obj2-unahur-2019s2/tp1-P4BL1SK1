package ar.edu.unahur.obj2;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Demonio {
    private int nivelDeMaldad;
    private List<Alma> almasCazadas;

    public Demonio(int nivelDeMaldad) {
        this.nivelDeMaldad = nivelDeMaldad;
    }

    public void salirACazar(Lugar lugar) {
        List<Alma> tempSouls = null; //Lista temporal de almas obtenidas en cada caza;
        final Integer[] tormentedSoulsCounter = null;

        lugar.getAlmasQueLoHabitan().forEach(alma -> {
            if (this.puedeCazar(alma)) {
                tempSouls.add(alma);
                cazarAlma(alma, lugar);
            }
            else {
                atormentar(alma);
                tormentedSoulsCounter[0]++;
            }
        } );
        nivelDeMaldad += (tormentedSoulsCounter[0]) + (tempSouls.size()*2);
    }

    public void cazarAlma(Alma alma, Lugar lugar){
        this.almasCazadas.add(alma);
        lugar.almasQueLoHabitan.remove(alma);
    }

    public boolean puedeCazar(Alma alma) {
        return alma.nivelDeBondad < this.nivelDeMaldad && checkSoulCondition(alma);
    }


    public void atormentar(Alma alma) {
        alma.serAtormentada(this);
    }


    public abstract boolean checkSoulCondition(Alma alma);
    protected abstract void tormentCondition(Alma alma);

    public int getNivelDeMaldad() {
        return nivelDeMaldad;
    }

    public List<Alma> getAlmasCazadas() {
        return almasCazadas;
    }

    public Integer getCantAlmasCazadas() {
        return almasCazadas.size();
    }
}

