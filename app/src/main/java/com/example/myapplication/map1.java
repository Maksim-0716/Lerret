package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class map1 extends AppCompatActivity {
    int lvl = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map1);
        sw();
    }
    public void next(View v){
    lvl++;
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
                lp.setMargins(80,950,550,50);
                player.setLayoutParams(lp);
                break;
            }
            case 2:{
                ImageButton player=findViewById(R.id.player);
                ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                lp.setMargins(440,810,175,185);
                player.setLayoutParams(lp);
                break;
            }
            case 3:{
                ImageButton player=findViewById(R.id.player);
                ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                lp.setMargins(555,485,60,485);
                player.setLayoutParams(lp);

                break;
            }
            case 4:{
                ImageButton player=findViewById(R.id.player);
                ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                lp.setMargins(485,75,125,900);
                player.setLayoutParams(lp);

                break;
            }
            case 5:{
                ImageButton player=findViewById(R.id.player);
                ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

                lp.setMargins(145,330,465,665);
                player.setLayoutParams(lp);

                break;
            }
            default:{
                lvl=1;
                break;
            }
        }
    }
}