package ar.edu.unahur.obj2;

public class LuchaMarcialDemoniaca extends Tecnica {

    public LuchaMarcialDemoniaca(Alma alma) {
        super(alma);
    }

    @Override
    public Integer getValor() {
        return (alma.getValor())*2;
    }
}
