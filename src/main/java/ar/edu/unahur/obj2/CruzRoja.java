package ar.edu.unahur.obj2;

public class CruzRoja extends Tecnica {

    public CruzRoja(Alma alma) {
        super(alma);
    }

    @Override
    public void setNivelDeBondad(int nivelDeBondad) {
        if(nivelDeBondad > 100) {
            super.setNivelDeBondad(nivelDeBondad);
        }
        else {
            super.setNivelDeBondad(100);
        }
    }
}
