package com.example.crudsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cadastrar(View view) {
        Intent it = new Intent(this, CadastroUserActivity.class);
        startActivity(it);
    }

    public void listar(View view) {
        Intent it = new Intent(this, ListarUsersActivity.class);
        startActivity(it);
    }
}