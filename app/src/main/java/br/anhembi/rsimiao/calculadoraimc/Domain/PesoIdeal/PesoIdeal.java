package br.anhembi.rsimiao.calculadoraimc.Domain.PesoIdeal;

/**
 * Created by rsimiao on 26/03/18.
 */

public abstract class PesoIdeal {

    private double pesoIdeal = 0;

    abstract double calcular();

    public String getResultado() {
        this.pesoIdeal = calcular();
        return new StringBuffer("Resultado: ").append(pesoIdeal).toString();
    }

}
