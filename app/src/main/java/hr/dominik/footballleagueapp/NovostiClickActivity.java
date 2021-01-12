package hr.dominik.footballleagueapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NovostiClickActivity extends AppCompatActivity {

    ImageView imageViewClick;
    TextView textViewNaslovClick;
    TextView textViewDatumClick;
    TextView textViewTekstClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novosti_click);

        imageViewClick = findViewById(R.id.slika_click);
        textViewNaslovClick = findViewById(R.id.naslov_click);
        textViewDatumClick = findViewById(R.id.datum_click);
        textViewTekstClick = findViewById(R.id.tekst_click);

        String naslovClick = getIntent().getStringExtra("naslov");
        String datumClick = getIntent().getStringExtra("datum");
        String tekstClick = getIntent().getStringExtra("tekst");

        textViewNaslovClick.setText(naslovClick);
        textViewDatumClick.setText(datumClick);
        textViewTekstClick.setText(tekstClick);

    }
}