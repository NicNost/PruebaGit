package com.example.trabajo1andoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mainBinding.getRoot();
        setContentView(R.layout.activity_main);
        mainBinding.btnSingIn.setOnClickListener(this);
        mainBinding.btnSingUp.setOnClickListener(this);
    }

    public void showMessage(){
        Toast.makeText(this, "hola mundo", Toast.LENGTH_SHORT).show();
    }

    public void goToRegister(){
        Intent Intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(Intent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSingIn:
                showMessage();
                break;
            case R.id.btnSingUp:
                goToRegister();
                break;
        }
    }


}