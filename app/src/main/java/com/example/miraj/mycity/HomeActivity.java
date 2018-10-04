package com.example.miraj.mycity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Button btnDhaka,btnCtg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnDhaka=findViewById(R.id.btn_dhaka);
        btnCtg=findViewById(R.id.btn_ctg);

        btnDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i= new Intent(HomeActivity.this,DetailsActivity.class);

                i.putExtra("place","Dhaka");
                Toast.makeText(HomeActivity.this, "Dhaka", Toast.LENGTH_SHORT).show();
                startActivity(i);


            }
        });


       btnCtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(HomeActivity.this,DetailsActivity.class);

                i.putExtra("place","Chittagong");
                Toast.makeText(HomeActivity.this, "Chittagong", Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });
    }
}
