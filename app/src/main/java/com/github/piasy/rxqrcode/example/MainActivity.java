package com.github.piasy.rxqrcode.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.github.piasy.cameracompat.CameraCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CameraCompat.init(getApplicationContext());

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R2.id.mBtnQrScan)
    public void qrScan() {
        startActivity(new Intent(this, QrScanActivity.class));
    }
}
