package ar.edu.unahur.obj2;

public class Sample {
    public static void main(String[] args) {

        DemonioDeHielo d1 = new DemonioDeHielo(5);
        DemonioDeFuego d2 = new DemonioDeFuego(5);
        DemonioDeSombra d3 = new DemonioDeSombra(5);
        DemonioDeSombra d4 = new DemonioDeSombra(3);

        Alma almita = new Alma(); almita.setNivelDeBondad(4);almita.setEsFriolenta(true);almita.setValor(25);
        Alma alma = new Alma(); alma.setNivelDeBondad(4);alma.setEsFriolenta(false);alma.setValor(25);
        Alma almucha = new Alma(); almucha.setNivelDeBondad(4);almucha.setValor(25);
        Alma almucha2 = new Alma(); almucha2.setNivelDeBondad(4);almucha2.setValor(51);

        Diablo luci = new Diablo();
        luci.reclutarDemonio(d1);
        luci.reclutarDemonio(d2);
        luci.reclutarDemonio(d3);
        luci.reclutarDemonio(d4);


        Lugar midgard = new Lugar("Midgard");
        midgard.recibirAlma(alma);
        midgard.recibirAlma(almita);
        midgard.recibirAlma(almucha);
        midgard.recibirAlma(almucha2);

        luci.mandarACazar(d3,midgard);
        System.out.println(midgard.getAlmasQueLoHabitan().size());
    }
}
