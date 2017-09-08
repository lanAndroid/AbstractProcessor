package com.example.abstractprocessor;

import android.os.Bundle;
import android.widget.TextView;

@LayouyInject(R.layout.activity_test)
public class TestActivity extends InjectActivity {

    @ViewInject(R.id.textView)
    TextView tv1;
    @ViewInject(R.id.textView2)
    TextView tv2;
    @ViewInject(R.id.textView3)
    TextView tv3;
    @ViewInject(R.id.textView4)
    TextView tv4;
    @ViewInject(R.id.textView5)
    TextView tv5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv1.setText("成功了");
        tv2.setText("成功了");
        tv3.setText("成功了");
        tv4.setText("成功了");
        tv5.setText("成功了");
    }
}
