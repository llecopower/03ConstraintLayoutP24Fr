package com.collegelasalle.a03constraintlayoutp24fr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void infoStudent (View view) {
        Intent intent = new Intent (this, InfoActivity.class);
        startActivity(intent);

    }
}
