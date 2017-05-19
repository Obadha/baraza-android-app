package com.walt.baraza;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Obadha on 5/19/17.
 */

        public class RegisterActivityPhoneNumber extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_phone_number);
    }

    public void registerActivityPassword (View view){
        Intent intent = new Intent(this, RegisterActivityPassword.class);
        startActivity(intent);
    }
}
