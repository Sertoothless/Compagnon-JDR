package com.serto.compagnon_jdr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

/**
 * Created by Utilisateur on 18/09/2017.
 */

public class DarkHeresyActivity extends Activity {
    private TextView textResult;
    String world;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super .onCreate(savedInstanceState);
        setContentView(R.layout.activity_darkheresy);

        TextView textTitle = (TextView) findViewById(R.id.textViewWorld);
        textTitle.setText(world);

        Button buttonWorld = (Button) findViewById(R.id.buttonWorld);
        buttonWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DarkHeresyActivity.this, DHWorldActivity.class);
                startActivity(intent);
            }
        });

    }


}

