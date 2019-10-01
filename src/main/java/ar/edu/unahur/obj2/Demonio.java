package ar.edu.unahur.obj2;

import java.util.List;

public abstract class Demonio {
    private int nivelDeMaldad;
    private List<Alma> almasCAzadas;

    public Demonio(int nivelDeMaldad) {
        this.nivelDeMaldad = nivelDeMaldad;
    }
    public void cazar(Lugar lugar) {
        lugar.almas.stream().forEach(alma -> checkSoul(alma));
    }

    public void checkSoul(Alma alma) {
        if(alma.nivelBondad > nivelDeMaldad) {
            //Fafafa;
        }
    }
}

