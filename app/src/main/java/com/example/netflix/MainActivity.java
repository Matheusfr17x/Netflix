package com.example.netflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView conteudoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.red)));

        setContentView(R.layout.activity_main);



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);


        // Simule o progresso
        int progress = 50; // Defina o valor de progresso como necessário
        progressBar.setProgress(progress);

        // Verifique o progresso e sinalize o conteúdo visto em vermelho se necessário
        if (progress <= 50) {
            progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(Color.RED));

        }
    }
}