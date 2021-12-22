package com.example.e_medic;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Button toLoginScreen =(Button) findViewById(R.id.main_button);
      toLoginScreen.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent toLoginScreen=new Intent(MainActivity.this,LoginScreen.class);
              startActivity(toLoginScreen);
          }
      });
    }
    }
