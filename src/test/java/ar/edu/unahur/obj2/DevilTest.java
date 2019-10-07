package ar.edu.unahur.obj2;

import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DevilTest {

    //Devil:
    Diablo Luci = new Diablo();

    //Demons
    Demonio d1; Demonio d2;Demonio d3; Demonio d4; Demonio d5;

    //Souls
    Alma almita; Alma alma; Alma almucha;

    //Places
    Lugar midgard = new Lugar("Midgard");


    @BeforeEach
    public void setup() {
        //Demons:
        d1 = new DemonioDeHielo(5);
        d2 = new DemonioDeFuego(5);
        d3 = new DemonioDeSombra(5);
        d4 = new DemonioDeSombra(3);

        //Souls:
        almita = new Alma(); almita.setNivelDeBondad(4);almita.setEsFriolenta(true);
        alma = new Alma(); alma.setNivelDeBondad(4);alma.setEsFriolenta(false);
        almucha = new Alma(); almucha.setNivelDeBondad(4);almucha.setValor(25);

        //Place
        midgard.recibirAlma(alma);
        midgard.recibirAlma(almita);
        midgard.recibirAlma(almucha);
    }

    @Test
    public void puedeCazar () {
        Assert.assertEquals(d1.puedeCazar(almita),true);
        Assert.assertEquals(d2.puedeCazar(alma),false);

        Assert.assertEquals(d1.puedeCazar(alma),false);
        Assert.assertEquals(d2.puedeCazar(almita),true);

    }
}