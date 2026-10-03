package com.example.ciclodevida;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrarMensaje("onCreate(): Activity creada");

    }

    @Override
    protected void onStart(){
        super.onStart();

        mostrarMensaje("onStart(): Activity visible");

    }

    @Override
    protected void onResume(){
        super.onResume();

        mostrarMensaje("onResume(): Activity en primer plano");
    }

    @Override

    protected void onPause(){

        super.onPause();

        mostrarMensaje("onPause(): Activity parcialmente oculta");
    }


    @Override

    protected void onStop(){
        super.onStop();

        mostrarMensaje("onStop(): Activity no visible");

    }

    @Override

    protected void onRestart(){
        super.onRestart();

        mostrarMensaje("onRestart(): Activity reiniciandose");

    }

    @Override

    protected void onDestroy(){
        super.onDestroy();

        mostrarMensaje("onDestroy(): Activity destruida");

    }

    protected void mostrarMensaje(String mensaje){
        Toast.makeText(
                getApplicationContext(),
                mensaje,
                Toast.LENGTH_LONG
        ).show();

    }
}

