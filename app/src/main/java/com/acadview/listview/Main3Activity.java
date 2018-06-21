package com.acadview.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        int phone = getIntent().getIntExtra("phone",905310143);

        TextView names = findViewById(R.id.name);
        TextView emails = findViewById(R.id.email);
        TextView phones = findViewById(R.id.phone);

        names.setText(name);
        emails.setText(email);
        phones.setText(phone);
    }
}
