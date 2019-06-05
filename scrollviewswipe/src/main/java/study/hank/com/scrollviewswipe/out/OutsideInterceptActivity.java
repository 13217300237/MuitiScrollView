package study.hank.com.scrollviewswipe.out;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import study.hank.com.scrollviewswipe.R;

/**
 * 外部拦截解决方案
 */
public class OutsideInterceptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.out_intercept);
    }
}
