package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;


public class MainActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onOperationClick(View view) {
        View view1 = (View) findViewById(R.id.vis_panel);

        if (view1.getVisibility() == View.GONE) {
            view1.setVisibility(View.VISIBLE);

        } else {
            view1.setVisibility(View.GONE);
        }
    }

}





