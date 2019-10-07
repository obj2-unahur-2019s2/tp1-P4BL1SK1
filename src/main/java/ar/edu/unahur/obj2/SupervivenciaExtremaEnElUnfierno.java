package ar.edu.unahur.obj2;

public class SupervivenciaExtremaEnElUnfierno extends Tecnica {

    public SupervivenciaExtremaEnElUnfierno(Alma alma) {
        super(alma);
    }

    @Override
    public void setEsFriolenta(boolean esFriolenta) {
        super.setEsFriolenta(false);
    }

    @Override
    public boolean getEsFriolenta() {
        return false;
    }
}
