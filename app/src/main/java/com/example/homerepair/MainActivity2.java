package com.example.homerepair;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    protected TextView tv1,tv2,tv3,tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Poner Icono en action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        tv1 = (TextView)findViewById(R.id.result_name);
        tv2 = (TextView)findViewById(R.id.result_username);
        tv3 = (TextView)findViewById(R.id.result_password);
        tv4 = (TextView)findViewById(R.id.result_english_level);


        registro();
    }
    private void registro() {
        Bundle extras =  getIntent().getExtras();

        String[] results = getIntent().getStringArrayExtra("array_values");
        //String result = getIntent().getStringExtra("name");

        tv1.setText("Nombre: " + results[0]);
        tv2.setText("Tipo: " + results[1]);
        tv3.setText("Serial: " + results[2]);
        tv4.setText("Nivel de daño: " + results[3]);

    }
    public void returnMainClass(View view){
        //Regreesar al inicio
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
