package com.walt.baraza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginActivity (View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void registerActivityName (View view){
        Intent intent = new Intent(this, RegisterActivityName.class);
        startActivity(intent);
    }
}
