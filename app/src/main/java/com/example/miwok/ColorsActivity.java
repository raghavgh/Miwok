/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red","lal",R.mipmap.color_red));
        words.add(new Word("green","hara",R.mipmap.color_green));
        words.add(new Word("mustard yellow","pila",R.mipmap.color_mustard_yellow));
        words.add(new Word("dirty yellow","neela",R.mipmap.color_dusty_yellow));
        words.add(new Word("brown","bhoora",R.mipmap.color_brown));
        words.add(new Word("grey","dhusar",R.mipmap.color_gray));
        words.add(new Word("black","kala",R.mipmap.color_black));
        words.add(new Word("White","saphed",R.mipmap.color_white));


        WordAdapter Adapter = new WordAdapter(this,words,R.color.category_colors);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }

}
