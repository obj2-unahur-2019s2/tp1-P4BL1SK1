package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.diabolico.alma.proteccion.AnilloDePoder;
import ar.edu.unahur.obj2.diabolico.alma.proteccion.LuzBlanca;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SoulTest {
    //Demons
    Demonio d1; Demonio d2;Demonio d3;

    //Souls
    Alma almita; Alma alma; Alma almucha; Alma almucha2;

    //ProtectionTypes
    AnilloDePoder ring = new AnilloDePoder();
    LuzBlanca whiteLight = new LuzBlanca();

    //Places
    Lugar midgard;


    @BeforeMethod
    public void setup() {

        //Demons:
        d1 = new DemonioDeHielo(5);
        d2 = new DemonioDeFuego(5);
        d3 = new DemonioDeSombra(5);

        //Souls:
        almita = new Alma(); almita.setNivelDeBondad(4);almita.setEsFriolenta(true);almita.setValor(25);
        almita.setTipoDeProteccion(whiteLight);

        alma = new Alma(); alma.setNivelDeBondad(4);alma.setEsFriolenta(false);alma.setValor(25);
        alma.setTipoDeProteccion(whiteLight);

        almucha = new Alma(); almucha.setNivelDeBondad(4);almucha.setValor(25);
        almucha.setTipoDeProteccion(whiteLight);

        almucha2 = new Alma(); almucha2.setNivelDeBondad(4);almucha2.setValor(54);
        almucha2.setTipoDeProteccion(ring);

        //Place
        midgard = new Lugar("Midgard");
        midgard.setAlmasQueLoHabitan(Stream.of(alma,almita,almucha,almucha2).collect(Collectors.toList()));
    }

    @Test
    public void puedeCazar () {
        Assert.assertTrue(d1.puedeCazar(almita));
        Assert.assertFalse(d1.puedeCazar(alma));

        Assert.assertFalse(d2.puedeCazar(almita));
        Assert.assertTrue(d2.puedeCazar(alma));

        Assert.assertTrue(d3.puedeCazar(almucha));
        Assert.assertFalse(d3.puedeCazar(almucha2));
    }

    @Test
    public void almasEnLugar(){
        List<Alma> almas = Stream.of(alma,almita,almucha,almucha2).collect(Collectors.toList());
        Assert.assertEquals(almas, midgard.getAlmasQueLoHabitan());

        d3.salirACazar(midgard);
        List<Alma> almas2 = Stream.of(almucha2).collect(Collectors.toList());
        Assert.assertEquals(almas2, midgard.getAlmasQueLoHabitan());
        Assert.assertEquals(d3.getAlmasCazadas().size(),3);
    }
}