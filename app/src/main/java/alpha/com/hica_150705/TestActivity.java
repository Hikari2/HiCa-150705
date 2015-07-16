package alpha.com.hica_150705;


import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class TestActivity extends Activity {

    private final String TAG = "ActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout  MainMenuLayout = new RelativeLayout (this);

        Button opt1_Button = new Button(this);
        opt1_Button.setId(1);
        opt1_Button.setText("1");
        opt1_Button.setBackgroundColor(Color.GREEN);

        Button opt2_Button = new Button(this);
        opt2_Button.setId(2);
        opt2_Button.setText("2");
        opt2_Button.setBackgroundColor(Color.RED);

        Button opt3_Button = new Button(this);
        opt2_Button.setId(3);
        opt3_Button.setText("3");
        opt3_Button.setBackgroundColor(Color.BLUE);

        RelativeLayout.LayoutParams opt1_ButtonParam = new RelativeLayout.LayoutParams (
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        opt1_ButtonParam.addRule(RelativeLayout.CENTER_HORIZONTAL);
        opt1_ButtonParam.addRule(RelativeLayout.ABOVE, opt2_Button.getId());

        RelativeLayout.LayoutParams opt2_ButtonParam = new RelativeLayout.LayoutParams (
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        opt2_ButtonParam.addRule(RelativeLayout.CENTER_HORIZONTAL);
        opt2_ButtonParam.addRule(RelativeLayout.ABOVE, opt3_Button.getId());

        RelativeLayout.LayoutParams opt3_ButtonParam = new RelativeLayout.LayoutParams (
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        opt3_ButtonParam.addRule(RelativeLayout.CENTER_HORIZONTAL);
        opt3_ButtonParam.addRule(RelativeLayout.CENTER_VERTICAL);

        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics());

        MainMenuLayout.addView(opt1_Button, opt1_ButtonParam);
        MainMenuLayout.addView(opt2_Button, opt2_ButtonParam);
        MainMenuLayout.addView(opt3_Button, opt3_ButtonParam);

        setContentView(MainMenuLayout);
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

