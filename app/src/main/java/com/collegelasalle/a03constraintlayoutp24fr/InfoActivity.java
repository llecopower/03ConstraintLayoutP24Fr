package com.collegelasalle.a03constraintlayoutp24fr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnDisplay, btnReturn;
    EditText editTextName, editTextAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initialize();


    }

    private void initialize() {
        btnDisplay =findViewById(R.id.btnDisplay);
        btnReturn = findViewById(R.id.btnReturn);
        // on active listner pour les buttons
        btnDisplay.setOnClickListener(this);
        btnReturn.setOnClickListener(this);
        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
    }

    public void display (View view) {

    }

    public void backBtn (View view) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnDisplay :
            {
               String name = editTextName.getText().toString();
               String age = editTextAge.getText().toString();
                Log.d("DISPLAY","Name " + name);

               String info = "Name " + name + " Age: " + age;
               Toast.makeText(this,info, Toast.LENGTH_LONG).show();

                break;
            }
            case R.id.btnReturn : {
                finish();
                break;
            }
        }
    }
}
