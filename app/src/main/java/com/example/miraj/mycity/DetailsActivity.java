package com.example.miraj.mycity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView imgPlace;
    TextView txtName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgPlace=findViewById(R.id.img_place);
        txtName=findViewById(R.id.txt_name);

        String getPlace=getIntent().getExtras().getString("place");

        Log.d("place",getPlace);

        if (getPlace.equals("Dhaka"))
        {
           imgPlace.setImageResource(R.drawable.mmm);
           txtName.setText(R.string.dhk_desc);
        }



        else
        {
            imgPlace.setImageResource(R.drawable.mmmm);
            txtName.setText(R.string.ctg_desc);
        }


    }
}
