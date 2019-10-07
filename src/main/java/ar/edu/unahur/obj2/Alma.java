package ar.edu.unahur.obj2;

import java.util.ArrayList;

public class Alma {
    int nivelDeBondad;
    int valor;
    boolean esFriolenta;
    boolean estaAtormentada;
    ArrayList<Tecnica> tecnicasAprendidas;

    public void setNivelDeBondad(int nivelBondad) { this.nivelDeBondad = nivelBondad; }

    public void setValor(int valor) { this.valor = valor; }

    public void setEsFriolenta(boolean esFrioLenta) { this.esFriolenta = esFrioLenta; }

    public void setEstaAtormentada(boolean estaAtormentada) { this.estaAtormentada = estaAtormentada; }

    public Integer getValor() {return this.valor;}

    public boolean getEstaAtormentada() { return estaAtormentada; }

    public boolean getEsFriolenta() { return esFriolenta; }

    public void serAtormentada(Demonio demonio) {
        if(nivelDeBondad > 5) {
           nivelDeBondad -= 5;
        }
        else {
            nivelDeBondad = 0;
        }
        demonio.tormentCondition(this);
        estaAtormentada = true;
    }
}
