package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.diabolico.demonio.Astaroth;

public class AstarothAdapter extends Demonio {
    Astaroth astaroth;

    public AstarothAdapter(int nivelDeMaldad, Astaroth astaroth) {
        super(nivelDeMaldad);
        this.astaroth = astaroth;
    }

    @Override
        public boolean checkSoulCondition(Alma alma) {
            return astaroth.elegirPresa(alma.nivelDeBondad, alma.valor);
     }

     @Override
     public void tormentCondition(Alma alma) {
        astaroth.nivelDeValorAQuitar(alma.nivelDeBondad, alma.valor);
    }
}

