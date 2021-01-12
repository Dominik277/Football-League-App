package hr.dominik.footballleagueapp;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

public class NovostiActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CardView cardView;
    private ArrayList<ModelNovosti> modelNovostiArrayList;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novosti);

        recyclerView = findViewById(R.id.recyclerViewNovosti);


        modelNovostiArrayList = new ArrayList<>();
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet1,"31.12.2020.","Za gajbu piva & 10.000 kn...","Danas započinju prijave za novu ligu pod imenom Za Gajbu.Liga će se održavati na novom terenu"));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet2,"14.11.2020.","3.HNL Srediste - Pobjeda Vrbovca nakon samoizolacije!","Nakon 4 kola napokon su se uspjele odigrati kompletno sve utakmice u 5.kolu.Odigralo se u 9"));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet3,"31.10.2020.","2.kolo 4.HNL Središte:3,44 gola po utakmici!","U drugom kolu 4.HNL Središte pao je čak 31 pogodak.U prosjeku 3,44 gola po utakmici"));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet4,"27.10.2020.","3.HNL Središte[2.kolo]","U 2.kolu 3.HNL Središte ukupno je postignuto 21 pogodak.Jedna utakmica nije odgirana zbog.."));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet4,"24.10.2020.","2.kolo Jedinstvene županijske lige","Osvrt na 2.kolo Jedinstvene županijske like započet ćemo u Mraclinu.Tamo je domaćin.."));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet5,"21.10.2020.","1.kolo Jedinstvene županijske lige","1.kolo nove sezone u Zagrebačkoj županiji krenulo je vrlo uzbudljivo"));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet6,"18.10.2020.","Krenula je i 3.HNL Središte","Već prije vikenda zbog pojave korona virusa, odgođene su utakmice između NK Jaruna i NK Zadra"));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet7,"11.10.2020.","1.kolo 4.HNL Središte","Započela je još jedna vrlo uzbudljiva sezona u 4.HNL Središte koja obuhvaća 5 županija"));

        NovostiAdapter novostiAdapter = new NovostiAdapter(this,modelNovostiArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(novostiAdapter);

    }

}