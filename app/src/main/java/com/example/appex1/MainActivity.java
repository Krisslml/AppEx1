package com.example.appex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cucha1 (View viu){
        Toast.makeText(this,"Una cucharaka", Toast.LENGTH_LONG).show();
    }
    public void cucha2 (View viu){
        Toast.makeText(this,"Wakala otra cucharaka", Toast.LENGTH_LONG).show();
    }
    public void cucha3 (View viu){
        Toast.makeText(this,"SON MUCHAS CUCHARAKAS!!!", Toast.LENGTH_LONG).show();
    }
    public void cucha4 (View viu){
        Toast.makeText(this,"AIUDAAAAA!", Toast.LENGTH_LONG).show();
    }
}