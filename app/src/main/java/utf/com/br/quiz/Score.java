package utf.com.br.quiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity {
    public static final String PREFS_NAME ="preference";
    Integer pontSalvaAnimais, pontSalvaCinema, pontSalvaJogos, pontSalvaGerais;
    String spontSalvaAnimais, spontSalvaCinema, spontSalvaJogos, spontSalvaGerais;
    Integer pontuacaoAnimal, pontCinema, pontJogos, pontGerais;
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

        pontuacaoAnimal = intent.getIntExtra("Animais", 0);
        pontCinema = intent.getIntExtra("Cinema", 0);
        pontJogos = intent.getIntExtra("Jogos",0);
        pontGerais = intent.getIntExtra("Gerais",0);

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



        if(pontuacaoAnimal > 0) {
            txPontuacao.setText("Sua pontuação no quiz Animais foi: "+ pontuacaoAnimal.toString());

            if (pontSalvaAnimais < pontuacaoAnimal) {
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("ScoreAnimais", pontuacaoAnimal.toString());
                editor.commit();
            }
        }




    }
}
