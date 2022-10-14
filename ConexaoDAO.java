package com.example.cadastro;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class PessoaDAO {
    public Conexao conexao;
    public SQLiteDatabase banco;
    public PessoaDAO(Context context) {
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }
    public long inserir(Pessoa pessoa){
        ContentValues values = new ContentValues();
        values.put("mat",pessoa.getMat());
        values.put("nom",pessoa.getNom());
        values.put("cid",pessoa.getCid());
        values.put("est",pessoa.getEst());
        return banco.insert("pessoa",null,values);
    }
}
