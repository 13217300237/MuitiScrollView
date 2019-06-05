package study.hank.com.scrollviewswipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import study.hank.com.scrollviewswipe.in.InsideInterceptActivity;
import study.hank.com.scrollviewswipe.out.OutsideInterceptActivity;

/**
 * 外部拦截解决方案
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        findViewById(R.id.btn1).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, OutsideInterceptActivity.class)));
        findViewById(R.id.btn2).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, InsideInterceptActivity.class)));

    }


}
