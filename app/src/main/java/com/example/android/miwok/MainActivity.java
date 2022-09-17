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
package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(view.getContext(),"Open the list of numbers",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,Numbers.class);
                startActivity(i);
            }
        });
    }
    

//    public void numberActivity(View view) {
//        Intent i = new Intent(this,Numbers.class);
//        startActivity(i);
//    }

    public void familyActivity(View view) {
        Toast.makeText(view.getContext(),"Opening the Family Activity ",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,Family.class);
        startActivity(i);
    }

    public void colorsActivity(View view) {
        Toast.makeText(view.getContext(),"Opening the colors activity",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,Colors.class);
        startActivity(i);
    }

    public void phrasesActivity(View view) {
        Toast.makeText(view.getContext(),"Opening the phrases",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,phrases.class);
        startActivity(i);
    }
}
