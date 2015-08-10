package com.company.tookar.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.company.tookar.R;


public class LoginActivity extends BaseActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void prototypeAnonLogin(View view)
    {
        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
    }
}
