package com.acadview.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Spinner spinner = findViewById(R.id.spinner);
        final Spinner spinner2 = findViewById(R.id.spinner2);

        final String[] country = {"INDIA","Pakistan","Germany"};

        final String[] indianciities = {"Chandigarh","Shimla","Yamunanagar"};
        final String[] pakistancities = {"Multan","karachi","Lahaur"};
        final String[] germancities = {"Berlin","Hamburg","Munich"};

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                intent.putExtra("name","Raj");
                intent.putExtra("email","Rajneeshthakur592@gmail.com");
                intent.putExtra("phone","8894254563");

                startActivity(intent);
                intent.putExtra("spinner","country");
                intent.putExtra("spinner2","state");

            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,country);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                              @Override
                                              public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                  if (position == 0) {
                                                      ArrayAdapter<String> citiesAdapter = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, indianciities);
                                                      spinner2.setAdapter(citiesAdapter);
                                                  } else if (position == 1) {
                                                      ArrayAdapter<String> citiesAdapter = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, pakistancities);
                                                      spinner2.setAdapter(citiesAdapter);
                                                  } else if (position == 2) {
                                                      ArrayAdapter<String> citiesAdapter = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, germancities);
                                                      spinner2.setAdapter(citiesAdapter);
                                                  }
                                              }

                                              @Override
                                              public void onNothingSelected(AdapterView<?> parent) {

                                              }

                                              public void setAdapter(String[] citiesArray) {
                                                  ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_dropdown_item_1line);
                                                  spinner2.setAdapter(arrayAdapter);
                                              }

                                          });






    }
}
