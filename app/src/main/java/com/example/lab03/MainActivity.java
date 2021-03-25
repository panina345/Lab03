package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = Phraser.PhraserGen();

        TextView textView = findViewById(R.id.textView2);
        textView.setText(Phraser.PhraserGen());

    }

    public void ButtonClick(View view) {
        TextView textView = findViewById(R.id.textView2);
        textView.setText(Phraser.PhraserGen());
    }

}
