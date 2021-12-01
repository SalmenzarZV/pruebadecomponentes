package com.di.almenzarjimenezsergio.mylibrarycomponent;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;

public class MyComponent extends LinearLayout {

    private View rootView;
    private EditText etUsername, etPassword;
    private TextInputEditText tietUsername, tietPassword;
    private Button button;
    private HashMap<String, String> users= new HashMap<String, String>();

    public MyComponent(Context context) {
        super(context);
        init(context);
    }

    public MyComponent(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private  void init(Context context){
        rootView=inflate(context,R.layout.erasable_component,this);
        etUsername = rootView.findViewById(R.id.etUsername);
        etPassword = rootView.findViewById(R.id.etPassword);
        tietUsername = rootView.findViewById(R.id.tietUsername);
        tietPassword = rootView.findViewById(R.id.tietPassword);
        button=rootView.findViewById(R.id.btLogin);
        initUsers();

        button.setOnClickListener(v -> {
            String user, pass;
            user = tietUsername.getText().toString();
            pass = tietPassword.getText().toString();

        });
    }

    private void initUsers() {
        users.put("sergi11","srbx");
        users.put("hackgamer6","timecill");
        users.put("quanch","cheesy");
        users.put("artorias","vvhk");
    }
}
