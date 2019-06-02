package com.example.gravityflip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    long animationDuration = 500;
    int a[]= new int[]{1, 1, 1, 1, 1};

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        relativeLayout = findViewById(R.id.relativeLayoutMain);
        relativeLayout.setOnTouchListener((View.OnTouchListener) this);
    }

    public boolean onTouch(View view, MotionEvent event) {

        ObjectAnimator animator1 = ObjectAnimator.ofFloat(imageView1,"y",40f);
        animator1.setDuration(animationDuration);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(imageView2,"y",40f);
        animator2.setDuration(animationDuration);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(imageView3,"y",40f);
        animator3.setDuration(animationDuration);
        ObjectAnimator animator4 = ObjectAnimator.ofFloat(imageView4,"y",40f);
        animator4.setDuration(animationDuration);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(imageView5,"y",40f);
        animator5.setDuration(animationDuration);

        ObjectAnimator Animator1 = ObjectAnimator.ofFloat(imageView1,"y",1410f);
        Animator1.setDuration(animationDuration);
        ObjectAnimator Animator2 = ObjectAnimator.ofFloat(imageView2,"y",1410f);
        Animator2.setDuration(animationDuration);
        ObjectAnimator Animator3 = ObjectAnimator.ofFloat(imageView3,"y",1410f);
        Animator3.setDuration(animationDuration);
        ObjectAnimator Animator4 = ObjectAnimator.ofFloat(imageView4,"y",1410f);
        Animator4.setDuration(animationDuration);
        ObjectAnimator Animator5 = ObjectAnimator.ofFloat(imageView5,"y",1410f);
        Animator5.setDuration(animationDuration);

        Random random = new Random();
        int i = random.nextInt(5);

        if(i==0){
            if(a[i]%2==0)
             animator1.start();
            else Animator1.start();
            a[i]++;
        }
        else if(i==1){
            if(a[i]%2==0)
                animator2.start();
            else Animator2.start();
            a[i]++;
        }
        else if(i==2){
            if(a[i]%2==0)
                animator3.start();
            else Animator3.start();
            a[i]++;
        }
        else if(i==3){
            if(a[i]%2==0)
                animator4.start();
            else Animator4.start();
            a[i]++;
        }
        else if(i==4){
            if(a[i]%2==0)
                animator5.start();
            else Animator5.start();
            a[i]++;
        }
        return false;
    }
}
