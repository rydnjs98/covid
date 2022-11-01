package com.example.covid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn1 = findViewById(R.id.button_move1);//버튼 1,2,3선언
        btn1.setOnClickListener(this);
        Button btn2 = findViewById(R.id.button_move2);
        btn2.setOnClickListener(this);
        Button btn3 = findViewById(R.id.button_move3);
        btn3.setOnClickListener(this);








    }

    @Override//버튼 클릭시 이벤트 1,2,3
    public void onClick(View view){
        if(view.getId()==R.id.button_move1){
                Intent intent = new Intent(MainActivity.this, covid_java.class);
                startActivity(intent);
        }
      else if(view.getId()==R.id.button_move2){
            Intent intent = new Intent(MainActivity.this, map_java.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.button_move3){
            Intent intent = new Intent(MainActivity.this, support_java.class);
            startActivity(intent);
        }

        }



}





