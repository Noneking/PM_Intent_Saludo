package com.example.nonek.pm_intent_saludo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {

    TextView txtViewSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        txtViewSaludo= (TextView) findViewById(R.id.textViewSaludo);
        Bundle bundle = this.getIntent().getExtras();
        txtViewSaludo.setText("Hola " + bundle.getString("name"));
    }
}
