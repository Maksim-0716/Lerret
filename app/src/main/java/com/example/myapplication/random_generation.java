package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class random_generation extends AppCompatActivity {
    int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_generation);

        TextView Example=findViewById(R.id.answer);
        int random_number2= 0 + (int) (Math.random() * 10); // Генерация 2-го числа
        int random_number1 = 0 + (int) (Math.random() * 10); // Генерация 1-го числа
       Example.setText(random_number2 + " + " + random_number1);
       answer=random_number2+random_number1;


    }
    public void reply(View v){
        TextView Example=findViewById(R.id.answer);
        EditText Answer=findViewById(R.id.answer1);
        String ex=Example.getText().toString();
        String ans=Answer.getText().toString();
        if (Answer.getText().toString().equals(Integer.toString(answer))) {
            Toast.makeText(this,"Правильный ответ,молодец!",Toast.LENGTH_SHORT).show();
        }
        else { Toast.makeText(this,"Неправильнй ответ,попробуй ещё",Toast.LENGTH_SHORT).show();

        }

    }


}