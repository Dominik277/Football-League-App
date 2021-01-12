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
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet1,"31.12.2020.","Za gajbu piva & 10.000 kn...","Još jedna subota je iza nas i još jedna odlična utakmica. Na tribinama je ponovno bilo više od 120 ljudi, brojka koja je postala gotovo minimum za domaće utakmice Zagreba 041. Uz redovite posjetitelje naših utakmica ovu subotu je na stadionu bilo i 20tak tražitelja azila koji su smješteni u hotelu Porin, potvrđujući ponovno kako je ZG041 klub koji i ostvaruje zacrtanu ulogu u olakšavanju integracije izbjeglica i migranata kroz nogomet.\n" +
                "\n" +
                "Zagreb 041 je ovu utakmicu brojnim izostancima i ozlijedama bio oslabljen, no ipak je iz ove utakmice izvukao bod. Utakmica je počela dobro za Kašinu koja već od 15. minute vodi pogotkom Gredelj Matije. Cijelo prvo poluvrijeme Kašina je bila puno bolja momčad i stiskala je Zagrebaše kako bi došli i do drugog pogotka. Zagreb se uspio obraniti do poluvremena iako je bilo vidljivo da Zagrebašima nedostaje utakmica u nogama iz prošlog kola koji se zbog odgode nije dogodio. Drugo poluvrijeme pod utjecajem Zagrebovog trenera dolazi do promjene u igri domaćeg Zagreba koji je sada obrnuo utakmicu i preuzeo inicijativu u svoje ruke. Gostujući golman je vadio nekoliko dobrih udaraca, no ipak na kraju propustio sačuvati mrežu. Svijeća domaćeg igrača Klarića prevarila je golmana i završila u mreži za proslavu na tribini od stotinjak gledatelja. Ivan Klarić zabio je u 79. minuti i već se pokazao kao odlično pojačanje ove zime. Do kraja utakmice rezultat se nije mijenjao.\n" +
                "\n" +
                "Kao i inače, navijači su bodrili klub tijekom cijele utakmice, a naši članovi su istaknuli i transparent podrške Plenumu FFZG. Poslije utakmice je nastavljeno druženje pored terena uz najbolju proljetnu kombinaciju - pivo i roštilj. :)"));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet2,"14.11.2020.","3.HNL Srediste - Pobjeda Vrbovca nakon samoizolacije!","Još jedna subota je iza nas i još jedna odlična utakmica. Na tribinama je ponovno bilo više od 120 ljudi, brojka koja je postala gotovo minimum za domaće utakmice Zagreba 041. Uz redovite posjetitelje naših utakmica ovu subotu je na stadionu bilo i 20tak tražitelja azila koji su smješteni u hotelu Porin, potvrđujući ponovno kako je ZG041 klub koji i ostvaruje zacrtanu ulogu u olakšavanju integracije izbjeglica i migranata kroz nogomet.\n" +
                "\n" +
                "Zagreb 041 je ovu utakmicu brojnim izostancima i ozlijedama bio oslabljen, no ipak je iz ove utakmice izvukao bod. Utakmica je počela dobro za Kašinu koja već od 15. minute vodi pogotkom Gredelj Matije. Cijelo prvo poluvrijeme Kašina je bila puno bolja momčad i stiskala je Zagrebaše kako bi došli i do drugog pogotka. Zagreb se uspio obraniti do poluvremena iako je bilo vidljivo da Zagrebašima nedostaje utakmica u nogama iz prošlog kola koji se zbog odgode nije dogodio. Drugo poluvrijeme pod utjecajem Zagrebovog trenera dolazi do promjene u igri domaćeg Zagreba koji je sada obrnuo utakmicu i preuzeo inicijativu u svoje ruke. Gostujući golman je vadio nekoliko dobrih udaraca, no ipak na kraju propustio sačuvati mrežu. Svijeća domaćeg igrača Klarića prevarila je golmana i završila u mreži za proslavu na tribini od stotinjak gledatelja. Ivan Klarić zabio je u 79. minuti i već se pokazao kao odlično pojačanje ove zime. Do kraja utakmice rezultat se nije mijenjao.\n" +
                "\n" +
                "Kao i inače, navijači su bodrili klub tijekom cijele utakmice, a naši članovi su istaknuli i transparent podrške Plenumu FFZG. Poslije utakmice je nastavljeno druženje pored terena uz najbolju proljetnu kombinaciju - pivo i roštilj. :)"));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet3,"31.10.2020.","2.kolo 4.HNL Središte:3,44 gola po utakmici!","Još jedna subota je iza nas i još jedna odlična utakmica. Na tribinama je ponovno bilo više od 120 ljudi, brojka koja je postala gotovo minimum za domaće utakmice Zagreba 041. Uz redovite posjetitelje naših utakmica ovu subotu je na stadionu bilo i 20tak tražitelja azila koji su smješteni u hotelu Porin, potvrđujući ponovno kako je ZG041 klub koji i ostvaruje zacrtanu ulogu u olakšavanju integracije izbjeglica i migranata kroz nogomet.\n" +
                "\n" +
                "Zagreb 041 je ovu utakmicu brojnim izostancima i ozlijedama bio oslabljen, no ipak je iz ove utakmice izvukao bod. Utakmica je počela dobro za Kašinu koja već od 15. minute vodi pogotkom Gredelj Matije. Cijelo prvo poluvrijeme Kašina je bila puno bolja momčad i stiskala je Zagrebaše kako bi došli i do drugog pogotka. Zagreb se uspio obraniti do poluvremena iako je bilo vidljivo da Zagrebašima nedostaje utakmica u nogama iz prošlog kola koji se zbog odgode nije dogodio. Drugo poluvrijeme pod utjecajem Zagrebovog trenera dolazi do promjene u igri domaćeg Zagreba koji je sada obrnuo utakmicu i preuzeo inicijativu u svoje ruke. Gostujući golman je vadio nekoliko dobrih udaraca, no ipak na kraju propustio sačuvati mrežu. Svijeća domaćeg igrača Klarića prevarila je golmana i završila u mreži za proslavu na tribini od stotinjak gledatelja. Ivan Klarić zabio je u 79. minuti i već se pokazao kao odlično pojačanje ove zime. Do kraja utakmice rezultat se nije mijenjao.\n" +
                "\n" +
                "Kao i inače, navijači su bodrili klub tijekom cijele utakmice, a naši članovi su istaknuli i transparent podrške Plenumu FFZG. Poslije utakmice je nastavljeno druženje pored terena uz najbolju proljetnu kombinaciju - pivo i roštilj. :)"));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet4,"27.10.2020.","3.HNL Središte[2.kolo]","Još jedna subota je iza nas i još jedna odlična utakmica. Na tribinama je ponovno bilo više od 120 ljudi, brojka koja je postala gotovo minimum za domaće utakmice Zagreba 041. Uz redovite posjetitelje naših utakmica ovu subotu je na stadionu bilo i 20tak tražitelja azila koji su smješteni u hotelu Porin, potvrđujući ponovno kako je ZG041 klub koji i ostvaruje zacrtanu ulogu u olakšavanju integracije izbjeglica i migranata kroz nogomet.\n" +
                "\n" +
                "Zagreb 041 je ovu utakmicu brojnim izostancima i ozlijedama bio oslabljen, no ipak je iz ove utakmice izvukao bod. Utakmica je počela dobro za Kašinu koja već od 15. minute vodi pogotkom Gredelj Matije. Cijelo prvo poluvrijeme Kašina je bila puno bolja momčad i stiskala je Zagrebaše kako bi došli i do drugog pogotka. Zagreb se uspio obraniti do poluvremena iako je bilo vidljivo da Zagrebašima nedostaje utakmica u nogama iz prošlog kola koji se zbog odgode nije dogodio. Drugo poluvrijeme pod utjecajem Zagrebovog trenera dolazi do promjene u igri domaćeg Zagreba koji je sada obrnuo utakmicu i preuzeo inicijativu u svoje ruke. Gostujući golman je vadio nekoliko dobrih udaraca, no ipak na kraju propustio sačuvati mrežu. Svijeća domaćeg igrača Klarića prevarila je golmana i završila u mreži za proslavu na tribini od stotinjak gledatelja. Ivan Klarić zabio je u 79. minuti i već se pokazao kao odlično pojačanje ove zime. Do kraja utakmice rezultat se nije mijenjao.\n" +
                "\n" +
                "Kao i inače, navijači su bodrili klub tijekom cijele utakmice, a naši članovi su istaknuli i transparent podrške Plenumu FFZG. Poslije utakmice je nastavljeno druženje pored terena uz najbolju proljetnu kombinaciju - pivo i roštilj. :)"));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet4,"24.10.2020.","2.kolo Jedinstvene županijske lige","Još jedna subota je iza nas i još jedna odlična utakmica. Na tribinama je ponovno bilo više od 120 ljudi, brojka koja je postala gotovo minimum za domaće utakmice Zagreba 041. Uz redovite posjetitelje naših utakmica ovu subotu je na stadionu bilo i 20tak tražitelja azila koji su smješteni u hotelu Porin, potvrđujući ponovno kako je ZG041 klub koji i ostvaruje zacrtanu ulogu u olakšavanju integracije izbjeglica i migranata kroz nogomet.\n" +
                "\n" +
                "Zagreb 041 je ovu utakmicu brojnim izostancima i ozlijedama bio oslabljen, no ipak je iz ove utakmice izvukao bod. Utakmica je počela dobro za Kašinu koja već od 15. minute vodi pogotkom Gredelj Matije. Cijelo prvo poluvrijeme Kašina je bila puno bolja momčad i stiskala je Zagrebaše kako bi došli i do drugog pogotka. Zagreb se uspio obraniti do poluvremena iako je bilo vidljivo da Zagrebašima nedostaje utakmica u nogama iz prošlog kola koji se zbog odgode nije dogodio. Drugo poluvrijeme pod utjecajem Zagrebovog trenera dolazi do promjene u igri domaćeg Zagreba koji je sada obrnuo utakmicu i preuzeo inicijativu u svoje ruke. Gostujući golman je vadio nekoliko dobrih udaraca, no ipak na kraju propustio sačuvati mrežu. Svijeća domaćeg igrača Klarića prevarila je golmana i završila u mreži za proslavu na tribini od stotinjak gledatelja. Ivan Klarić zabio je u 79. minuti i već se pokazao kao odlično pojačanje ove zime. Do kraja utakmice rezultat se nije mijenjao.\n" +
                "\n" +
                "Kao i inače, navijači su bodrili klub tijekom cijele utakmice, a naši članovi su istaknuli i transparent podrške Plenumu FFZG. Poslije utakmice je nastavljeno druženje pored terena uz najbolju proljetnu kombinaciju - pivo i roštilj. :)"));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet5,"21.10.2020.","1.kolo Jedinstvene županijske lige","Još jedna subota je iza nas i još jedna odlična utakmica. Na tribinama je ponovno bilo više od 120 ljudi, brojka koja je postala gotovo minimum za domaće utakmice Zagreba 041. Uz redovite posjetitelje naših utakmica ovu subotu je na stadionu bilo i 20tak tražitelja azila koji su smješteni u hotelu Porin, potvrđujući ponovno kako je ZG041 klub koji i ostvaruje zacrtanu ulogu u olakšavanju integracije izbjeglica i migranata kroz nogomet.\n" +
                "\n" +
                "Zagreb 041 je ovu utakmicu brojnim izostancima i ozlijedama bio oslabljen, no ipak je iz ove utakmice izvukao bod. Utakmica je počela dobro za Kašinu koja već od 15. minute vodi pogotkom Gredelj Matije. Cijelo prvo poluvrijeme Kašina je bila puno bolja momčad i stiskala je Zagrebaše kako bi došli i do drugog pogotka. Zagreb se uspio obraniti do poluvremena iako je bilo vidljivo da Zagrebašima nedostaje utakmica u nogama iz prošlog kola koji se zbog odgode nije dogodio. Drugo poluvrijeme pod utjecajem Zagrebovog trenera dolazi do promjene u igri domaćeg Zagreba koji je sada obrnuo utakmicu i preuzeo inicijativu u svoje ruke. Gostujući golman je vadio nekoliko dobrih udaraca, no ipak na kraju propustio sačuvati mrežu. Svijeća domaćeg igrača Klarića prevarila je golmana i završila u mreži za proslavu na tribini od stotinjak gledatelja. Ivan Klarić zabio je u 79. minuti i već se pokazao kao odlično pojačanje ove zime. Do kraja utakmice rezultat se nije mijenjao.\n" +
                "\n" +
                "Kao i inače, navijači su bodrili klub tijekom cijele utakmice, a naši članovi su istaknuli i transparent podrške Plenumu FFZG. Poslije utakmice je nastavljeno druženje pored terena uz najbolju proljetnu kombinaciju - pivo i roštilj. :)"));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet6,"18.10.2020.","Krenula je i 3.HNL Središte","Još jedna subota je iza nas i još jedna odlična utakmica. Na tribinama je ponovno bilo više od 120 ljudi, brojka koja je postala gotovo minimum za domaće utakmice Zagreba 041. Uz redovite posjetitelje naših utakmica ovu subotu je na stadionu bilo i 20tak tražitelja azila koji su smješteni u hotelu Porin, potvrđujući ponovno kako je ZG041 klub koji i ostvaruje zacrtanu ulogu u olakšavanju integracije izbjeglica i migranata kroz nogomet.\n" +
                "\n" +
                "Zagreb 041 je ovu utakmicu brojnim izostancima i ozlijedama bio oslabljen, no ipak je iz ove utakmice izvukao bod. Utakmica je počela dobro za Kašinu koja već od 15. minute vodi pogotkom Gredelj Matije. Cijelo prvo poluvrijeme Kašina je bila puno bolja momčad i stiskala je Zagrebaše kako bi došli i do drugog pogotka. Zagreb se uspio obraniti do poluvremena iako je bilo vidljivo da Zagrebašima nedostaje utakmica u nogama iz prošlog kola koji se zbog odgode nije dogodio. Drugo poluvrijeme pod utjecajem Zagrebovog trenera dolazi do promjene u igri domaćeg Zagreba koji je sada obrnuo utakmicu i preuzeo inicijativu u svoje ruke. Gostujući golman je vadio nekoliko dobrih udaraca, no ipak na kraju propustio sačuvati mrežu. Svijeća domaćeg igrača Klarića prevarila je golmana i završila u mreži za proslavu na tribini od stotinjak gledatelja. Ivan Klarić zabio je u 79. minuti i već se pokazao kao odlično pojačanje ove zime. Do kraja utakmice rezultat se nije mijenjao.\n" +
                "\n" +
                "Kao i inače, navijači su bodrili klub tijekom cijele utakmice, a naši članovi su istaknuli i transparent podrške Plenumu FFZG. Poslije utakmice je nastavljeno druženje pored terena uz najbolju proljetnu kombinaciju - pivo i roštilj. :)"));
        modelNovostiArrayList.add(new ModelNovosti(R.drawable.nogomet7,"11.10.2020.","1.kolo 4.HNL Središte","Još jedna subota je iza nas i još jedna odlična utakmica. Na tribinama je ponovno bilo više od 120 ljudi, brojka koja je postala gotovo minimum za domaće utakmice Zagreba 041. Uz redovite posjetitelje naših utakmica ovu subotu je na stadionu bilo i 20tak tražitelja azila koji su smješteni u hotelu Porin, potvrđujući ponovno kako je ZG041 klub koji i ostvaruje zacrtanu ulogu u olakšavanju integracije izbjeglica i migranata kroz nogomet.\n" +
                "\n" +
                "Zagreb 041 je ovu utakmicu brojnim izostancima i ozlijedama bio oslabljen, no ipak je iz ove utakmice izvukao bod. Utakmica je počela dobro za Kašinu koja već od 15. minute vodi pogotkom Gredelj Matije. Cijelo prvo poluvrijeme Kašina je bila puno bolja momčad i stiskala je Zagrebaše kako bi došli i do drugog pogotka. Zagreb se uspio obraniti do poluvremena iako je bilo vidljivo da Zagrebašima nedostaje utakmica u nogama iz prošlog kola koji se zbog odgode nije dogodio. Drugo poluvrijeme pod utjecajem Zagrebovog trenera dolazi do promjene u igri domaćeg Zagreba koji je sada obrnuo utakmicu i preuzeo inicijativu u svoje ruke. Gostujući golman je vadio nekoliko dobrih udaraca, no ipak na kraju propustio sačuvati mrežu. Svijeća domaćeg igrača Klarića prevarila je golmana i završila u mreži za proslavu na tribini od stotinjak gledatelja. Ivan Klarić zabio je u 79. minuti i već se pokazao kao odlično pojačanje ove zime. Do kraja utakmice rezultat se nije mijenjao.\n" +
                "\n" +
                "Kao i inače, navijači su bodrili klub tijekom cijele utakmice, a naši članovi su istaknuli i transparent podrške Plenumu FFZG. Poslije utakmice je nastavljeno druženje pored terena uz najbolju proljetnu kombinaciju - pivo i roštilj. :)"));

        NovostiAdapter novostiAdapter = new NovostiAdapter(this,modelNovostiArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(novostiAdapter);

    }

}