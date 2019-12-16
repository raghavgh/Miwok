package com.example.miwok;

import android.view.View;
import android.widget.Toast;

public class NumberListener1 implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),"Numbers", Toast.LENGTH_SHORT).show();
    }
}
