package com.irwancannady.indonesiamountain.mainview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.irwancannady.indonesiamountain.R;

public class DetailMountain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mountain);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
