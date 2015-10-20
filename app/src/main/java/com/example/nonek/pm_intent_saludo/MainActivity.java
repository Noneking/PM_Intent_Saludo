package com.example.nonek.pm_intent_saludo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private Button btnSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText)findViewById(R.id.editTextName);
        btnSaludo = (Button)findViewById(R.id.buttonSaludo);
    }

    public void btnSaludoListener(View v)
    {
        Intent intent = new Intent(this, SaludoActivity.class);
        Bundle b = new Bundle();
        b.putString("name", editTextName.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
}
