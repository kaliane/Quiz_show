package utf.com.br.quiz;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Questoes extends AppCompatActivity {
    Matrizes matrizes = new Matrizes();
    ArrayList<Integer> respostas = new ArrayList<Integer>();
    int coluna, acertosAnimais=0, acertosCinema=0, acertosJogos=0, acertosGerais=0;

    TextView pergunta;
    Button resposta1;
    Button resposta2;
    Button resposta3;
    Button resposta4;
    Button proximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questoes);

        pergunta = (TextView) findViewById(R.id.pergunta);
        resposta1 = (Button) findViewById(R.id.resposta1);
        resposta2 = (Button) findViewById(R.id.resposta2);
        resposta3 = (Button) findViewById(R.id.resposta3);
        resposta4 = (Button) findViewById(R.id.resposta4);
        proximo = (Button) findViewById(R.id.proximo);

        if(getIntent().hasExtra("Animais")){
            getSupportActionBar().setTitle("Animais");
            matrizes.alimentaAnimais();
            coluna = 0;

            carregarProximaQuestao();

        }
    }

    public void carregarScore(){
        Intent intent = new Intent(this, Score.class);
        intent.putExtra("Animais", acertosAnimais);
        intent.putExtra("Cinema", acertosCinema);
        intent.putExtra("Jogos", acertosJogos);
        intent.putExtra("Gerais", acertosGerais);
        startActivity(intent);
    }

    public void carregarProximaQuestao(){
        proximo.setVisibility(View.INVISIBLE);
        /*resposta1.setBackgroundResource(R.color.Padrao);
        resposta2.setBackgroundResource(R.color.Padrao);
        resposta3.setBackgroundResource(R.color.Padrao);
        resposta4.setBackgroundResource(R.color.Padrao);
        proximo.setBackgroundResource(R.color.Padrao);*/
        resposta1.setClickable(true);
        resposta2.setClickable(true);
        resposta3.setClickable(true);
        resposta4.setClickable(true);
        pergunta.setText(matrizes.animais[0][coluna]);
        respostas = matrizes.sortearRespostas(matrizes.animais, coluna);
        resposta1.setText(matrizes.animais[respostas.get(0)][coluna]);
        resposta2.setText(matrizes.animais[respostas.get(1)][coluna]);
        resposta3.setText(matrizes.animais[respostas.get(2)][coluna]);
        resposta4.setText(matrizes.animais[respostas.get(3)][coluna]);
    }

    public void proximaquestao(View view){
        coluna += 1;
        if (coluna <= 14){
            carregarProximaQuestao();
        }else{
            carregarScore();
        }

    }


    public void alternativa1(View view){
        if(resposta1.getText().equals(matrizes.animais[1][coluna])){
            resposta1.setBackgroundResource(R.drawable.botao_correto);
            acertosAnimais +=10;

        }else{
            resposta1.setBackgroundResource(R.color.Errada);
        }
        resposta1.setClickable(false);
        resposta2.setClickable(false);
        resposta3.setClickable(false);
        resposta4.setClickable(false);
        proximo.setVisibility(View.VISIBLE);
    }

    public void alternativa2(View view){
        if(resposta2.getText().equals(matrizes.animais[1][coluna])){
            resposta2.setBackgroundResource(R.color.Certa);
            acertosAnimais += 10;
        }else{
            resposta2.setBackgroundResource(R.color.Errada);
        }
        resposta1.setClickable(false);
        resposta2.setClickable(false);
        resposta3.setClickable(false);
        resposta4.setClickable(false);
        proximo.setVisibility(View.VISIBLE);
    }

    public void alternativa3(View view){
        if(resposta3.getText().equals(matrizes.animais[1][coluna])){
            resposta3.setBackgroundResource(R.color.Certa);
            acertosAnimais += 10;
        }else{
            resposta3.setBackgroundResource(R.color.Errada);
        }
        resposta1.setClickable(false);
        resposta2.setClickable(false);
        resposta3.setClickable(false);
        resposta4.setClickable(false);
        proximo.setVisibility(View.VISIBLE);
    }

    public void alternativa4(View view){
        if(resposta4.getText().equals(matrizes.animais[1][coluna])){
            resposta4.setBackgroundResource(R.color.Certa);
            acertosAnimais += 10;
        }else{
            resposta4.setBackgroundResource(R.color.Errada);
        }
        resposta1.setClickable(false);
        resposta2.setClickable(false);
        resposta3.setClickable(false);
        resposta4.setClickable(false);
        proximo.setVisibility(View.VISIBLE);
    }
}
