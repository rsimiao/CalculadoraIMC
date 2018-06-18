package br.anhembi.rsimiao.calculadoraimc.Domain.PesoIdeal;

/**
 * Created by rsimiao on 26/03/18.
 */

public class PesoIdealMasculino extends PesoIdeal {
    private double altura;

    public PesoIdealMasculino(String altura) {
        this.altura =  Double.valueOf(altura.toString());
    }

    @Override
    double calcular() {
        return (altura - 100) * 0.90;
    }
}
