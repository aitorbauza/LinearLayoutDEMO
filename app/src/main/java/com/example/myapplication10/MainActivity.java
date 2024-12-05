package com.example.myapplication10;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends Activity
        implements RadioGroup.OnCheckedChangeListener {
    RadioGroup orientation;
    RadioGroup gravity;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        orientation = findViewById(R.id.orientation);
        orientation.setOnCheckedChangeListener(this);
        gravity = findViewById(R.id.gravity);
        gravity.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.horizontal) {
            orientation.setOrientation(LinearLayout.HORIZONTAL);
        } else if (checkedId == R.id.vertical) {
            orientation.setOrientation(LinearLayout.VERTICAL);
        } else if (checkedId == R.id.left) {
            gravity.setGravity(Gravity.LEFT);
        } else if (checkedId == R.id.center) {
            gravity.setGravity(Gravity.CENTER_HORIZONTAL);
        } else if (checkedId == R.id.right) {
            gravity.setGravity(Gravity.RIGHT);
        }
    }
}
