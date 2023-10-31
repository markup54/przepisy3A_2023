package pl.zabrze.zs10.przepisy3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PrzepisActivity extends AppCompatActivity {
private TextView textViewTytul, textViewSkladniki,textViewTresc;
private ImageView imageView;
private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepis);
        int id = getIntent().getIntExtra("ID",0);
        RepozytoriumPrzepisow repozytoriumPrzepisow = new RepozytoriumPrzepisow();
        Przepis przepis = repozytoriumPrzepisow.getPrzepisy().get(id);
        Toast.makeText(this, przepis.toString(), Toast.LENGTH_SHORT).show();
        imageView = findViewById(R.id.imageView);
        textViewTytul = findViewById(R.id.textView3);
        textViewSkladniki = findViewById(R.id.textView4);
        textViewTresc = findViewById(R.id.textView5);
        textViewTytul.setText(przepis.getNazwa());
        imageView.setImageResource(przepis.getIdObrazka());
        textViewSkladniki.setText(przepis.getSkladniki());
        textViewTresc.setText(przepis.getTresc());
        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent= new Intent();
                        //intencja nie jawna
                        intent.setAction(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_TEXT,
                                przepis.getNazwa()+" skladniki:"
                                +przepis.getSkladniki()+" "+przepis.getTresc());
                        intent.setType("text/plain");
                        Intent udostepnionaIntent = Intent.createChooser(intent,null);
                        startActivity(intent);
                    }
                }
        );
    }
}