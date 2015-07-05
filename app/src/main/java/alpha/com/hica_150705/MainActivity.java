package alpha.com.hica_150705;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private final String TAG = "ActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    protected void onRestart() {
        super.onStart();
        Log.d(TAG, "onRestart");
    }

    protected void onResume() {
        super.onStart();
        Log.d(TAG, "onResume");
    }

    protected void onPause() {
        super.onStart();
        Log.d(TAG, "onPause");
    }

    protected void onStop() {
        super.onStart();
        Log.d(TAG, "onStop");
    }

    protected void onDestroy() {
        super.onStart();
        Log.d(TAG, "onDestroy");
    }
}

