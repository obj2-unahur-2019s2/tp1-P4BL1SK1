package ar.edu.unahur.obj2;

public class DemonioDeSombra extends Demonio {
    public DemonioDeSombra(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }
    @Override
    public boolean checkSoulCondition(Alma alma) {
        return alma.valor < 50;
    }

    @Override
    protected  void tormentCondition(Alma alma) {
    alma.nivelDeBondad /= 2;
    }
}
