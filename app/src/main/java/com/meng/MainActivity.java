package com.meng;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.tencent.tinker.lib.tinker.TinkerInstaller;

public class MainActivity extends AppCompatActivity {
    private String patch=Environment.getExternalStorageDirectory().getAbsolutePath();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "应用正常了", Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "应用正常了", Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "应用正常了", Toast.LENGTH_SHORT).show();
        TinkerInstaller.onReceiveUpgradePatch(this, patch+"/patch_signed_7zip.apk");

    }
}
