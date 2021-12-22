package com.example.e_medic;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RegistrasiScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi_screen);

        //        BACK TO login SCREEN
        ImageView toLogin= (ImageView) findViewById(R.id.backToLogin);
        toLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLogin=new Intent(RegistrasiScreen.this,LoginScreen.class);
                startActivity(toLogin);
            }
        });
    }
}