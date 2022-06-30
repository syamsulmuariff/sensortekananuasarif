package android.example.sensortekananuasarif;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button Tampil, SensorP;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SensorP = findViewById(R.id.sensor);

        Tampil = findViewById(R.id.tampil);
        Tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, android.example.sensortekananuasarif.ListViewActivity.class);
                startActivity(intent);
            }
        });
        SensorP = findViewById(R.id.sensor);
        SensorP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, android.example.sensortekananuasarif.PressureSensor.class);
                startActivity(intent);
            }
        });
    }
}