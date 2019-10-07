package ar.edu.unahur.obj2;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Demonio {
    private int nivelDeMaldad;
    private List<Alma> almasCazadas;

    public Demonio(int nivelDeMaldad) {
        this.nivelDeMaldad = nivelDeMaldad;
        this.almasCazadas = new ArrayList<>();
    }

    public void salirACazar(Lugar lugar) {
        List<Alma> tempSouls = new ArrayList<>(); //Lista temporal de almas obtenidas en cada caza;

        lugar.getAlmasQueLoHabitan().forEach(alma -> {
            if (puedeCazar(alma)) {
                tempSouls.add(alma);
                nivelDeMaldad += 2;
            }
            else {
                atormentar(alma);
                nivelDeMaldad++;
            }
        });
        cazarAlmas(tempSouls);
        lugar.liberarAlmas(tempSouls);
    }

    public void cazarAlmas(List<Alma> alma){
        this.almasCazadas.addAll(alma);
    }


    public boolean puedeCazar(Alma alma) {
        return this.getNivelDeMaldad() > alma.getNivelDeBondad() && this.checkSoulCondition(alma);
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

