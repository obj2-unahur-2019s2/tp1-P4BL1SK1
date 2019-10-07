package ar.edu.unahur.obj2;

import java.util.List;
import java.util.stream.Collectors;

public class  Diablo {
    List<Demonio> demonios = null;

    public boolean puedeDemonioCazar(Demonio demonio, Alma alma) {
        return demonio.puedeCazar(alma);
    }

    public void atormentar(Demonio demonio, Alma alma) {
        demonio.atormentar(alma);
    }

    public void mandarACazar(Demonio demonio, Lugar lugar) {
        demonio.salirACazar(lugar);
    }

    public void reclutarDemonio(Demonio demonio) {
        demonios.add(demonio);
    }
    public void desterrarDemonio(Demonio demonio) {
        demonios.remove(demonio);
    }

    public Alma entrenarAlma (Alma alma, Tecnicas tecnica) {
        switch (tecnica) {
            case CruzRoja:
                alma = new CruzRoja(alma);
                break;
            case SupervivenciaExtremaEnElUnfierno:
                alma = new SupervivenciaExtremaEnElUnfierno(alma);
                break;
            case LuchaMarcialDemoniaca:
                alma = new LuchaMarcialDemoniaca(alma);
                break;
        }
        return alma;
    }

    public Demonio demonioConMasCazadas(){
        return demonios.stream().max((demon, demon1) -> demon.getCantAlmasCazadas().compareTo(demon1.getCantAlmasCazadas())).get();
    }

    public Alma almaMasBrave() {
        return totalDeAlmasCazadas().stream().max((almita ,almucha) -> almita.getValor().compareTo(almucha.getValor())).get();
    }

    public List<Alma> totalDeAlmasCazadas() {
        return demonios.stream().flatMap(demon -> demon.getAlmasCazadas().stream()).collect(Collectors.toList());
    }
}
