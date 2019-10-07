package ar.edu.unahur.obj2;

public class DemonioDeFuego extends Demonio {

    public DemonioDeFuego(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    @Override
    public boolean checkSoulCondition(Alma alma) {
        return !alma.getEsFriolenta();
    }

    @Override
    protected  void tormentCondition(Alma alma) { alma.setEsFriolenta(false); }
}
