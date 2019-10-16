package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.diabolico.demonio.Leviatan;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class LeviatanAdapter extends Demonio {
    Leviatan leviatan;

    public LeviatanAdapter (int nivelDeMaldad, Leviatan leviatan) {
        super(nivelDeMaldad);
        this.leviatan = leviatan;
    }

    @Override
    public boolean checkSoulCondition(Alma alma) {
        return leviatan.seleccionar(alma.valor);
    }

    @Override
    public void tormentCondition(Alma alma) { }
}
