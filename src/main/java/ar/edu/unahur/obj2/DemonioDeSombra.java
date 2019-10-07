package ar.edu.unahur.obj2;

public class DemonioDeSombra extends Demonio {
    public DemonioDeSombra(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }
    @Override
    public boolean checkSoulCondition(Alma alma) { return alma.getValor() < 50; }

    @Override
    protected void tormentCondition(Alma alma) {
        if(alma.nivelDeBondad >= 2) {
            alma.nivelDeBondad /= 2;
        }
        else {
            alma.nivelDeBondad = 0;
        }
    }
}
