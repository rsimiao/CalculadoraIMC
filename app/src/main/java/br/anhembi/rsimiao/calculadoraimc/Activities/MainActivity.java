package br.anhembi.rsimiao.calculadoraimc.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.anhembi.rsimiao.calculadoraimc.R;

public class MainActivity extends AppCompatActivity {

    private Button btnPesoHomem, btnPesoMulher, btnIMC, btnSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPesoHomem = (Button) findViewById(R.id.btnPesoIdealHomem);
        btnPesoMulher = (Button) findViewById(R.id.btnPesoIdealMulher);
        btnIMC = (Button) findViewById(R.id.btnCalcularImc);
        btnSobre = (Button) findViewById(R.id.btnSobre);


        btnPesoHomem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoTo(PesoIdealHomemActivity.class);
            }
        });

        btnPesoMulher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoTo(PesoIdealMulherActivity.class);
            }
        });


        btnIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoTo(ImcActivity.class);
            }
        });


        btnSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoTo(SobreActivity.class);
            }
        });

    }

    public void GoTo(Class activity) {

        Intent intent = new Intent(MainActivity.this, activity);
        startActivity(intent);
    }

}
