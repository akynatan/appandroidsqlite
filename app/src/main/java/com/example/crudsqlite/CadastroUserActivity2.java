package com.example.crudsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroUserActivity2 extends AppCompatActivity {

    private EditText nome;
    private EditText email;
    private EditText senha;
    private UserDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editNome);
        email = findViewById(R.id.editEmail);
        senha = findViewById(R.id.editSenha);
        dao = new UserDAO(this);

    }

    public void salvar(View view) {
        User user = new User();
        user.setNome(nome.getText().toString());
        user.setEmail(email.getText().toString());
        user.setSenha(senha.getText().toString());
        long id = dao.inserirUser(user);
        Toast.makeText(this, "Aluno inserido: " + id, Toast.LENGTH_SHORT);

    }
}