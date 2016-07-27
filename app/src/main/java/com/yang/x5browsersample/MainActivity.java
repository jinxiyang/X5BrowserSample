package com.yang.x5browsersample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnSingleClickListener() {
            @Override
            public void onSinglClick(View view) {
                Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
                intent.putExtra(BrowserActivity.LOAD_URL, "http://180.166.42.108:7001/xhws_webapp/web/qyws/yjyqy.jsp");
                startActivity(intent);
            }
        });
    }
}
