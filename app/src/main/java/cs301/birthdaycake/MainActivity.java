package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView lCakeView = findViewById(R.id.cakeview); // Retrieving a reference to the objects in the GUI (findViewByID())

        CakeController lCakeController = new CakeController(lCakeView); // New CakeController object

        System.out.println("");
    }

    public void goodbye (View button) {
        Log.i("button", "Goodbye");
        // System.out.println("Goodbye");
        // finishAffinity();
    }
    }

