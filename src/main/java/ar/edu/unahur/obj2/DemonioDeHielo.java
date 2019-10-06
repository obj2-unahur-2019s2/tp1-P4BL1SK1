package ar.edu.unahur.obj2;

public class DemonioDeHielo extends Demonio {
    public DemonioDeHielo(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }


    @Override
    public boolean selfCondition(Alma alma) {
        return alma.getEsFriolenta() == true;
    }

    @Override
    protected  void anotherCondition(Alma alma) {
        alma.esFrioLenta = true;
    }
}
