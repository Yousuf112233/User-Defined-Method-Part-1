package com.example.userdefinedmethodpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1,button2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MakeToast();
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MakeDialog();




            }
        });





    }




    private void MakeToast(){

        Toast.makeText(MainActivity.this,"hello i am yousuf softoware devilopmant",Toast.LENGTH_LONG).show();

    }


    private void MakeDialog(){

        new AlertDialog.Builder(MainActivity.this)
                .setMessage("hello i am kajol")
                .setTitle("hello i am devilopmant")
                
                .show();


    }




}