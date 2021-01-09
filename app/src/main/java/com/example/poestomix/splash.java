package com.example.poestomix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    Animation topAnim, bottomAnim;
    ImageView logo;
    TextView txtOne, txtTwo, txtThree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        logo=findViewById(R.id.flogo);
        txtOne=findViewById(R.id.one);
        txtTwo=findViewById(R.id.two);
        txtThree=findViewById(R.id.three);

        logo.setAnimation(topAnim);
        txtOne.setAnimation(bottomAnim);
        txtTwo.setAnimation(bottomAnim);
        txtThree.setAnimation(bottomAnim);

    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    }, 5000);

    }
}