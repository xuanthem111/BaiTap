
package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_main;
    TextView txt_view;
    Button txt_view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_main);

        btn_main = (Button) findViewById(R.id.btn_login_in);
        txt_view = (TextView) findViewById(R.id.txt_forgot);
        txt_view1 = (Button) findViewById(R.id.btn_dk);

        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
        });
        txt_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, forgotpass_app.class);
                startActivity(intent);
            }
        });
        txt_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, sign_main_app.class);
                startActivity(intent);
            }
        });

    }


//        btn_main = findViewById(R.id.btn_sign_in);
//        btn_main.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//
//
//        spinner = findViewById(R.id.spinner);
//        spinner.setOnItemSelectedListener(this);
//
//        ArrayList<String> courses = new ArrayList<String>();
//        courses.add("-- Choosse your target--");
//        courses.add("CSS3");
//        courses.add("JavaScript");
//        courses.add("Bootstrap");
//        courses.add("jQuery");
//        courses.add("MySQLi");
//        courses.add("PHP");
//
//        //Tạo adapter
//        ArrayAdapter<String> spinAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, courses);
//        spinAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(spinAdapter);
//    }
//
//    @Override
//    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//        String item = adapterView.getItemAtPosition(i).toString();
//        Toast.makeText(adapterView.getContext(), "Bạn đã chọn: " + item, Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> adapterView) {
//
//    }

}
