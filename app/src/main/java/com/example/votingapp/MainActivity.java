package com.example.votingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView hardikText;
    TextView yurajText;
    Button  hardikButton;
    Button yurajButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hardikText = findViewById(R.id.tv_hardik_count);
        yurajText = findViewById(R.id.tv_yuraj_count);
        hardikButton = findViewById(R.id.btn_hardik_vote);
        yurajButton = findViewById(R.id.btn_yuraj_vote);




    }
    public void onHardikClicked(View v)
    {
        String hardikCount = hardikText.getText().toString().trim();
        int count = Integer.parseInt(hardikCount);
        count++;
        hardikText.setText(String.valueOf(count));
    }
    public void onYurajClicked(View v)
    {
        String yurajCount = yurajText.getText().toString().trim();
        int count = Integer.parseInt(yurajCount);
        count++;
        yurajText.setText(String.valueOf(count));
    }
}
