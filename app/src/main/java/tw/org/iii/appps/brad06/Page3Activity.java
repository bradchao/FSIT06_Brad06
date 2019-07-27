package tw.org.iii.appps.brad06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Page3Activity extends AppCompatActivity {
    private MainApp mainApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);


        mainApp = (MainApp)getApplication();
        Log.v("brad", "var1 = " + mainApp.var1++);

    }
}
