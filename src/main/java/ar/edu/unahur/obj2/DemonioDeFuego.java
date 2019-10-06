package ar.edu.unahur.obj2;

public class DemonioDeFuego extends Demonio {

    public DemonioDeFuego(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    @Override
    public boolean selfCondition(Alma alma) {
        return alma.getEsFriolenta() == false;
    }

    @Override
    protected  void anotherCondition(Alma alma) {
        alma.esFrioLenta = false;
    }
}
