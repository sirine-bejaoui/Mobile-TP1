package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public class ClickButtonActivity extends Activity{
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            Button b1=(Button)findViewById(R.id.monbutton);
            b1.setOnClickListener(
                    new OnClickListener(){
                        public void onClick(View v){
                            Toast.makeText(getApplication(),"Boutton Cliqué !!!", Toast.LENGTH_SHORT).show();
                        }
                    }
            );

        }
    }
}