package ar.edu.unahur.obj2;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DevilTest {

    //Devil:
    Diablo luci;

    //Demons
    Demonio d1; Demonio d2;Demonio d3;

    //Souls
    Alma alma; Alma alma1; Alma alma2; Alma redCross; Alma survive; Alma demonMartialArts;

    //Places
    Lugar midgard;
    private Object CruzRoja;

    @BeforeTest
    public void setup() {

        //Demons:
        d1 = new DemonioDeHielo(5);
        d2 = new DemonioDeFuego(5);
        d3 = new DemonioDeSombra(5);

        //Souls:
        alma = new Alma(); alma.setNivelDeBondad(4);alma.setEsFriolenta(true);alma.setValor(25);
        alma1 = new Alma(); alma1.setNivelDeBondad(4);alma1.setEsFriolenta(true);alma1.setValor(25);
        alma2 = new Alma(); alma1.setNivelDeBondad(4);alma2.setEsFriolenta(true);alma2.setValor(25);
        redCross = new CruzRoja(alma);
        survive = new SupervivenciaExtremaEnElUnfierno(alma1);
        demonMartialArts = new LuchaMarcialDemoniaca(alma2);

        //Devil
        luci = new Diablo();
        luci.setDemonios(Stream.of(d1,d2,d3).collect(Collectors.toList()));
    }

    @Test
    public void reclutarDemonios() {
        Assert.assertEquals(luci.getCantEsbirros(),3);

        luci.atormentar(d1, alma);
        Assert.assertTrue(alma.getEsFriolenta());

        luci.atormentar(d2, alma1);
        Assert.assertFalse(alma1.getEsFriolenta());
    }

    @Test
    public void almasEntrenadas() {
        redCross.setNivelDeBondad(20);
        Assert.assertEquals(redCross.getNivelDeBondad(),100);
        redCross.setNivelDeBondad(899);
        Assert.assertEquals(redCross.getNivelDeBondad(),899);

        Assert.assertFalse(survive.getEsFriolenta());
        int valorEsperado = demonMartialArts.getValor();
        Assert.assertEquals(valorEsperado,50);
    }
}