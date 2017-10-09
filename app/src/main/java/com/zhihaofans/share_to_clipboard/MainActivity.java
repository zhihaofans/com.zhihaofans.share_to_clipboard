package com.zhihaofans.share_to_clipboard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getApplicationContext(), R.string.text_helloworld, Toast.LENGTH_SHORT).show();
        finish();
    }
}
