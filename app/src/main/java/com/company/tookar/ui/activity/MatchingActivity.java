package com.company.tookar.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.company.tookar.R;

public class MatchingActivity extends BaseActivity

{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching);
        setupViews();
    }

    private void setupViews()
    {
        Toolbar toolbar = (Toolbar) findViewById(R.id.base_toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setTitle("Matched barters");
        toolbar.setSubtitle("Local");
    }
}
