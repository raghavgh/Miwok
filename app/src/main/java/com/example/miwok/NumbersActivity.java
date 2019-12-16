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

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one","ek",R.mipmap.number_one));
        words.add(new Word("two","dau",R.mipmap.number_two));
        words.add(new Word("three","tin",R.mipmap.number_three));
        words.add(new Word("four","char",R.mipmap.number_four));
        words.add(new Word("five","paanch",R.mipmap.number_five));
        words.add(new Word("six","chay",R.mipmap.number_six));
        words.add(new Word("seven","saat",R.mipmap.number_seven));
        words.add(new Word("eight","aath",R.mipmap.number_eight));
        words.add(new Word("nine","nau",R.mipmap.number_nine));
        words.add(new Word("ten","Dus",R.mipmap.number_ten));


        WordAdapter Adapter = new WordAdapter(this,words,R.color.category_numbers);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(Adapter);

    }
}
