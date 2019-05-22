package utf.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void animaisClick(View view){

        Intent intent = new Intent(this, Questoes.class);
        intent.putExtra("Animais", "Animais");
        startActivity(intent);
    }

    public void cinemaClick(View view){

        Intent intent = new Intent(this, Questoes.class);
        intent.putExtra("Cinema", "Cinema");
        startActivity(intent);
    }

    public void geraisClick(View view){

        Intent intent = new Intent(this, Questoes.class);
        intent.putExtra("Gerais", "Gerais");
        startActivity(intent);
    }

    public void jogosClick(View view){

        Intent intent = new Intent(this, Questoes.class);
        intent.putExtra("Jogos", "Jogos");
        startActivity(intent);
    }
}
