package ar.edu.unahur.obj2;

import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AlmasTest {

    //Diablo:
    Diablo Luci;

    //Demonios
    Demonio demon1; Demonio demon2;Demonio demon3;

    //Almas:
    Alma soul1; Alma soul2; Alma soul3;
    Alma soul4; Alma soul5; Alma soul6;

    //Lugares:
    Lugar hell; Lugar purgatory;

    @Before
    public void setup() {
        Luci = new Diablo();

        demon1 = new DemonioDeHielo(40);
        demon2 = new DemonioDeFuego(50);
        demon3 = new DemonioDeSombra(60);

        Luci.reclutarDemonio(demon1);
        Luci.reclutarDemonio(demon2);
        Luci.reclutarDemonio(demon3);

        soul1 = new Alma(); soul1.setNivelDeBondad(50); soul1.setValor(50); soul1.setEsFriolenta(true);
        soul2 = new Alma(); soul2.setNivelDeBondad(30); soul2.setValor(30); soul2.setEsFriolenta(false);
        soul3 = new Alma(); soul3.setNivelDeBondad(20); soul3.setValor(20); soul3.setEsFriolenta(true);
        soul4 = new Alma(); soul4.setNivelDeBondad(10); soul4.setValor(40); soul4.setEsFriolenta(false);
        soul5 = new Alma(); soul5.setNivelDeBondad(60); soul5.setValor(50); soul5.setEsFriolenta(true);
        soul6 = new Alma(); soul6.setNivelDeBondad(70); soul6.setValor(60); soul6.setEsFriolenta(false);

        hell = new Lugar("Hell");
        hell.recibirAlma(soul1);hell.recibirAlma(soul2);hell.recibirAlma(soul3);

        purgatory = new Lugar("Purgatory");
        purgatory.recibirAlma(soul4);purgatory.recibirAlma(soul5);purgatory.recibirAlma(soul6);

    }

    @Test
    public void test1 () {
        Assert.assertEquals(Luci.demonios.size(), 3);
    }
}