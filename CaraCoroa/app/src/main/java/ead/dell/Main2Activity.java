package ead.dell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent IntentSecundaria = getIntent();

        Bundle parametros = IntentSecundaria.getExtras();

        if (parametros != null){

            String nome = parametros.getString("chave_nome");

            Toast.makeText(Main2Activity.this, "Tá ótimo, " + nome + "! Obrigada por participar !", Toast.LENGTH_SHORT).show();

        }
    }
}
