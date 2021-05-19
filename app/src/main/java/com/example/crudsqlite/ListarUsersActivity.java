package com.example.crudsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ListarUsersActivity extends AppCompatActivity {

    private ListView listView;
    private UserDAO dao;
    private List<User> users;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_users);

        listView = findViewById(R.id.lista_users);
        dao = new UserDAO(this);
        users = dao.obterTodos();

        ArrayAdapter<User> adaptador = new ArrayAdapter<User>(this, android.R.layout.simple_list_item_1, users);
        listView.setAdapter(adaptador);

    }
}