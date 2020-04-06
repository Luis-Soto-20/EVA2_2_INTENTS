package com.example.eva2_2_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent inTel;
    EditText edtxtTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxtTel = findViewById(R.id.edtxtTel);

    }

    public void onClick(View v){

        String cade = "tel:" + edtxtTel.getText().toString();
        if(v.getId() == R.id.btnDial) {
            inTel = new Intent(Intent.ACTION_DIAL, Uri.parse(cade));

        }else{
            inTel = new Intent(Intent.ACTION_CALL, Uri.parse(cade));
        }
        startActivity(inTel);

    }




}
