package com.example.processordemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @Inject(R.id.textView)
    TextView tv1;
    @Inject(R.id.textView2)
    TextView tv2;
    @Inject(R.id.textView3)
    TextView tv3;
    @Inject(R.id.textView4)
    TextView tv4;
    @Inject(R.id.textView5)
    TextView tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MSHInject.inject(this);

        tv1.setText("完成");
        tv2.setText("完成");
        tv3.setText("完成");
        tv4.setText("完成");
        tv5.setText("完成");
    }

    @OnClick({R.id.textView, R.id.textView2, R.id.textView3, R.id.textView4, R.id.textView5,})
    public void OnClick(View view) {
        switch (view.getId()) {
            case R.id.textView:
                Toast.makeText(this, "AAAAAAAAA", Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView2:
                Toast.makeText(this, "BBBBBBBBB", Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView3:
                Toast.makeText(this, "CCCCCCCCC", Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView4:
                Toast.makeText(this, "DDDDDDDDD", Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView5:
                Toast.makeText(this, "EEEEEEEEE", Toast.LENGTH_SHORT).show();
                break;


        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MSHInject.unInject();
    }
}
