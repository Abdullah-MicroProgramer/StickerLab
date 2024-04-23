package com.example.stickerlab.Activities.Main;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stickerlab.Activities.SeeAll.SeeAllForFeaturedActivity;
import com.example.stickerlab.Adapters.MainActivity.PopularAdapter;
import com.example.stickerlab.Utills.SharedPref;
import com.example.stickerlab.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Context context;
    ActivityMainBinding binding;
    SharedPref sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initUI();

    }

    private void initUI() {
        context = MainActivity.this;
        sh = new SharedPref(context);

        hideStatusBar();
        ClickListners();
        setAdapter();
    }

    private void ClickListners() {
        binding.clSellFeatured.setOnClickListener(v -> {
            startActivity(new Intent(context, SeeAllForFeaturedActivity.class));
        });
        binding.clSellPopular.setOnClickListener(v -> {
            startActivity(new Intent(context, SeeAllForFeaturedActivity.class));
        });
    }

    private void setAdapter() {
        binding.rvVerseImage.setAdapter(new PopularAdapter(context));
    }

    private void hideStatusBar() {
        // Hide the status bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().setDecorFitsSystemWindows(false);
            getWindow().setStatusBarColor(View.GONE);
        } else {
            getWindow().setFlags(
                    WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN
            );
        }
    }
}