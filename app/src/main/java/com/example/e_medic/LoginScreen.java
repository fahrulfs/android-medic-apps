package com.example.e_medic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);


//        TO REGISTRASI SCREEN ( REGISTRASI TEXXT)
        TextView toRegistrasiScreen = (TextView) findViewById(R.id.textView7);
        toRegistrasiScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toRegistrasiScreen = new Intent(LoginScreen.this, RegistrasiScreen.class);
                startActivity(toRegistrasiScreen);
            }
        });

//        TO MAIN SCREEN
        Button toMainScreen = (Button) findViewById(R.id.toMainScreen);
        toMainScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toMainScreen = new Intent(LoginScreen.this, MainScreen.class);
                startActivity(toMainScreen);

            }
        });

    }
}
