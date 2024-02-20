package com.example.android.materialme;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private TextView sportsTitle;
    private ImageView sportsImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        sportsTitle = (TextView) findViewById(R.id.titleDetail);
        sportsImage = (ImageView) findViewById(R.id.sportsImageDetail);

        sportsTitle.setText(getIntent().getStringExtra("title"));
        Glide.with(this).load(getIntent().getIntExtra("image_resource",0))
                .into(sportsImage);
    }
}