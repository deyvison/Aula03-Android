package com.example.deyvison.aula3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private class Multiplicar implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent i = new Intent("MULTIPLICAR");
            i.putExtra("num",10);
            startActivity(i);
        }
    }

    private class Duplicar implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent i = new Intent("MULTIPLICAR");
            i.addCategory("Duplicar");
            i.putExtra("num",10);
            startActivity(i);
        }
    }

    private class Triplicar implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent i = new Intent("MULTIPLICAR");
            i.addCategory("Triplicar");
            i.putExtra("num",10);
            startActivity(i);
        }
    }
}
