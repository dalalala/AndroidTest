package com.example.myandroidup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt1:
                Intent intent1 =new Intent();
                startActivity(intent1);
                break;
            case R.id.bt1_1:
                Intent intent11 =new Intent();
                startActivity(intent11);
                break;
            case R.id.bt1_2:
                Intent intent12 =new Intent();
                startActivity(intent12);
                break;
            case R.id.bt1_3:
                Intent intent13 =new Intent();
                startActivity(intent13);
                break;
            case R.id.bt1_4:
                Intent intent14 =new Intent();
                startActivity(intent14);
                break;
            case R.id.bt1_5:
                Intent intent15 =new Intent();
                startActivity(intent15);
                break;
            case R.id.bt1_6:
                Intent intent16 =new Intent();
                startActivity(intent16);
                break;
            case R.id.bt1_7:
                Intent intent17 =new Intent();
                startActivity(intent17);
                break;
            case R.id.bt1_8:
                Intent intent18 =new Intent();
                startActivity(intent18);
                break;
            case R.id.bt2:
                Intent intent2 =new Intent();
                startActivity(intent2);
                break;
            case R.id.bt2_1:
                Intent intent21 =new Intent();
                startActivity(intent21);
                break;
            case R.id.bt2_2:
                Intent intent22 =new Intent();
                startActivity(intent22);
                break;
        }
    }
}
