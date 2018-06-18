package br.anhembi.rsimiao.calculadoraimc.Domain.PesoIdeal;

/**
 * Created by rsimiao on 26/03/18.
 */

public class PesoIdealFeminino extends PesoIdeal {
    private double altura;

    public PesoIdealFeminino(String altura) {
        this.altura = Double.valueOf(altura.toString());
    }

    @Override
    public double calcular() {

        return (altura - 100) * 0.85;
    }
}
