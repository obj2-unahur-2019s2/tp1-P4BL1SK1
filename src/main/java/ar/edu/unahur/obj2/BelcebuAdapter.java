package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.diabolico.demonio.Belcebu;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class BelcebuAdapter extends Demonio {
    Belcebu belcebu;

    public BelcebuAdapter(int nivelDeMaldad, Belcebu belcebu) {
        super(nivelDeMaldad);
        this.belcebu = belcebu;
    }


    @Override
    public boolean checkSoulCondition(Alma alma) {
        try {
            belcebu.puedeCazarla(alma.nivelDeBondad);
        }
        catch(Exception e) {
            return false;
        }
        return true;
    }
    @Override
    public void tormentCondition(Alma alma) {
        belcebu.incrementoDeMaldad(alma.nivelDeBondad);
    }
}
