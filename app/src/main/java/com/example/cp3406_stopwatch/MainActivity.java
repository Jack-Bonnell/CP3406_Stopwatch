package com.example.cp3406_stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    boolean isRunning;
    StopWatch stopWatch = new StopWatch();
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        Button button = findViewById(R.id.toggle);

        if (button.getText() == "start"){
            enableStopwatch();
            button.setText("stop");
        } else {
            disableStopwatch();
            button.setText("start");
        }
    }

    private void enableStopwatch() {
        isRunning = true;
        handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (isRunning){
                    stopWatch.tick();
                    TextView timer = findViewById(R.id.timer);
                    timer.setText(stopWatch.toString());
                }
            }
        });
    }

    private void disableStopwatch() {
        isRunning = false;
    }
}
