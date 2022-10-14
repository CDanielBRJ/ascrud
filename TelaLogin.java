package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button) findViewById(R.id.btnLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tLogin = (TextView) findViewById(R.id.txtLogin);
                TextView tSenha = (TextView) findViewById(R.id.txtSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if(login.equals("daniel")&&senha.equals("123")) {
                    startActivity(new Intent(TelaLogin.this, TelaCadastro.class));
                } else {
                    alert("Login e/ou Senha invalido(s)");
                }
            }
        });
    }
    private void alert(String s) {
        Toast.makeText(this,s, Toast.LENGTH_LONG).show();
    }
}
