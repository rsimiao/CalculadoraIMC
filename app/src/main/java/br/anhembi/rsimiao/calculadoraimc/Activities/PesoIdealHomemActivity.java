package br.anhembi.rsimiao.calculadoraimc.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import br.anhembi.rsimiao.calculadoraimc.Domain.PesoIdeal.PesoIdealFeminino;
import br.anhembi.rsimiao.calculadoraimc.Domain.PesoIdeal.PesoIdealMasculino;
import br.anhembi.rsimiao.calculadoraimc.R;

/**
 * Created by rsimiao on 26/03/18.
 */

public class PesoIdealHomemActivity extends AppCompatActivity {

    private TextView txtAltura, txtResultado;
    private Button btnCalcularPesoIdeal;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_ideal);

        txtAltura = (TextView) findViewById(R.id.TxtAltura);
        txtResultado = (TextView) findViewById(R.id.TxtResultado);
        btnCalcularPesoIdeal = (Button) findViewById(R.id.BtnCalcularPesoIdeal);

        btnCalcularPesoIdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultado =
                        new PesoIdealMasculino(txtAltura.getText().toString())
                                .getResultado();

                txtResultado.setText(resultado);
            }
        });

    }


}
