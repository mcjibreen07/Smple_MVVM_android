package com.google.material.dev.jibreen.model_demostration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.material.dev.jibreen.model_demostration.ModelViewPack.ModelClass;

public class MainActivity extends AppCompatActivity {
    private ModelClass modelClass;
    private TextView textView;
    private TextInputEditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modelClass = new ViewModelProvider(this).get(ModelClass.class);
        textView = findViewById(R.id.disp);
        textView.setText(modelClass.getText1().toString());
        text = findViewById(R.id.enter_text);
    }

    public void setText(View view) {
        modelClass.setText(text.getText().toString());
        textView.setText(modelClass.getText1());
    }

}