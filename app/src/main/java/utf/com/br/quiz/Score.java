package utf.com.br.quiz;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class Score extends AppCompatActivity {
    public static final String PREFS_NAME ="preference";
    String pontSalvaAnimais;
    Button btnAnimais;
    Button btnCinema;
    Button btnGerais;
    Button btnJogos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        getSupportActionBar().setTitle("Score");

        btnAnimais = (Button) findViewById(R.id.button1);
        btnCinema = (Button) findViewById(R.id.button2);
        btnGerais = (Button) findViewById(R.id.button3);
        btnJogos = (Button) findViewById(R.id.button4);

        btnAnimais.setClickable(false);
        btnCinema.setClickable(false);
        btnGerais.setClickable(false);
        btnJogos.setClickable(false);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        pontSalvaAnimais = settings.getString("ScoreAnimais", "");

        if(getIntent().hasExtra("Animais")) {
            if (pontSalvaAnimais.equals(btnAnimais.getText().toString())){

            }
            editor.putString("ScoreAnimais", btnAnimais.getText().toString());
        }
        editor.commit();



    }
}
