package hr.dominik.footballleagueapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class NovostiActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ModelNovosti> modelNovostiArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novosti);
        recyclerView = findViewById(R.id.recyclerViewNovosti);

        modelNovostiArrayList = new ArrayList<>();
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.ic_baseline_sensors_24,"","",""));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.ic_baseline_sensors_24,"","",""));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.ic_baseline_sensors_24,"","",""));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.ic_baseline_sensors_24,"","",""));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.ic_baseline_sensors_24,"","",""));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.ic_baseline_sensors_24,"","",""));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.ic_baseline_sensors_24,"","",""));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.ic_baseline_sensors_24,"","",""));

        NovostiAdapter novostiAdapter = new NovostiAdapter(this,modelNovostiArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(novostiAdapter);

    }
}