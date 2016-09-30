package com.example.zeng.uitest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zeng.uitest.Utils.DensityUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Context context = this;
    private Button toast_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast_button = (Button) findViewById(R.id.toast_button);
        toast_button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "当前屏幕宽度是： " + context.getResources().getDisplayMetrics().density + "英寸", Toast.LENGTH_SHORT).show();
        DensityUtil.getScreenHeight(MainActivity.this);//高度
        DensityUtil.getScreenWidth(MainActivity.this);//宽度
        DensityUtil.getScreenDensityDpi(MainActivity.this);//获取屏幕密度
    }
}
