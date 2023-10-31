package pl.zabrze.zs10.przepisy3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ListView listViewKategorie;
private Spinner spinnerKategorie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewKategorie = findViewById(R.id.listView);
        listViewKategorie.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        int ktory = i; //indeks elementu, który został kliknięty
                        String kategoria = listViewKategorie.getItemAtPosition(i).toString();
                        Toast.makeText(MainActivity.this,
                                "Kliknięto "+Integer.toString(i)+" Kategoria: "+kategoria,
                                Toast.LENGTH_SHORT)
                                .show();
                        wyswietlNowaAktywnosc(kategoria,i);
                    }
                }
        );
        spinnerKategorie = findViewById(R.id.spinner);
        spinnerKategorie.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        String kategoria = listViewKategorie.getItemAtPosition(i).toString();
                        Toast.makeText(MainActivity.this,
                                        "Kliknięto "+Integer.toString(i)+" Kategoria: "+kategoria,
                                        Toast.LENGTH_SHORT)
                                .show();
                        //wyswietlNowaAktywnosc(kategoria,i);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        Toast.makeText(MainActivity.this, "Wybierz kategorię", Toast.LENGTH_SHORT)
                                .show();
                    }
                }
        );

    }
    private void wyswietlNowaAktywnosc(String kategoria,int numer){
        //notatka o intencjach jawnych
        Intent intent = new Intent(MainActivity.this, ListaPrzepisowActivity.class);
        intent.putExtra("KATEGORIA",kategoria);
        intent.putExtra("NR",numer);
        startActivity(intent);
    }
}