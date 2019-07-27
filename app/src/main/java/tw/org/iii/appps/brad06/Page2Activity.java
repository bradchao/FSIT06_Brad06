package tw.org.iii.appps.brad06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity {
    private TextView mesg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        mesg = findViewById(R.id.mesg);

        Log.v("brad", "var2:" + MainApp.var2);
        MainApp.var2++;


        Intent intent = getIntent();
        int lottery = intent.getIntExtra("lottery", -1);

        mesg.setText("" + lottery);


    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("name", "Brad");
        setResult(RESULT_OK, intent);
        super.finish();
    }
}
