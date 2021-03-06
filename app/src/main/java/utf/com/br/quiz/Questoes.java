package utf.com.br.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Questoes extends AppCompatActivity {
    Matrizes matrizes = new Matrizes();
    String[][] MatrizPadrao = new String[9][15];
    ArrayList<Integer> respostas = new ArrayList<Integer>();
    int coluna, acertos=0;

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
            MatrizPadrao = matrizes.animais;
            coluna = 0;

            carregarProximaQuestao();

        }else if(getIntent().hasExtra("Cinema")){
            getSupportActionBar().setTitle("Cinema");
            matrizes.alimentaCinema();
            MatrizPadrao = matrizes.cinema;
            coluna = 0;

            carregarProximaQuestao();

        }else if(getIntent().hasExtra("Gerais")){
            getSupportActionBar().setTitle("Conhecimentos Gerais");
            matrizes.alimentaGerais();
            MatrizPadrao = matrizes.gerais;

            carregarProximaQuestao();

        }else if(getIntent().hasExtra("Jogos")){
            getSupportActionBar().setTitle("Jogos");
            matrizes.alimentaJogos();
            MatrizPadrao = matrizes.jogos;
            coluna = 0;

            carregarProximaQuestao();
        }
    }

    public void carregarScore(){
        Intent intent = new Intent(this, Score.class);

        if(getIntent().hasExtra("Animais")){
            intent.putExtra("Animais", acertos);
        }else if(getIntent().hasExtra("Cinema")){
            intent.putExtra("Cinema", acertos);
        }else if(getIntent().hasExtra("Gerais")){
            intent.putExtra("Jogos", acertos);
        }else if(getIntent().hasExtra("Jogos")){
            intent.putExtra("Gerais", acertos);
        }
        startActivity(intent);
        finish();
    }

    public void carregarProximaQuestao(){
        proximo.setVisibility(View.INVISIBLE);
        resposta1.setBackgroundResource(R.drawable.border_button);
        resposta2.setBackgroundResource(R.drawable.border_button);
        resposta3.setBackgroundResource(R.drawable.border_button);
        resposta4.setBackgroundResource(R.drawable.border_button);
        proximo.setBackgroundResource(R.drawable.border_button);
        resposta1.setClickable(true);
        resposta2.setClickable(true);
        resposta3.setClickable(true);
        resposta4.setClickable(true);
        pergunta.setText(MatrizPadrao[0][coluna]);
        respostas = matrizes.sortearRespostas(MatrizPadrao, coluna);
        resposta1.setText(MatrizPadrao[respostas.get(0)][coluna]);
        resposta2.setText(MatrizPadrao[respostas.get(1)][coluna]);
        resposta3.setText(MatrizPadrao[respostas.get(2)][coluna]);
        resposta4.setText(MatrizPadrao[respostas.get(3)][coluna]);
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
        if(resposta1.getText().equals(MatrizPadrao[1][coluna])){
            resposta1.setBackgroundResource(R.drawable.botao_correto);
            acertos += 10;
        }else{
            resposta1.setBackgroundResource(R.drawable.botao_errado);
        }
        resposta1.setClickable(false);
        resposta2.setClickable(false);
        resposta3.setClickable(false);
        resposta4.setClickable(false);
        proximo.setVisibility(View.VISIBLE);
    }

    public void alternativa2(View view){
        if(resposta2.getText().equals(MatrizPadrao[1][coluna])){
            resposta2.setBackgroundResource(R.drawable.botao_correto);
            acertos += 10;
        }else{
            resposta2.setBackgroundResource(R.drawable.botao_errado);
        }
        resposta1.setClickable(false);
        resposta2.setClickable(false);
        resposta3.setClickable(false);
        resposta4.setClickable(false);
        proximo.setVisibility(View.VISIBLE);
    }

    public void alternativa3(View view){
        if(resposta3.getText().equals(MatrizPadrao[1][coluna])){
            resposta3.setBackgroundResource(R.drawable.botao_correto);
            acertos += 10;
        }else{
            resposta3.setBackgroundResource(R.drawable.botao_errado);
        }
        resposta1.setClickable(false);
        resposta2.setClickable(false);
        resposta3.setClickable(false);
        resposta4.setClickable(false);
        proximo.setVisibility(View.VISIBLE);
    }

    public void alternativa4(View view){
        if(resposta4.getText().equals(MatrizPadrao[1][coluna])){
            resposta4.setBackgroundResource(R.drawable.botao_correto);
            acertos += 10;
        }else{
            resposta4.setBackgroundResource(R.drawable.botao_errado);
        }
        resposta1.setClickable(false);
        resposta2.setClickable(false);
        resposta3.setClickable(false);
        resposta4.setClickable(false);
        proximo.setVisibility(View.VISIBLE);
    }
}
