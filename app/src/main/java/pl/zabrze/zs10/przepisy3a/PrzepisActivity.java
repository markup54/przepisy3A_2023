package pl.zabrze.zs10.przepisy3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class PrzepisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepis);
        int id = getIntent().getIntExtra("NR",0);
        RepozytoriumPrzepisow repozytoriumPrzepisow = new RepozytoriumPrzepisow();
        Przepis przepis = repozytoriumPrzepisow.getPrzepisy().get(id);
        Toast.makeText(this, przepis.toString(), Toast.LENGTH_SHORT).show();

    }
}