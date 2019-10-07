package ar.edu.unahur.obj2;

public abstract class Tecnica extends Alma {
    Alma alma;

    @Override
    public void setNivelDeBondad(int nivelDeBondad) {
        super.setNivelDeBondad(nivelDeBondad);
    }

    @Override
    public void setValor(int valor) {
        super.setValor(valor);
    }

    @Override
    public void setEsFriolenta(boolean esFrioLenta) {
        super.setEsFriolenta(esFrioLenta);
    }

    @Override
    public void setEstaAtormentada(boolean estaAtormentada) {
        super.setEstaAtormentada(estaAtormentada);
    }

    @Override
    public boolean getEstaAtormentada() {
        return super.getEstaAtormentada();
    }

    @Override
    public boolean getEsFriolenta() {
        return super.getEsFriolenta();
    }

    @Override
    public void serAtormentada(Demonio demonio) {
        super.serAtormentada(demonio);
    }
}
