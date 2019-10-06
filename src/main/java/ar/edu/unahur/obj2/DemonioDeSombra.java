package ar.edu.unahur.obj2;

public class DemonioDeSombra extends Demonio {
    public DemonioDeSombra(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }
    @Override
    public boolean selfCondition(Alma alma) {
        return alma.valor < 50;
    }

    @Override
    protected  void anotherCondition(Alma alma) {
    alma.nivelBondad /= 2;
    }
}
