package com.example.votingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt_name;
    private Button btn_submit;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name = findViewById(R.id.edt_name);
        btn_submit = findViewById(R.id.btn_submit);
        tv_result = findViewById(R.id.tv_result);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSubmitted();
            }
        });

    }
    public void onSubmitted(){
        String name = edt_name.getText().toString().trim();
        if(!name.isEmpty()){
            tv_result.setText(name);
        }
    }
}
