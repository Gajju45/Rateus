package com.android.gajju45.rate_us;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.rateusBtn);

        //Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(MainActivity.this);

                dialog.setContentView(R.layout.rate);

                TextView t1=dialog.findViewById(R.id.rate_usTv);
                TextView t2=dialog.findViewById(R.id.did_yo_like_our_app_TV);
                TextView t3=dialog.findViewById(R.id.yesLikeit_TV);
                TextView  t4=dialog.findViewById(R.id.not_badTV);

                ImageView img1=dialog.findViewById(R.id.happy_img);
                ImageView img2=dialog.findViewById(R.id.sad_image);
                dialog.getWindow().setLayout(1100,1600);
               /* ratingBarD.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                        Toast.makeText(MainActivity.this,"Rating"+v, Toast.LENGTH_SHORT).show();
                    }
                });


                */
                dialog.show();


            }
        });

    }

}