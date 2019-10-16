package ar.edu.unahur.obj2;

public class DemonioDeHielo extends Demonio {
    public DemonioDeHielo(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }


    @Override
    public boolean checkSoulCondition(Alma alma) {
        return alma.getEsFriolenta();
    }

    @Override
    public void tormentCondition(Alma alma) { alma.setEsFriolenta(true); }
}
