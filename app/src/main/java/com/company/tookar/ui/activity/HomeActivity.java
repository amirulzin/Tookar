package com.company.tookar.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.company.tookar.R;

public class HomeActivity extends BaseActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupViews();
    }

    private void setupViews()
    {
        Toolbar toolbar = (Toolbar) findViewById(R.id.base_toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(Color.WHITE);

        findViewById(R.id.ah_goodwillcard).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });

        findViewById(R.id.ah_matchcard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(HomeActivity.this, MatchingActivity.class));
            }
        });
    }
}
