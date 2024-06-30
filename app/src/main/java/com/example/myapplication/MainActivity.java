package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txtTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.idTitulo), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        criarObjeto();


    }
    public void criarObjeto(){
        Livro objLivro = new Livro();
        objLivro.setAutor("M");
        objLivro.setTitulo("Programaçãop orientada a objeto");
        objLivro.setEditora("ER");
        objLivro.setLocalizacao("MG");
       txtTitulo = findViewById(R.id.textView);
       txtTitulo.setText(objLivro.getTitulo());
    }
}