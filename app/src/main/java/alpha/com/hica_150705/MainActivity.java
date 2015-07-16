package alpha.com.hica_150705;


import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private final String TAG = "ActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick (View v){
                        TextView    textView = (TextView) findViewById(R.id.textView);
                        textView.setText("Option1 pressed!");
                    }
                }
        );

        button2.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick (View v){
                        TextView    textView = (TextView) findViewById(R.id.textView);
                        textView.setText("Option2 pressed!");
                    }
                }
        );

        button3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick (View v){
                        TextView    textView = (TextView) findViewById(R.id.textView);
                        textView.setText("Option3 pressed!");
                    }
                }
        );
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

