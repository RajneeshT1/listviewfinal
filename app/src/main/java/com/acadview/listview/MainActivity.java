package com.acadview.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = findViewById(R.id.spinner);
        final Spinner spinner2 = findViewById(R.id.spinner2);


        String[] country = {"INDIA","Pakistan","Germany"};

        final String[] indianciities = {"Chandigarh","Shimla","Yamunanagar"};
        final String[] pakistancities = {"Multan","karachi","Lahaur"};
        final String[] germancities = {"Berlin","Hamburg","Munich"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,country);


        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

               if ( position == 0){
                   ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,indianciities);
                   spinner2.setAdapter(citiesAdapter);
               }
               else if (position == 1){

                   ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,pakistancities);
                   spinner2.setAdapter(citiesAdapter);
               }
               else if(position == 2){
                   ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,germancities);
                   spinner2.setAdapter(citiesAdapter);
               }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void setAdapter(String[] citiesArray){
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(arrayAdapter);
    }
}
