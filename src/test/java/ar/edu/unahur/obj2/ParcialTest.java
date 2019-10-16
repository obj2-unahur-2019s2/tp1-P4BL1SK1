package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.diabolico.alma.proteccion.AnilloDePoder;
import ar.edu.unahur.obj2.diabolico.alma.proteccion.LuzBlanca;
import ar.edu.unahur.obj2.diabolico.alma.proteccion.LuzNegra;
import ar.edu.unahur.obj2.diabolico.demonio.Astaroth;
import ar.edu.unahur.obj2.diabolico.demonio.Belcebu;
import ar.edu.unahur.obj2.diabolico.demonio.Leviatan;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParcialTest {

    //Devil:
    Diablo luci;

    //Demons
    Astaroth astaroth = new Astaroth();
    Belcebu belcebu= new Belcebu();
    Leviatan leviatan = new Leviatan();

    AstarothAdapter astarothAdapter; BelcebuAdapter belcebuAdapter; LeviatanAdapter leviatanAdapter;

    //Souls
    Alma alma; Alma alma1; Alma alma2; Alma redCross; Alma survive;

    //Protections
    AnilloDePoder ring = new AnilloDePoder();
    LuzBlanca whiteLight = new LuzBlanca();
    LuzNegra blackLight = new LuzNegra();

    //Places
    Lugar midgard;

    @BeforeMethod
    public void setup() {

        //Demons:

        astarothAdapter = new AstarothAdapter(9,astaroth);
        belcebuAdapter = new BelcebuAdapter(5,belcebu);
        leviatanAdapter = new LeviatanAdapter(5,leviatan);


        //Souls:
        alma = new Alma(); alma.setNivelDeBondad(4);
        alma.setTipoDeProteccion(ring);

        alma1 = new Alma(); alma1.setNivelDeBondad(4);
        alma1.setTipoDeProteccion(whiteLight);

        alma2 = new Alma(); alma1.setNivelDeBondad(4);
        alma1.setTipoDeProteccion(blackLight);

        //Devil
        luci = new Diablo();
        luci.setDemonios(Stream.of(astarothAdapter,leviatanAdapter, belcebuAdapter).collect(Collectors.toList()));
    }

    @Test
    public void puedeCazar() {
        Assert.assertEquals(luci.getCantEsbirros(),3);

        Assert.assertFalse(luci.puedeDemonioCazar(astarothAdapter,alma));
        Assert.assertTrue(luci.puedeDemonioCazar(astarothAdapter,alma1));
        Assert.assertFalse(luci.puedeDemonioCazar(astarothAdapter,alma2));
    }
}