package br.anhembi.rsimiao.calculadoraimc.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import br.anhembi.rsimiao.calculadoraimc.Domain.IMC.CalcularIMC;
import br.anhembi.rsimiao.calculadoraimc.R;

/**
 * Created by rsimiao on 26/03/18.
 */

public class ImcActivity extends AppCompatActivity {

    private Button btnCalcular;
    private TextView txtAltura, txtPeso;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imc);

        btnCalcular = (Button) findViewById(R.id.BtnCalcularPesoIdeal);
        txtAltura = (TextView) findViewById(R.id.TxtAltura);
        txtPeso = (TextView) findViewById(R.id.TxtPeso);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               new CalcularIMC(txtPeso.getText().toString(),
                       txtAltura.getText().toString()).show(ImcActivity.this);
            }
        });


    }


}
