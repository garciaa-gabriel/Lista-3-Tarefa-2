package com.example.lista3tarefa2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NovaActivity extends AppCompatActivity {
    private Button btback;
    private TextView tvn;
    private EditText edn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova);
        getSupportActionBar().setTitle("Login");

        btback = (Button) findViewById(R.id.btback);
        tvn = (TextView) findViewById(R.id.tvn);
        edn = (EditText) findViewById(R.id.edn);

        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edn.getText().toString();
                Intent returnIntent = new Intent(NovaActivity.this, MainActivity.class);
                returnIntent.putExtra("name", name);
                setResult(RESULT_OK, returnIntent);

            }
        });

    }
}