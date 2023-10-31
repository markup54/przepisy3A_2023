package pl.zabrze.zs10.przepisy3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;

public class ListaPrzepisowActivity extends AppCompatActivity {
    private ArrayList<Przepis> wybranePrzepisy ;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String kategoria = getIntent().getStringExtra("KATEGORIA");
        int nr = getIntent().getIntExtra("NR",0);
        TextView textView = findViewById(R.id.textView);
        textView.setText(kategoria);
        RepozytoriumPrzepisow repozytoriumPrzepisow = new RepozytoriumPrzepisow();
        wybranePrzepisy = repozytoriumPrzepisow.przepisyZKategorii(nr);
        listView = findViewById(R.id.listView2);
        ArrayAdapter<Przepis> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                wybranePrzepisy);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(ListaPrzepisowActivity.this,PrzepisActivity.class);
                        Przepis przepis = wybranePrzepisy.get(i);
                        int id = przepis.getId();
                        intent.putExtra("ID",id);
                        //przekazac który przepis
                        startActivity(intent);
                    }
                }
        );
    }
}