package com.kevin.zwk.kt_0617_shipei_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /**
     *  1.完全自定义 直接继承于view然后重写相应方法
     *  2.继承原有控件 需要控件与原生控件差距不大时 一般继承原生控件重写相应方法
     *  3组合空间 一般继承于viewgroup
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      // setContentView(new CustomButton(this));
    }

}
