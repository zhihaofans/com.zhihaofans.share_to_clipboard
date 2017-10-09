package com.zhihaofans.share_to_clipboard;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.content.ClipboardManager;

import java.util.Objects;

public class ShareActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (Objects.equals(Intent.ACTION_SEND, intent.getAction()) && intent.getType() != null && Objects.equals("text/plain", intent.getType())) {
            String st = intent.getStringExtra(Intent.EXTRA_TEXT);
            if (st != null) {
                ClipboardManager clipManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                if (clipManager != null) {
                    clipManager.setPrimaryClip(ClipData.newPlainText("Hi", st));
                    t(getString(R.string.text_copySu));
                }
            } else {
                t(getString(R.string.text_copyFail));
            }
        } else {
            t(getString(R.string.text_copyFail));
        }
        finish();
    }

    private void t(String tt) {
        Toast.makeText(getApplicationContext(), tt, Toast.LENGTH_SHORT).show();
    }
}
