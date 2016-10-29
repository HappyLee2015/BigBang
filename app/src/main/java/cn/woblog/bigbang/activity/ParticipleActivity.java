package cn.woblog.bigbang.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import cn.woblog.bigbang.R;
import cn.woblog.bigbang.domain.Info;

public class ParticipleActivity extends AppCompatActivity {

    public static final String DATA = "DATA";
    private Info info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participle);

        info = getIntent().getParcelableExtra(DATA);

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(info.getText());
    }
}
