package com.example.android.inclassassignment06_johnb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView dinoInfo = findViewById(R.id.dino_info_text_view);
        Intent intent = getIntent();
        Dino myDino = (Dino) intent.getSerializableExtra(Keys.KEY_DINO);
        dinoInfo.setText(myDino.toString());

    }

}
