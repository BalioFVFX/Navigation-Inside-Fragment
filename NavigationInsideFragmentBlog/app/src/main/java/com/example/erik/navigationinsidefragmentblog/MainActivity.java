package com.example.erik.navigationinsidefragmentblog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_content, new NavigationFragment()).commit();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new MainFragment()).commit();
    }
}
