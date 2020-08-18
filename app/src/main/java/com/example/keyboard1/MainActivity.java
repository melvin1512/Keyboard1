package com.example.keyboard1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.inputmethodservice.KeyboardView;
import android.widget.EditText;
import com.example.keyboard1.keylib1;


public class MainActivity extends Activity {

    private EditText mPassword;
    private KeyboardView mKeyboardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPassword = (EditText) findViewById(R.id.password_edit);
        mKeyboardView = findViewById(R.id.keyboard_view);
        new keylib1(this, mPassword, mKeyboardView);
    }
}
