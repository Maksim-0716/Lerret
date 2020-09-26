package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Играть(View v){
        EditText Editlogin=findViewById(R.id.eT_login);
        EditText Editpass=findViewById(R.id.eT_pass);
        String pass=Editpass.getText().toString();
        String login=Editlogin.getText().toString();
        if ((login.equals("1111"))&&(pass.equals("123"))){
            Intent intent_to_start_game=new Intent(MainActivity.this,DifficultActivity.class);
            intent_to_start_game.putExtra("flogin", Editlogin.getText().toString());
            startActivity(intent_to_start_game);
        }
        else{
            EditText Error=findViewById(R.id.er);
            Error.setText("вы ввели неправильный логин или пароль");
        }



    }



}