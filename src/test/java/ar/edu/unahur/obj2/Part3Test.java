package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.diabolico.alma.proteccion.AnilloDePoder;
import ar.edu.unahur.obj2.diabolico.alma.proteccion.LuzBlanca;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Part3Test {
    //Devil
    Diablo luci;
    //Demons
    Demonio d1; Demonio d2;Demonio d3;
    //Souls
    Alma alma; Alma alma1; Alma alma2; Alma alma3; Alma alma4; Alma alma5; Alma alma6;
    //Places
    Lugar midgard;
    //TypeProtection
    AnilloDePoder ring = new AnilloDePoder();
    LuzBlanca whiteLight = new LuzBlanca();

    @BeforeTest
    public void setup() {

        //Demons:
        d1 = new DemonioDeHielo(5);
        d2 = new DemonioDeFuego(5);
        d3 = new DemonioDeSombra(5);

        //Souls:
        alma = new Alma(); alma.setNivelDeBondad(4);alma.setEsFriolenta(true);alma.setValor(51);
        alma.setTipoDeProteccion(whiteLight);

        alma1 = new Alma(); alma1.setNivelDeBondad(4);alma1.setEsFriolenta(false);alma1.setValor(51);
        alma1.setTipoDeProteccion(whiteLight);

        alma2 = new Alma(); alma2.setNivelDeBondad(4);alma2.setEsFriolenta(false);alma2.setValor(51);
        alma2.setTipoDeProteccion(whiteLight);

        alma3 = new Alma(); alma3.setNivelDeBondad(4);alma3.setEsFriolenta(false);alma3.setValor(58);
        alma3.setTipoDeProteccion(whiteLight);

        alma4 = new Alma(); alma4.setNivelDeBondad(4);alma4.setValor(24);
        alma4.setTipoDeProteccion(whiteLight);

        alma5 = new Alma(); alma5.setNivelDeBondad(4);alma5.setValor(25);
        alma5.setTipoDeProteccion(whiteLight);

        alma6 = new Alma(); alma6.setNivelDeBondad(4);alma6.setValor(26);
        alma6.setTipoDeProteccion(whiteLight);

        //Place
        midgard = new Lugar("Midgard");
        midgard.setAlmasQueLoHabitan(Stream.of(alma,alma1).collect(Collectors.toList()));

        //Devil
        luci = new Diablo();
        luci.setDemonios(Stream.of(d1,d2,d3).collect(Collectors.toList()));
    }

    @Test
   public  void part3() {

        luci.atormentar(d1,alma1);

        List<Alma> almas = Stream.of(alma,alma1).collect(Collectors.toList());
        Assert.assertEquals(almas, midgard.getAlmasQueLoHabitan());

        luci.mandarACazar(d1,midgard);

        midgard.setAlmasQueLoHabitan(Stream.of(alma2,alma3).collect(Collectors.toList()));
        luci.mandarACazar(d2,midgard);


        midgard.setAlmasQueLoHabitan(Stream.of(alma4,alma5,alma6).collect(Collectors.toList()));
        luci.mandarACazar(d3,midgard);

        List<Alma> answer = Stream.of(alma,alma1,alma2,alma3, alma4, alma5, alma6).collect(Collectors.toList());
        Assert.assertEquals(luci.totalDeAlmasCazadas(),answer);

        Assert.assertEquals(luci.almaMasBrave(),alma3);
        Assert.assertEquals(luci.demonioConMasCazadas(),d3);
    }
}