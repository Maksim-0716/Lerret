package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class map1 extends AppCompatActivity {
    int lvl = 10;
    int Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map1);
        sw();
    }

    public void next(View v) {
        EditText ANSWER = findViewById(R.id.example1);
        if (ANSWER.getText().toString().equals(Integer.toString(Result)))
        {
            lvl++;
        }
        else
        {
            Toast.makeText(this, "Неправильный ответ", Toast.LENGTH_SHORT).show();
            lvl--;
        }
        sw();
    }

    public void back(View v){
            lvl--;
        sw();
    }


    private  void sw()
    {
        switch (lvl){
            case 1:{
                ImageButton player=findViewById(R.id.player);
                ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                lp.setMargins(450,825,155,175);
                player.setLayoutParams(lp);
                TextView Example=findViewById(R.id.example);
                int random_number2= 0 + (int) (Math.random() * 10); // Генерация 2-го числа
                int random_number1 = 0 + (int) (Math.random() * 10); // Генерация 1-го числа
                Example.setText(random_number2 + " + " + random_number1);
                Result = random_number2 + random_number1;
                break;
            }
            case 2:{
                ImageButton player=findViewById(R.id.player);
                ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                lp.setMargins(580,550,55,170);
                player.setLayoutParams(lp);
                TextView Example=findViewById(R.id.example);
                int random_number2= 0 + (int) (Math.random() * 10); // Генерация 2-го числа
                int random_number1 = 0 + (int) (Math.random() * 10); // Генерация 1-го числа
                Example.setText(random_number2 + " - " + random_number1);
                Result = random_number2 - random_number1;
                break;
            }
            case 3:{
                ImageButton player=findViewById(R.id.player);
                ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                lp.setMargins(100,555,140,170);
                player.setLayoutParams(lp);
                TextView Example=findViewById(R.id.example);
                int random_number2= 5 + (int) (Math.random() * 15); // Генерация 2-го числа
                int random_number1 = 5 + (int) (Math.random() * 15); // Генерация 1-го числа
                Example.setText(random_number2 + " + " + random_number1);
                Result = random_number2 + random_number1;
                break;
            }
            case 4:{
                ImageButton player=findViewById(R.id.player);
                ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                lp.setMargins(10,270,480,100);
                player.setLayoutParams(lp);
                TextView Example=findViewById(R.id.example);
                int random_number2= 10 + (int) (Math.random() * 15); // Генерация 2-го числа
                int random_number1 = 10 + (int) (Math.random() * 15); // Генерация 1-го числа
                Example.setText(random_number2 + " - " + random_number1);
                Result = random_number2 - random_number1;
                break;
            }
            case 5:{
                ImageButton player=findViewById(R.id.player);
                ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                lp.setMargins(10,-135,595,5);
                player.setLayoutParams(lp);
                TextView Example=findViewById(R.id.example);
                int random_number2= 15 + (int) (Math.random() * 15); // Генерация 2-го числа
                int random_number1 = 15 + (int) (Math.random() * 15); // Генерация 1-го числа
                Example.setText(random_number2 + " + " + random_number1);
                Result = random_number2 + random_number1;
                break;
            }
            case 6: {
                ImageButton player = findViewById(R.id.player);
                ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                lp.setMargins(515, 450, 35, 490);
                player.setLayoutParams(lp);
                TextView Example = findViewById(R.id.example);
                int random_number2 = 10 + (int) (Math.random() * 10); // Генерация 2-го числа
                int random_number1 = 10 + (int) (Math.random() * 10); // Генерация 1-го числа
                Example.setText(random_number2 + " - " + random_number1);
                Result = random_number2 - random_number1;
                break;
            }
            case 7: {
                ImageButton player = findViewById(R.id.player);
                ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                lp.setMargins(10, 5,350 , 405);
                player.setLayoutParams(lp);
                TextView Example = findViewById(R.id.example);
                int random_number2 = 20 + (int) (Math.random() * 15); // Генерация 2-го числа
                int random_number1 = 20 + (int) (Math.random() * 15); // Генерация 1-го числа
                Example.setText(random_number2 + " + " + random_number1);
                Result = random_number2 + random_number1;
                break;
            }
            case 8: {
                ImageButton player = findViewById(R.id.player);
                ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                lp.setMargins(300, 20, 10, 530);
                player.setLayoutParams(lp);
                TextView Example = findViewById(R.id.example);
                int random_number2 = 20 + (int) (Math.random() * 20); // Генерация 2-го числа
                int random_number1 = 20 + (int) (Math.random() * 20); // Генерация 1-го числа
                Example.setText(random_number2 + " - " + random_number1);
                Result = random_number2 - random_number1;
                break;
            }
            case 9: {
                ImageButton player = findViewById(R.id.player);
                ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                lp.setMargins(20, 25, -100, 875);
                player.setLayoutParams(lp);
                TextView Example = findViewById(R.id.example);
                int random_number2 = 4 + (int) (Math.random() * 3); // Генерация 2-го числа
                int random_number1 = 4 + (int) (Math.random() * 3); // Генерация 1-го числа
                Example.setText(random_number2 + " * " + random_number1);
                Result = random_number2 * random_number1;
                break;
            }
                case 10: {
                    ImageButton player = findViewById(R.id.player);
                    ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                    lp.setMargins(20, 25, 480, 925);
                    player.setLayoutParams(lp);
                    TextView Example = findViewById(R.id.example);
                    int random_number2 = 5 + (int) (Math.random() * 5); // Генерация 2-го числа
                    int random_number1 = 5 + (int) (Math.random() * 5); // Генерация 1-го числа
                    Example.setText(random_number2 + " * " + random_number1);
                    Result = random_number2 * random_number1;
                    break;
                }
            default:{
                Toast.makeText(this, "Молодец,1 уровень пройден!", Toast.LENGTH_SHORT).show();
                lvl=0;
                break;
            }
        }
    }
}