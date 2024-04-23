package com.example.stickerlab.Activities.Detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.stickerlab.Activities.Main.MainActivity;
import com.example.stickerlab.Adapters.MainActivity.PopularAdapter;
import com.example.stickerlab.Adapters.PackDetail.PackDetailAdapter;
import com.example.stickerlab.R;
import com.example.stickerlab.Utills.SharedPref;
import com.example.stickerlab.databinding.ActivityMainBinding;
import com.example.stickerlab.databinding.ActivityPackDetailBinding;

public class PackDetailActivity extends AppCompatActivity {
    Context context;
    ActivityPackDetailBinding binding;
    SharedPref sh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPackDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initUI();

    }
    private void initUI() {
        context = PackDetailActivity.this;
        sh = new SharedPref(context);

        hideStatusBar();
        setAdapter();
    }

    private void setAdapter() {
        binding.rvPackDetail.setAdapter(new PackDetailAdapter(context));
    }
    private void hideStatusBar() {
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