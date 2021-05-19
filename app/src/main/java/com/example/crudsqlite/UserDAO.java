package com.example.crudsqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private Conexao conexao;

    private SQLiteDatabase banco;

    public UserDAO(Context context) {
        conexao = new Conexao(context);
    }

    public long inserirUser(User user) {
        ContentValues values = new ContentValues();
        values.put("nome", user.getNome());
        values.put("email", user.getEmail());
        values.put("senha", user.getSenha());

        return banco.insert("aluno", null, values);
    }

    public List<User> obterTodos() {
        List<User> users = new ArrayList<>();
        Cursor cursor = banco.query("aluno", new String[]{"nome", "email", "senha"}, null, null, null, null, null);
        while(cursor.moveToNext()) {
            User u = new User();
            u.setNome(cursor.getString(0));
            u.setEmail(cursor.getString(1));
            u.setSenha(cursor.getString(2));

            users.add(u);
        }
        return users;
    }

}
