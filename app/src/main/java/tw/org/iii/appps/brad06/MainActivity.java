package tw.org.iii.appps.brad06;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private int lottery;
    private long start;

    private MainApp mainApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("brad", "onCreate");

        Log.v("brad", "var2:" + MainApp.var2);
        mainApp = (MainApp) getApplication();

        Log.v("brad", "var1:" + mainApp.var1);

        mainApp.var1++;
        MainApp.var2++;

        start = System.currentTimeMillis();

        tv = findViewById(R.id.tv);
    }

    @Override
    public void finish() {
        super.finish();
        Log.v("brad", "finish");
    }

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() - start >= 3*1000){
            start = System.currentTimeMillis();
            Toast.makeText(this, "Back one more", Toast.LENGTH_SHORT).show();
        }else{
            super.onBackPressed();
        }

        Log.v("brad", "onBackPressed");
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.v("brad", "onActivityResult:" + requestCode);

        if (requestCode == 2 && resultCode == RESULT_OK){
            String name = data.getStringExtra("name");
            Log.v("brad", name);
        }


    }

    public void toPage2(View view) {
        Intent intent = new Intent(this, Page2Activity.class);
        intent.putExtra("lottery", lottery);
        //startActivity(intent);
        startActivityForResult(intent, 2);

    }

    public void toPage3(View view) {
        Intent intent = new Intent(this, Page3Activity.class);
        //startActivity(intent);
        startActivityForResult(intent, 3);
    }
}
