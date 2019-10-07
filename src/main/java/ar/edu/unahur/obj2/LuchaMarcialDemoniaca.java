package ar.edu.unahur.obj2;

public class LuchaMarcialDemoniaca extends Tecnica {

    public LuchaMarcialDemoniaca(Alma alma) {
        this.alma = alma;
    }

    @Override
    public Integer getValor() {
        return super.getValor()*2;
    }
}
