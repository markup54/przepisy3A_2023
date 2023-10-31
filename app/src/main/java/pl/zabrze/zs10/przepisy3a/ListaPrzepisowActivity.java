package pl.zabrze.zs10.przepisy3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;

public class ListaPrzepisowActivity extends AppCompatActivity {
    private ArrayList<Przepis> wybranePrzepisy ;
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
    }
}