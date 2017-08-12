package tw.adouble.app.helloworld.mystopwatch170812003;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private boolean isRunning;
    private Button left, right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left = (Button)findViewById(R.id.left);
        right = (Button)findViewById(R.id.right);

    }


    //Reset & Lap
    public void doLeft(View view){
        if (isRunning){
            doLap();
        }else {
            doReset();
        }
    }

    //Start & Stop
    public void doRight(View view){
        //切換Running狀態
        isRunning = !isRunning;
        if (isRunning){
            right.setText("STOP");
            left.setText("LAP");
            doStart();
        }else {
            right.setText("START");
            left.setText("RESET");
            doStop();
        }

    }

    private void doStart(){

    }

    private void doStop(){

    }

    private void doLap(){

    }

    private void doReset(){

    }
}
