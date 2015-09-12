package com.example.sarah.cs188assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class myActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Button my2Button =(Button) findViewById(R.id.button_two);
        Button myButton =(Button) findViewById(R.id.button_one);
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sendToSecondScreen();
            }
        });
        my2Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sendToThirdScreen();
            }
        });
    }

    private void sendToSecondScreen()
    {
        Intent intent = new Intent(this, my2Activity.class);
        startActivity(intent);
    }

    private void sendToThirdScreen()
    {
        Intent intent = new Intent(this, my2Activity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
