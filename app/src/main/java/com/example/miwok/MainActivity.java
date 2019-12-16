package com.example.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = findViewById(R.id.numbers);
        TextView phrases = findViewById(R.id.phrases);
        TextView colors =  findViewById(R.id.colors);
        TextView family = findViewById(R.id.family);
        openActivity(numbers,NumbersActivity.class);
        openActivity(phrases,PhrasesActivity.class);
        openActivity(family,FamilyActivity.class);
        openActivity(colors,ColorsActivity.class);
    }
    public void openActivity(TextView t, final Class<?> cl){
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cl);
                startActivity(intent);
            }
        });
    }
}
