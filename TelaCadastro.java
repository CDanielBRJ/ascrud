package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaCadastro extends AppCompatActivity {
    private EditText mat;
    private EditText nom;
    private EditText cid;
    private EditText est;
    private PessoaDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fornecedor);
        mat = findViewById(R.id.editMatricula);
        nom = findViewById(R.id.editNome);
        cid = findViewById(R.id.editCidade);
        est = findViewById(R.id.editEstado);
        dao = new PessoaDAO(this);
    }

    public void gravar(View view){
        Pessoa c = new Pessoa();
        c.setMat(Integer.parseInt(mat.getText().toString()));
        c.setNome(nom.getText().toString());
        c.setCid(cid.getText().toString());
        c.setEst(est.getText().toString());
        long id = dao.inserir(c);
        Toast.makeText(this, "Cliente cadastrado com Matrícula: " + mat, Toast.LENGTH_SHORT).show();
    }
}
