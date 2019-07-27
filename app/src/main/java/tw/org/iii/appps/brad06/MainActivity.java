package tw.org.iii.appps.brad06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private int lottery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("brad", "onCreate");

        tv = findViewById(R.id.tv);


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("brad", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("brad", "onStart");
        lottery = (int)(Math.random()*49+1);
        tv.setText("" + lottery);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("brad", "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.v("brad", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("brad", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("brad", "onRestart");
    }

    public void toPage2(View view) {
        Intent intent = new Intent(this, Page2Activity.class);
        intent.putExtra("lottery", lottery);
        startActivity(intent);

    }
}
