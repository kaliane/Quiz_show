package utf.com.br.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Questoes extends AppCompatActivity {
    Matrizes matrizes = new Matrizes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questoes);

        TextView pergunta = (TextView) findViewById(R.id.pergunta);
        Button resposta1 = (Button) findViewById(R.id.resposta1);
        Button resposta2 = (Button) findViewById(R.id.resposta2);
        Button resposta3 = (Button) findViewById(R.id.resposta3);
        Button resposta4 = (Button) findViewById(R.id.resposta4);


        if(getIntent().hasExtra("Animais")){
            matrizes.alimentaAnimais();
            ArrayList<Integer> respostas = new ArrayList<Integer>();

            for(int i = 0; i <= 14; i++){
                pergunta.setText(matrizes.animais[0][i]);
                respostas = matrizes.sortearRespostas(matrizes.animais, i);
                resposta1.setText(matrizes.animais[respostas.get(0)][i]);
                resposta2.setText(matrizes.animais[respostas.get(1)][i]);
                resposta3.setText(matrizes.animais[respostas.get(2)][i]);
                resposta4.setText(matrizes.animais[respostas.get(3)][i]);

            }


        }


    }
}
