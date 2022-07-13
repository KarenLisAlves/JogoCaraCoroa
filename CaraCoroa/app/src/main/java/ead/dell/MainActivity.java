package ead.dell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Random;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

        private EditText nomeJogador;
        int aleatorio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nomeJogador = (EditText) findViewById(R.id.nomeJogador);


        RadioButton cara = (RadioButton) findViewById(R.id.Cara);
        cara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "A escolha da moeda foi CARA!!!" , Toast.LENGTH_SHORT).show();

            }
        });


        


        RadioButton coroa = (RadioButton) findViewById(R.id.Coroa);
        coroa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "A escolha da moeda foi COROA!!!", Toast.LENGTH_SHORT).show();

            }
        });
    }



    public void jogar (View Resultado) {

        String nome = nomeJogador.getText().toString();


        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(2);

        if (valor == 0) {

            //System.out.println("Numero aleatório gerado: " + valor);

            Toast.makeText(MainActivity.this, "O RESULTADO DO JOGO É --> CARA! ", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "O RESULTADO DO JOGO É --> COROA! ", Toast.LENGTH_SHORT).show();
        }


/*
        // boolean

        RadioButton cara = (RadioButton) findViewById(R.id.Cara);
        RadioButton coroa = (RadioButton) findViewById(R.id.Coroa);

        cara.setSelected(true);
        coroa.setSelected(true);



        if (cara.isSelected() && valor == 0) {
            Toast.makeText(MainActivity.this, "PARABÉNS, VOCÊ GANHOU !!!" + valor, Toast.LENGTH_SHORT).show();
        }

        else if (coroa.isSelected() && valor == 0) {
            Toast.makeText(MainActivity.this, " INFELIZMENTE VOCÊ PERDEU. MAS TENTE OUTRA VEZ !!!" + valor, Toast.LENGTH_SHORT).show();
        }

        else if (cara.isSelected() && valor == 1) {
                        Toast.makeText(MainActivity.this, "INFELIZMENTE VOCÊ PERDEU. MAS TENTE OUTRA VEZ !!!" + valor, Toast.LENGTH_SHORT).show();
                    }

        else if (coroa.isSelected() && valor == 1) {
            Toast.makeText(MainActivity.this, "PARABÉNS, VOCÊ GANHOU !!!!!" + valor, Toast.LENGTH_SHORT).show();
        }


        else {
        Toast.makeText(MainActivity.this, "ATENCAO!!!" + valor, Toast.LENGTH_SHORT).show();

    }

 */






        Intent IntentPrincipal = new Intent(getApplicationContext(), Main2Activity.class);

        Bundle parametros = new Bundle();

        parametros.putString("chave_nome", nome);

        IntentPrincipal.putExtras(parametros);

        startActivity(IntentPrincipal);
    }
}










/*
        if (valor == 0) {
            if (cara.isSelected()) {
               Toast.makeText(MainActivity.this, "VOCÊ GANHOU!" + valor, Toast.LENGTH_SHORT).show(); }

            else if (coroa.isSelected()) {
                Toast.makeText(MainActivity.this, "VOCÊ PERDEU!" + valor, Toast.LENGTH_SHORT).show();}
        }


        else if (valor == 1) {
                if (cara.isSelected()) {
                Toast.makeText(MainActivity.this, "VOCÊ PERDEU!" + valor, Toast.LENGTH_SHORT).show(); }

                else if (coroa.isSelected()) {
                Toast.makeText(MainActivity.this, "VOCÊ GANHOU!" + valor, Toast.LENGTH_SHORT).show(); }
        }

        else{
            Toast.makeText(MainActivity.this, "VOCÊ ???!" + valor, Toast.LENGTH_SHORT).show(); }

 */

/*
                if (valor == 0 && cara.isSelected()) {

                Toast.makeText(MainActivity.this, "VOCÊ GANHOU!" + valor, Toast.LENGTH_SHORT).show(); }


                else if (valor == 0 && coroa.isSelected()){

                Toast.makeText(MainActivity.this, "VOCÊ PERDEUUUUUUU???!" + valor, Toast.LENGTH_SHORT).show(); }


                else if (valor == 1 && cara.isSelected()){

                Toast.makeText(MainActivity.this, "VOCÊ perdeuuuuu???!" + valor, Toast.LENGTH_SHORT).show();

                } else {

                    Toast.makeText(MainActivity.this, "VOCÊ GANHOUUUUUUUUUUUUUUUUUUUUUUUUUUU?????!" + valor, Toast.LENGTH_SHORT).show();

                } */


/*
        String cara = "0";
        int numero0 = Integer.parseInt(cara);
        int numerook0 = numero0 * 1;

        String coroa = "1";
        int numero1 = Integer.parseInt(coroa);
        int numerook1 = numero1 * 1;

        int valorsorteado = valor + 1;
        //  0  + 1 = 1
        //  1  + 1 = 2

        if ( valor == 0 && numerook0 == valor || numerook1 != valor) {
            //SELEC. CARA SORTEADO CARA

            Toast.makeText(MainActivity.this, "GANHOUUU" + valor, Toast.LENGTH_SHORT).show();
        }

        else if (valor != 0 && numerook0 != valor || numerook1 == valor){
             // SELEC COROA SORTEADO COROA
                        //SELEC. CARA SORTEADO COROA = PERDEU

            Toast.makeText(MainActivity.this, "perdeu???" + valor, Toast.LENGTH_SHORT).show();
        }

        else if ( valor == 1 && numerook1 == valor) {
            //SELEC. COROA SORTEADO COROA
            Toast.makeText(MainActivity.this, "GANHOU" + valor, Toast.LENGTH_SHORT).show();
        }

        else {
            Toast.makeText(MainActivity.this, "PERDEU" + valor, Toast.LENGTH_SHORT).show();
        }
*/


