package com.google.material.dev.jibreen.model_demostration.ModelViewPack;

import androidx.lifecycle.ViewModel;

import com.google.android.material.textfield.TextInputEditText;

public class ModelClass extends ViewModel {
    private String text;
    private String test;


    public String getText1() {
        if (text == null) {
            text = ("Please Enter any Text");
        }
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
