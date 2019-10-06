package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public abstract class Demonio {
    private int nivelDeMaldad;
    private List<Alma> almasCazadas;

    public Demonio(int nivelDeMaldad) {
        this.nivelDeMaldad = nivelDeMaldad;
    }

    public void salirACazar(Lugar lugar) {
        lugar.getAlmasQueLoHabitan().forEach(alma -> {
            if (checkSoul(alma)) {
                cazarAlma(alma);
            }
            else {
                atormentar(alma);
                alma.nivelBondad -= 5;
                anotherCondition(alma);
            }
        } );
    }


    public boolean checkSoul(Alma alma) {
        return alma.nivelBondad > this.nivelDeMaldad && selfCondition(alma);
    }

    public void cazarAlma(Alma alma){
        this.almasCazadas.add(alma);
    }

    public void atormentar(Alma alma) {
        alma.estaAtormentada = true;
    }

    public abstract boolean selfCondition(Alma alma);
    protected abstract void anotherCondition(Alma alma);
}

