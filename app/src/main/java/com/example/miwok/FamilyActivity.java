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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one","ek"));
        words.add(new Word("two","dau"));
        words.add(new Word("three","tin"));
        words.add(new Word("four","char"));
        words.add(new Word("five","paanch"));
        words.add(new Word("six","chay"));
        words.add(new Word("seven","saat"));
        words.add(new Word("eight","aath"));
        words.add(new Word("nine","nau"));


        WordAdapter Adapter = new WordAdapter(this,words,R.color.category_family);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}
