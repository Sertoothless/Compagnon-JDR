package com.serto.compagnon_jdr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonDH = (Button) findViewById(R.id.buttonDH);
        buttonDH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V){
                Intent intent = new Intent(MainActivity.this, DarkHeresyActivity.class);
                startActivity(intent);
            }
        });

    }
}
