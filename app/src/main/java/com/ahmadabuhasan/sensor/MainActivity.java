package com.ahmadabuhasan.sensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Accelerometer(View view) {
        Intent i = new Intent(MainActivity.this, AccelerometerActivity.class);
        startActivity(i);
    }


    public void Gyroscope(View view) {
        Intent i = new Intent(MainActivity.this, GyroscopeActivity.class);
        startActivity(i);
    }

    public void Light(View view) {
        Intent i = new Intent(MainActivity.this, LightActivity.class);
        startActivity(i);
    }

    public void Magnetic(View view) {
        Intent i = new Intent(MainActivity.this, MagneticActivity.class);
        startActivity(i);
    }

    public void Pressure(View view) {
        Intent i = new Intent(MainActivity.this, PressureActivity.class);
        startActivity(i);
    }

    public void Proximity(View view) {
        Intent i = new Intent(MainActivity.this, ProximityActivity.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.about) {
            startActivity(new Intent(this, AboutActivity.class));
        } else if (item.getItemId() == R.id.about) {
            startActivity(new Intent(this, GyroscopeActivity.class));
        }
        return true;
    }
}