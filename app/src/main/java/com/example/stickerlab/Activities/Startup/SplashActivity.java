package com.example.stickerlab.Activities.Startup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.example.stickerlab.Activities.Main.MainActivity;
import com.example.stickerlab.R;
import com.example.stickerlab.Utills.Constants;
import com.example.stickerlab.Utills.Functions;
import com.example.stickerlab.Utills.SharedPref;
import com.example.stickerlab.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    Context context;
    ActivitySplashBinding binding;
    TextView tvVersion;
    SharedPref sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initUI();

    }

    private void initUI() {
        context = SplashActivity.this;
        sh = new SharedPref(context);
        Functions.hideSystemUI(context);
        tvVersion = findViewById(R.id.tv_version);

        nextScreen();
        getVersionCode();
    }

    private void nextScreen() {
        new Handler().postDelayed(() -> {
            finish();
        startActivity(new Intent(context, MainActivity.class)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));

        }, Constants.SPLASH_LENGTH);
    }

    private int getVersionCode() {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }
}