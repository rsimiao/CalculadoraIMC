package br.anhembi.rsimiao.calculadoraimc.Domain.IMC;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by rsimiao on 26/03/18.
 */

public class CalcularIMC {

    private double peso, altura;

    public CalcularIMC(String peso, String altura){
        this.peso = Double.valueOf(peso);
        this.altura = Double.valueOf(altura);
    }

    private double calcular(){
        return peso / (altura * altura);
    }

    public void show(Context context){

        double IMC = calcular();
        Toast msg;
        if (IMC < 18.5) {
            msg = Toast.makeText(context, "BAIXO PESO", Toast.LENGTH_LONG);
        } else if (IMC > 18.5 && IMC <= 24.9) {
            msg = Toast.makeText(context, "PESO NORMAL", Toast.LENGTH_LONG);
        } else if (IMC > 25 && IMC <= 29.9) {
            msg = Toast.makeText(context, "SOBREPESO", Toast.LENGTH_LONG);
        } else if (IMC > 30 && IMC < 34.9) {
            msg = Toast.makeText(context, "OBESIDADE GRAU I", Toast.LENGTH_LONG);
        } else if (IMC > 35 && IMC <= 39.9) {
            msg = Toast.makeText(context, "OBESIDADE GRAU II", Toast.LENGTH_LONG);
        } else if (IMC > 40) {
            msg = Toast.makeText(context, "OBESIDADE GRAU III", Toast.LENGTH_LONG);
        } else {
            msg = Toast.makeText(context, "OCORREU UM ERRO AO CALCULAR", Toast.LENGTH_LONG);
        }

        msg.show();
    }


}
