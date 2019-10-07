package ar.edu.unahur.obj2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DemoniosTest {

    //Demonios
    Demonio demon1; Demonio demon2;Demonio demon3;

    @BeforeTest
    public void setup() {
        demon1 = new DemonioDeHielo(40);
    }

    @Test
    public void test1 () {
        Assert.assertEquals(40, demon1.getNivelDeMaldad());
    }
}