package utf.com.br.quiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity {
    public static final String PREFS_NAME ="preference";
    Integer pontSalvaAnimais, pontSalvaCinema, pontSalvaJogos, pontSalvaGerais;
    String spontSalvaAnimais, spontSalvaCinema, spontSalvaJogos, spontSalvaGerais;
    Integer pontuacao = 0;
    Button btnAnimais;
    Button btnCinema;
    Button btnGerais;
    Button btnJogos;
    TextView txPontuacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        getSupportActionBar().setTitle("Score");
        Intent intent = getIntent();

        btnAnimais = (Button) findViewById(R.id.button1);
        btnCinema = (Button) findViewById(R.id.button2);
        btnGerais = (Button) findViewById(R.id.button3);
        btnJogos = (Button) findViewById(R.id.button4);
        txPontuacao = (TextView) findViewById(R.id.pontuacao);

        btnAnimais.setClickable(false);
        btnCinema.setClickable(false);
        btnGerais.setClickable(false);
        btnJogos.setClickable(false);

        if(getIntent().hasExtra("Animais")){
            pontuacao = intent.getIntExtra("Animais", 0);
        }else if(getIntent().hasExtra("Cinema")){
            pontuacao = intent.getIntExtra("Cinema", 0);
        }else if(getIntent().hasExtra("Gerais")){
            pontuacao = intent.getIntExtra("Gerais",0);
        }else if(getIntent().hasExtra("Jogos")){
            pontuacao = intent.getIntExtra("Jogos",0);
        }else if(getIntent().hasExtra("Menu")){
            txPontuacao.setVisibility(View.INVISIBLE);
        }

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);

        spontSalvaAnimais = settings.getString("ScoreAnimais", "");

        if (spontSalvaAnimais.equals("")){
            pontSalvaAnimais = 0;
        }else{
            pontSalvaAnimais = Integer.parseInt(spontSalvaAnimais);
        }

        spontSalvaCinema = settings.getString("ScoreCinema", "");

        if (spontSalvaCinema.equals("")){
            pontSalvaCinema = 0;
        }else{
            pontSalvaCinema = Integer.parseInt(spontSalvaCinema);
        }

        spontSalvaJogos = settings.getString("ScoreJogos", "");

        if (spontSalvaJogos.equals("")){
            pontSalvaJogos = 0;
        }else{
            pontSalvaJogos = Integer.parseInt(spontSalvaJogos);
        }

        spontSalvaGerais = settings.getString("ScoreGerais", "");

        if (spontSalvaGerais.equals("")){
            pontSalvaGerais = 0;
        }else{
            pontSalvaGerais = Integer.parseInt(spontSalvaGerais);
        }


        btnAnimais.setText(pontSalvaAnimais.toString());
        btnCinema.setText(pontSalvaCinema.toString());
        btnJogos.setText(pontSalvaJogos.toString());
        btnGerais.setText(pontSalvaGerais.toString());



        if(pontuacao > 0) {

            if(getIntent().hasExtra("Animais")){
                txPontuacao.setText("Sua pontuação no quiz Animais foi: "+ pontuacao.toString());

                if (pontSalvaAnimais < pontuacao) {
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putString("ScoreAnimais", pontuacao.toString());
                    editor.commit();
                }
            }else if(getIntent().hasExtra("Cinema")){
                txPontuacao.setText("Sua pontuação no quiz Cinema foi: "+ pontuacao.toString());

                if (pontSalvaCinema < pontuacao) {
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putString("ScoreCinema", pontuacao.toString());
                    editor.commit();
                }
            }else if(getIntent().hasExtra("Gerais")){
                txPontuacao.setText("Sua pontuação no quiz Conhecimentos Gerais foi: "+ pontuacao.toString());

                if (pontSalvaGerais < pontuacao) {
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putString("ScoreGerais", pontuacao.toString());
                    editor.commit();
                }
            }else if(getIntent().hasExtra("Jogos")){
                txPontuacao.setText("Sua pontuação no quiz Jogos foi: "+ pontuacao.toString());

                if (pontSalvaJogos < pontuacao) {
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putString("ScoreJogos", pontuacao.toString());
                    editor.commit();
                }
            }


        }

    }
}
