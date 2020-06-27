package com.example.a1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends  AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button openRegistrationButton = findViewById((R.id.registrarionButton));
        openRegistrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =
                        new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivityForResult(intent, MainActivity.LOGIN_REQUEST_CODE);

            }
        });







        }
        @Override
                public  void onBackPressed() {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);


        }
    }



